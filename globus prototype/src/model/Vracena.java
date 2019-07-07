/***********************************************************************
 * Module:  Vracena.java
 * Author:  Nemanja
 * Purpose: Defines the Class Vracena
 ***********************************************************************/

package model;

import java.util.*;

public class Vracena extends Stanje {
   public Vracena(Narudzbina narudzbina) {
		super(narudzbina);
		// TODO Auto-generated constructor stub
	}

   public void entry() {
      narudzbina.povracajNovca();
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
      // TODO: implement
   }

}