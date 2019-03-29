import java.util.List;

public class Corector extends Persoana{
	Facultate facultate;
	TitluUniversitar titlu;
	
	public Corector(String nume, String prenume, Adresa adresa, List<Integer> CNP, Facultate facultate,
			TitluUniversitar titlu) {
		super(nume, prenume, adresa, CNP);
		this.facultate = facultate;
		this.titlu = titlu;
	}
	
	public Facultate getFacultate() {
		return facultate;
	}
	public void setFacultate(Facultate facultate) {
		this.facultate = facultate;
	}
	public TitluUniversitar getTitlu() {
		return titlu;
	}
	public void setTitlu(TitluUniversitar titlu) {
		this.titlu = titlu;
	}
	
	
}
