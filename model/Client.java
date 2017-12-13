package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	private String dateInscription;
	private String dateNaissance;
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
	public Client(String pseudo1, String motDePasse, String nom, String prenom,
			String dateInscription, String dateNaissance, String adresse, String adresseMail) {
		super(pseudo1, motDePasse, nom, prenom, 2);
		this.dateInscription = dateInscription;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.adresseMail = adresseMail;
		Connection conn = null;
        Statement stmt = null;
        int rs;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            String temp = "INSERT INTO personne (pseudo, motDePasse, nom, prenom, privilege, dateInscription, dateNaissance, adresse, adresseMail) VALUES ('" + pseudo1 + "', '" + motDePasse + "', '" + nom + "', '" + prenom + "', 2, '" + dateInscription + "', '" + dateNaissance + "', '" + adresse + "', '" + adresseMail + "')";
            rs = stmt.executeUpdate(temp);
            if (rs!=1) {
            	System.out.println("Erreur lors de l'insertion dans la BDD");
            }
            
        } catch (SQLException ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
    	finally {
    		    if (stmt != null) {
    		        try {
    		            stmt.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        stmt = null;
    		    }
    	}
		
	}
	public Client(String pseudo, String motDePasse, String nom, String prenom) {
		super(pseudo, motDePasse, nom, prenom, 2);
	}
	public Client(String pseudo, String motDePasse) {
		super(pseudo, motDePasse, 2);
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
	
	public String getDateInscription() {
		return dateInscription;
	}
	/**
	 * Mets en place la date d'inscription du client
	 * @param La date d'inscription du client
	 */
	public void setDateInscription(String dateInscription) {
		this.dateInscription = dateInscription;
	}
	/**
	 * Obtiens la date de naissance du client
	 * @return la date de naissance à donner au client
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}
	/**
	 *  Mets en place la date de naissance du client
	 * @param dateNaissance la date de naissance du client
	 */
	public void setDateNaissance(String dateNaissance) {
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
	 * Cette méthode donnera la liste des voitures qui ne sont pas encore louées
	 * @return Elle retournera la liste des voitures non louées
	 */
	public Voiture[] getListVoitureDisp() {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            rs = stmt.executeQuery("SELECT * FROM voiture WHERE estLouee=0");
            if(rs.next()) {
				rs.previous();
				return resultSetToVoitures(rs);
			}
			else throw new DataNotFoundException("Can't find this data in the database");
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
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM voiture INNER JOIN location ON voiture.voitID=location.voitureID where location.personneID="+this.getClientID());
            if(rs.next()) {
				rs.previous();
				return resultSetToVoitures(rs);
			}
			else throw new DataNotFoundException("Can't find this data in the database");
            
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
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT locationID FROM location WHERE voitureID="+voitID);
            
            while(rs.next()){
            	return Integer.parseInt(rs.getString("locationID"));

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
    	return 0;
	}
	/**
	 * Cette méthode donnera le tarif de chaque voiture. 
	 * @param voiture la voiture
	 * @param assurance L'assurance du client 
	 * @return Retournera le tarif final à payer
	 */
	@SuppressWarnings("resource")
	public double getTarif(int voitID, int assurID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        double prixVoiture;
        double prixAssurance;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT prix FROM voiture WHERE voitID="+voitID);

            if(rs.next()){
            	prixVoiture= Double.parseDouble(rs.getString("prix"));
        	}
            else {
            	return 0;
            }
            rs = stmt.executeQuery("SELECT prix FROM assurance WHERE assurID="+assurID);
            if(rs.next()) {
            prixAssurance=Double.parseDouble(rs.getString("prix"));
            }
            else {
            	return 0;
            }
            return prixVoiture+prixAssurance;
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
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM assurance");
            if(rs.next()) {
				rs.previous();
				return resultSetToAssurances(rs);
			}
			else throw new DataNotFoundException("Can't find this data in the database");
            
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
	public int createLocation(int voitID, int assurID) {
		Connection conn = null;
        Statement stmt = null;
        int result ;
        ResultSet rs = null;
        long kilometrage;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            	rs= stmt.executeQuery("SELECT kilometrage, estLouee from voiture where voitID="+voitID);
            	if(rs.next()) {
            		if(rs.getString("estLouee").equals("1")){
            			return -2;
            		}
            		kilometrage=Long.parseLong(rs.getString("kilometrage"));
            	}
            	else {
            		return -1;
            	}
            	//System.out.println(this.getClientID());
            	result = stmt.executeUpdate("insert into location (personneID, assurID, voitureID, accompte, accomptePaye, kmInitial) values ("+this.getClientID()+","+assurID+","+voitID+",200,0,"+kilometrage+")");
            	System.out.println("test2");
            	if(result>0) {
					result= stmt.executeUpdate("update voiture set estLouee=1 where voitID="+voitID);
					return 1;
				}
            	else {
            		return 0;
            	}
                    
    	} catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
    	finally {
    		 
    		    if (stmt != null) {
    		        try {
    		            stmt.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        stmt = null;
    		    }
    	}
		return 0;
	}
	
	public static void main(String[] args) {
		Client dewulf = new Client("dewulf", "dewulf", "dewulf", "dewulf");
		dewulf.getLocationID(11);
		System.out.println(dewulf.getTarif(11, 11));
		dewulf.setClientID(1);
		System.out.println(dewulf.createLocation(12, 11));
	}
	/**
	 * 
	 * @param rs un ResultSet issu d'un SELECT * from voiture
	 * @return un tableau de Voiture[] issu du ResultSet
	 */
	private Assurance[] resultSetToAssurances(ResultSet rs) {
		Assurance tempAssur[];
		int count = 0;
		try {
			while(rs.next()){
				count++; 
			}
			tempAssur = new Assurance[count];
			int countTwo = 0;
			while(rs.previous());
			while(rs.next()) {
				tempAssur[countTwo] = new Assurance(Integer.parseInt(rs.getString("assurID")), Double.parseDouble(rs.getString("prix")), rs.getString("type"), Double.parseDouble(rs.getString("prixKmSupp")));
				countTwo++;
			}
			return tempAssur;
		} catch (SQLException ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
        return null;
    }
	
	/**
	 * 
	 * @param rs un ResultSet issu d'un SELECT * from voiture
	 * @return un tableau de Voiture[] issu du ResultSet
	 */
	private Voiture[] resultSetToVoitures(ResultSet rs) {
		Voiture tempVoit[];
		int count = 0;
		try {
			while(rs.next()){
				count++; 
			}
			tempVoit = new Voiture[count];
			int countTwo = 0;
			boolean tempEstManuelle;
			boolean tempEstLouee;
			while(rs.previous());
			while(rs.next()) {
				if(Integer.parseInt(rs.getString("estManuelle"))==1) {
					tempEstManuelle = true;
				}
				else {
					tempEstManuelle = false;
				}
				if(Integer.parseInt(rs.getString("estLouee"))==1) {
					tempEstLouee = true;
				}
				else {
					tempEstLouee = false;
				}
				tempVoit[countTwo] = new Voiture(Integer.parseInt(rs.getString("voitID")), Double.parseDouble(rs.getString("prix")), rs.getString("marque"),rs.getString("modele"),  Integer.parseInt(rs.getString("annee")),  rs.getString("type"),  rs.getString("carburant"),  rs.getString("couleur"),  tempEstManuelle,  Integer.parseInt(rs.getString("roueMotrice")),  (long)Integer.parseInt(rs.getString("kilometrage")),  Double.parseDouble(rs.getString("volumeCoffre")),  Double.parseDouble(rs.getString("hauteur")),  Double.parseDouble(rs.getString("poids")),  tempEstLouee,  rs.getString("note"),  Integer.parseInt(rs.getString("agenceID")));
				countTwo++;
			}
			return tempVoit;
		} catch (SQLException ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
        return null;
    }
}
