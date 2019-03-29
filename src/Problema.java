
public class Problema {
	Integer punctaj;
	String enunt;
	String barem;
	
	public Problema(Integer punctaj, String enunt, String barem) {
		super();
		this.punctaj = punctaj;
		this.enunt = enunt;
		this.barem = barem;
	}
	
	public Integer getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(Integer punctaj) {
		this.punctaj = punctaj;
	}
	public String getEnunt() {
		return enunt;
	}
	public void setEnunt(String enunt) {
		this.enunt = enunt;
	}
	public String getBarem() {
		return barem;
	}
	public void setBarem(String barem) {
		this.barem = barem;
	}
	
	
}
