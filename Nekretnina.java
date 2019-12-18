package homework3_1;

public abstract class Nekretnina {

	protected String adresa;
	protected int zona;
	protected double kvadratura;

	protected Vlasnik vlasnik;

	public abstract double cena();

	public int cenaKvadrata() {
		int cenaKvadrata = 0;
		switch (zona) {
		case 1:
			cenaKvadrata = 3000;
			break;
		case 2:
			cenaKvadrata = 2000;
			break;
		case 3:
			cenaKvadrata = 1000;
			break;
		case 4:
			cenaKvadrata = 500;
			break;
		default: cenaKvadrata = 0;
		}
		return cenaKvadrata;
	}

	public String toString() {
		String imeKlase = this.getClass().toString().split("\\.")[1];
		return imeKlase + "\n Adresa: " + adresa + "\n Zona: " + zona + "\n Kvadratura: " + kvadratura + "\n Cena: " + cena() + "\n" + "Vlasnik \n" + vlasnik.toString();

	}
}
