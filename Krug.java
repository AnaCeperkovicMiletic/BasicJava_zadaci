package homework3;

public class Krug extends Geometrijska_slika {

	protected double poluprecnik;
	
	public double GetPoluprecnik() {
		return poluprecnik;
	}

	public double obim() {
		return 2 * poluprecnik * Math.PI;
	}

	public double povrsina() {

		return Math.pow(poluprecnik, 2) * Math.PI;
	}

	public Krug() {
		poluprecnik = 1;
	}

	public Krug(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	public Krug(Krug k) {
		poluprecnik = k.poluprecnik;
	}
}