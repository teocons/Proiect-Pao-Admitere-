import java.util.List;

public class Sectie {
	
	Facultate facultate;
	String nume;
	List<Sala> sali;
	
	public Sectie(Facultate facultate, String nume, List<Sala> sali) {
		super();
		this.facultate = facultate;
		this.nume = nume;
		this.sali = sali;
	}
	
	public void addSala(Sala sala) {
		this.sali.add(sala);
	}
	
	public void rmvSala(Sala sala) {
		this.sali.remove(sala);
	}	

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public List<Sala> getSali() {
		return sali;
	}
	public void setSali(List<Sala> sali) {
		this.sali = sali;
	}
	public void setFacultate(Facultate facultate) {
		this.facultate = facultate;
	}
	public Facultate getFacultate() {
		return facultate;
	}

}
