package fr.dauphine.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.dauphine.models.Chambre;
import fr.dauphine.models.Client;
import fr.dauphine.models.Chambre.TYPECHAMBRE;

public class TestReservationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testChambre() {
		Chambre chambre = new Chambre();
		int etage = -20;
		chambre.setEtage(etage);
		assertEquals("Etage incorrecte",etage,chambre.getEtage(),0);
		
	}

}
