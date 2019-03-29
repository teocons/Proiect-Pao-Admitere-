import java.util.List;

public class Subiect {
	Facultate facultate;
	List<Problema> probleme;
	
	public Subiect(Facultate facultate, List<Problema> probleme) {
		super();
		this.facultate = facultate;
		this.probleme = probleme;
	}
	
	public void addProblema(Problema problema) {
		this.probleme.add(problema);
	}
	public void rmvProblema(Problema problema) {
		this.probleme.remove(problema);
	}
	
	public Facultate getFacultate() {
		return facultate;
	}
	public void setFacultate(Facultate facultate) {
		this.facultate = facultate;
	}
	public List<Problema> getProbleme() {
		return probleme;
	}
	public void setProbleme(List<Problema> probleme) {
		this.probleme = probleme;
	}
}
