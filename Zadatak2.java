package homework1;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		int a;
		int b;
		String operacija = "";

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite dva cela broja.");

		a = ulaz.nextInt();
		b = ulaz.nextInt();

		System.out.println("Unesite operaciju (�s� � sabiranje, �o� � oduzimanje, �m� � mno�enje, �d� � deljenje, �e� - izlaz).");

		operacija = ulaz.next();

		double rezultat = 0;

		switch (operacija) {
		case "s":
			rezultat = a + b;
			break;
		case "o":
			rezultat = a - b;
			break;
		case "m":
			rezultat = a * b;
			break;
		case "d":
			rezultat = a / b;
			break;
		}
		System.out.println("Rezultat je: " + rezultat);
	}
}
