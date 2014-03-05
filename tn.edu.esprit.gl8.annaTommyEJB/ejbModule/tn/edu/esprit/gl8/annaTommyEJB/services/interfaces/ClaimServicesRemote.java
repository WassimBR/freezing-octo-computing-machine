package tn.edu.esprit.gl8.annaTommyEJB.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.gl8.annaTommyEJB.domain.Claim;

@Remote
public interface ClaimServicesRemote {
	boolean addClaim(Claim claim);

}
