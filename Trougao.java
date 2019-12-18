package homework3;

public class Trougao extends Geometrijska_slika {
	
	protected double krak;
	
	public double GetKrak() {
		return krak;
	}
	
	public double obim() {
		return krak * 3;
	}

	public double povrsina() {

		return Math.pow(krak, 2) * Math.sqrt(3) / 4;
	}
	
	public Trougao() {
		krak = 3;
	}

	public Trougao(double krak) {
		this.krak = krak;
	}

	public Trougao(Trougao t) {
		krak = t.krak;
	}

}
