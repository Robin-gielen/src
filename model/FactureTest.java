package model;
import static org.junit.Assert.*;

import org.junit.Test;

public class FactureTest {

	@Test
	public void testToString() {
		Facture fact = new Facture(0, 1, 2, false, "le client n'est pas tres sympathique");
		System.out.println(fact.toString());
		assertEquals("factID=0, montant=800.0, locationID=1, techID=2, estPaye=false, note=le client n'est pas tres sympathique", fact.toString());
	}

	@Test
	public void testCalculMontant() {
		Facture fact = new Facture(0, 1, 2, false, "le client n'est pas tres sympathique");
		assertTrue(800.0 == fact.CalculMontant());
	}
}

