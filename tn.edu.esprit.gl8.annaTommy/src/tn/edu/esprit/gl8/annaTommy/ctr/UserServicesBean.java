package tn.edu.esprit.gl8.annaTommy.ctr;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.edu.esprit.gl8.annaTommyEJB.domain.User;
import tn.edu.esprit.gl8.annaTommyEJB.services.interfaces.ClaimServicesLocal;

@ManagedBean
@SessionScoped
public class UserServicesBean implements Serializable {
	private User user = new User();
	@EJB
	private ClaimServicesLocal claimServicesLocal;

	public String doAddUser() {
		claimServicesLocal.addUser(user);
		return "";

	}

	public User getUser() {

		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
