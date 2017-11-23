package model;
import java.time.LocalDate;
// Descampe Fabian
// 2TL2
// Groupe 15
/**
 * 
 * @author fabia
 * Cette classe représente un client avec ses informations personnelles 
 */
public class Client extends Personne {
	private int clientID;
	private LocalDate dateInscription;
	private LocalDate dateNaissance;
	private String adresse;
	private String adresseMail;
	/**
	 * C'est le constructeur utilisé pour créer le client
	 * @param pseudo Le pseudo du client
	 * @param motDePasse le mot de passe du client
	 * @param nom le nom du client
	 * @param prenom le prénom du client
	 * @param dateInscription la date à laquelle le client s'est inscrit
	 * @param dateNaissance la date de naissance du client
	 * @param adresse l'adresse où habite le client
	 * @param adresseMail l'adresse mail du client
	 */
	
	public Client(String pseudo, String motDePasse, String nom, String prenom,
			LocalDate dateInscription, LocalDate dateNaissance, String adresse, String adresseMail) {
		super(pseudo, motDePasse, nom, prenom, 2);
		this.dateInscription = dateInscription;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.adresseMail = adresseMail;
	}
	/**
	 * Obtiens l'ID du client
	 * @return clientID ID  à donner au client
	 */
	public int getClientID() {
		return clientID;
	}
	/**
	 * Mets en place un ID au client
	 * @param clientID l'ID du client
	 */
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	/**
	 * Obtiens la date d'inscription du client
	 * @return dateInscription la date d'inscription à donner au client
	 */
	
	public LocalDate getDateInscription() {
		return dateInscription;
	}
	/**
	 * Mets en place la date d'inscription du client
	 * @param La date d'inscription du client
	 */
	public void setDateInscription(LocalDate dateInscription) {
		this.dateInscription = dateInscription;
	}
	/**
	 * Obtiens la date de naissance du client
	 * @return la date de naissance à donner au client
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	/**
	 *  Mets en place la date de naissance du client
	 * @param dateNaissance la date de naissance du client
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * Obtiens l'adresse du client
	 * @return  l'adresse à donner au client
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * Mets en place l'adresse du client
	 * @param adresse l'adresse du cleitn
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * Obtiens l'adresse email du client
	 * @return l'adresse email à donner au client
	 */
	public String getAdresseMail() {
		return adresseMail;
	}
	/**
	 * Mets en place l'adresse email du client
	 * @param adresseMail l'adresse mail du client
	 */
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	/**
	 * Cette méthode donne une représentation textuelle du client
	 */
	@Override
	public String toString() {
		return super.toString()+ "clientID=" + clientID + ", dateInscription=" + dateInscription + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", adresseMail=" + adresseMail;
	}
	/**
	 * Cette méthode nécessite d'avoir accès à la bande de données.
	 */
	@Override
	public int connect(String pseudo, String motDePasse) {
		// Connexion à la base de données
		return 0;
	}
	/**
	 * Cette méthode donnera la liste des voitures qui ne sont pas encore louées
	 * @return Elle retournera la liste des voitures non louées
	 */
	public Voiture[] getListVoitureDisp() {
		// Besoin de la base de données
		return null;
	}
	/**
	 * Cette méthode donnera la liste des voitures déjà louées
	 * @return Elle retournera la liste des voitures déjà louées
	 */
	public Voiture[] getListVoitureLouees() {
		// Besoin de la base de données
		return null;
	}
	/**
	 * Cette méthode donnera la location de chaque voiture par leur ID
	 * @param voitID l'ID de chaque voiture
	 * @return Retournera l'ID de chaque voiture
	 */
	public int getLocationID(int voitID) {
		// Besoin de la base de données
		return 0;
	}
	/**
	 * Cette méthode donnera le tarif de chaque voiture. 
	 * @param voiture la voiture
	 * @param assurance L'assurance du client 
	 * @return Retournera le tarif final à payer
	 */
	public double getTarif(Voiture voiture, Assurance assurance) {
		// Besoin de la base de données
		return 0.0;
	}
	/**
	 * Cette méthode donne une liste des assurances
	 * @return Retournera la liste des assurances
	 */
	public Assurance[] getAssurance() {
		// Besoin de la base de données
		return null;
	}
	/**
	 * Cette méthode sert à valider la location pour qu'une location soit confirmer 
	 * @param voitID L'ID de la voiture
	 * @param assurID L'ID de l'assurance
	 * @return Retournera la validation de la location
	 */
	public int valideLocation(int voitID, int assurID) {
		// Besoin de la base de données
		return 0;
	}
}
