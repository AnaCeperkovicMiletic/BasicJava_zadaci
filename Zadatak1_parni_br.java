package homework2;

import java.util.Scanner;

public class Zadatak1_parni_br {

	public static void main(String[] args) {
		int a;
		int b;

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite dva cela broja.");

		a = ulaz.nextInt();
		b = ulaz.nextInt();
		
		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}
		int d = a + 1;
		
		System.out.print("Parni brojevi su: ");
		
		while (d < b) {
				if (d % 2 == 0) System.out.print(d + " ");
				d++;
		}
	}
}
