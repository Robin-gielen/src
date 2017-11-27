package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	public Client(String pseudo, String motDePasse, String nom, String prenom) {
		super(pseudo, motDePasse, nom, prenom, 2);
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
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personne WHERE pseudo='" +pseudo+"'" + "AND motDePasse='"+motDePasse+"'" + "AND privilege=2");
            rs.next();
            System.out.println("personneID" + rs.getString("personneID") + "pseudo" + rs.getString("pseudo") + "mdp" + rs.getString("motDePasse"));
            if (rs.getString("pseudo").equals(pseudo) && rs.getString("motDePasse").equals(motDePasse)) {
            	System.out.println("vous etes connecté");
            	return 0; //connection OK 
            }
            else {
            	System.out.println("vous etes poas connecté");
            	return -1; //connection pas OK
            }
            
        } catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        	return -1; //connection pas OK
        }
    	finally {
    		 if (rs != null) {
    		        try {
    		            rs.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        rs = null;
    		    }

    		    if (stmt != null) {
    		        try {
    		            stmt.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        stmt = null;
    		    }
    	}
	}
	/**
	 * Cette méthode donnera la liste des voitures qui ne sont pas encore louées
	 * @return Elle retournera la liste des voitures non louées
	 */
	public Voiture[] getListVoitureDisp() {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int count = 0;
        Voiture tempVoit[];
    	try {
    		
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM voiture WHERE estLouee=0");
            
            while(rs.next()){
            	count++;
            	System.out.println("voitID "+ rs.getString("voitID") + " Modele " + rs.getString("modele") + " type "+ rs.getString("type") );
        	}
            tempVoit = new Voiture[count];
            int countTwo = 0;
            boolean tempEstManuelle;
            boolean tempEstLouee;
            while(rs.next()) {
            	if(rs.getString("estManuelle").equals("true")) {
            		tempEstManuelle = true;
            	}
            	else {
            		tempEstManuelle = false;
            	}
            	if(rs.getString("estLouee").equals("true")) {
            		tempEstLouee = true;
            	}
            	else {
            		tempEstLouee = false;
            	}
            	
            	tempVoit[countTwo] = new Voiture(Integer.parseInt(rs.getString("voitID")), (double)Integer.parseInt(rs.getString("prix")), rs.getString("marque"),rs.getString("modele"),  Integer.parseInt(rs.getString("annee")),  rs.getString("type"),  rs.getString("carburant"),  rs.getString("couleur"),  tempEstManuelle,  Integer.parseInt(rs.getString("roueMotrice")),  (long)Integer.parseInt(rs.getString("kilometrage")),  (double)Integer.parseInt(rs.getString("volumeCoffre")),  (double)Integer.parseInt(rs.getString("hauteur")),  (double)Integer.parseInt(rs.getString("poids")),  tempEstLouee,  rs.getString("note"),  Integer.parseInt(rs.getString("agenceID")));
            }
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
    	finally {
    		 if (rs != null) {
    		        try {
    		            rs.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        rs = null;
    		    }

    		    if (stmt != null) {
    		        try {
    		            stmt.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        stmt = null;
    		    }
    	}
		return null;
    	//return tempVoit;
	}
	/**
	 * Cette méthode donnera la liste des voitures déjà louées
	 * @return Elle retournera la liste des voitures déjà louées
	 */
	public Voiture[] getListVoitureLouees() {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM voiture WHERE estLouee=1 AND client='"+this.getPseudo()+"'");
            
            while(rs.next()){
            	System.out.println("voitID "+ rs.getString("voitID") + " Modele " + rs.getString("modele") + " type "+ rs.getString("type") );
        	}
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
    	finally {
    		 if (rs != null) {
    		        try {
    		            rs.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        rs = null;
    		    }

    		    if (stmt != null) {
    		        try {
    		            stmt.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        stmt = null;
    		    }
    	}
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
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM assurance");
            
            while(rs.next()){
            	System.out.println("assurID "+ rs.getString("assurID") + " Prix " + rs.getString("prix") + " type "+ rs.getString("type") + " prixKmSupp " + rs.getString("prixKmSupp"));
        	}
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
    	finally {
    		 if (rs != null) {
    		        try {
    		            rs.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        rs = null;
    		    }

    		    if (stmt != null) {
    		        try {
    		            stmt.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        stmt = null;
    		    }
    	}
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
	public static void main(String[] args) {
		Client dewulf = new Client("dewulf", "dewulf", "dewulf", "dewulf");
		dewulf.connect("dewulf", "dewulf");
	}
}
