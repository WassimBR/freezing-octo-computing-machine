package tn.edu.esprit.gl8.annaTommyEJB.services.interfaces;

import javax.ejb.Local;

import tn.edu.esprit.gl8.annaTommyEJB.domain.Claim;

@Local
public interface ClaimServicesLocal {
	boolean addClaim(Claim claim);
}
