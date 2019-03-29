import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EntityManager {
	Map<Candidat, Integer> punctaje;
	List<Candidat> candidati;
	List<Facultate> facultati;
	
	public EntityManager(Map<Candidat, Integer> punctaje, List<Candidat> candidati, List<Facultate> facultati) {
		super();
		this.punctaje = punctaje;
		this.candidati = candidati;
		this.facultati = facultati;
	}
	
	public EntityManager() {
		this.punctaje = new HashMap<Candidat, Integer>();
		this.candidati  = new ArrayList<Candidat>();
		this.facultati = new ArrayList<Facultate>();
	}
	
	public void afisarePunctaje() {	 
		
		Set< Map.Entry<Candidat ,Integer> > set = punctaje.entrySet();   
		
		for (Map.Entry<Candidat,Integer> rez : set) 
	       { 
	           System.out.print(rez.getKey().getNumeIntreg() + " are punctajul: "); 
	           System.out.println(rez.getValue()); 
	       } 
	}
	
	
	public void addFacultate(Facultate facultate) {
		facultati.add(facultate);
	}
	
	public void addCandidat(Candidat candidat) {
		candidati.add(candidat);
	}
	
	public void rmvFacultate(Facultate facultate) {
		facultati.remove(facultate);
	}
	
	public void rmvCandidat(Candidat candidat) {
		candidati.remove(candidat);
	}
	
	public void addPunctaj(Candidat candidat, Integer punctaj)
	{
		punctaje.put(candidat, punctaj);
	}
	
	public Integer getPunctaj(Candidat candidat) {
		return punctaje.get(candidat);
	}
	
	public Map<Candidat, Integer> getPunctaje() {
		return punctaje;
	}

	public void setPunctaje(Map<Candidat, Integer> punctaje) {
		this.punctaje = punctaje;
	}

	public List<Candidat> getCandidati() {
		return candidati;
	}

	public void setCandidati(List<Candidat> candidati) {
		this.candidati = candidati;
	}

	public List<Facultate> getFacultati() {
		return facultati;
	}

	public void setFacultati(List<Facultate> facultati) {
		this.facultati = facultati;
	}
	
	
	

	
	
}
