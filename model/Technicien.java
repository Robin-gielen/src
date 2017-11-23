package model;

/**
 * cette classe implémente un technicien qui est une Personne qui est identifié par son techID
 * @author Tanguy Alexandre
 * 2TL2 
 * Groupe 15
 *
 */
public class Technicien extends Personne{
	private int techID;
	/**
	 * Ce constructeur permet de créer un technicien sans spécifier son techID qui sera créer dans la DB et son privilège sera par défaut à 1 (=technicien)
	 * @param pseudo c'est son pseudo pour se connecter à l'application
	 * @param motDePasse c'est son mot de passe pour ce connecter à l'application
	 * @param nom c'est son nom
	 * @param prenom c'est son prénom
	 */
	public Technicien(String pseudo, String motDePasse, String nom, String prenom) {
		super(pseudo, motDePasse, nom, prenom, 1);
	}
	/**
	 * Ce constructeur permet de créer un technicien 
	 * @param pseudo c'est son pseudo pour se connecter à l'application
	 * @param motDePasse c'est son mot de passe pour ce connecter à l'application
	 * @param nom c'est son nom
	 * @param prenom c'est son prénom
	 * @param privilege cela représente les privilèges qu'il aura (0=Admin, 1=Technicien, 2= Client)
	 * @param techID c'est l'identifiant du technicien
	 */
	public Technicien(String pseudo, String motDePasse, String nom, String prenom, int privilege, int techID) {
		super(pseudo, motDePasse, nom, prenom, privilege);
		this.techID = techID;
	}
	
	@Override
	/**
	 * Cette méthode permet d'afficher en chaine de caractère les différents attributs d'un technicien
	 */
	public String toString() {
		return super.toString()+"techID=" + techID;
	}

	@Override
	/**
	 * Cette méthode permetra au technicien de se connecter à l'application 
	 * @param pseudo c'est le pseudo du technicien
	 * @param motDePasse c'est le mot de passe du technicien
	 */
	public int connect(String pseudo, String motDePasse) {
		//A faire avec les sockets et la base de donnée
		return 0;
	}
	/**
	 * cette méthode sert à récupérer une voiture pour afficher les attributs de celle-ci
	 * @param voitID c'est l'identifiant de la voiture 
	 * @return un objet de type voiture 
	 */
	public Voiture getVoiture(int voitID) {
		//besoin de la base de donnée
		return null;
	}
	/**
	 * Cette méthode permet de modifier le kilometrage d'une voiture 
	 * @param voitID c'est l'identifiant d'une voiture
	 * @param kilometrage c'est le kilometrage lors de la fin de la location
	 */
	public void setKilometrage(int voitID, long kilometrage) {
		//besoin de la base de donnée
	}
	/**
	 * cette méthode permet d'ajouter une note par rapport à une location d'une voiture
	 * @param locationID c'est l'identifiant d'une location
	 * @param note c'est la note que l'on ajoute à une location
	 */
	public void setNote(int locationID, String note) {
		//besoin de la base de donnée
	}
	/**
	 * cette méthode permet de modifier le faite que l'accompte à été payé ou non 
	 * @param locationID c'est l'identifiant d'une location
	 * @param estPaye c'est l'état de l'accompte d'une location true si payé, false si non payé
	 */
	public void setAccompteStatut(int locationID, boolean estPaye) {
		//besoin de la base de donnée
		
	}
	/**
	 * cette méthode permet de créer une facture 
	 * @param locationID c'est la location à laquelle est lié la facture
	 * @param estPaye c'est l'état de payement d'une location true si payé, false si non payé
	 */
	public void createFacture(int locationID, boolean estPaye) {
		//besoin de la base de donnée
	}
	
}
