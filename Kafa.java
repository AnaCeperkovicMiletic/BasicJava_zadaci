package homework4_1;

public class Kafa extends Proizvodi {
	
	boolean mlevena;
	
	public double brutoCena() {
		return cenaProizvoda * 1.08;
	}
	
	public Kafa(String imeProizvoda, double cenaProizvoda, String rokTrajanja, boolean mlevena) {
		
		this.imeProizvoda = imeProizvoda;
		this.cenaProizvoda = cenaProizvoda;
		this.rokTrajanja = rokTrajanja;
		this.mlevena = mlevena;
		
	}
	
}
