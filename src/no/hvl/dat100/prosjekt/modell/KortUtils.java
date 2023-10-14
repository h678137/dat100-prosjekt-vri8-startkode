package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling samling av kort som skal sorteres.
	 */

	public static void sorter(KortSamling samling) {

		// TODO - START
		Kort[] hentsamling = samling.getSamling();
		int hentant = samling.getAntalKort();
		KortSamling sotert = new KortSamling();
		
		for (int i=0; i<hentant;i++) {
			int minstpos = 0;
			for(int j=1;j<hentant;j++) {
				if(hentsamling[i].compareTo(hentsamling[j])>0 /*&&j<hentant-1*/) {
					minstpos = j;
				}
				sotert.leggTil(hentsamling[minstpos]);
//				System.out.println(hentsamling[minstpos].toString());
				
			}

		}
		samling =sotert;

		// TODO - END
	}

	/**
	 * Stokkar en kortsamling.
	 * 
	 * @param samling samling av kort som skal stokkes.
	 */
	public static void stokk(KortSamling samling) {
 //Kanskje med bruk av random og sjekke om posisjonen har noe objekt i en ny bunke
		
		KortSamling stokk = new KortSamling();
		for(int i=0; i<samling.getAntalKort();i++) {
		int plassering = (int) (Math.random()*(samling.getAntalKort()-1));
		
			while(stokk.getSamling()[plassering]!=null) {
				plassering =(int) (Math.random()*(samling.getAntalKort()-1));
			}
			stokk.getSamling()[plassering]=samling.getSamling()[i];

			
		}
		samling =stokk;

			// TODO - END
	}

}
