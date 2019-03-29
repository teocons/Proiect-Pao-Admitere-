import java.util.List;

public class Facultate {
	Universitate universitate;
	List<Sala> sali;
	List<Sectie> sectii;
	String nume;
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Facultate(Universitate universitate, List<Sala> sali, List<Sectie> sectii, String nume) {
		super();
		this.universitate = universitate;
		this.sali = sali;
		this.sectii= sectii;
		this.nume = nume;
	}
	
	public void addSala(Sala sala) {
		this.sali.add(sala);
	}
	
	public void rmvSala(Sala sala) {
		this.sali.remove(sala);
	}
	
	public void addSectie(Sectie sectie) {
		this.sectii.add(sectie);
	}
	
	public void rmvSectie(Sectie sectie) {
		this.sectii.remove(sectie);
	}
	
	public Universitate getUniversitate() {
		return universitate;
	}
	public void setUniversitate(Universitate universitate) {
		this.universitate = universitate;
	}
	public List<Sala> getSali() {
		return sali;
	}
	public void setSali(List<Sala> sali) {
		this.sali = sali;
	}
	public List<Sectie> getSectii() {
		return sectii;
	}
	public void setSectii(List<Sectie> sectii) {
		this.sectii = sectii;
	}
}
