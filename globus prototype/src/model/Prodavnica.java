/***********************************************************************
 * Module:  Prodavnica.java
 * Author:  Nemanja
 * Purpose: Defines the Class Prodavnica
 ***********************************************************************/
package model;

import java.util.*;

/** @pdOid 69ec8f90-0182-45ce-bb9d-2b71133e066b */
public class Prodavnica {
   /** @pdOid 25def07c-625a-4cd2-8fc3-f6bc43d7f24a */
   private String id;
   /** @pdOid f9ef3ee1-7543-4780-a2fc-e4171182c2ce */
   private String mesto;
   /** @pdOid 54b0a455-2676-4700-8967-177de88819d2 */
   private String kontakt;
   
   /** @pdRoleInfo migr=no name=Proizvod assc=association15 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Proizvod> proizvod;
   /** @pdRoleInfo migr=no name=Radnik assc=association16 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Radnik> radnik;
   
   /** @param radnik
    * @pdOid 491f619a-d483-4e04-bad1-cdbbdb36cf2b */
   public void dodajRadnika(Radnik radnik) {
      // TODO: implement
   }
   
   /** @param radnik
    * @pdOid 068214d8-0d96-48ac-824f-e584d97d875e */
   public void obrisiRadnika(Radnik radnik) {
      // TODO: implement
   }
   
   /** @param id
    * @pdOid 2bfd074a-0edc-449a-a395-62f36cde6216 */
   public Radnik nadjiRadnika(String id) {
      // TODO: implement
      return null;
   }
   
   /** @param proizvod
    * @pdOid f9430609-b290-4863-84cd-a847d1a2cafd */
   public void dodajProizvod(Proizvod proizvod) {
      // TODO: implement
   }
   
   /** @param naziv
    * @pdOid 5fc24ae3-ac75-48fb-bddf-c4d7a35def86 */
   public Proizvod nadjiProizvod(String naziv) {
      // TODO: implement
      return null;
   }
   
   /** @param proizvod
    * @pdOid 6f63a6e2-f7fb-4a77-9813-f5ba089cf12f */
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