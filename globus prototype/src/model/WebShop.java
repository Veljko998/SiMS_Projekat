/***********************************************************************
 * Module:  WebShop.java
 * Author:  Nemanja
 * Purpose: Defines the Class WebShop
 ***********************************************************************/
package model;

import java.util.*;

/** @pdOid 1c26866f-0723-4d3d-aa6a-17322e1445bd */
public class WebShop {
   /** @pdOid 97b74fb7-5e48-413f-ad90-37cc44fae91c */
   private String naziv;
   /** @pdOid 88384810-018e-4c01-b6cd-71983e27f723 */
   private String infoCentar;
   
   /** @pdRoleInfo migr=no name=Proizvod assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Proizvod> proizvod;
   /** @pdRoleInfo migr=no name=Prodavnica assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Prodavnica> prodavnica;
   /** @pdRoleInfo migr=no name=Cenovnik assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Cenovnik> cenovnik;
   /** @pdRoleInfo migr=no name=RegistrovaniKupac assc=association13 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<RegistrovaniKupac> registrovaniKupac;
   /** @pdRoleInfo migr=no name=Narudzbina assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Narudzbina> narudzbina;
   
   /** @param registrovaniKupac
    * @pdOid b54ec9e9-b15f-4056-8f7c-a176e9940caf */
   public void dodajMenadzera(RegistrovaniKupac registrovaniKupac) {
      // TODO: implement
   }
   
   /** @param id
    * @pdOid a8b7bdd4-4be8-4b19-94df-b49e3c74e8ae */
   public Narudzbina nadjiNarudzbinu(String id) {
      // TODO: implement
      return null;
   }
   
   /** @pdOid b4798826-bd03-4a56-9ffc-9ecc1b35ce70 */
   public void promenaBojeSajta() {
      // TODO: implement
   }
   
   /** @pdOid 6138692a-f370-41b0-829f-b575263c5197 */
   public void promenaRasporedaProizvoda() {
      // TODO: implement
   }
   
   /** @param korisnik
    * @pdOid f238896d-aa04-4f7d-b1bc-a465b952e742 */
   public void pregledPorudzbina(RegistrovaniKupac korisnik) {
      // TODO: implement
   }
   
   /** @param proizvod
    * @pdOid bf7dbd78-8c15-48fc-b8d5-d74016601765 */
   public void dodajProizvod(Proizvod proizvod) {
      // TODO: implement
   }
   
   /** @param proizvod
    * @pdOid 9f531789-993b-4f7b-b4f5-56292ed9d396 */
   public void obrisiProizvod(Proizvod proizvod) {
      // TODO: implement
   }
   
   /** @param naziv
    * @pdOid bb260a02-9f2c-4dd3-984c-f3a2f9d3b560 */
   public Proizvod nadjiProizvod(String naziv) {
      // TODO: implement
      return null;
   }
   
   /** @param prodavnica
    * @pdOid 282af38e-c130-4581-8e17-5961446fb2c0 */
   public void dodajProdavnicu(Prodavnica prodavnica) {
      // TODO: implement
   }
   
   /** @param id
    * @pdOid 02761f76-3a9d-4bb8-8224-8cdf0e6c0a14 */
   public Prodavnica nadjiProdavnicu(int id) {
      // TODO: implement
      return null;
   }
   
   /** @param prodavnica
    * @pdOid dd76dfd3-54ee-4634-9a91-08cb6bdb7d2c */
   public void obrisiProdavnicu(Prodavnica prodavnica) {
      // TODO: implement
   }
   
   /** @param registrovaniKupac
    * @pdOid 25134046-cb70-4e29-8c16-bfaf92db1fe8 */
   public void dodajKupca(RegistrovaniKupac registrovaniKupac) {
      // TODO: implement
   }
   
   /** @param korisnickoIme
    * @pdOid 8c10ab71-9086-47ce-8762-1c527e6a6eb2 */
   public RegistrovaniKupac nadjiKupca(String korisnickoIme) {
      // TODO: implement
      return null;
   }
   
   /** @param registrovaniKupac
    * @pdOid aa553803-9477-4c20-83f2-65c136ae09a1 */
   public void obrisiKupca(RegistrovaniKupac registrovaniKupac) {
      // TODO: implement
   }
   
   /** @param cenovnik
    * @pdOid 7c9f1bb9-ba01-4d84-a176-20f6aca2a138 */
   public void dodajCenovnik(Cenovnik cenovnik) {
      // TODO: implement
   }
   
   /** @param id
    * @pdOid 8d2fe659-49da-4f0e-a714-79b3c97eddb8 */
   public Cenovnik nadjiCenovnik(String id) {
      // TODO: implement
      return null;
   }
   
   /** @param cenovnik
    * @pdOid de11d233-55c1-4f6a-b7d5-89c2618cc43a */
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