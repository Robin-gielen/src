package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgenceTest {

	@Test
	public void testToString() {
		Agence nivelles = new Agence(0, "Nivelles 1400", "Rue de Sotriamont 1");
		assertEquals("agenceID=0, ville=Nivelles 1400, adresse=Rue de Sotriamont 1", nivelles.toString());
	}

}
