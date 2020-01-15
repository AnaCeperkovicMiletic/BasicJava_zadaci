package homework5_2;

import java.util.ArrayList;
import java.util.Scanner;
import homework5_2.Student;
import java.io.*;

public class Uvoz {

	public static void main(String[] args) {
		
		try {
			Scanner ulaz = new Scanner(new FileReader("C:\\Users\\Ana.Ceperkovic\\OneDrive - ENDAVA\\Endava\\Testing\\Java\\Practice\\Basic Java\\src\\homework5_2\\poeni.txt"));
			
			ArrayList<Student> studenti = new ArrayList<Student>();
			
			while (ulaz.hasNext()) {
				String ime = ulaz.next();
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
			
			System.out.println("Studenti su: ");
			
			for(Student s : studenti) {
				System.out.println(s.toString());
			}
		}
		catch (FileNotFoundException e){
			System.out.println("Datoteka nije pronadjena.");
		}

	}

}
