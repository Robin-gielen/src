package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TechnicienTest {

	@Test
	public void testToString() {
		assertEquals("pseudo=JC, motDePasse=mdp, nom=Jesus, prenom=Christ, privilege=1techID=1", tech.toString());
	}

}
