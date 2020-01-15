package homework5_1;

public class Student {
	
	String ime;
	String prezime;
	int brojPoena;
	int ocena = 0;
	
	public Student(String ime, String prezime, int brojPoena) throws Exception {
		
		if (brojPoena < 0 || brojPoena > 100) {
			throw new Exception("Broj poena mora biti od 0 do 100.");
		}
		this.ime = ime;
		this.prezime = prezime;
		this.brojPoena = brojPoena;
		
		if (brojPoena > 90) {
			ocena = 10;
		}
		else if (80 < brojPoena && brojPoena <= 90) {
			ocena = 9;
		}
		else if (70 < brojPoena && brojPoena <= 80) {
			ocena = 8;
		}
		else if (60 < brojPoena && brojPoena <= 70) {
			ocena = 7;
		}
		else if (50 < brojPoena && brojPoena <= 60) {
			ocena = 6;
		}
		else if (brojPoena <= 50) {
			ocena = 5;
		}
	}
	
	public String toString() {
		return "Ime i prezime studenta: " + ime + " " + prezime + " Broj poena: " + brojPoena + " Ocena: " + ocena;
	}
	
}