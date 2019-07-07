/***********************************************************************
 * Module:  Stanje.java
 * Author:  Nemanja
 * Purpose: Defines the Class Stanje
 ***********************************************************************/
package model;

import java.util.*;

public abstract class Stanje {
   public Narudzbina narudzbina;
   
   public Stanje(Narudzbina narudzbina) {
	   this.narudzbina = narudzbina;
   }
   
   public abstract void entry();
   public abstract void poslatZahtev();
   public abstract void izvrsenaUplata();
   public abstract void otkazanZahtev();
   public abstract void narudzbinaUrucena();
   public abstract void narudzbinaVracena();
}