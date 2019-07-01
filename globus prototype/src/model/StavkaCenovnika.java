/***********************************************************************
 * Module:  StavkaCenovnika.java
 * Author:  Nemanja
 * Purpose: Defines the Class StavkaCenovnika
 ***********************************************************************/
package model;

import java.util.*;

public class StavkaCenovnika {
   private String id;
   private double jedinicnaCena;
   
   public Proizvod proizvod;
   
   
   /** @pdGenerated default parent getter */
   public Proizvod getProizvod() {
      return proizvod;
   }
   
   /** @pdGenerated default parent setter
     * @param newProizvod */
   public void setProizvod(Proizvod newProizvod) {
      if (this.proizvod == null || !this.proizvod.equals(newProizvod))
      {
         if (this.proizvod != null)
         {
            Proizvod oldProizvod = this.proizvod;
            this.proizvod = null;
            oldProizvod.removeStavkaCenovnika(this);
         }
         if (newProizvod != null)
         {
            this.proizvod = newProizvod;
            this.proizvod.addStavkaCenovnika(this);
         }
      }
   }

}