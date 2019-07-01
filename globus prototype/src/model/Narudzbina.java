/***********************************************************************
 * Module:  Narudzbina.java
 * Author:  Nemanja
 * Purpose: Defines the Class Narudzbina
 ***********************************************************************/
package model;

import java.util.*;

/** @pdOid 1aa7e77f-2a2b-45ea-8d17-a8482d6473d1 */
public class Narudzbina {
   /** @pdOid 1775c194-34ae-43ff-9d4e-feb774c9a7f0 */
   private String id;
   /** @pdOid 7e4abd51-080f-413e-a96d-96284723c354 */
   private double ukupnaCena;
   /** @pdOid a0ab2b44-d675-4684-97cb-c8e10c064a12 */
   private boolean placena;
   /** @pdOid c8f5ac47-588c-4ebc-9b0b-f0cd87978de6 */
   private Date datumPorudzbine;
   /** @pdOid e053ecc0-f550-4700-b672-2ecf50f843be */
   private Date ocekivanaIsporuka;
   /** @pdOid 0efd91fd-d81d-47f6-9a32-19cad34894cc */
   private String adresaIsporuke;
   
   /** @pdRoleInfo migr=no name=StavkaNarudzbine assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<StavkaNarudzbine> stavkaNarudzbine;
   /** @pdRoleInfo migr=no name=Stanje assc=association18 mult=0..1 */
   public Stanje stanje;
   /** @pdRoleInfo migr=no name=RegistrovaniKupac assc=association19 mult=0..1 */
   public RegistrovaniKupac registrovaniKupac;
   
   /** @pdOid 5e331f76-1849-4153-9b37-c58d77f1ac29 */
   public void zabraniPromenuNarudzbine() {
      // TODO: implement
   }
   
   /** @pdOid 53969457-cb8f-4c05-b025-4ae034b76121 */
   public void slanjeRobe() {
      // TODO: implement
   }
   
   /** @pdOid 6ac0c942-4041-4f2c-ba8d-cb94b9ee5c4b */
   public void poslatZahtev() {
      // TODO: implement
   }
   
   /** @pdOid d7be409d-9d16-4a40-a527-4709d1e0ad54 */
   public void izvrsenaUplata() {
      // TODO: implement
   }
   
   /** @pdOid 4b642d5c-2132-4124-ae98-afb058940858 */
   public void otkazanZahtev() {
      // TODO: implement
   }
   
   /** @pdOid f0d53adc-9690-4452-a037-e8f7fa05b08b */
   public void narudzbinaUrucena() {
      // TODO: implement
   }
   
   /** @pdOid b462688c-ef59-4ec6-87ec-aea3eb3321f5 */
   public void narudzbinaVracena() {
      // TODO: implement
   }
   
   /** @param stanje
    * @pdOid ece859ca-560f-4114-b522-f7fa2347a23f */
   public void promeniStanje(Stanje stanje) {
      // TODO: implement
   }
   
   /** @pdOid 10c5266a-4ec5-4c64-8153-ec02b62cdd64 */
   public void povracajNovca() {
      // TODO: implement
   }
   
   /** @param stavka
    * @pdOid 0e3bf1a1-c5ba-4fca-a1c0-1f26f030a518 */
   public void dodajStavku(StavkaNarudzbine stavka) {
      // TODO: implement
   }
   
   /** @param stavka
    * @pdOid c2ec7827-f383-48b7-8f80-bcf336120ba9 */
   public void obrisiStavku(StavkaNarudzbine stavka) {
      // TODO: implement
   }
   
   /** @param proizvod
    * @pdOid 0575a016-af31-4c01-a5b0-bfa3646dea5d */
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