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
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;
import logica.RegistroAcceso;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author dokgo
 */
public class RegistroAccesoJpaController implements Serializable {

    public RegistroAccesoJpaController(){
        emf = Persistence.createEntityManagerFactory("ServidorPU");
    }
    
    public RegistroAccesoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(RegistroAcceso registroAcceso) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(registroAcceso);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void borrarTodosRegistros() {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.createQuery("DELETE FROM RegistroAcceso r").executeUpdate();
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(RegistroAcceso registroAcceso) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            registroAcceso = em.merge(registroAcceso);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = registroAcceso.getId();
                if (findRegistroAcceso(id) == null) {
                    throw new NonexistentEntityException("The registroAcceso with id " + id + " no longer exists.");
                }
            }
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
            RegistroAcceso registroAcceso;
            try {
                registroAcceso = em.getReference(RegistroAcceso.class, id);
                registroAcceso.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The registroAcceso with id " + id + " no longer exists.", enfe);
            }
            em.remove(registroAcceso);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<RegistroAcceso> findRegistroAccesoEntities() {
        return findRegistroAccesoEntities(true, -1, -1);
    }

    public List<RegistroAcceso> findRegistroAccesoEntities(int maxResults, int firstResult) {
        return findRegistroAccesoEntities(false, maxResults, firstResult);
    }

    private List<RegistroAcceso> findRegistroAccesoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(RegistroAcceso.class));
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

    public RegistroAcceso findRegistroAcceso(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(RegistroAcceso.class, id);
        } finally {
            em.close();
        }
    }

    public int getRegistroAccesoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<RegistroAcceso> rt = cq.from(RegistroAcceso.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<RegistroAcceso> findAllRegistros() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM RegistroAcceso c", RegistroAcceso.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
}
