/***********************************************************************
 * Module:  Zavrsena.java
 * Author:  Nemanja
 * Purpose: Defines the Class Zavrsena
 ***********************************************************************/
package model;

import java.util.*;

public class Zavrsena extends Stanje {
	
   public Zavrsena(Narudzbina narudzbina) {
		super(narudzbina);
		// TODO Auto-generated constructor stub
	}

   public void entry() {
      narudzbina.zabraniPromenuNarudzbine();
   }
   
   public void poslatZahtev() {
      // TODO: implement
   }
   
   public void izvrsenaUplata() {
      Poslata poslata = new Poslata(narudzbina);
      narudzbina.promeniStanje(poslata);
   }
   
   public void otkazanZahtev() {
      Korpa korpa = new Korpa(narudzbina);
      narudzbina.promeniStanje(korpa);
   }
   
   public void narudzbinaUrucena() {
      // TODO: implement
   }
   
   public void narudzbinaVracena() {
      // TODO: implement
   }

}