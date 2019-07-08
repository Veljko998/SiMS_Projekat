/***********************************************************************
 * Module:  Narudzbina.java
 * Author:  Nemanja
 * Purpose: Defines the Class Narudzbina
 ***********************************************************************/
package model;

import java.util.*;

public class Narudzbina {
   private String id;
   private double ukupnaCena;
   private boolean placena;
   private Date datumPorudzbine;
   private Date ocekivanaIsporuka;
   private String adresaIsporuke;
   private String imeKupca;
   private String prezimeKupca;
   
   public Narudzbina(String imeKupca, String prezimeKupca, String mejlKupca) {
	super();
	this.imeKupca = imeKupca;
	this.prezimeKupca = prezimeKupca;
	this.mejlKupca = mejlKupca;
}

private String mejlKupca;
   
   public ArrayList<StavkaNarudzbine> stavkaNarudzbine;
   private Stanje stanje;
   public RegistrovaniKupac registrovaniKupac;
   
   public Narudzbina(String id, double ukupnaCena, boolean placena, Date datumPorudzbine, Date ocekivanaIsporuka,
		   String adresaIsporuke, RegistrovaniKupac registrovaniKupac) {
		super();
		this.id = id;
		this.ukupnaCena = ukupnaCena;
		this.placena = placena;
		this.datumPorudzbine = datumPorudzbine;
		this.ocekivanaIsporuka = ocekivanaIsporuka;
		this.adresaIsporuke = adresaIsporuke;
		this.registrovaniKupac = registrovaniKupac;
		
		stavkaNarudzbine = new ArrayList<StavkaNarudzbine>();
		stanje = new Korpa(this);
	}

   public Narudzbina() {
	super();
	stavkaNarudzbine = new ArrayList<StavkaNarudzbine>();
	stanje = new Korpa(this);
}

public Narudzbina(String id, double ukupnaCena, boolean placena, Date datumPorudzbine, Date ocekivanaIsporuka,
		   String adresaIsporuke, String imeKupca, String prezimeKupca, String mejlKupca) {
		super();
		this.id = id;
		this.ukupnaCena = ukupnaCena;
		this.placena = placena;
		this.datumPorudzbine = datumPorudzbine;
		this.ocekivanaIsporuka = ocekivanaIsporuka;
		this.adresaIsporuke = adresaIsporuke;
		this.imeKupca = imeKupca;
		this.prezimeKupca = prezimeKupca;
		this.mejlKupca = mejlKupca;
		
		stavkaNarudzbine = new ArrayList<StavkaNarudzbine>();
		stanje = new Korpa(this);
	}
   
   public void zabraniPromenuNarudzbine() {
      // TODO: implement
   }
   
   public void dozvoliPromenuNarudzbine() {
	   // TODO: implement
   }
   
   public void slanjeRobe() {
      // TODO: implement
   }
   
   public void poslatZahtev() {
      stanje.poslatZahtev();
      
      this.datumPorudzbine = new Date();
      Calendar cal = Calendar.getInstance();
      cal.setTime(datumPorudzbine);
      cal.add(Calendar.DATE, 5);
      this.ocekivanaIsporuka = cal.getTime();
   }
   
   public void izvrsenaUplata() {
      stanje.izvrsenaUplata();
      placena = true;
   }
   
   public void otkazanZahtev() {
      stanje.otkazanZahtev();
      this.datumPorudzbine = null;
      this.ocekivanaIsporuka = null;
   }
   
   public void narudzbinaUrucena() {
      stanje.narudzbinaUrucena();
   }
   
   public void narudzbinaVracena() {
      stanje.narudzbinaVracena();
   }
   
   public void promeniStanje(Stanje stanje) {
      stanje.entry();
      this.stanje = stanje;
   }
   
   public void povracajNovca() {
      // TODO: implement
   }
   
   public void dodajStavku(StavkaNarudzbine stavka) {
      stavkaNarudzbine.add(stavka);
      ukupnaCena += stavka.getCena();
   }
   
   public void obrisiStavku(StavkaNarudzbine stavka) {
      // TODO: implement
   }
   
   public StavkaNarudzbine nadjiStavku(Proizvod proizvod) {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public ArrayList<StavkaNarudzbine> getStavkaNarudzbine() {
      if (stavkaNarudzbine == null)
         stavkaNarudzbine = new ArrayList<StavkaNarudzbine>();
      return stavkaNarudzbine;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStavkaNarudzbine() {
      if (stavkaNarudzbine == null)
         stavkaNarudzbine = new ArrayList<StavkaNarudzbine>();
      return stavkaNarudzbine.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStavkaNarudzbine */
   public void setStavkaNarudzbine(ArrayList<StavkaNarudzbine> newStavkaNarudzbine) {
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
         this.stavkaNarudzbine = new ArrayList<StavkaNarudzbine>();
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

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getUkupnaCena() {
		return ukupnaCena;
	}
	
	public void setUkupnaCena(double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}
	
	public boolean isPlacena() {
		return placena;
	}
	
	public void setPlacena(boolean placena) {
		this.placena = placena;
	}
	
	public Date getDatumPorudzbine() {
		return datumPorudzbine;
	}
	
	public void setDatumPorudzbine(Date datumPorudzbine) {
		this.datumPorudzbine = datumPorudzbine;
	}
	
	public Date getOcekivanaIsporuka() {
		return ocekivanaIsporuka;
	}
	
	public void setOcekivanaIsporuka(Date ocekivanaIsporuka) {
		this.ocekivanaIsporuka = ocekivanaIsporuka;
	}
	
	public String getAdresaIsporuke() {
		return adresaIsporuke;
	}
	
	public void setAdresaIsporuke(String adresaIsporuke) {
		this.adresaIsporuke = adresaIsporuke;
	}
	
	public String getImeKupca() {
		return imeKupca;
	}
	
	public void setImeKupca(String imeKupca) {
		this.imeKupca = imeKupca;
	}
	
	public String getPrezimeKupca() {
		return prezimeKupca;
	}
	
	public void setPrezimeKupca(String prezimeKupca) {
		this.prezimeKupca = prezimeKupca;
	}
	
	public String getMejlKupca() {
		return mejlKupca;
	}
	
	public void setMejlKupca(String mejlKupca) {
		this.mejlKupca = mejlKupca;
	}
	
	public Stanje getStanje() {
		return stanje;
	}
	
	public void setStanje(Stanje stanje) {
		this.stanje = stanje;
	}
	
	public RegistrovaniKupac getRegistrovaniKupac() {
		return registrovaniKupac;
	}
	
	public void setRegistrovaniKupac(RegistrovaniKupac registrovaniKupac) {
		this.registrovaniKupac = registrovaniKupac;
	}
}