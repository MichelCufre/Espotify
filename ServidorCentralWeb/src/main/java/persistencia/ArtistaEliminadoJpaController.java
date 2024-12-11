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
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import logica.AlbumEliminado;
import java.util.ArrayList;
import java.util.List;
import logica.ArtistaEliminado;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author dokgo
 */
public class ArtistaEliminadoJpaController implements Serializable {

    public ArtistaEliminadoJpaController (){
        emf = Persistence.createEntityManagerFactory("ServidorPU");
    }
    
    public ArtistaEliminadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ArtistaEliminado album) {
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

    public void edit(ArtistaEliminado artista) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            artista = em.merge(artista);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ArtistaEliminado artistaEliminado;
            try {
                artistaEliminado = em.getReference(ArtistaEliminado.class, id);
                artistaEliminado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The artistaEliminado with id " + id + " no longer exists.", enfe);
            }
            List<AlbumEliminado> albums = artistaEliminado.getAlbums();
            for (AlbumEliminado albumsAlbumEliminado : albums) {
                albumsAlbumEliminado.setArtista(null);
                albumsAlbumEliminado = em.merge(albumsAlbumEliminado);
            }
            em.remove(artistaEliminado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ArtistaEliminado> findArtistaEliminadoEntities() {
        return findArtistaEliminadoEntities(true, -1, -1);
    }

    public List<ArtistaEliminado> findArtistaEliminadoEntities(int maxResults, int firstResult) {
        return findArtistaEliminadoEntities(false, maxResults, firstResult);
    }

    private List<ArtistaEliminado> findArtistaEliminadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ArtistaEliminado.class));
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

    public ArtistaEliminado findArtistaEliminado(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ArtistaEliminado.class, id);
        } finally {
            em.close();
        }
    }

    public int getArtistaEliminadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ArtistaEliminado> rt = cq.from(ArtistaEliminado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public ArtistaEliminado findArtistaEliminadoByNickname(String nickname) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT u FROM ArtistaEliminado u WHERE u.nickname = :nickname");
            query.setParameter("nickname", nickname);
            return (ArtistaEliminado) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }
    
    public List<ArtistaEliminado> findAllArtistasEliminados() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM ArtistaEliminado c", ArtistaEliminado.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
}
