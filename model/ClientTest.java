package model;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClientTest {

	@Test
	public void testToString() {
		Client cli = new Client("Jean","Oui","Jean","Jean","2017-11-17","2017-11-17","Wavre","@gmail.com", false, 0);
		assertEquals("pseudo=Jean, motDePasse=Oui, nom=Jean, prenom=Jean, privilege=2clientID=0, dateInscription=2017-11-17, dateNaissance=2017-11-17, adresse=Wavre, adresseMail=@gmail.com", cli.toString());
	}

}
