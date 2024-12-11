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
import java.util.List;
import logica.AlbumEliminado;
import logica.TemaEliminado;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author dokgo
 */
public class TemaEliminadoJpaController implements Serializable {

    public TemaEliminadoJpaController (){
        emf = Persistence.createEntityManagerFactory("ServidorPU");
    }
    
    public TemaEliminadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TemaEliminado album) {
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

    public void edit(TemaEliminado artista) throws Exception {
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

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TemaEliminado temaEliminado;
            try {
                temaEliminado = em.getReference(TemaEliminado.class, id);
                temaEliminado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The temaEliminado with id " + id + " no longer exists.", enfe);
            }
            AlbumEliminado album = temaEliminado.getAlbum();
            if (album != null) {
                album.getTemas().remove(temaEliminado);
                album = em.merge(album);
            }
            em.remove(temaEliminado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TemaEliminado> findTemaEliminadoEntities() {
        return findTemaEliminadoEntities(true, -1, -1);
    }

    public List<TemaEliminado> findTemaEliminadoEntities(int maxResults, int firstResult) {
        return findTemaEliminadoEntities(false, maxResults, firstResult);
    }

    private List<TemaEliminado> findTemaEliminadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TemaEliminado.class));
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

    public TemaEliminado findTemaEliminado(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TemaEliminado.class, id);
        } finally {
            em.close();
        }
    }

    public int getTemaEliminadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TemaEliminado> rt = cq.from(TemaEliminado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public TemaEliminado findTemaEliminadoByNombre(String nombre) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT u FROM TemaEliminado u WHERE u.nombre = :nombre");
            query.setParameter("nombre", nombre);
            return (TemaEliminado) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }
    
}
