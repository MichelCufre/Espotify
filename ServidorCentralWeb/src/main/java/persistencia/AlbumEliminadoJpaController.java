/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.io.Serializable;
import jakarta.persistence.Query;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;
import logica.ArtistaEliminado;
import logica.TemaEliminado;
import java.util.ArrayList;
import java.util.List;
import logica.AlbumEliminado;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author dokgo
 */
public class AlbumEliminadoJpaController implements Serializable {

    public AlbumEliminadoJpaController (){
        emf = Persistence.createEntityManagerFactory("ServidorPU");
    }
    
    public AlbumEliminadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(AlbumEliminado album) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(album);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para editar un álbum existente
    public void edit(AlbumEliminado album) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            album = em.merge(album);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw new Exception("Error al editar el álbum: " + ex.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            AlbumEliminado albumEliminado;
            try {
                albumEliminado = em.getReference(AlbumEliminado.class, id);
                albumEliminado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The albumEliminado with id " + id + " no longer exists.", enfe);
            }
            ArtistaEliminado artista = albumEliminado.getArtista();
            if (artista != null) {
                artista.getAlbums().remove(albumEliminado);
                artista = em.merge(artista);
            }
            List<TemaEliminado> temas = albumEliminado.getTemas();
            for (TemaEliminado temasTemaEliminado : temas) {
                temasTemaEliminado.setAlbum(null);
                temasTemaEliminado = em.merge(temasTemaEliminado);
            }
            em.remove(albumEliminado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<AlbumEliminado> findAlbumEliminadoEntities(ArtistaEliminado usr) {
        return findAlbumEliminadoEntities(usr, true, -1, -1);
    }
    
    public List<AlbumEliminado> findAlbumEliminadoEntities(ArtistaEliminado usr, int maxResults, int firstResult) {
        return findAlbumEliminadoEntities(usr, false, maxResults, firstResult);
    }
    
    private List<AlbumEliminado> findAlbumEliminadoEntities(ArtistaEliminado usuario, boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            // Crear el CriteriaBuilder
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<AlbumEliminado> cq = cb.createQuery(AlbumEliminado.class);

            // Root de Artista
            Root<ArtistaEliminado> artistaRoot = cq.from(ArtistaEliminado.class);

            // Realizar un join con la lista de álbumes
            Join<ArtistaEliminado, AlbumEliminado> albumesJoin = artistaRoot.join("albums");

            // Comparar una propiedad específica del artista, como nickname o id
            cq.select(albumesJoin).where(cb.equal(artistaRoot.get("nickname"), usuario.getNickname()));

            // Crear la consulta
            Query q = em.createQuery(cq);

            // Establecer límites si no queremos traer todos los resultados
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }

            // Obtener la lista de álbumes
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public List<AlbumEliminado> findAlbumEliminadoEntities() {
        return findAlbumEliminadoEntities(true, -1, -1);
    }

    public List<AlbumEliminado> findAlbumEliminadoEntities(int maxResults, int firstResult) {
        return findAlbumEliminadoEntities(false, maxResults, firstResult);
    }

    private List<AlbumEliminado> findAlbumEliminadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(AlbumEliminado.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public AlbumEliminado findAlbumEliminado(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(AlbumEliminado.class, id);
        } finally {
            em.close();
        }
    }

    public int getAlbumEliminadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<AlbumEliminado> rt = cq.from(AlbumEliminado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public AlbumEliminado findAlbumEliminadoByName(String nombre) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT a FROM AlbumEliminado a WHERE a.nombre = :nombre");
            query.setParameter("nombre", nombre);

            return (AlbumEliminado) query.getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }
    
}
