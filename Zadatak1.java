package homework1;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		int slucajnoGenBroj;
		int unetiBroj;
		boolean provera = false;

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite ceo broj izmedju 1 i 50.");

		slucajnoGenBroj = 1 + (int) (Math.random() * 50);

		while (!provera) {
			unetiBroj = ulaz.nextInt();
			if (slucajnoGenBroj == unetiBroj) {
				System.out.println("Neverovatno! Pogodili ste tacan broj!");
				provera = true;
			} else if (Math.abs(slucajnoGenBroj - unetiBroj) <= 5) {
				System.out.println("Dobar pokusaj, bili ste jako blizu!");
			} else {
				System.out.println("Vise srece sledeci put...");
			}
		}

	}

}
