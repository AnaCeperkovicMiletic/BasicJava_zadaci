package homework4_2;

import java.util.ArrayList;

public class Firma {
	
	private ArrayList<Bolnica> bolnice = new ArrayList<Bolnica>();
	
	public String toString() {
		String s = "Broj bolnica koje firma poseduje je: " + bolnice.size() + "\n";
		s += "Ukupan broj lekara je: " + ukupnoL() + "\n";
		s += "Ukupan broj osoblja je: " + ukupnoO() + "\n";
		s += "Ukupan broj medicinskih sestara je: " + ukupnoMS();
		return s;
	}
	
	public void dodajBolnicu(Bolnica b) {
		bolnice.add(b);
	}
	
	public int ukupnoL() {
		int ukupanBrL = 0;
		for (Bolnica b : bolnice) {
			ukupanBrL += b.brojLekara();
		}
		return ukupanBrL;
	}
	
	public int ukupnoO() {
		int ukupanBrO = 0;
		for (Bolnica b : bolnice) {
			ukupanBrO += b.brojOsoblja();
		}
		return ukupanBrO;
	}
	
	public int ukupnoMS() {
		int ukupanBrMS = 0;
		for (Bolnica b : bolnice) {
			ukupanBrMS += b.brojMedSestara();
		}
		return ukupanBrMS;
	}
}
