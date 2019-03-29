import java.util.List;

public class Supraveghetor extends Persoana{
	Facultate facultate;

	
	public Supraveghetor(String nume, String prenume, Adresa adresa, List<Integer> CNP, Facultate facultate) {
		super(nume, prenume, adresa, CNP);
		this.facultate = facultate;
	}

	public Facultate getFacultate() {
		return facultate;
	}

	public void setFacultate(Facultate facultate) {
		this.facultate = facultate;
	}

}
