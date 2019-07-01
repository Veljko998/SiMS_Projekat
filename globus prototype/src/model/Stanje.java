/***********************************************************************
 * Module:  Stanje.java
 * Author:  Nemanja
 * Purpose: Defines the Class Stanje
 ***********************************************************************/
package model;

import java.util.*;

/** @pdOid 6fcee5b6-308a-45d2-9752-42e64ba405a6 */
public abstract class Stanje {
   /** @pdRoleInfo migr=no name=Narudzbina assc=association18 mult=0..1 side=A */
   public Narudzbina narudzbina;
   
   /** @pdOid 6744f394-6abf-4766-ba1d-c4a4ae36596f */
   public void entry() {
      // TODO: implement
   }
   
   /** @pdOid 0212fb40-b759-438d-bbb9-466a28e8c248 */
   public void poslatZahtev() {
      // TODO: implement
   }
   
   /** @pdOid 29dec542-d5dc-416c-92e6-a1dad2f4067b */
   public void izvrsenaUplata() {
      // TODO: implement
   }
   
   /** @pdOid c08a3759-38ce-4625-993e-7632781f01d5 */
   public void otkazanZahtev() {
      // TODO: implement
   }
   
   /** @pdOid e5a8196a-7e54-460e-8599-148fba8fb582 */
   public void narudzbinaUrucena() {
      // TODO: implement
   }
   
   /** @pdOid ffcee406-8423-4b0c-97b7-91c4320bbde7 */
   public void narudzbinaVracena() {
      // TODO: implement
   }

}