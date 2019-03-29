import java.util.List;

public class Persoana {
	String nume, prenume;
	Adresa adresa;
	List<Integer> CNP;
	public Persoana(String nume, String prenume, Adresa adresa, List<Integer> CNP) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.adresa = adresa;
		this.CNP = CNP;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	public List<Integer> getCNP() {
		return CNP;
	}
	public void setCNP(List<Integer> CNP) {
		this.CNP = CNP;
	}
}
