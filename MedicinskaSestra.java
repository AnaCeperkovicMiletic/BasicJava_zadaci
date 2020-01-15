package homework4_2;

public class MedicinskaSestra extends Zaposleni {
	
	String smena;
	
	public MedicinskaSestra(String ime, String prezime, String adresa, String telefon, String datumRodjenja, String smena) {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.telefon = telefon;
		this.datumRodjenja = datumRodjenja;
		this.smena = smena;
	}
}
