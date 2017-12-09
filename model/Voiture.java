package model;


public class Voiture {
	private int voitID;
	private double prix;
	private String marque;
	private String modele;
	private int annee;
	private String type;
	private String carburant;
	private String couleur;
	private boolean estManuelle =true;
	private int roueMotrice;
	private long kilmotrage;
	private double volumeCoffre;
	private double hauteur;
	private double poids;
	private boolean estLouee=false;
	private String note;
	private int agenceID;
	
	
	
	public Voiture(double prix, String marque, String modele, int annee, String type, String carburant, String couleur,
			boolean estManuelle, int roueMotrice, long kilmotrage, double volumeCoffre, double hauteur, double poids,
			int agenceID) {
		this.prix = prix;
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.type = type;
		this.carburant = carburant;
		this.couleur = couleur;
		this.estManuelle = estManuelle;
		this.roueMotrice = roueMotrice;
		this.kilmotrage = kilmotrage;
		this.volumeCoffre = volumeCoffre;
		this.hauteur = hauteur;
		this.poids = poids;
		this.agenceID = agenceID;
	}
	
	
	public Voiture(int voitID, double prix, String marque, String modele, int annee, String type, String carburant,
			String couleur, boolean estManuelle, int roueMotrice, long kilmotrage, double volumeCoffre, double hauteur,
			double poids, boolean estLouee, String note, int agenceID) {
		super();
		this.voitID = voitID;
		this.prix = prix;
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.type = type;
		this.carburant = carburant;
		this.couleur = couleur;
		this.estManuelle = estManuelle;
		this.roueMotrice = roueMotrice;
		this.kilmotrage = kilmotrage;
		this.volumeCoffre = volumeCoffre;
		this.hauteur = hauteur;
		this.poids = poids;
		this.estLouee = estLouee;
		this.note = note;
		this.agenceID = agenceID;
	}


	public int getVoitID() {
		return voitID;
	}
	public void setVoitID(int voitID) {
		this.voitID = voitID;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public boolean isEstManuelle() {
		return estManuelle;
	}
	public void setEstManuelle(boolean estManuelle) {
		this.estManuelle = estManuelle;
	}
	public int getRoueMotrice() {
		return roueMotrice;
	}
	public void setRoueMotrice(int roueMotrice) {
		this.roueMotrice = roueMotrice;
	}
	public long getKilmotrage() {
		return kilmotrage;
	}
	public void setKilmotrage(long kilmotrage) {
		this.kilmotrage = kilmotrage;
	}
	public double getVolumeCoffre() {
		return volumeCoffre;
	}
	public void setVolumeCoffre(double volumeCoffre) {
		this.volumeCoffre = volumeCoffre;
	}
	public double getHauteur() {
		return hauteur;
	}
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public boolean isEstLouee() {
		return estLouee;
	}
	public void setEstLouee(boolean estLouee) {
		this.estLouee = estLouee;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getAgenceID() {
		return agenceID;
	}
	public void setAgenceID(int agenceID) {
		this.agenceID = agenceID;
	}
	@Override
	public String toString() {
		return "voitID=" + voitID + ", prix=" + prix + ", marque=" + marque + ", modele=" + modele + ", annee="
				+ annee + ", type=" + type + ", carburant=" + carburant + ", couleur=" + couleur + ", estManuelle="
				+ estManuelle + ", roueMotrice=" + roueMotrice + ", kilmotrage=" + kilmotrage + ", volumeCoffre="
				+ volumeCoffre + ", hauteur=" + hauteur + ", poids=" + poids + ", estLouee=" + estLouee + ", note="
				+ note + ", agenceID=" + agenceID ;
	}
	
	
	
	
}
