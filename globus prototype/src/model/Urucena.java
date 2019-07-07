/***********************************************************************
 * Module:  Urucena.java
 * Author:  Nemanja
 * Purpose: Defines the Class Urucena
 ***********************************************************************/

package model;

import java.util.*;

public class Urucena extends Stanje {
   public Urucena(Narudzbina narudzbina) {
		super(narudzbina);
		// TODO Auto-generated constructor stub
	}

   public void entry() {
      // TODO: implement
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
      // TODO: implement
   }
   
   public void narudzbinaVracena() {
      Vracena vracena = new Vracena(narudzbina);
      narudzbina.promeniStanje(vracena);
   }

}