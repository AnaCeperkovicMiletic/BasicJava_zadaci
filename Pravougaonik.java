package homework3;

public class Pravougaonik extends Kvadrat {
	
	double x;
	double y;
	
	public double obim() {
		return 2 * x + 2 * y;
	} 

	public double povrsina() {
		return x * y;
	}
	
	public Pravougaonik() {
		x = 3;
		y = 4;
	}

	public Pravougaonik(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Pravougaonik(Pravougaonik p) {
		x = p.x;
		y = p.y;
	}

}
