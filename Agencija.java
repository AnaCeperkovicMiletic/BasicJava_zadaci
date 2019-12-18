package homework3_1;

import java.util.ArrayList;

public class Agencija {

	public static void main(String[] args) {
		
		ArrayList<Nekretnina> nekretnine = new ArrayList<Nekretnina>();
		
		Vlasnik v1 = new Vlasnik("Zoran", "Filipovic", "0101960801005", "001234567");
		Vlasnik v2 = new Vlasnik("Milica", "Milicevic", "3112959736150", "007654321");
		
		Nekretnina s1 = new Stan("Bulevar Nikole Tesle 152", 2, 105, 20, 35, v1);
		Nekretnina k1 = new Kuca("Jove Ilica 23", 3, 256, 100, v2);
		
		nekretnine.add(s1);
		nekretnine.add(k1);
		
		for (Nekretnina n : nekretnine) {
			System.out.println(n.toString());
		}
	}

}
