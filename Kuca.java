package homework3_1;

public class Kuca extends Nekretnina {
	
	double povrsinaOkucnice;
	
	public double cena() {
		double cena = kvadratura * cenaKvadrata() + povrsinaOkucnice * cenaKvadrata() * 0.15;
		return cena;
	}
	
public Kuca(String adresa, int zona, double kvadratura, double povrsinaOkucnice, Vlasnik v) {
		
		this.adresa = adresa;
		this.zona = zona;
		this.kvadratura = kvadratura;
		this.povrsinaOkucnice = povrsinaOkucnice;
		this.vlasnik = v;
		
	}
}
