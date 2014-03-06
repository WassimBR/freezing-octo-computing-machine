package tn.edu.esprit.gl8.annaTommyEJB.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

}
