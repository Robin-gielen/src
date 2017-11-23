package model;
import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class ClientTest {

	@Test
	public void testToString() {
		LocalDate localDate = LocalDate.now();
		LocalDate localDate2 = LocalDate.now();
		Client cli = new Client("Jean","Oui","Jean","Jean",localDate,localDate2,"Wavre","@gmail.com");
		assertEquals("pseudo=Jean, motDePasse=Oui, nom=Jean, prenom=Jean, privilege=2clientID=0, dateInscription=2017-11-17, dateNaissance=2017-11-17, adresse=Wavre, adresseMail=@gmail.com", cli.toString());
	}

}
