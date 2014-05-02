package de.designdatabase.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.designdatabase.model.Design;

@Stateless
public class DesignDAO {
	@PersistenceContext(unitName = "DesignDatabasePU")
    private EntityManager em;
 
    public Design addPerson(Design design) {
        em.persist(design);
        return design;
    }
 
    public Design findDesignById(Long id) {
        return em.find(Design.class, id);
    }
 
    public void updateDesign(Design design) {
        em.merge(design);      
    }
 
    public void deleteDesign(Design design) {
        em.remove(design);
    }
}
