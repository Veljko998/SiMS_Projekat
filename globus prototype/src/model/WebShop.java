/***********************************************************************
 * Module:  WebShop.java
 * Author:  Nemanja
 * Purpose: Defines the Class WebShop
 ***********************************************************************/
package model;

import java.util.*;

public class WebShop {
   private String naziv;
   private String infoCentar;
   
   public java.util.Collection<Proizvod> proizvod;
   public java.util.Collection<Prodavnica> prodavnica;
   public java.util.Collection<Cenovnik> cenovnik;
   public java.util.Collection<RegistrovaniKupac> registrovaniKupac;
   public java.util.Collection<Narudzbina> narudzbina;
   
   public void dodajMenadzera(RegistrovaniKupac registrovaniKupac) {
      // TODO: implement
   }
   
   public Narudzbina nadjiNarudzbinu(String id) {
      // TODO: implement
      return null;
   }
   
   public void promenaBojeSajta() {
      // TODO: implement
   }
   
   public void promenaRasporedaProizvoda() {
      // TODO: implement
   }
   
   public void pregledPorudzbina(RegistrovaniKupac korisnik) {
      // TODO: implement
   }
   
   public void dodajProizvod(Proizvod proizvod) {
      // TODO: implement
   }
   
   public void obrisiProizvod(Proizvod proizvod) {
      // TODO: implement
   }
   
   public Proizvod nadjiProizvod(String naziv) {
      // TODO: implement
      return null;
   }
   
   public void dodajProdavnicu(Prodavnica prodavnica) {
      // TODO: implement
   }
   
   public Prodavnica nadjiProdavnicu(int id) {
      // TODO: implement
      return null;
   }
   
   public void obrisiProdavnicu(Prodavnica prodavnica) {
      // TODO: implement
   }
   
   public void dodajKupca(RegistrovaniKupac registrovaniKupac) {
      // TODO: implement
   }
   
   public RegistrovaniKupac nadjiKupca(String korisnickoIme) {
      // TODO: implement
      return null;
   }
   
   public void obrisiKupca(RegistrovaniKupac registrovaniKupac) {
      // TODO: implement
   }
   
   public void dodajCenovnik(Cenovnik cenovnik) {
      // TODO: implement
   }
   
   public Cenovnik nadjiCenovnik(String id) {
      // TODO: implement
      return null;
   }
   
   public void obrisiCenovnik(Cenovnik cenovnik) {
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
   public java.util.Collection<Prodavnica> getProdavnica() {
      if (prodavnica == null)
         prodavnica = new java.util.HashSet<Prodavnica>();
      return prodavnica;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProdavnica() {
      if (prodavnica == null)
         prodavnica = new java.util.HashSet<Prodavnica>();
      return prodavnica.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProdavnica */
   public void setProdavnica(java.util.Collection<Prodavnica> newProdavnica) {
      removeAllProdavnica();
      for (java.util.Iterator iter = newProdavnica.iterator(); iter.hasNext();)
         addProdavnica((Prodavnica)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProdavnica */
   public void addProdavnica(Prodavnica newProdavnica) {
      if (newProdavnica == null)
         return;
      if (this.prodavnica == null)
         this.prodavnica = new java.util.HashSet<Prodavnica>();
      if (!this.prodavnica.contains(newProdavnica))
         this.prodavnica.add(newProdavnica);
   }
   
   /** @pdGenerated default remove
     * @param oldProdavnica */
   public void removeProdavnica(Prodavnica oldProdavnica) {
      if (oldProdavnica == null)
         return;
      if (this.prodavnica != null)
         if (this.prodavnica.contains(oldProdavnica))
            this.prodavnica.remove(oldProdavnica);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProdavnica() {
      if (prodavnica != null)
         prodavnica.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Cenovnik> getCenovnik() {
      if (cenovnik == null)
         cenovnik = new java.util.HashSet<Cenovnik>();
      return cenovnik;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCenovnik() {
      if (cenovnik == null)
         cenovnik = new java.util.HashSet<Cenovnik>();
      return cenovnik.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCenovnik */
   public void setCenovnik(java.util.Collection<Cenovnik> newCenovnik) {
      removeAllCenovnik();
      for (java.util.Iterator iter = newCenovnik.iterator(); iter.hasNext();)
         addCenovnik((Cenovnik)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCenovnik */
   public void addCenovnik(Cenovnik newCenovnik) {
      if (newCenovnik == null)
         return;
      if (this.cenovnik == null)
         this.cenovnik = new java.util.HashSet<Cenovnik>();
      if (!this.cenovnik.contains(newCenovnik))
         this.cenovnik.add(newCenovnik);
   }
   
   /** @pdGenerated default remove
     * @param oldCenovnik */
   public void removeCenovnik(Cenovnik oldCenovnik) {
      if (oldCenovnik == null)
         return;
      if (this.cenovnik != null)
         if (this.cenovnik.contains(oldCenovnik))
            this.cenovnik.remove(oldCenovnik);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCenovnik() {
      if (cenovnik != null)
         cenovnik.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<RegistrovaniKupac> getRegistrovaniKupac() {
      if (registrovaniKupac == null)
         registrovaniKupac = new java.util.HashSet<RegistrovaniKupac>();
      return registrovaniKupac;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRegistrovaniKupac() {
      if (registrovaniKupac == null)
         registrovaniKupac = new java.util.HashSet<RegistrovaniKupac>();
      return registrovaniKupac.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRegistrovaniKupac */
   public void setRegistrovaniKupac(java.util.Collection<RegistrovaniKupac> newRegistrovaniKupac) {
      removeAllRegistrovaniKupac();
      for (java.util.Iterator iter = newRegistrovaniKupac.iterator(); iter.hasNext();)
         addRegistrovaniKupac((RegistrovaniKupac)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRegistrovaniKupac */
   public void addRegistrovaniKupac(RegistrovaniKupac newRegistrovaniKupac) {
      if (newRegistrovaniKupac == null)
         return;
      if (this.registrovaniKupac == null)
         this.registrovaniKupac = new java.util.HashSet<RegistrovaniKupac>();
      if (!this.registrovaniKupac.contains(newRegistrovaniKupac))
      {
         this.registrovaniKupac.add(newRegistrovaniKupac);
         newRegistrovaniKupac.setWebShop(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldRegistrovaniKupac */
   public void removeRegistrovaniKupac(RegistrovaniKupac oldRegistrovaniKupac) {
      if (oldRegistrovaniKupac == null)
         return;
      if (this.registrovaniKupac != null)
         if (this.registrovaniKupac.contains(oldRegistrovaniKupac))
         {
            this.registrovaniKupac.remove(oldRegistrovaniKupac);
            oldRegistrovaniKupac.setWebShop((WebShop)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRegistrovaniKupac() {
      if (registrovaniKupac != null)
      {
         RegistrovaniKupac oldRegistrovaniKupac;
         for (java.util.Iterator iter = getIteratorRegistrovaniKupac(); iter.hasNext();)
         {
            oldRegistrovaniKupac = (RegistrovaniKupac)iter.next();
            iter.remove();
            oldRegistrovaniKupac.setWebShop((WebShop)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Narudzbina> getNarudzbina() {
      if (narudzbina == null)
         narudzbina = new java.util.HashSet<Narudzbina>();
      return narudzbina;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorNarudzbina() {
      if (narudzbina == null)
         narudzbina = new java.util.HashSet<Narudzbina>();
      return narudzbina.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newNarudzbina */
   public void setNarudzbina(java.util.Collection<Narudzbina> newNarudzbina) {
      removeAllNarudzbina();
      for (java.util.Iterator iter = newNarudzbina.iterator(); iter.hasNext();)
         addNarudzbina((Narudzbina)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNarudzbina */
   public void addNarudzbina(Narudzbina newNarudzbina) {
      if (newNarudzbina == null)
         return;
      if (this.narudzbina == null)
         this.narudzbina = new java.util.HashSet<Narudzbina>();
      if (!this.narudzbina.contains(newNarudzbina))
         this.narudzbina.add(newNarudzbina);
   }
   
   /** @pdGenerated default remove
     * @param oldNarudzbina */
   public void removeNarudzbina(Narudzbina oldNarudzbina) {
      if (oldNarudzbina == null)
         return;
      if (this.narudzbina != null)
         if (this.narudzbina.contains(oldNarudzbina))
            this.narudzbina.remove(oldNarudzbina);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllNarudzbina() {
      if (narudzbina != null)
         narudzbina.clear();
   }

}