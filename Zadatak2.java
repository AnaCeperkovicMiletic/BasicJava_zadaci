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

		System.out.println("Unesite operaciju (‘s’ – sabiranje, ‘o’ – oduzimanje, ‘m’ – množenje, ‘d’ – deljenje, ‘e’ - izlaz).");

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
		default: System.out.println("Nepostojeca operacija!");
		}
		System.out.println("Rezultat je: " + rezultat);
	}
}
