package homework3;

public class Kvadrat extends Geometrijska_slika {
	
	protected double stranica;
	
	public double GetStranica() {
		return stranica;
	}
	
	public double obim() {
		return stranica * 4;
	}

	public double povrsina() {

		return Math.pow(stranica, 2);
	}
	
	public Kvadrat() {
		stranica = 2;
	}

	public Kvadrat(double stranica) {
		this.stranica = stranica;
	}

	public Kvadrat(Kvadrat kv) {
		stranica = kv.stranica;
	}
}