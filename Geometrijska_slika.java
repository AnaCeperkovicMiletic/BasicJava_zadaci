package homework3;

public abstract class Geometrijska_slika {
	
	public abstract double obim();

	public abstract double povrsina();
	
	public String toString() {
		String imeKlase = this.getClass().toString().split("\\.")[1];
		return imeKlase + " ima obim " + obim() +" i povrsinu " + povrsina() + ".";
	}
}