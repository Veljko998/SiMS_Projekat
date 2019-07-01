/***********************************************************************
 * Module:  Kategorija.java
 * Author:  Nemanja
 * Purpose: Defines the Class Kategorija
 ***********************************************************************/
package model;

import java.util.*;

/** @pdOid 139ce05b-6c53-4103-b508-8b6f3f213892 */
public class Kategorija {
   /** @pdOid 18a9b033-1c70-48ae-ba37-507691a5e214 */
   private String naziv;
   
   /** @pdRoleInfo migr=no name=Proizvod assc=association20 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Proizvod> proizvod;
   /** @pdRoleInfo migr=no name=Kategorija assc=association21 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Kategorija> kategorijaB;
   
   /** @param proizvod
    * @pdOid 258e3a33-f15a-45bf-88e9-515d396b3f7c */
   public void dodajProizvod(Proizvod proizvod) {
      // TODO: implement
   }
   
   /** @param naziv
    * @pdOid 89e995d6-2eac-4bfd-aa3d-53addf67c1ce */
   public Proizvod nadjiProizvod(String naziv) {
      // TODO: implement
      return null;
   }
   
   /** @param proizvod
    * @pdOid a754736e-8073-4811-9d9b-6f12b9aceb45 */
   public void obrisiProizvod(Proizvod proizvod) {
      // TODO: implement
   }
   
   /** @param kategorija
    * @pdOid 3ccf1b5f-44af-4980-9440-66d00fbbf43a */
   public void dodajKategoriju(Kategorija kategorija) {
      // TODO: implement
   }
   
   /** @param naziv
    * @pdOid a9a3ddbb-85fd-4d45-b25c-40c2afcb1faf */
   public Kategorija nadjiKategoriju(String naziv) {
      // TODO: implement
      return null;
   }
   
   /** @param kategorija
    * @pdOid 191cdbdf-255a-43e4-95af-6da842bd6b55 */
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