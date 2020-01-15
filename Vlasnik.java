package homework3_1;

public class Vlasnik {
	
	String ime;
	String prezime;
	String jmbg;
	String licnaKarta;
	
	public String toString() {

		return " Ime: " + ime + "\n Prezime: " + prezime + "\n Maticni broj: " + jmbg + "\n Broj licne karte: " + licnaKarta;
	}
	
	public Vlasnik(String ime, String prezime, String jmbg, String licnaKarta) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.licnaKarta = licnaKarta;
	}
}
