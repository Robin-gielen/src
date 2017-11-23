package model;
import static org.junit.Assert.*;

import org.junit.Test;

public class AssuranceTest {

	@Test
	public void test() {
		Assurance assur= new Assurance(0, 300.0, "OMNIUM", 1.2);
		assertEquals("assurID=0, prix=300.0, type=OMNIUM, prixKmSupp=1.2", assur.toString());
	}

}
