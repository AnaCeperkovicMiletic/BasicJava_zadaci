package homework4_2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Firma f = new Firma();
		
		Bolnica b = new Bolnica("Hipokrat", "Zdravko Lazic", new ArrayList<Zaposleni>());
		Bolnica b1 = new Bolnica("KBC Zvezdara", "Andja Ivkovic", new ArrayList<Zaposleni>());
		Bolnica b2 = new Bolnica("Zdravlje", "Ninoslav Tot", new ArrayList<Zaposleni>());
		
		Lekar l = new Lekar("Biljana", "Savic", "Majke Jevrosime 42", "0111234567", "1965-05-28", "Medicinski fakultet");
		Lekar l1 = new Lekar("Jovan", "Belic", "Jurija Gagarina 152", "0114444567", "1958-06-20", "Medicinski fakultet");
		Lekar l2 = new Lekar("Vukasin", "Mircov", "Glavna 36", "0114444555", "1983-01-10", "Medicinski fakultet");
		Lekar l3 = new Lekar("Ljubica", "Djukic", "Cara Nikolaja 89", "0111112222", "1978-12-02", "Medicinski fakultet");
		
		Osoblje o = new Osoblje("Dragan", "Karanovic", "Majska 22", "0117654321", "1972-02-01");
		Osoblje o1 = new Osoblje("Mila", "Zdravkovic", "Avalska 5", "0117777321", "1985-11-17");
		Osoblje o2 = new Osoblje("Radoje", "Tatic", "Juzni bulevar 77", "0113333888", "1960-09-22");
		Osoblje o3 = new Osoblje("Nikola", "Ugrinov", "Partizanske avijacije 123", "0115566778", "1979-04-09");
		
		MedicinskaSestra ms = new MedicinskaSestra("Dusica", "Miljkovic", "Vitanovacka 13", "0112233445", "1992-08-15", "prva");
		MedicinskaSestra ms1 = new MedicinskaSestra("Kristina", "Biorac", "Bulevar Milutina Milankovica 48", "0119988776", "1978-10-06", "treca");
		MedicinskaSestra ms2 = new MedicinskaSestra("Petar", "Krist", "Bulevar oslobodjenja 200", "0114998866", "1957-07-26", "druga");
		
		
		f.dodajBolnicu(b);
		f.dodajBolnicu(b1);
		f.dodajBolnicu(b2);
		
		b.dodajZaposlenog(l);
		b.dodajZaposlenog(l2);
		b.dodajZaposlenog(o);
		b.dodajZaposlenog(o1);
		b.dodajZaposlenog(ms1);
		
		b1.dodajZaposlenog(l1);
		b1.dodajZaposlenog(o3);
		b1.dodajZaposlenog(ms);
		
		b2.dodajZaposlenog(l);
		b2.dodajZaposlenog(l3);
		b2.dodajZaposlenog(o2);
		b2.dodajZaposlenog(ms2);
		
		System.out.println(f.toString());
		System.out.println("Broj zaposlenih u bolnici Hipokrat: " + b.brojZaposlenih);
		System.out.println("Broj zaposlenih u bolnici KBC Zvezdara: " + b1.brojZaposlenih);
		System.out.println("Broj zaposlenih u bolnici Zdravlje: " + b2.brojZaposlenih);

	}

}
