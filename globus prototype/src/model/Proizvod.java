/***********************************************************************
 * Module:  Proizvod.java
 * Author:  Nemanja
 * Purpose: Defines the Class Proizvod
 ***********************************************************************/

package model;

import java.util.*;

/** @pdOid b1d37bfe-d119-4de6-bb29-994ee8716d5d */
public class Proizvod {
   /** @pdOid a30116e1-067c-4ca1-bb38-8ad046d84264 */
   private String id;
   /** @pdOid 44b7fc52-ff7b-4aae-87e6-ce0c484d588f */
   private String naziv;
   /** @pdOid 75512a77-40e4-487b-9156-8210c12c9c6b */
   private String boja;
   /** @pdOid da9675a4-78e4-4791-aa66-50aceb056995 */
   private String opis;
   /** @pdOid fa86024b-2f2c-4043-a125-56fb6ead906e */
   private String materijal;
   /** @pdOid f1cc7f51-bba7-4bb2-b83a-0eb5f3290ec5 */
   private Date datumProizvodnje;
   /** @pdOid 11009663-c292-4bd1-a0b9-aa0361764fb2 */
   private float masa;
   /** @pdOid 1dec12e5-1315-4847-ac47-40c86863be63 */
   private int garancija;
   
   /** @pdRoleInfo migr=no name=StavkaCenovnika assc=association11 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<StavkaCenovnika> stavkaCenovnika;
   /** @pdRoleInfo migr=no name=Prodavnica assc=association15 mult=0..* side=A */
   public Prodavnica[] prodavnica;
   /** @pdRoleInfo migr=no name=Kategorija assc=association20 mult=0..1 side=A */
   public Kategorija kategorija;
   
   /** @param prodavnica
    * @pdOid 1dbd46c3-f5a3-4bae-963e-c5e71bef59af */
   public void dodajProdavnicu(Prodavnica prodavnica) {
      // TODO: implement
   }
   
   /** @param id
    * @pdOid 0968ac2b-2cec-417e-89c2-2bd990b785b4 */
   public Prodavnica nadjiProdavnicu(String id) {
      // TODO: implement
      return null;
   }
   
   /** @param prodavnica
    * @pdOid 668ff1ca-e78a-44cb-b38e-eb98496baa1d */
   public void obrisiProdavnicu(Prodavnica prodavnica) {
      // TODO: implement
   }
   
   /** @param stavka
    * @pdOid 9db1bfdd-867b-4844-82c8-abce37154b1f */
   public void dodajStavku(StavkaCenovnika stavka) {
      // TODO: implement
   }
   
   /** @param id
    * @pdOid 9b56b11b-5125-45b5-a0fe-74cb1a02e558 */
   public StavkaCenovnika nadjiStavku(String id) {
      // TODO: implement
      return null;
   }
   
   /** @param stavka
    * @pdOid 53940660-ffa9-4428-b223-fcb4cc04812f */
   public void obrisiStavku(StavkaCenovnika stavka) {
      // TODO: implement
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
      {
         this.stavkaCenovnika.add(newStavkaCenovnika);
         newStavkaCenovnika.setProizvod(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldStavkaCenovnika */
   public void removeStavkaCenovnika(StavkaCenovnika oldStavkaCenovnika) {
      if (oldStavkaCenovnika == null)
         return;
      if (this.stavkaCenovnika != null)
         if (this.stavkaCenovnika.contains(oldStavkaCenovnika))
         {
            this.stavkaCenovnika.remove(oldStavkaCenovnika);
            oldStavkaCenovnika.setProizvod((Proizvod)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllStavkaCenovnika() {
      if (stavkaCenovnika != null)
      {
         StavkaCenovnika oldStavkaCenovnika;
         for (java.util.Iterator iter = getIteratorStavkaCenovnika(); iter.hasNext();)
         {
            oldStavkaCenovnika = (StavkaCenovnika)iter.next();
            iter.remove();
            oldStavkaCenovnika.setProizvod((Proizvod)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Kategorija getKategorija() {
      return kategorija;
   }
   
   /** @pdGenerated default parent setter
     * @param newKategorija */
   public void setKategorija(Kategorija newKategorija) {
      if (this.kategorija == null || !this.kategorija.equals(newKategorija))
      {
         if (this.kategorija != null)
         {
            Kategorija oldKategorija = this.kategorija;
            this.kategorija = null;
            oldKategorija.removeProizvod(this);
         }
         if (newKategorija != null)
         {
            this.kategorija = newKategorija;
            this.kategorija.addProizvod(this);
         }
      }
   }

}