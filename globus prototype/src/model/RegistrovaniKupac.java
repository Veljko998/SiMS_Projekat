/***********************************************************************
 * Module:  RegistrovaniKupac.java
 * Author:  Nemanja
 * Purpose: Defines the Class RegistrovaniKupac
 ***********************************************************************/
package model;

import java.util.*;

/** @pdOid dca2f348-504b-47ee-bc36-df3d57097a8c */
public class RegistrovaniKupac {
   /** @pdOid de4067a5-00ab-4044-b790-ba41172e6605 */
   private String ime;
   /** @pdOid 2a165104-d8cc-4c03-a281-4e5fbb8e3d74 */
   private String prezime;
   /** @pdOid 0087f357-f89c-4674-b7f4-3bc0d8f75d0a */
   private Date datumRodjenja;
   /** @pdOid 6a68f6fa-96d6-42f0-af9e-98f8fcfd38f1 */
   private Date datumRegistrovanja;
   /** @pdOid b4383bb2-1d79-44d1-b0f1-b60a5d98c08f */
   private Uloga uloga;
   /** @pdOid ce937b95-7760-4c46-9f48-7f4fb519b328 */
   private String korisnickoIme;
   /** @pdOid 57463bc0-779f-4c47-b47e-6cf32c478687 */
   private String lozinka;
   /** @pdOid 3d9c1d57-3b11-480e-9e14-62293dd67d5a */
   private String mejl;
   
   /** @pdRoleInfo migr=no name=Proizvod assc=association17 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Proizvod> listaZelja;
   /** @pdRoleInfo migr=no name=Narudzbina assc=association19 mult=* side=A */
   public Narudzbina[] narudzbina;
   /** @pdRoleInfo migr=no name=WebShop assc=association13 mult=1..1 side=A */
   public WebShop webShop;
   
   /** @pdOid cb24f4e7-99c6-4440-8667-e4742cbab794 */
   public void pregledajNarudzbine() {
      // TODO: implement
   }
   
   /** @pdOid 9609db3e-1d4c-4edd-b1c5-774db9c81a5d */
   public void pregledajListuZelja() {
      // TODO: implement
   }
   
   /** @param suma 
    * @param narudzbina
    * @pdOid d7b20928-9035-49a1-830f-70d3df954e00 */
   public boolean plati(double suma, Narudzbina narudzbina) {
      // TODO: implement
      return false;
   }
   
   /** @param narudzbina
    * @pdOid f722fd25-2c49-4e8e-a09d-6653433ceed2 */
   public void izbrisiNarudzbinu(Narudzbina narudzbina) {
      // TODO: implement
   }
   
   /** @param proizvod
    * @pdOid 4afab4c4-5bf5-4e8a-94e8-d6de063e0004 */
   public void dodajProizvodUListuZelja(Proizvod proizvod) {
      // TODO: implement
   }
   
   /** @param naziv
    * @pdOid a4913fe3-96bf-45f2-a0a6-5057dd713e88 */
   public Proizvod nadjiProizvodUListuZelja(String naziv) {
      // TODO: implement
      return null;
   }
   
   /** @param proizvod
    * @pdOid a9708f09-efee-4e40-a29a-7d93bb8a872b */
   public void obrisiProizvodUListuZelja(Proizvod proizvod) {
      // TODO: implement
   }
   
   /** @param proizvod 
    * @param kolicina
    * @pdOid e51ee5f9-24be-413f-ba09-71c84b4ae865 */
   public void dodajProizvodUKorpu(Proizvod proizvod, int kolicina) {
      // TODO: implement
   }
   
   /** @param proizvod
    * @pdOid 2f45e3b0-34f5-4d8a-8829-f67ff7e1bf8f */
   public void obrisiProizvodIzKorpe(Proizvod proizvod) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Proizvod> getListaZelja() {
      if (listaZelja == null)
         listaZelja = new java.util.HashSet<Proizvod>();
      return listaZelja;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorListaZelja() {
      if (listaZelja == null)
         listaZelja = new java.util.HashSet<Proizvod>();
      return listaZelja.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newListaZelja */
   public void setListaZelja(java.util.Collection<Proizvod> newListaZelja) {
      removeAllListaZelja();
      for (java.util.Iterator iter = newListaZelja.iterator(); iter.hasNext();)
         addListaZelja((Proizvod)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProizvod */
   public void addListaZelja(Proizvod newProizvod) {
      if (newProizvod == null)
         return;
      if (this.listaZelja == null)
         this.listaZelja = new java.util.HashSet<Proizvod>();
      if (!this.listaZelja.contains(newProizvod))
         this.listaZelja.add(newProizvod);
   }
   
   /** @pdGenerated default remove
     * @param oldProizvod */
   public void removeListaZelja(Proizvod oldProizvod) {
      if (oldProizvod == null)
         return;
      if (this.listaZelja != null)
         if (this.listaZelja.contains(oldProizvod))
            this.listaZelja.remove(oldProizvod);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllListaZelja() {
      if (listaZelja != null)
         listaZelja.clear();
   }
   /** @pdGenerated default parent getter */
   public WebShop getWebShop() {
      return webShop;
   }
   
   /** @pdGenerated default parent setter
     * @param newWebShop */
   public void setWebShop(WebShop newWebShop) {
      if (this.webShop == null || !this.webShop.equals(newWebShop))
      {
         if (this.webShop != null)
         {
            WebShop oldWebShop = this.webShop;
            this.webShop = null;
            oldWebShop.removeRegistrovaniKupac(this);
         }
         if (newWebShop != null)
         {
            this.webShop = newWebShop;
            this.webShop.addRegistrovaniKupac(this);
         }
      }
   }

}