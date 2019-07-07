/***********************************************************************
 * Module:  Poslata.java
 * Author:  Nemanja
 * Purpose: Defines the Class Poslata
 ***********************************************************************/
package model;

import java.util.*;

public class Poslata extends Stanje {
   public Poslata(Narudzbina narudzbina) {
		super(narudzbina);
		// TODO Auto-generated constructor stub
	}

   public void entry() {
	   narudzbina.slanjeRobe();
   }
   
   public void poslatZahtev() {
      // TODO: implement
   }
   
   public void izvrsenaUplata() {
      // TODO: implement
   }
   
   public void otkazanZahtev() {
      // TODO: implement
   }
   
   public void narudzbinaUrucena() {
      Urucena urucena = new Urucena(narudzbina);
      narudzbina.promeniStanje(urucena);
   }
   
   public void narudzbinaVracena() {
      // TODO: implement
   }

}