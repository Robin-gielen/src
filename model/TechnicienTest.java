package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TechnicienTest {

	@Test
	public void testToString() {
		Technicien tech = new Technicien("JC", "mdp","Jesus", "Christ", 1);
		assertEquals("pseudo=JC, motDePasse=mdp, nom=Jesus, prenom=Christ, privilege=1techID=1", tech.toString());
	}

}
