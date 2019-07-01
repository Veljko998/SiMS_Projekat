/***********************************************************************
 * Module:  Prodavnica.java
 * Author:  Nemanja
 * Purpose: Defines the Class Prodavnica
 ***********************************************************************/
package model;

import java.util.*;

public class Prodavnica {
   private String id;
   private String mesto;
   private String kontakt;
   
   public java.util.Collection<Proizvod> proizvod;
   public java.util.Collection<Radnik> radnik;
   
   public void dodajRadnika(Radnik radnik) {
      // TODO: implement
   }
   
   public void obrisiRadnika(Radnik radnik) {
      // TODO: implement
   }
   
   public Radnik nadjiRadnika(String id) {
      // TODO: implement
      return null;
   }
   
   public void dodajProizvod(Proizvod proizvod) {
      // TODO: implement
   }
   
   public Proizvod nadjiProizvod(String naziv) {
      // TODO: implement
      return null;
   }
   
   public void obrisiProizvod(Proizvod proizvod) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Proizvod> getProizvod() {
      if (proizvod == null)
         proizvod = new java.util.HashSet<Proizvod>();
      return proizvod;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProizvod() {
      if (proizvod == null)
         proizvod = new java.util.HashSet<Proizvod>();
      return proizvod.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProizvod */
   public void setProizvod(java.util.Collection<Proizvod> newProizvod) {
      removeAllProizvod();
      for (java.util.Iterator iter = newProizvod.iterator(); iter.hasNext();)
         addProizvod((Proizvod)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProizvod */
   public void addProizvod(Proizvod newProizvod) {
      if (newProizvod == null)
         return;
      if (this.proizvod == null)
         this.proizvod = new java.util.HashSet<Proizvod>();
      if (!this.proizvod.contains(newProizvod))
         this.proizvod.add(newProizvod);
   }
   
   /** @pdGenerated default remove
     * @param oldProizvod */
   public void removeProizvod(Proizvod oldProizvod) {
      if (oldProizvod == null)
         return;
      if (this.proizvod != null)
         if (this.proizvod.contains(oldProizvod))
            this.proizvod.remove(oldProizvod);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProizvod() {
      if (proizvod != null)
         proizvod.clear();
   }
   
   /** @pdGenerated default getter */
   public java.util.Collection<Radnik> getRadnik() {
      if (radnik == null)
         radnik = new java.util.HashSet<Radnik>();
      return radnik;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRadnik() {
      if (radnik == null)
         radnik = new java.util.HashSet<Radnik>();
      return radnik.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRadnik */
   public void setRadnik(java.util.Collection<Radnik> newRadnik) {
      removeAllRadnik();
      for (java.util.Iterator iter = newRadnik.iterator(); iter.hasNext();)
         addRadnik((Radnik)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRadnik */
   public void addRadnik(Radnik newRadnik) {
      if (newRadnik == null)
         return;
      if (this.radnik == null)
         this.radnik = new java.util.HashSet<Radnik>();
      if (!this.radnik.contains(newRadnik))
         this.radnik.add(newRadnik);
   }
   
   /** @pdGenerated default remove
     * @param oldRadnik */
   public void removeRadnik(Radnik oldRadnik) {
      if (oldRadnik == null)
         return;
      if (this.radnik != null)
         if (this.radnik.contains(oldRadnik))
            this.radnik.remove(oldRadnik);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRadnik() {
      if (radnik != null)
         radnik.clear();
   }

}