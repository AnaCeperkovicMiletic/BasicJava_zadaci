package homework4_2;

import java.util.ArrayList;

public class Bolnica {
	
	String naziv;
	String direktor;
	int brojZaposlenih;
	
	ArrayList<Zaposleni> listaZaposlenih = new ArrayList<Zaposleni>();
	
	public Bolnica(String naziv, String direktor, ArrayList<Zaposleni> listaZaposlenih) {
		this.naziv = naziv;
		this.direktor = direktor;
		this.listaZaposlenih = listaZaposlenih;
		brojZaposlenih = listaZaposlenih.size();
	}
	
	public int brojLekara() {
		int brojacL = 0;
		for (Zaposleni z : listaZaposlenih) {
			if(z instanceof Lekar) {
				brojacL++;
			}
		}
		return brojacL;
	}
	
	public int brojOsoblja() {
		int brojacO = 0;
		for (Zaposleni z : listaZaposlenih) {
			if(z instanceof Osoblje) {
				brojacO++;
			}
		}
		return brojacO;
	}
	
	public int brojMedSestara() {
		int brojacMS = 0;
		for (Zaposleni z : listaZaposlenih) {
			if(z instanceof MedicinskaSestra) {
				brojacMS++;
			}
		}
		return brojacMS;
	}
	
	public void dodajZaposlenog(Zaposleni z) {
		listaZaposlenih.add(z);
		brojZaposlenih++;
	}

}
