package model;

public class Location {
	private int locationID;
	private int clientID;
	private int assurID;
	private int voitureID;
	private int accompte;
	private boolean accomptePaye;
	private long kmInitial;
	
	public int getLocationID() {
		return locationID;
	}
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	public int getClientID() {
		return clientID;
	}
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	public int getAssurID() {
		return assurID;
	}
	public void setAssurID(int assurID) {
		this.assurID = assurID;
	}
	public int getVoitureID() {
		return voitureID;
	}
	public void setVoitureID(int voitureID) {
		this.voitureID = voitureID;
	}
	public int getAccompte() {
		return accompte;
	}
	public void setAccompte(int accompte) {
		this.accompte = accompte;
	}
	public boolean isAccomptePaye() {
		return accomptePaye;
	}
	public void setAccomptePaye(boolean accomptePaye) {
		this.accomptePaye = accomptePaye;
	}
	public Location(int clientID, int assurID, int voitureID, int accompte) {
		this.clientID = clientID;
		this.assurID = assurID;
		this.voitureID = voitureID;
		this.accompte = accompte;
	}
	public Location(int locationID, int clientID, int assurID, int voitureID, int accompte, boolean accomptePaye) {
		this.locationID = locationID;
		this.clientID = clientID;
		this.assurID = assurID;
		this.voitureID = voitureID;
		this.accompte = accompte;
		this.accomptePaye = accomptePaye;
	}
	@Override
	public String toString() {
		return "locationID=" + locationID + ", clientID=" + clientID + ", assurID=" + assurID + ", voitureID="
				+ voitureID + ", accompte=" + accompte + ", accomptePaye=" + accomptePaye;
	}
	public long getKmInitial() {
		return kmInitial;
	}
	public void setKmInitial(long kmInitial) {
		this.kmInitial = kmInitial;
	}
}

