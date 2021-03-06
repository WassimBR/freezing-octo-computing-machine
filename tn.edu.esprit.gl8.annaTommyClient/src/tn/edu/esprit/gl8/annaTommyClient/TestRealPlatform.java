package tn.edu.esprit.gl8.annaTommyClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tn.edu.esprit.gl8.annaTommyEJB.domain.Claim;
import tn.edu.esprit.gl8.annaTommyEJB.domain.User;
import tn.edu.esprit.gl8.annaTommyEJB.services.interfaces.ClaimServicesRemote;

public class TestRealPlatform {
	private Context context;
	private ClaimServicesRemote claimServicesRemote;

	@Before
	public void init() {
		try {
			context = new InitialContext();
			String jndiName = "ejb:tn.edu.esprit.gl8.annaTommyEAR/tn.edu.esprit.gl8.annaTommyEJB/ClaimServices!"
					+ ClaimServicesRemote.class.getCanonicalName();
			claimServicesRemote = (ClaimServicesRemote) context
					.lookup(jndiName);
		} catch (NamingException e) {
		}

	}

	@Test
	public void shouldAddClaim() {
		Claim claim = new Claim();
		claim.setDescription("the JEE prof is fool");

		Assert.assertTrue(claimServicesRemote.addClaim(claim));
	}

	@Test
	public void shouldAddUser() {
		User user = new User("tabassi");
		Assert.assertTrue(claimServicesRemote.addUser(user));
	}

	@Test
	public void shouldLogIn() {
		Assert.assertEquals("esprit",
				claimServicesRemote.login("esprit@esprit.com", "esprit")
						.getName());

	}

}
