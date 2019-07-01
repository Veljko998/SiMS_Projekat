/***********************************************************************
 * Module:  StavkaNarudzbine.java
 * Author:  Nemanja
 * Purpose: Defines the Class StavkaNarudzbine
 ***********************************************************************/
package model;

import java.util.*;

/** @pdOid 3755b045-db22-4811-9b04-6c8a993f0bbd */
public class StavkaNarudzbine {
   /** @pdOid 322c8471-c3e1-4edd-bdf5-b8d459de3e6a */
   private int narucenaKolicina;
   /** @pdOid 2f0bb2e4-2a92-452a-883c-1161fa3996c9 */
   private double jedinicnaCena;
   /** @pdOid 9e6f0365-725a-4e9e-9fdb-45e2b46237f4 */
   private double cena;
   
   /** @pdRoleInfo migr=no name=Proizvod assc=association10 mult=0..1 */
   public Proizvod proizvod;
   
   /** @param zaDodati
    * @pdOid deb39963-2984-4fb4-9209-747c09a97d14 */
   public void povecajKolicinu(int zaDodati) {
      // TODO: implement
   }
   
   /** @param smanjiZa
    * @pdOid 6ebb2a86-1c85-432d-8309-07f79877fec5 */
   public void smanjiKolicinu(int smanjiZa) {
      // TODO: implement
   }

}