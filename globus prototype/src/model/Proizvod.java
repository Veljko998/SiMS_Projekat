/***********************************************************************
 * Module:  Proizvod.java
 * Author:  Nemanja
 * Purpose: Defines the Class Proizvod
 ***********************************************************************/

package model;

import java.util.*;

public class Proizvod {
   private String id;
   private String naziv;
   private String boja;
   private String opis;
   private String materijal;
   private Date datumProizvodnje;
   private float masa;
   private int garancija;
   
   public java.util.Collection<StavkaCenovnika> stavkaCenovnika;
   public java.util.Collection<Prodavnica> prodavnica;
   public Kategorija kategorija;
   
   public void dodajProdavnicu(Prodavnica prodavnica) {
      // TODO: implement
   }
   
   public Prodavnica nadjiProdavnicu(String id) {
      // TODO: implement
      return null;
   }
   
   public void obrisiProdavnicu(Prodavnica prodavnica) {
      // TODO: implement
   }
   
   public void dodajStavku(StavkaCenovnika stavka) {
      // TODO: implement
   }
   
   public StavkaCenovnika nadjiStavku(String id) {
      // TODO: implement
      return null;
   }
   
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