package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak5_niz {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite duzinu niza.");
		int duzina = ulaz.nextInt();
		
		int[] niz = new int[duzina];
		System.out.println("Unesite elemente niza.");
		for(int i = 0; i < duzina; i++) {
			niz[i] = ulaz.nextInt();
		}

		System.out.println("Niz: " + Arrays.toString(niz));
		
		int[] niz1 = Arrays.copyOf(niz, 5);
		System.out.println("Prvih pet elemenata niza je: " + Arrays.toString(niz1));
		
		System.out.println("Da li sadrzi broj: ");
		int nadji = ulaz.nextInt();
		Arrays.binarySearch(niz, nadji);
		System.out.println("Broj se nalazi na poziciji:" + Arrays.binarySearch(niz, nadji));
		
		Arrays.sort(niz);
		System.out.println("Sortirani niz: " + Arrays.toString(niz));
		
	}

}
