
public class Adresa {
	String judet, oras, strada;
	Integer nr;
	
	public Adresa(String judet, String oras, String strada, Integer nr) {
		super();
		this.judet = judet;
		this.oras = oras;
		this.strada = strada;
		this.nr = nr;
	}
	
	public Adresa() {
		this.judet = new String();
		this.oras = new String();
		this.strada = new String();
		this.nr = 0;
	}

	public Adresa(Adresa adresa) {
		this.judet = adresa.judet;
		this.oras = adresa.oras;
		this.strada = adresa.strada;
		this.nr = adresa.nr;
	}

	public String getJudet() {
		return judet;
	}

	public void setJudet(String judet) {
		this.judet = judet;
	}

	public String getOras() {
		return oras;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	public String getStrada() {
		return strada;
	}

	public void setStrada(String strada) {
		this.strada = strada;
	}

	public Integer getNr() {
		return nr;
	}

	public void setNr(Integer nr) {
		this.nr = nr;
	}
	
	public String getAdresa() {
		String outputStr;
		outputStr = "Jud." + this.judet
				+" Mun." + this.oras
				+" Str." + this.strada
				+" nr." + Integer.toString(this.nr) + "!.";
		return outputStr;
	}
	
}
