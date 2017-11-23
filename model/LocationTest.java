package model;
import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	@Test
	public void testToString() {
		Location loca = new Location(0, 1, 2, 3, 4, false);
		assertEquals("locationID=0, clientID=1, assurID=2, voitureID=3, accompte=4, accomptePaye=false", loca.toString());
		
	}

}
