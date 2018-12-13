package tn.uniteam.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.uniteam.persistence.AspNetUser;

/**
 * Session Bean implementation class UserManagement
 */
@Stateless
@LocalBean
public class UserManagement implements UserManagementRemote, UserManagementLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public UserManagement() {
        // TODO Auto-generated constructor stub
    }
    

	@Override
	public List<AspNetUser> getAllUsers() {
		// TODO Auto-generated method stub
		String req = "select u from User u";
		Query query = em.createQuery(req);
		return query.getResultList();
	}


	@Override
	public void addUser(AspNetUser a) {
		// TODO Auto-generated method stub
		em.persist(a);
	}
    

}
