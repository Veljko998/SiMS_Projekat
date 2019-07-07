/***********************************************************************
 * Module:  StavkaNarudzbine.java
 * Author:  Nemanja
 * Purpose: Defines the Class StavkaNarudzbine
 ***********************************************************************/
package model;

import java.util.*;

public class StavkaNarudzbine {
   private int narucenaKolicina;
   private double jedinicnaCena;
   private double cena;
   
   public Proizvod proizvod;
   
   public StavkaNarudzbine(int narucenaKolicina, double jedinicnaCena, double ukupnaCena, Proizvod proizvod) {
	   this.narucenaKolicina = narucenaKolicina;
	   this.jedinicnaCena = jedinicnaCena;
	   this.cena = ukupnaCena;
	   this.proizvod = proizvod;
   }
   
   public void povecajKolicinu(int zaDodati) {
      // TODO: implement
   }
   
   public void smanjiKolicinu(int smanjiZa) {
      // TODO: implement
   }

	public int getNarucenaKolicina() {
		return narucenaKolicina;
	}
	
	public void setNarucenaKolicina(int narucenaKolicina) {
		this.narucenaKolicina = narucenaKolicina;
	}
	
	public double getJedinicnaCena() {
		return jedinicnaCena;
	}
	
	public void setJedinicnaCena(double jedinicnaCena) {
		this.jedinicnaCena = jedinicnaCena;
	}
	
	public double getCena() {
		return cena;
	}
	
	public void setCena(double cena) {
		this.cena = cena;
	}
}