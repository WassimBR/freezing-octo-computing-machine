package tn.edu.esprit.gl8.annaTommyEJB.services.interfaces;

import javax.ejb.Local;

import tn.edu.esprit.gl8.annaTommyEJB.domain.Claim;
import tn.edu.esprit.gl8.annaTommyEJB.domain.User;

@Local
public interface ClaimServicesLocal {
	boolean addClaim(Claim claim);

	boolean addUser(User user);
}
