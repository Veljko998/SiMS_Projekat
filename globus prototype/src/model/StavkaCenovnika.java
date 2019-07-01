/***********************************************************************
 * Module:  StavkaCenovnika.java
 * Author:  Nemanja
 * Purpose: Defines the Class StavkaCenovnika
 ***********************************************************************/
package model;

import java.util.*;

/** @pdOid 0c0ab75a-335d-48ec-83e0-0730d780b534 */
public class StavkaCenovnika {
   /** @pdOid 5a0078b0-e9aa-4eba-9be5-be5d3ced34b3 */
   private String id;
   /** @pdOid b6390c12-256c-46c2-a02a-2b5086825afd */
   private double jedinicnaCena;
   
   /** @pdRoleInfo migr=no name=Proizvod assc=association11 mult=1..1 side=A */
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