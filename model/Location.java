package model;
/**
 * Cette classe implemente une location pour un client en prenant en compte l'ID du client, de l'assurance
 * de la voiture et renvoie un ID d'une location unique. Elle prend egalement en compte si il y a un accompte,
 * si il a ete paye et le kilimotrage initial de la voiture
 * 
 * @author fabia
 *
 */
public class Location {
	private int locationID;
	private int clientID;
	private int assurID;
	private int voitureID;
	private int accompte;
	private boolean accomptePaye;
	private long kmInitial;
	/**
	 * 
	 * @return l'ID de la location
	 */
	public int getLocationID() {
		return locationID;
	}
	/**
	 * 
	 * @param l'ID de la location associee au client pour cette voiture
	 */
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	/**
	 * 
	 * @return l'ID du client
	 */
	public int getClientID() {
		return clientID;
	}
	/**
	 * 
	 * @param l'ID du client associe a ue telle voiture
	 */
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	/**
	 * 
	 * l'ID de l'assurance
	 */
	public int getAssurID() {
		return assurID;
	}
	/**
	 * 
	 * @param l'ID de l'assurance du client associe a une telle voiture
	 */
	public void setAssurID(int assurID) {
		this.assurID = assurID;
	}
	/**
	 * 
	 * @return l'ID de la voiture
	 */
	public int getVoitureID() {
		return voitureID;
	}
	/**
	 * 
	 * @param L'ID de la voiture louee par un client avec une telle assurance
	 */
	public void setVoitureID(int voitureID) {
		this.voitureID = voitureID;
	}
	/**
	 * 
	 * @return une telle somme a payer avant la location
	 */
	public int getAccompte() {
		return accompte;
	}
	/**
	 * 
	 * @param une telle somme a payer avant la location
	 */
	public void setAccompte(int accompte) {
		this.accompte = accompte;
	}
	/**
	 * 
	 * @return estPaye, true si le client a payé sa location, false sinon
	 */
	public boolean isAccomptePaye() {
		return accomptePaye;
	}
	/**
	 * 
	 * @param accomptePaye si l'accompte et paye ou non
	 */
	public void setAccomptePaye(boolean accomptePaye) {
		this.accomptePaye = accomptePaye;
	}
	/**
	 * 
	 * @return le kilometrage initial de la voiture avant la location
	 */
	public long getKmInitial() {
		return kmInitial;
	}
	/**
	 * 
	 * @param kmInitial le kilometrage initial de la voiture avant la location
	 */
	public void setKmInitial(long kmInitial) {
		this.kmInitial = kmInitial;
	}
	/**
	 *
	 * @param clientID l'ID du client qui effectue la location
	 * @param assurID l'ID de l'assurance du client qui effectue une location
	 * @param voitureID l'ID de la voiture qui est louee par un client avec une assurance
	 * @param accompte une telle somme a payer avant la location
	 */
	public Location(int clientID, int assurID, int voitureID, int accompte) {
		this.clientID = clientID;
		this.assurID = assurID;
		this.voitureID = voitureID;
		this.accompte = accompte;
	}
	/**
	 * 
	 * @param locationID l'ID d'une location lorsqu'elle est creee
	 * @param clientID l'ID du client qui effectue la location
	 * @param assurID l'ID de l'assurance du client qui effectue une location
	 * @param voitureID l'ID de la voiture qui est louee par un client avec une assurance
	 * @param accompte une telle somme a payer avant la location
	 * @param accomptePaye true si le client a payé son accompte, false sinon
	 */
	public Location(int locationID, int clientID, int assurID, int voitureID, int accompte, boolean accomptePaye) {
		this.locationID = locationID;
		this.clientID = clientID;
		this.assurID = assurID;
		this.voitureID = voitureID;
		this.accompte = accompte;
		this.accomptePaye = accomptePaye;
	}
	/**
	 * 
	 * @param locationID l'ID d'une location lorsqu'elle est creee
	 * @param clientID l'ID du client qui effectue la location
	 * @param assurID l'ID de l'assurance du client qui effectue une location
	 * @param voitureID l'ID de la voiture qui est louee par un client avec une assurance
	 * @param accompte une telle somme a payer avant la location
	 * @param accomptePaye true si le client a payé son accompte, false sinon
	 * @param kmInitial le kilimetrage initial de la voiture avant la location
	 */
	public Location(int locationID, int clientID, int assurID, int voitureID, int accompte, boolean accomptePaye, long kmInitial) {
		this.locationID = locationID;
		this.clientID = clientID;
		this.assurID = assurID;
		this.voitureID = voitureID;
		this.accompte = accompte;
		this.accomptePaye = accomptePaye;
		this.kmInitial = kmInitial;
	}
	/**
	 * Cette methode affiche en chaine de caracteres les informations concernant la location
	 */
	@Override
	public String toString() {
		return "locationID=" + locationID + ", clientID=" + clientID + ", assurID=" + assurID + ", voitureID="
				+ voitureID + ", accompte=" + accompte + ", accomptePaye=" + accomptePaye;
	}
}
