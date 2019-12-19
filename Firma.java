package homework4_1;

import java.util.ArrayList;

public class Firma {

		double kapital;
		
		ArrayList<Proizvodi> listaProizvoda = new ArrayList<Proizvodi>();
		
		public boolean porudzbina() {
			
			double zbirCena = 0;
			
			for (Proizvodi p : listaProizvoda) {
				
				zbirCena += p.brutoCena();
			}
			
			if (zbirCena<kapital) {
				
				kapital -= zbirCena;
				listaProizvoda.clear();
				return true;
			}
			else {
				return false;
			}
		}
}
