package model;
/**
 * Cette classe implemente une agence avec un ID, une ville et une adresse
 * @author fabia
 *
 */
public class Agence {
	private int agenceID;
	private String ville;
	private String adresse;
	/**
	 * Ce constructeur creer une agence en specifiant sa ville et son adresse
	 * @param ville de l'agence
	 * @param adresse de l'agence
	 */
	
	public Agence(String ville, String adresse) {
		this.ville = ville;
		this.adresse = adresse;
	}
	/**
	 * Ce constructeur creer une agence avec ID specifique, une ville et son adresse
	 * @param agenceID specifique a chaque agence
	 * @param ville de l'agence
	 * @param adresse de l'agence
	 */

	public Agence(int agenceID, String ville, String adresse) {
		super();
		this.agenceID = agenceID;
		this.ville = ville;
		this.adresse = adresse;
	}
	/**
	 * Permet de recuperer l'ID de l'agence
	 * @return l'ID de l'agence a obtenir
	 */

	public int getAgenceID() {
		return agenceID;
	}
	/**
	 * 
	 * @param agenceID l'ID de l'agence a mettre
	 */

	public void setAgenceID(int agenceID) {
		this.agenceID = agenceID;
	}
	/**
	 * Obtiens la ville de l'agence
	 * @return
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * 
	 * @param ville de l'agence a mettre
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * Obtiens l'adresse de l'agence
	 * @return
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * 
	 * @param adresse de l'agence a mettre
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * Cette methode permet d'afficher en chaine de caracteres les differents parametres d'une agence 
	 */

	public String toString() {
		return "agenceID=" + agenceID + ", ville=" + ville + ", adresse=" + adresse;
	}

}

