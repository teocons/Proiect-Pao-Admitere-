import java.util.List;

public class Cladire {
	Adresa adresa;
	List<Sala> sali;
	
	public Cladire(Adresa adresa, List<Sala> sali) {
		super();
		this.adresa = adresa;
		this.sali = sali;
	}
	
	public void addSala(Sala sala) {
		this.sali.add(sala);
	}
	
	public void rmvSala(Sala sala) {
		this.sali.remove(sala);
	}
	
	public List<Sala> getSali() {
		return sali;
	}
	public void setSali(List<Sala> sali) {
		this.sali = sali;
	}
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	
}
