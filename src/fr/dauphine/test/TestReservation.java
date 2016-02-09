package fr.dauphine.test;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import fr.dauphine.business.Reservation;
import fr.dauphine.models.Chambre;
import fr.dauphine.models.Chambre.TYPECHAMBRE;
import fr.dauphine.models.Client;
import fr.dauphine.models.Hotel;



public class TestReservation {
	
	public void reserver(){
	
		
		Chambre chambre1 = new Chambre(1, 1, 2000, TYPECHAMBRE.TRADITION);
		Chambre chambre2 = new Chambre(1, 1, 3000, TYPECHAMBRE.HARMONY);
		Chambre chambre3 = new Chambre(1, 1, 4000, TYPECHAMBRE.FAMILIALE);
		Chambre chambre4 = new Chambre(1, 1, 5000, TYPECHAMBRE.TRIPLE);
		Chambre chambre5 = new Chambre(1, 1, 6000, TYPECHAMBRE.ROYAL);
		
		List<Chambre> listChambres = new Vector<>();
		
		listChambres.add(chambre1);
		listChambres.add(chambre2);
		listChambres.add(chambre3);
		listChambres.add(chambre4);
		listChambres.add(chambre5);
		
		Hotel hotel1 = new Hotel("MERCURE", "2B RUE DE LA PEROUSE", null, listChambres);
		
		Client client = new Client("BOUHIRMANI", "MOHAMMED", "3VB RUE SAINT MICHEAL",
				"m.bouhirmani@gmail.com", "0663915291");
		
		Reservation reservation = new Reservation(hotel1,client,"08/02/2016",3,chambre1);
		
	}
		
	
	
}


