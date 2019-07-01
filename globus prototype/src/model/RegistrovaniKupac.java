/***********************************************************************
 * Module:  RegistrovaniKupac.java
 * Author:  Nemanja
 * Purpose: Defines the Class RegistrovaniKupac
 ***********************************************************************/
package model;

import java.util.*;

public class RegistrovaniKupac {
   private String ime;
   private String prezime;
   private Date datumRodjenja;
   private Date datumRegistrovanja;
   private Uloga uloga;
   private String korisnickoIme;
   private String lozinka;
   private String mejl;
   
   public java.util.Collection<Proizvod> listaZelja;
   public java.util.Collection<Narudzbina> narudzbina;
   public WebShop webShop;
   
   public void pregledajNarudzbine() {
      // TODO: implement
   }
   
   public void pregledajListuZelja() {
      // TODO: implement
   }
   
   public boolean plati(double suma, Narudzbina narudzbina) {
      // TODO: implement
      return false;
   }
   
   public void izbrisiNarudzbinu(Narudzbina narudzbina) {
      // TODO: implement
   }
   
   public void dodajProizvodUListuZelja(Proizvod proizvod) {
      // TODO: implement
   }
   
   public Proizvod nadjiProizvodUListuZelja(String naziv) {
      // TODO: implement
      return null;
   }
   
   public void obrisiProizvodUListuZelja(Proizvod proizvod) {
      // TODO: implement
   }
   
   public void dodajProizvodUKorpu(Proizvod proizvod, int kolicina) {
      // TODO: implement
   }
   
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