package homework4_1;

public class Meso extends Proizvodi {
	
	String zivotinja;
	
	public double brutoCena() {
		return cenaProizvoda * 1.08;
	}
	
	public Meso(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String zivotinja) {
		
		this.imeProizvoda = imeProizvoda;
		this.cenaProizvoda = cenaProizvoda;
		this.rokTrajanja = rokTrajanja;
		this.zivotinja = zivotinja;
		
	}
}
