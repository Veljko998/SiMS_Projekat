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
   
   public ArrayList<Proizvod> listaZelja;
   public ArrayList<Narudzbina> narudzbina;
   public WebShop webShop;

	public RegistrovaniKupac(String ime, String prezime, Date datumRodjenja, Date datumRegistrovanja, Uloga uloga,
			String korisnickoIme, String lozinka, String mejl) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.datumRegistrovanja = datumRegistrovanja;
		this.uloga = uloga;
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.mejl = mejl;
		
		this.listaZelja = new ArrayList<Proizvod>();
		this.narudzbina = new ArrayList<Narudzbina>();
	}
   
	public RegistrovaniKupac(String ime, String prezime, Date datumRodjenja, Date datumRegistrovanja, Uloga uloga,
			String korisnickoIme, String lozinka, String mejl, WebShop webShop) {
		this(ime, prezime, datumRodjenja, datumRegistrovanja, uloga, korisnickoIme, lozinka, mejl);

		this.webShop = webShop;
		this.webShop.addRegistrovaniKupac(this);
	}
	
   public void pregledajNarudzbine() {
      // TODO: implement
   }
   
   public void pregledajListuZelja() {
      // TODO: implement
   }
   
   public boolean platiNarudzbinu(double suma) {
      Narudzbina narudzbinaZaPlatiti = narudzbina.get(narudzbina.size() - 1);
      if (suma >= narudzbinaZaPlatiti.getUkupnaCena())
      {
    	  narudzbinaZaPlatiti.izvrsenaUplata();
    	  return true;
      }
      else
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
		if (narudzbina.isEmpty() || narudzbina.get(narudzbina.size() - 1).isPlacena())
			kreirajKorpu();

		double jedinicnaCena = proizvod.getStavkaCenovnika().get(proizvod.getStavkaCenovnika().size() - 1).getJedinicnaCena();
		double ukupnaCena = jedinicnaCena * kolicina;
		StavkaNarudzbine stavka = new StavkaNarudzbine(kolicina, jedinicnaCena, ukupnaCena, proizvod);
		narudzbina.get(narudzbina.size() - 1).dodajStavku(stavka);
   }
   
   public void obrisiProizvodIzKorpe(Proizvod proizvod) {
      // TODO: implement
   }
   
   public void kreirajKorpu() {
	   Narudzbina narudzbina1 = new Narudzbina("0", 0, false, null, null, null, this);
	   narudzbina.add(narudzbina1);
	   webShop.addNarudzbina(narudzbina1);
   }
   
   /** @pdGenerated default getter */
   public java.util.ArrayList<Proizvod> getListaZelja() {
      if (listaZelja == null)
         listaZelja = new java.util.ArrayList<Proizvod>();
      return listaZelja;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorListaZelja() {
      if (listaZelja == null)
         listaZelja = new java.util.ArrayList<Proizvod>();
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
         this.listaZelja = new java.util.ArrayList<Proizvod>();
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

   public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Date getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public Date getDatumRegistrovanja() {
		return datumRegistrovanja;
	}

	public void setDatumRegistrovanja(Date datumRegistrovanja) {
		this.datumRegistrovanja = datumRegistrovanja;
	}

	public Uloga getUloga() {
		return uloga;
	}

	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getMejl() {
		return mejl;
	}

	public void setMejl(String mejl) {
		this.mejl = mejl;
	}
}