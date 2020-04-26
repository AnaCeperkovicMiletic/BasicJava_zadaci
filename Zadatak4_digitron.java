package homework2;

import java.util.Scanner;

public class Zadatak4_digitron {

	public static int sabiranje(int a, int b) {
		return a + b;
	}

	public static int oduzimanje(int a, int b) {
		return a - b;
	}

	public static int mnozenje(int a, int b) {
		return a * b;
	}

	public static double deljenje(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		int a;
		int b;
		String operacija = "";

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite dva cela broja.");

		a = ulaz.nextInt();
		b = ulaz.nextInt();

		double rezultat = 0;

		boolean radi = true;
		while (radi) {
			System.out.println("Unesite operaciju (‘s’ – sabiranje, ‘o’ – oduzimanje, ‘m’ – množenje, ‘d’ – deljenje).");

			operacija = ulaz.next();
			
			switch (operacija) {
			case "s":
				rezultat = sabiranje(a, b);
				break;
			case "o":
				rezultat = oduzimanje(a, b);
				break;
			case "m":
				rezultat = mnozenje(a, b);
				break;
			case "d":
				rezultat = deljenje(a, b);
				break;
			default:
				radi = false;
			}
			if (radi) System.out.println("Rezultat je: " + rezultat);
		}

	}

}
