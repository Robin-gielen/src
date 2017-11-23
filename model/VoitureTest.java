package model;
import static org.junit.Assert.*;


import org.junit.Test;

public class VoitureTest {

	@Test
	public void testToString() {
		Voiture voit=new Voiture(500.0, "Opel", "Corsa", 2010, "citadine","Diesel", "noir", true, 2, 99000, 100.0, 130.0, 900.0, 0 );
		assertEquals("voitID=0, prix=500.0, marque=Opel, modele=Corsa, annee=2010, type=citadine, carburant=Diesel, couleur=noir, estManuelle=true, roueMotrice=2, kilmotrage=99000, volumeCoffre=100.0, hauteur=130.0, poids=900.0, estLouee=false, note=null, agenceID=0", voit.toString());
	}

}
