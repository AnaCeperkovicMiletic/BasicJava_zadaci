package homework2;

import java.util.Scanner;

public class Zadatak3_pogadjanje {

	public static int slucajnoGenBroj;
	
	public static int proveraPogotka(int pogodak) {
		if (slucajnoGenBroj == pogodak) {
			return 0;
		} else if (Math.abs(slucajnoGenBroj - pogodak) <= 5) {
			return 1;
		} else {			
			return 2;
		}
	}
	public static void main(String[] args) {

		int unetiBroj;
		boolean provera = false;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite ceo broj izmedju 1 i 50.");

		slucajnoGenBroj = 1 + (int) (Math.random() * 50);

		while (!provera) {
			unetiBroj = ulaz.nextInt();
			if (proveraPogotka(unetiBroj) == 0) {
				System.out.println("Neverovatno! Pogodili ste tacan broj!");
				provera = true;
			}
			else if (proveraPogotka(unetiBroj) == 1) {
				System.out.println("Dobar pokusaj, bili ste jako blizu!");
			}
			else {
				System.out.println("Vise srece sledeci put...");
			}
			
		}

	}

}
