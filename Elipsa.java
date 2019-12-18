package homework3;

public class Elipsa extends Krug {
	
	double a;
	double b;
	
	public double obim() {
		return a * Math.PI * (9 - Math.sqrt(35)) / 2;
	}
	
	public double povrsina() {
		return a * b * Math.PI;
	}
	
	public Elipsa() {
		a = 1;
		b = 2;
	}
	
	public Elipsa(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Elipsa(Elipsa e) {
		a = e.a;
		b = e.b;
}
}
