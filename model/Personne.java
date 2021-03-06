package model;

//import java.sql.Connection;
//import java.sql.Statement;
import java.util.Observable;

public abstract class Personne extends Observable {
	private String pseudo;
	private String motDePasse;
	private String nom;
	private String prenom;
	private int privilege;
	
	public Personne(String pseudo, String motDePasse, int privilege) {
		this.pseudo = pseudo;
		this.motDePasse = pseudo;
		this.privilege = privilege;
	}
	
	public Personne(String pseudo, String motDePasse, String nom, String prenom, int privilege) {
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.privilege = privilege;
	}
	
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getPrivilege() {
		return privilege;
	}

	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}

	
	@Override
	public String toString() {
		return "pseudo=" + pseudo + ", motDePasse=" + motDePasse + ", nom=" + nom + ", prenom=" + prenom
				+ ", privilege=" + privilege;
	}
	
	
}
