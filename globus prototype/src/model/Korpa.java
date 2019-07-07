/***********************************************************************
 * Module:  Korpa.java
 * Author:  Nemanja
 * Purpose: Defines the Class Korpa
 ***********************************************************************/
package model;

import java.util.*;

public class Korpa extends Stanje {
   public Korpa(Narudzbina narudzbina) {
		super(narudzbina);
		// TODO Auto-generated constructor stub
	}

   public void entry() {
      narudzbina.dozvoliPromenuNarudzbine();
   }
   
   public void poslatZahtev() {
      Zavrsena zavrsena = new Zavrsena(narudzbina);
      narudzbina.promeniStanje(zavrsena);
   }
   
   public void izvrsenaUplata() {
      // TODO: implement
   }

   public void otkazanZahtev() {
      // TODO: implement
   }
   
   public void narudzbinaUrucena() {
      // TODO: implement
   }
   public void narudzbinaVracena() {
      // TODO: implement
   }

}