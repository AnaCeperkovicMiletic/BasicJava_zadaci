package homework2;

import java.util.Scanner;

public class Zadatak2_najbolji_student {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Uneti broj studenata koji su polagali ispit ");

		int brojStudenata = ulaz.nextInt();
		String[] imenaStudenata = new String[brojStudenata];
		int[] brojPoena = new int[brojStudenata];

		for (int i = 0; i < brojStudenata; i++) {
			System.out.print("Uneti ime i ocenu studenta: ");

			imenaStudenata[i] = ulaz.next();
			brojPoena[i] = ulaz.nextInt();
		}
		int max = 0;
		for (int i = 0; i < brojStudenata; i++) {
			if (brojPoena[i] > max) max = brojPoena[i];
		}
		
		System.out.print("Studenti sa najvisim brojem poena na testu su: ");
		for (int i = 0; i < brojStudenata; i++) {
			if (max == brojPoena[i]) {
				System.out.print(imenaStudenata[i] + " ");
				
			}
		}
	}
}
