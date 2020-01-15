package homework4_1;

public class Test {

	public static void main(String[] args) {
		
		Proizvodi m = new MlecniProizvodi("Jogurt", 119.99, "2019-12-31", "Srbija");
		Proizvodi m1 = new MlecniProizvodi("Mleko", 129.99, "2020-01-31", "Slovenija");
		
		Proizvodi k = new Kafa("Grand", 99.99, "2021-07-12", true);
		Proizvodi k1 = new Kafa("Barcafe", 379.99, "2021-10-02", false);
		
		Proizvodi s = new Sokovi("Next", 94.99, "2020-03-25", "narandza");
		Proizvodi s1 = new Sokovi("Pago", 149.99, "2020-09-15", "jabuka");
		
		Proizvodi ms = new Meso("But", 519, "2019-12-25", "svinja");
		Proizvodi ms1 = new Meso("Batak", 259, "2019-12-21", "curka");
		
		Firma f = new Firma();
		f.kapital = 500000;
		f.listaProizvoda.add(m);
		f.listaProizvoda.add(m1);
		f.listaProizvoda.add(k);
		f.listaProizvoda.add(k1);
		f.listaProizvoda.add(s);
		f.listaProizvoda.add(s1);
		f.listaProizvoda.add(ms);
		f.listaProizvoda.add(ms1);
		
		System.out.println("Lista proizvoda za porudzbinu: ");
		for (Proizvodi p : f.listaProizvoda) {
			System.out.println("Ime proizvoda: " + p.imeProizvoda + ", Cena: " + p.cenaProizvoda);
		}
		
		if (f.porudzbina()) {
		System.out.println("Kapital je: " + f.kapital);
		}
		else {
			System.out.println("Nemate dovoljno kapitala.");
		}
	}

}
