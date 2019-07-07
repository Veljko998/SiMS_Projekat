package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Kategorija;
import model.Korpa;
import model.Poslata;
import model.Prodavnica;
import model.Proizvod;
import model.RegistrovaniKupac;
import model.StavkaCenovnika;
import model.Uloga;
import model.Urucena;
import model.Vracena;
import model.WebShop;
import model.Zavrsena;

class TestClass {
	private static WebShop webShop;
	private static RegistrovaniKupac kupac;
	private static RegistrovaniKupac menadzer;
	private static SimpleDateFormat formatter;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		formatter = new SimpleDateFormat("dd.MM.yyyy.");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webShop = null;
		kupac = null;
		menadzer = null;
		formatter = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		webShop = new WebShop();
		kupac = new RegistrovaniKupac("Ime", "Prezime", formatter.parse("1.1.2000."), formatter.parse("6.7.2019."), Uloga.REGKUPAC, "korisnicko ime", "lozinka", "mejl", webShop);
		menadzer = new RegistrovaniKupac("Ime2", "Prezime2", formatter.parse("1.1.2002."), formatter.parse("6.7.2019."), Uloga.MENADZER, "korisnicko ime2", "lozinka2", "mejl2", webShop);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void dodajProizvodTest() {
		Proizvod proizvod1 = new Proizvod();
		StavkaCenovnika stavka1 = new StavkaCenovnika("0", 150, proizvod1);
		proizvod1.addStavkaCenovnika(stavka1);
		kupac.dodajProizvodUKorpu(proizvod1, 5);
		
		assertEquals(kupac.narudzbina.size(), 1);
		assertEquals(kupac.webShop.narudzbina.size(), 1);
		assertEquals(kupac.narudzbina.get(kupac.narudzbina.size() - 1).getUkupnaCena(), 750);
		assertTrue(kupac.narudzbina.get(kupac.narudzbina.size() - 1).getStanje() instanceof Korpa);
		
		Proizvod proizvod2 = new Proizvod();
		StavkaCenovnika stavka2 = new StavkaCenovnika("0", 150, proizvod2);
		proizvod2.addStavkaCenovnika(stavka2);
		kupac.dodajProizvodUKorpu(proizvod2, 5);
		
		assertEquals(kupac.narudzbina.size(), 1);
		assertEquals(kupac.webShop.narudzbina.size(), 1);
		assertEquals(kupac.narudzbina.get(kupac.narudzbina.size() - 1).getUkupnaCena(), 1500);
		assertTrue(kupac.narudzbina.get(kupac.narudzbina.size() - 1).getStanje() instanceof Korpa);
	}
	
	@Test
	void potvrdaPorudzbineTest() {
		Proizvod proizvod1 = new Proizvod();
		StavkaCenovnika stavka1 = new StavkaCenovnika("0", 150, proizvod1);
		proizvod1.addStavkaCenovnika(stavka1);
		kupac.dodajProizvodUKorpu(proizvod1, 5);
		
		Proizvod proizvod2 = new Proizvod();
		StavkaCenovnika stavka2 = new StavkaCenovnika("0", 150, proizvod2);
		proizvod2.addStavkaCenovnika(stavka2);
		kupac.dodajProizvodUKorpu(proizvod2, 5);
		
		kupac.narudzbina.get(kupac.narudzbina.size() - 1).poslatZahtev();
		
		assertTrue(kupac.narudzbina.get(kupac.narudzbina.size() - 1).getStanje() instanceof Zavrsena);
	}

	@Test
	void otkazivanjePorudzbineTest() {
		Proizvod proizvod1 = new Proizvod();
		StavkaCenovnika stavka1 = new StavkaCenovnika("0", 150, proizvod1);
		proizvod1.addStavkaCenovnika(stavka1);
		kupac.dodajProizvodUKorpu(proizvod1, 5);
		
		Proizvod proizvod2 = new Proizvod();
		StavkaCenovnika stavka2 = new StavkaCenovnika("0", 150, proizvod2);
		proizvod2.addStavkaCenovnika(stavka2);
		kupac.dodajProizvodUKorpu(proizvod2, 5);
		
		kupac.narudzbina.get(kupac.narudzbina.size() - 1).poslatZahtev();
		kupac.narudzbina.get(kupac.narudzbina.size() - 1).otkazanZahtev();
		
		assertTrue(kupac.narudzbina.get(kupac.narudzbina.size() - 1).getStanje() instanceof Korpa);
	}
	
	@Test
	void izvrsavanjeUplateTest() {
		Proizvod proizvod1 = new Proizvod();
		StavkaCenovnika stavka1 = new StavkaCenovnika("0", 150, proizvod1);
		proizvod1.addStavkaCenovnika(stavka1);
		kupac.dodajProizvodUKorpu(proizvod1, 5);
		
		Proizvod proizvod2 = new Proizvod();
		StavkaCenovnika stavka2 = new StavkaCenovnika("0", 150, proizvod2);
		proizvod2.addStavkaCenovnika(stavka2);
		kupac.dodajProizvodUKorpu(proizvod2, 5);
		
		kupac.narudzbina.get(kupac.narudzbina.size() - 1).poslatZahtev();
		kupac.platiNarudzbinu(750);

		assertFalse(kupac.narudzbina.get(kupac.narudzbina.size() - 1).getStanje() instanceof Poslata);
		assertFalse(kupac.narudzbina.get(kupac.narudzbina.size() - 1).isPlacena());
		
		kupac.platiNarudzbinu(1500);

		assertTrue(kupac.narudzbina.get(kupac.narudzbina.size() - 1).getStanje() instanceof Poslata);
		assertTrue(kupac.narudzbina.get(kupac.narudzbina.size() - 1).isPlacena());
	}
	
	@Test
	void urucivanjeNarudzbineTest() {
		Proizvod proizvod1 = new Proizvod();
		StavkaCenovnika stavka1 = new StavkaCenovnika("0", 150, proizvod1);
		proizvod1.addStavkaCenovnika(stavka1);
		kupac.dodajProizvodUKorpu(proizvod1, 5);
		
		Proizvod proizvod2 = new Proizvod();
		StavkaCenovnika stavka2 = new StavkaCenovnika("0", 150, proizvod2);
		proizvod2.addStavkaCenovnika(stavka2);
		kupac.dodajProizvodUKorpu(proizvod2, 5);
		
		kupac.narudzbina.get(kupac.narudzbina.size() - 1).poslatZahtev();
		kupac.platiNarudzbinu(1500);
		
		menadzer.webShop.oznaciUrucenuNarudzbinu(kupac);
		
		assertTrue(kupac.narudzbina.get(kupac.narudzbina.size() - 1).getStanje() instanceof Urucena);
	}
	
	@Test
	void vracanjeNarudzbineTest() {
		Proizvod proizvod1 = new Proizvod();
		StavkaCenovnika stavka1 = new StavkaCenovnika("0", 150, proizvod1);
		proizvod1.addStavkaCenovnika(stavka1);
		kupac.dodajProizvodUKorpu(proizvod1, 5);
		
		Proizvod proizvod2 = new Proizvod();
		StavkaCenovnika stavka2 = new StavkaCenovnika("0", 150, proizvod2);
		proizvod2.addStavkaCenovnika(stavka2);
		kupac.dodajProizvodUKorpu(proizvod2, 5);
		
		kupac.narudzbina.get(kupac.narudzbina.size() - 1).poslatZahtev();
		kupac.platiNarudzbinu(1500);
		
		menadzer.webShop.oznaciUrucenuNarudzbinu(kupac);
		menadzer.webShop.oznaciVracenuNarudzbinu(kupac);
		
		assertTrue(kupac.narudzbina.get(kupac.narudzbina.size() - 1).getStanje() instanceof Vracena);
	}
}
