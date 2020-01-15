package homework4_1;

public class Sokovi extends Proizvodi {
	
	String voce;
	
	public double brutoCena() {
		return cenaProizvoda * 1.20;
	}
	
	public Sokovi(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String voce) {
		
		this.imeProizvoda = imeProizvoda;
		this.cenaProizvoda = cenaProizvoda;
		this.rokTrajanja = rokTrajanja;
		this.voce = voce;
		
	}
}
