import java.util.List;

public class Examen {
	Sectie sectie;
	Subiect subiect;
	List<Candidat> candidati;
	Facultate facultate;
	List<Supraveghetor> supraveghetori;
	List<Corector> corectori;


	public Examen(Sectie sectie, Subiect subiect, List<Candidat> candidati, Facultate facultate,
			List<Supraveghetor> supraveghetori, List<Corector> corectori) {
		super();
		this.sectie = sectie;
		this.subiect = subiect;
		this.candidati = candidati;
		this.facultate = facultate;
		this.supraveghetori = supraveghetori;
		this.corectori = corectori;
	}

	public void addSupraveghetor(Supraveghetor supraveghetor) {
		this.supraveghetori.add(supraveghetor);
	}
	
	public void rmvSupraveghetor(Supraveghetor supraveghetor) {
		this.supraveghetori.remove(supraveghetor);
	}
	
	public void addCandidat(Candidat candidat) {
		this.candidati.add(candidat);		
	}	
	
	public void rmvCandidat(Candidat candidat) {
		this.candidati.remove(candidat);		
	}	
	
	
	
	public List<Supraveghetor> getSupraveghetori() {
		return supraveghetori;
	}
	public void setSupraveghetori(List<Supraveghetor> supraveghetori) {
		this.supraveghetori = supraveghetori;
	}
	public List<Corector> getCorectori() {
		return corectori;
	}
	public void setCorectori(List<Corector> corectori) {
		this.corectori = corectori;
	}
	public void setFacultate(Facultate facultate) {
		this.facultate = facultate;
	}	
	public Facultate getFacultate() {
		return sectie.getFacultate();
	}
	public Sectie getSectie() {
		return sectie;
	}
	public void setSectie(Sectie sectie) {
		this.sectie = sectie;
	}
	public Subiect getSubiect() {
		return subiect;
	}
	public void setSubiect(Subiect subiect) {
		this.subiect = subiect;
	}
	public List<Candidat> getCandidati() {
		return candidati;
	}

	public void setCandidati(List<Candidat> candidati) {
		this.candidati = candidati;
	}
	
	
}
