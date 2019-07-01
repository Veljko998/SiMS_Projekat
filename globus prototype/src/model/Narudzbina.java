/***********************************************************************
 * Module:  Narudzbina.java
 * Author:  Nemanja
 * Purpose: Defines the Class Narudzbina
 ***********************************************************************/
package model;

import java.util.*;

public class Narudzbina {
   private String id;
   private double ukupnaCena;
   private boolean placena;
   private Date datumPorudzbine;
   private Date ocekivanaIsporuka;
   private String adresaIsporuke;
   
   public java.util.Collection<StavkaNarudzbine> stavkaNarudzbine;
   private Stanje stanje;
   public RegistrovaniKupac registrovaniKupac;
   
   public void zabraniPromenuNarudzbine() {
      // TODO: implement
   }
   
   public void slanjeRobe() {
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
      // TODO: implement
   }
   
   public void promeniStanje(Stanje stanje) {
      // TODO: implement
   }
   
   public void povracajNovca() {
      // TODO: implement
   }
   
   public void dodajStavku(StavkaNarudzbine stavka) {
      // TODO: implement
   }
   
   public void obrisiStavku(StavkaNarudzbine stavka) {
      // TODO: implement
   }
   
   public StavkaNarudzbine nadjiStavku(Proizvod proizvod) {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<StavkaNarudzbine> getStavkaNarudzbine() {
      if (stavkaNarudzbine == null)
         stavkaNarudzbine = new java.util.HashSet<StavkaNarudzbine>();
      return stavkaNarudzbine;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStavkaNarudzbine() {
      if (stavkaNarudzbine == null)
         stavkaNarudzbine = new java.util.HashSet<StavkaNarudzbine>();
      return stavkaNarudzbine.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStavkaNarudzbine */
   public void setStavkaNarudzbine(java.util.Collection<StavkaNarudzbine> newStavkaNarudzbine) {
      removeAllStavkaNarudzbine();
      for (java.util.Iterator iter = newStavkaNarudzbine.iterator(); iter.hasNext();)
         addStavkaNarudzbine((StavkaNarudzbine)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newStavkaNarudzbine */
   public void addStavkaNarudzbine(StavkaNarudzbine newStavkaNarudzbine) {
      if (newStavkaNarudzbine == null)
         return;
      if (this.stavkaNarudzbine == null)
         this.stavkaNarudzbine = new java.util.HashSet<StavkaNarudzbine>();
      if (!this.stavkaNarudzbine.contains(newStavkaNarudzbine))
         this.stavkaNarudzbine.add(newStavkaNarudzbine);
   }
   
   /** @pdGenerated default remove
     * @param oldStavkaNarudzbine */
   public void removeStavkaNarudzbine(StavkaNarudzbine oldStavkaNarudzbine) {
      if (oldStavkaNarudzbine == null)
         return;
      if (this.stavkaNarudzbine != null)
         if (this.stavkaNarudzbine.contains(oldStavkaNarudzbine))
            this.stavkaNarudzbine.remove(oldStavkaNarudzbine);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllStavkaNarudzbine() {
      if (stavkaNarudzbine != null)
         stavkaNarudzbine.clear();
   }

}