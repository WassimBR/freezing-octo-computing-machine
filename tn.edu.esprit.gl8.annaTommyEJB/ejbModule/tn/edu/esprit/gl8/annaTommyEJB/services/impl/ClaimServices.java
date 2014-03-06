package tn.edu.esprit.gl8.annaTommyEJB.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.gl8.annaTommyEJB.domain.Claim;
import tn.edu.esprit.gl8.annaTommyEJB.domain.User;
import tn.edu.esprit.gl8.annaTommyEJB.services.interfaces.ClaimServicesLocal;
import tn.edu.esprit.gl8.annaTommyEJB.services.interfaces.ClaimServicesRemote;

/**
 * Session Bean implementation class ClaimServices
 */
@Stateless
public class ClaimServices implements ClaimServicesRemote, ClaimServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ClaimServices() {
		// TODO Auto-generated constructor stub
	}

	public boolean addClaim(Claim claim) {
		boolean b = false;
		try {
			entityManager.persist(claim);
			b = true;
		} catch (Exception e) {
			System.err.println("emmmm ...");
		}
		return b;
	}

	public boolean addUser(User user) {
		boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
			System.err.println("emmmm ...");
		}
		return b;
	}

	public User login(String email, String password) {
		
		User userFound = null ;
		String jpql = "select u from User u where u.email=:param1 "
				+ "and u.password=:param2 ";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param1", email);
		query.setParameter("param2", password);
		try {
			userFound=(User) query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return userFound;
	}
}
