/***********************************************************************
 * Module:  Kategorija.java
 * Author:  Nemanja
 * Purpose: Defines the Class Kategorija
 ***********************************************************************/
package model;

import java.util.*;

public class Kategorija {
   private String naziv;
   public java.util.Collection<Proizvod> proizvod;
   public java.util.Collection<Kategorija> kategorijaB;
   
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
   
   public void dodajKategoriju(Kategorija kategorija) {
      // TODO: implement
   }
   
   public Kategorija nadjiKategoriju(String naziv) {
      // TODO: implement
      return null;
   }
   
   public void obrisiKategoriju(Kategorija kategorija) {
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
      {
         this.proizvod.add(newProizvod);
         newProizvod.setKategorija(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldProizvod */
   public void removeProizvod(Proizvod oldProizvod) {
      if (oldProizvod == null)
         return;
      if (this.proizvod != null)
         if (this.proizvod.contains(oldProizvod))
         {
            this.proizvod.remove(oldProizvod);
            oldProizvod.setKategorija((Kategorija)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProizvod() {
      if (proizvod != null)
      {
         Proizvod oldProizvod;
         for (java.util.Iterator iter = getIteratorProizvod(); iter.hasNext();)
         {
            oldProizvod = (Proizvod)iter.next();
            iter.remove();
            oldProizvod.setKategorija((Kategorija)null);
         }
      }
   }
   
   /** @pdGenerated default getter */
   public java.util.Collection<Kategorija> getKategorijaB() {
      if (kategorijaB == null)
         kategorijaB = new java.util.HashSet<Kategorija>();
      return kategorijaB;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorKategorijaB() {
      if (kategorijaB == null)
         kategorijaB = new java.util.HashSet<Kategorija>();
      return kategorijaB.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newKategorijaB */
   public void setKategorijaB(java.util.Collection<Kategorija> newKategorijaB) {
      removeAllKategorijaB();
      for (java.util.Iterator iter = newKategorijaB.iterator(); iter.hasNext();)
         addKategorijaB((Kategorija)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newKategorija */
   public void addKategorijaB(Kategorija newKategorija) {
      if (newKategorija == null)
         return;
      if (this.kategorijaB == null)
         this.kategorijaB = new java.util.HashSet<Kategorija>();
      if (!this.kategorijaB.contains(newKategorija))
         this.kategorijaB.add(newKategorija);
   }
   
   /** @pdGenerated default remove
     * @param oldKategorija */
   public void removeKategorijaB(Kategorija oldKategorija) {
      if (oldKategorija == null)
         return;
      if (this.kategorijaB != null)
         if (this.kategorijaB.contains(oldKategorija))
            this.kategorijaB.remove(oldKategorija);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllKategorijaB() {
      if (kategorijaB != null)
         kategorijaB.clear();
   }

}