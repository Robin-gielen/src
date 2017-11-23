package model;

public class Assurance {
	private int assurID;
	private double prix;
	private String type;
	private double prixKmSupp;
	public Assurance(double prix, String type, double prixKmSupp) {
		super();
		this.prix = prix;
		this.type = type;
		this.prixKmSupp = prixKmSupp;
	}
	public Assurance(int assurID, double prix, String type, double prixKmSupp) {
		super();
		this.assurID = assurID;
		this.prix = prix;
		this.type = type;
		this.prixKmSupp = prixKmSupp;
	}
	public int getAssurID() {
		return assurID;
	}
	public void setAssurID(int assurID) {
		this.assurID = assurID;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrixKmSupp() {
		return prixKmSupp;
	}
	public void setPrixKmSupp(double prixKmSupp) {
		this.prixKmSupp = prixKmSupp;
	}
	@Override
	public String toString() {
		return "assurID=" + assurID + ", prix=" + prix + ", type=" + type + ", prixKmSupp=" + prixKmSupp;
	}
	
	
}
