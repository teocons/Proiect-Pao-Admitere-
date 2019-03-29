
public class Sala {
	Facultate facultate;
	Cladire cladire;
	Integer numar, etaj;
	
	public Sala(Facultate facultate, Cladire cladire, Integer numar, Integer etaj) {
		super();
		this.facultate = facultate;
		this.cladire = cladire;
		this.numar = numar;
		this.etaj = etaj;
	}
	
	public Facultate getFacultate() {
		return facultate;
	}
	public void setFacultate(Facultate facultate) {
		this.facultate = facultate;
	}
	public Cladire getCladire() {
		return cladire;
	}
	public void setCladire(Cladire cladire) {
		this.cladire = cladire;
	}
	public Integer getNumar() {
		return numar;
	}
	public void setNumar(Integer numar) {
		this.numar = numar;
	}
	public Integer getEtaj() {
		return etaj;
	}
	public void setEtaj(Integer etaj) {
		this.etaj = etaj;
	}
}
