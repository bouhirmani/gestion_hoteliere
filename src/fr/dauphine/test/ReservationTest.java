package fr.dauphine.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.dauphine.business.Reservation;
import fr.dauphine.models.Chambre;
import fr.dauphine.models.Client;
import fr.dauphine.models.Hotel;
import fr.dauphine.models.Chambre.TYPECHAMBRE;

public class ReservationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testChambre() {
		Reservation reservation = reserver();
	 	assertEquals("true",2000,reservation.getChambre().getPrix(), 0);
		
	}
	
	@Test
	public final void testHotel() {
		Reservation reservation = reserver();
		assertEquals("true","MERCURE",reservation.getHotel().getNom());
		
	}
	
	
	@Test
	public final void testClient() {
		Reservation reservation = reserver();
		assertEquals("true","BOUHIRMANI",reservation.getClient().getNom());
		
	}
	
	public Reservation reserver(){
		Chambre chambre1 = new Chambre(1, 1, 2000, TYPECHAMBRE.TRADITION);
		Chambre chambre2 = new Chambre(1, 1, 3000, TYPECHAMBRE.HARMONY);
		Chambre chambre3 = new Chambre(1, 1, 4000, TYPECHAMBRE.FAMILIALE);
		Chambre chambre4 = new Chambre(1, 1, 5000, TYPECHAMBRE.TRIPLE);
		Chambre chambre5 = new Chambre(1, 1, 6000, TYPECHAMBRE.ROYAL);
		
		ArrayList<Chambre> listChambres = new ArrayList<>();
		
		listChambres.add(chambre1);
		listChambres.add(chambre2);
		listChambres.add(chambre3);
		listChambres.add(chambre4);
		listChambres.add(chambre5);
		
		Hotel hotel1 = new Hotel("MERCURE", "2B RUE DE LA PEROUSE", new ArrayList<Client>(), listChambres);
		
		Client client = new Client("BOUHIRMANI", "MOHAMMED", "3VB RUE SAINT MICHEAL",
				"m.bouhirmani@gmail.com", "0663915291");
		
		Reservation reservation = new Reservation(hotel1,client,"08/02/2016",3,chambre1);
		return reservation;
	}
}
