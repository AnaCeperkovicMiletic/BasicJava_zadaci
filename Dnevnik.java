package homework5_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Dnevnik {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		boolean nastaviUnos = true;
		
		ArrayList<Student> studenti = new ArrayList<Student>();
		
		while (nastaviUnos) {
			System.out.println("Unesite ime studenta i broj poena. Za kraj unosa unesite 'e'.");
			
			String ime = ulaz.next();
			
			if (ime.equals("e")) {
				nastaviUnos = false;
				break;
			}
			
			String prezime = ulaz.next();
			int poeni = ulaz.nextInt();
			
			try {
				Student s = new Student(ime, prezime, poeni);
				studenti.add(s);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		studenti.sort((s1, s2) -> s1.brojPoena < s2.brojPoena ? 1 : -1);
		
		try {
			PrintWriter izlaz = new PrintWriter(new FileWriter("C:\\Users\\Ana.Ceperkovic\\OneDrive - ENDAVA\\Endava\\Testing\\Java\\Practice\\Basic Java\\src\\homework5_1\\ocene.txt"));
			
			for (Student s : studenti) {
				izlaz.println(s.toString());
			}
			izlaz.close();
		}
		catch (IOException e){
			System.out.println("Doslo je do greske u radu sa fajlom. " + e.getMessage());
		}
		
		System.out.println("Studenti su: ");
		
		for (Student s : studenti) {
			System.out.println(s.toString());
		}
	
	}

}
