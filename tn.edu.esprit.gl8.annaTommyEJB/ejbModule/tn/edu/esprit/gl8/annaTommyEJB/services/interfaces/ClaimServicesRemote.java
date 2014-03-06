package tn.edu.esprit.gl8.annaTommyEJB.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.gl8.annaTommyEJB.domain.Claim;
import tn.edu.esprit.gl8.annaTommyEJB.domain.User;

@Remote
public interface ClaimServicesRemote {
	boolean addClaim(Claim claim);

	boolean addUser(User user);

	User login(String email, String password);
}
