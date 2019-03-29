import java.util.List;

public class Candidat extends Persoana{
	
	int medieBac;

	public Candidat(String nume, String prenume, Adresa adresa, List<Integer> CNP, int medieBac) {
		super(nume, prenume, adresa, CNP);
		this.medieBac = medieBac;
	}

	public int getMedieBac() {
		return medieBac;
	}

	public void setMedieBac(int medieBac) {
		this.medieBac = medieBac;
	}

	public String getNumeIntreg() {
		String str = getNume();
		str += " ";
		str += getPrenume();
		return str;
	}
}
