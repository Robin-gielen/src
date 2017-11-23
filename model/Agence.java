package model;
public class Agence {
	private int agenceID;
	private String ville;
	private String adresse;
	
	public Agence(String ville, String adresse) {
		this.ville = ville;
		this.adresse = adresse;
	}
	

	public Agence(int agenceID, String ville, String adresse) {
		super();
		this.agenceID = agenceID;
		this.ville = ville;
		this.adresse = adresse;
	}


	public int getAgenceID() {
		return agenceID;
	}

	public void setAgenceID(int agenceID) {
		this.agenceID = agenceID;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "agenceID=" + agenceID + ", ville=" + ville + ", adresse=" + adresse;
	}
	
	

}

