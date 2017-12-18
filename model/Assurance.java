package model;
/**
 * Cette classe implemente une assurance avec un ID, un prix, un prix au kilometre supplementaire et un type specifique.
 * @author fabia
 *
 */
public class Assurance {
	private int assurID;
	private double prix;
	private String type;
	private double prixKmSupp;
	/**
	 * Ce constructeur permet de creer une assurance en specifiant son prix, son prix au kilometre supplementaire et son type sans specifier l'ID de cette assurance.
	 * @param prix
	 * @param type
	 * @param prixKmSupp
	 */
	public Assurance(double prix, String type, double prixKmSupp) {
		super();
		this.prix = prix;
		this.type = type;
		this.prixKmSupp = prixKmSupp;
	}
	/**
	 * Ce constructeur creer une assurance en specifiant tout ses parametres
	 * @param assurID
	 * @param prix
	 * @param type
	 * @param prixKmSupp
	 */
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
	/**
	 * Cette methode permet d'afficher en chaine de caracteres les differents parametres d'une assurance.
	 */
	@Override
	public String toString() {
		return "assurID=" + assurID + ", prix=" + prix + ", type=" + type + ", prixKmSupp=" + prixKmSupp;
	}
}
