
public class Universitate {
	String nume;
	Facultate facultati;
	
	public Universitate(String nume, Facultate facultati) {
		super();
		this.nume = nume;
		this.facultati = facultati;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public Facultate getFacultati() {
		return facultati;
	}
	public void setFacultati(Facultate facultati) {
		this.facultati = facultati;
	}
}
