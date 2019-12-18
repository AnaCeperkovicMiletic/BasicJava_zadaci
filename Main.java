package homework3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Geometrijska_slika> objekti = new ArrayList<Geometrijska_slika>();
		
		Geometrijska_slika k1 = new Krug(10);
		Geometrijska_slika k2 = new Krug((Krug)k1); 
		Geometrijska_slika k3 = new Krug();
		
		Geometrijska_slika e1 = new Elipsa();
		Geometrijska_slika e2 = new Elipsa(1, 10);
		Geometrijska_slika e3 = new Elipsa((Elipsa)e2);
		
		Geometrijska_slika kv1 = new Kvadrat();
		Geometrijska_slika kv2 = new Kvadrat(4);
		Geometrijska_slika kv3 = new Kvadrat((Kvadrat)kv2);
		
		Geometrijska_slika p1 = new Pravougaonik();
		Geometrijska_slika p2 = new Pravougaonik(3, 9);
		Geometrijska_slika p3 = new Pravougaonik((Pravougaonik)p1);
		
		Geometrijska_slika t1 = new Trougao();
		Geometrijska_slika t2 = new Trougao(5);
		Geometrijska_slika t3 = new Trougao((Trougao)t2);
		
		Geometrijska_slika nt1 = new Nejednakostranicni();
		Geometrijska_slika nt2 = new Nejednakostranicni(2, 5, 6);
		Geometrijska_slika nt3 = new Nejednakostranicni((Nejednakostranicni)nt1);
		
		objekti.add(k1);
		objekti.add(k2);
		objekti.add(k3);
		objekti.add(e1);
		objekti.add(e2);
		objekti.add(e3);
		objekti.add(kv1);
		objekti.add(kv2);
		objekti.add(kv3);
		objekti.add(p1);
		objekti.add(p2);
		objekti.add(p3);
		objekti.add(t1);
		objekti.add(t2);
		objekti.add(t3);
		objekti.add(nt1);
		objekti.add(nt2);
		objekti.add(nt3);
		
		for(Geometrijska_slika g: objekti) {
			System.out.println(g.toString());
		}

	}

}
