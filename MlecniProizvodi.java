package homework4_1;

public class MlecniProizvodi extends Proizvodi {
	
	String porekloMleka;
	
	public double brutoCena() {
		return cenaProizvoda * 1.20;
	}
	
	public MlecniProizvodi(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String porekloMleka) {
		
		this.imeProizvoda = imeProizvoda;
		this.cenaProizvoda = cenaProizvoda;
		this.rokTrajanja = rokTrajanja;
		this.porekloMleka = porekloMleka;
		
	}
	
}
