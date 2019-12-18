package homework3;

public class Nejednakostranicni extends Trougao {
	
	double f;
	double g;
	double h;

	public double obim() {
		return f + g + h;
	}

	public double povrsina() {
		double s = (f + g + h) / 2;
		return Math.sqrt(s * (s - f) * (s - g) * (s - h));
	}
	
	public Nejednakostranicni() {
		f = 4;
		g = 5;
		h = 6;
	}

	public Nejednakostranicni(double f, double g, double h) {
		
		if (((f + g) > h) && ((f + h) > g) && ((g + h) > f)) {
			this.f = f;
			this.g = g;
			this.h = h;
		}
		else {
			System.out.println("Ovo nije trougao. Zbir svake dve stranice mora biti veci od trece.");
		}
 	}

	public Nejednakostranicni(Nejednakostranicni nt) {
		f = nt.f;
		g = nt.g;
		h = nt.h;
	}

}
