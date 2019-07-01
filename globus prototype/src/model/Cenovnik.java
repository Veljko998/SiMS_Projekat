/***********************************************************************
 * Module:  Cenovnik.java
 * Author:  Nemanja
 * Purpose: Defines the Class Cenovnik
 ***********************************************************************/
package model;

import java.util.*;

/** @pdOid 0f1d2b31-e843-4c78-867f-ee5643042c41 */
public class Cenovnik {
   /** @pdOid 5b620932-a57f-4289-88fc-3aff63257f98 */
   private String id;
   /** @pdOid 1cb8ac6e-6b00-47c1-a494-c9f90b78a40a */
   private Date datumFormiranja;
   /** @pdOid 292373b3-a145-4462-be9a-c515eb627ff2 */
   private Date vaziDo;
   
   /** @pdRoleInfo migr=no name=StavkaCenovnika assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<StavkaCenovnika> stavkaCenovnika;
   
   /** @param stavka
    * @pdOid d607c8d1-cfde-4bd2-b921-726941f39a67 */
   public void dodajStavku(StavkaCenovnika stavka) {
      // TODO: implement
   }
   
   /** @param stavka
    * @pdOid 81f087fd-e70a-42fd-87bc-91f6d1b00cb7 */
   public void obrisiStavku(StavkaCenovnika stavka) {
      // TODO: implement
   }
   
   /** @param id
    * @pdOid 3baac1f0-d480-4350-b911-7a8a9067253d */
   public StavkaCenovnika nadjiStavku(String id) {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<StavkaCenovnika> getStavkaCenovnika() {
      if (stavkaCenovnika == null)
         stavkaCenovnika = new java.util.HashSet<StavkaCenovnika>();
      return stavkaCenovnika;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStavkaCenovnika() {
      if (stavkaCenovnika == null)
         stavkaCenovnika = new java.util.HashSet<StavkaCenovnika>();
      return stavkaCenovnika.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStavkaCenovnika */
   public void setStavkaCenovnika(java.util.Collection<StavkaCenovnika> newStavkaCenovnika) {
      removeAllStavkaCenovnika();
      for (java.util.Iterator iter = newStavkaCenovnika.iterator(); iter.hasNext();)
         addStavkaCenovnika((StavkaCenovnika)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newStavkaCenovnika */
   public void addStavkaCenovnika(StavkaCenovnika newStavkaCenovnika) {
      if (newStavkaCenovnika == null)
         return;
      if (this.stavkaCenovnika == null)
         this.stavkaCenovnika = new java.util.HashSet<StavkaCenovnika>();
      if (!this.stavkaCenovnika.contains(newStavkaCenovnika))
         this.stavkaCenovnika.add(newStavkaCenovnika);
   }
   
   /** @pdGenerated default remove
     * @param oldStavkaCenovnika */
   public void removeStavkaCenovnika(StavkaCenovnika oldStavkaCenovnika) {
      if (oldStavkaCenovnika == null)
         return;
      if (this.stavkaCenovnika != null)
         if (this.stavkaCenovnika.contains(oldStavkaCenovnika))
            this.stavkaCenovnika.remove(oldStavkaCenovnika);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllStavkaCenovnika() {
      if (stavkaCenovnika != null)
         stavkaCenovnika.clear();
   }

}