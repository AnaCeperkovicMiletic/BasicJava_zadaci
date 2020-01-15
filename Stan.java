package homework3_1;

public class Stan extends Nekretnina {
	
	double povrsinaPodruma;
	double povrsinaTerase;
	
	public double cena() {
		
		double cena = kvadratura * cenaKvadrata() + ((povrsinaPodruma + povrsinaTerase) * cenaKvadrata() * 0.33);
		return cena;
	}
	
	public Stan(String adresa, int zona, double kvadratura, double povrsinaPodruma, double povrsinaTerase, Vlasnik v) {
		
		this.adresa = adresa;
		this.zona = zona;
		this.kvadratura = kvadratura;
		this.povrsinaPodruma = povrsinaPodruma;
		this.povrsinaTerase = povrsinaTerase;
		this.vlasnik = v;
		
	}
	
}
