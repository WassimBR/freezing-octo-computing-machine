package tn.edu.esprit.gl8.annaTommy.ctr;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.edu.esprit.gl8.annaTommyEJB.domain.Claim;
import tn.edu.esprit.gl8.annaTommyEJB.services.interfaces.ClaimServicesLocal;

@ManagedBean
@SessionScoped
public class ClaimServicesBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// the model
	private Claim claim = new Claim();

	// injection of the proxy
	@EJB
	private ClaimServicesLocal claimServicesLocal;

	// the methods
	public String doAddClaim() {
		claimServicesLocal.addClaim(claim);
		return "";
	}

	public Claim getClaim() {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

}
