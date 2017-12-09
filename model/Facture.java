package model;

/**
 * @author robin-gielen
 * Classe 2TL2 
 * Groupe 15
 * 
 * Cette classe implémente une structure de type facture, permettant d'achever 
 * la la location d'un client en définissant le prix final et si le prix 
 * a été payé par le client ou pas encore
 */
public class Facture {
	private int factID;
	private double montant;
	private int locationID;
	private int techID;
	private boolean estPaye;
	
	/**
	 * @return l'ID d'une facture 
	 */
	public int getFactID() {
		return factID;
	}

	/**
	 * @return le montant de la facture 
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montant le prix de la location de la voiture, défini par la voiture louee 
	 * et par le type d'assurance choisie par le client
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * @return l'ID de la location associée au client pour cette voiture
	 */
	public int getLocationID() {
		return locationID;
	}

	/**
	 * @return l'ID du technicien qui a créé la facture (permet de 
	 * le retrouver en cas de problème)
	 */
	public int getTechID() {
		return techID;
	}

	/**
	 * @return estPaye, true si le client a payé sa location, false sinon
	 */
	public boolean isEstPaye() {
		return estPaye;
	}

	/**
	 * 
	 * @param estPaye, true si le client a payé sa location, false sinon
	 */
	public void setEstPaye(boolean estPaye) {
		this.estPaye = estPaye;
	}
	
	/**
	 * 
	 * @param locationID L'ID de la location effectuée par le client 
	 * lorsqu'il a validé la location de la voiture
	 * @param techID l'ID du technicien qui créé la facture
	 * @param estPaye, true si le client a payé sa location, false sinon
	 */
	public Facture(int locationID, int techID, boolean estPaye) {
		this.montant = this.CalculMontant();
		this.locationID = locationID;
		this.techID = techID;
		this.estPaye = estPaye;
	}
	
	/**
	 * Implémenté uniquement en cas de nécessité pour des tests ultérieurs
	 * @param factID l'ID de la facture
	 * @param locationID L'ID de la location effectuée par le client 
	 * lorsqu'il a validé la location de la voiture
	 * @param techID l'ID du technicien qui créé la facture
	 * @param estPaye, true si le client a payé sa location, false sinon
	 */
	public Facture(int factID, int locationID, int techID, boolean estPaye) {
		this.factID = factID;
		this.montant = this.CalculMontant();
		this.locationID = locationID;
		this.techID = techID;
		this.estPaye = estPaye;
	}
	
	/**
	 * Cette méthode affiche en chaine de caractères les informations relative à la facture courante
	 */
	@Override
	public String toString() {
		return "factID=" + factID + ", montant=" + montant + ", locationID=" + locationID + ", techID="
				+ techID + ", estPaye=" + estPaye;
	}
	
	/**
	 * Cette méthode calcul le prix de la location en fonction de la voiture et du type d'assurance.
	 * Elle va rechercher les différentes information dans la base de données à partir de l'ID de la location 
	 * assigné à la facture courante
	 * @return Le prix de la location de la voiture, en double
	 */
	public double CalculMontant() {
		Location tempLocation = this.getLocation();
		Assurance tempAssur = getAssurance(tempLocation.getAssurID());
		Voiture tempVoit = getVoiture(tempLocation.getVoitureID());
		return (tempAssur.getPrix() + tempVoit.getPrix());
	}
	
	/**
	 * Cette méthode retourne la location associée à la facture courante
	 * @return Location, associée à la facture courante
	 */
	public Location getLocation() {
		// recherche dans la BDD avec this.locationID
		// Creation d'une location d'essais pour tester la methode CalculMontant
		Location loca = new Location(0, 1, 2, 3, 4, false);
		return loca;
	}
	
	/**
	 * Cette méthode retourne la voiture associée à la facture courante
	 * @param voitID l'ID de la voiture associée à la facture courante
	 * @return Voiture, associée à la facture courante
	 */
	public Voiture getVoiture(int voitID) {
		// recherche dans la BDD
		// Creation d'une voiture d'essais pour tester la methode CalculMontant
		Voiture voit=new Voiture(500.0, "Opel", "Corsa", 2010, "citadine","Diesel", "noir", true, 2, 99000, 100.0, 130.0, 900.0, 0 );
		return voit;
	}
	
	/**
	 * Cette méthode retourne la voiture associée à la facture courante
	 * @param assurID l'ID de l'assurance associée à la facture courante
	 * @return Assurance, associée à la facture courante
	 */
	public Assurance getAssurance(int assurID) {
		// recherche dans la BDD
		// Creation d'une assurance d'essais pour tester la methode CalculMontant
		Assurance assur= new Assurance(0, 300.0, "OMNIUM", 1.2);
		return assur;
	}
}
