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
 * Cette classe reprÃ©sente un client avec ses informations personnelles 
 */
public class Client extends Personne {
	private int clientID;
	private String dateInscription;
	private String dateNaissance;
	private String adresse;
	private String adresseMail;
	
	/**
	 * C'est le constructeur utilisÃ© pour crÃ©er le client
	 * @param pseudo Le pseudo du client
	 * @param motDePasse le mot de passe du client
	 * @param nom le nom du client
	 * @param prenom le prÃ©nom du client
	 * @param dateInscription la date Ã  laquelle le client s'est inscrit
	 * @param dateNaissance la date de naissance du client
	 * @param adresse l'adresse oÃ¹ habite le client
	 * @param adresseMail l'adresse mail du client
	 */
	public Client(String pseudo1, String motDePasse, String nom, String prenom,
			String dateInscription, String dateNaissance, String adresse, String adresseMail, boolean insertInto, int clientID) {
		super(pseudo1, motDePasse, nom, prenom, 2);
		this.dateInscription = dateInscription;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.adresseMail = adresseMail;
		this.clientID = clientID;
		Connection conn = null;
        Statement stmt = null;
        int rs;
        if(insertInto) {
        	try {
        		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
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
	}
	
	/**
	 * Obtiens l'ID du client
	 * @return clientID ID  Ã  donner au client
	 */
	public int getClientID() {
		return clientID;
	}
	/**
	 * Obtiens la date d'inscription du client
	 * @return dateInscription la date d'inscription Ã  donner au client
	 */
	
	public String getDateInscription() {
		return dateInscription;
	}
	/**
	 * Obtiens la date de naissance du client
	 * @return la date de naissance Ã  donner au client
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
	 * @return  l'adresse Ã  donner au client
	 */
	public String getAdresse() {
		return adresse;
	}
	
	/**
	 * Obtiens l'adresse email du client
	 * @return l'adresse email Ã  donner au client
	 */
	public String getAdresseMail() {
		return adresseMail;
	}
	
	/**
	 * Cette mÃ©thode donne une reprÃ©sentation textuelle du client
	 */
	@Override
	public String toString() {
		return super.toString()+ "clientID=" + clientID + ", dateInscription=" + dateInscription + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", adresseMail=" + adresseMail;
	}
	
	/**
	 * Cette mÃ©thode donnera la liste des voitures qui ne sont pas encore louÃ©es
	 * @return Elle retournera la liste des voitures non louÃ©es
	 */
	public Voiture[] getListVoitureDisp() {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
    		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
    		stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM voiture WHERE estLouee=0");
            if(rs.next()) {
            	
				rs.previous();
				return resultSetToVoitures(rs);
			}
			else return null;
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
	 * Cette mÃ©thode donnera la liste des voitures dÃ©jÃ  louÃ©es
	 * @return Elle retournera la liste des voitures dÃ©jÃ  louÃ©es
	 */
	public Voiture[] getListVoitureLouees() {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
    		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
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
	 * Cette mÃ©thode donnera la location de chaque voiture par leur ID
	 * @param voitID l'ID de chaque voiture
	 * @return Retournera l'ID de chaque voiture
	 */
	public int getLocationID(int voitID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
    		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
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
	 * Cette mÃ©thode donnera le tarif de chaque voiture. 
	 * @param voiture la voiture
	 * @param assurance L'assurance du client 
	 * @return Retournera le tarif final Ã  payer
	 */
	@SuppressWarnings("resource")
	public double getTarif(int voitID, int assurID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        double prixVoiture;
        double prixAssurance;
    	try {
    		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
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
	 * Cette mÃ©thode donne une liste des assurances
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
	 * Cette mÃ©thode sert Ã  valider la location pour qu'une location soit confirmer 
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
    		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
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
        	result = stmt.executeUpdate("insert into location (personneID, assurID, voitureID, accompte, accomptePaye, kmInitial) values ("+this.getClientID()+","+assurID+","+voitID+",200,0,"+kilometrage+")");
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
	
	public Location[] getLocations() {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM location WHERE personneID = " +this.clientID);
            if(rs.next()) {
            	
				rs.previous();
				return resultSetToLocations(rs);
			}
			else throw new DataNotFoundException("Can't find this data in the database");
           
            
        } catch (SQLException ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        } catch (DataNotFoundException ex) {
        	System.out.println(ex.getMessage());
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
	
	public Facture[] getFactures() {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM facture INNER JOIN location ON facture.locationID=location.locationID WHERE location.personneID= " + this.clientID);
            if(rs.next()) {
				rs.previous();
				return resultSetToFactures(rs);
			}
			else throw new DataNotFoundException("Can't find this data in the database");
            
            
        } catch (SQLException ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        } catch (DataNotFoundException ex) {
        	System.out.println(ex.getMessage());
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
	
	private Location[] resultSetToLocations(ResultSet rs) {
		Location tempLoc[];
		int count = 0; 
		try {
			while(rs.next()){
				count++; 
			}
			tempLoc = new Location[count];
			int countTwo = 0;
			boolean tempAccomptePaye;
			boolean tempEstEnCours;
			while(rs.previous());
			while(rs.next()) {
				if(Integer.parseInt(rs.getString("accomptePaye"))==1) {
					tempAccomptePaye = true; 
				}
				else tempAccomptePaye = false;
				if(Integer.parseInt(rs.getString("estEnCours"))==1) {
					tempEstEnCours = true; 
				}
				else tempEstEnCours = false;
				tempLoc[countTwo] = new Location(Integer.parseInt(rs.getString("locationId")), Integer.parseInt(rs.getString("personneID")), Integer.parseInt(rs.getString("assurID")), Integer.parseInt(rs.getString("voitureID")), 
						Integer.parseInt(rs.getString("accompte")), tempAccomptePaye, Long.parseLong(rs.getString("kmInitial")), tempEstEnCours);
				countTwo++;
			}
			return tempLoc;
		} catch (SQLException ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
        return null;
	}
	
	private Facture[] resultSetToFactures(ResultSet rs) {
		Facture tempFact[];
		int count = 0;
		try {
			while(rs.next()){
				count++; 
			}
			tempFact = new Facture[count];
			int countTwo = 0;
			boolean tempEstPaye;
			while(rs.previous());
			while(rs.next()) {
				if(Integer.parseInt(rs.getString("estPaye"))==1) {
					tempEstPaye = true;
				}
				else {
					tempEstPaye = false;
				}
				tempFact[countTwo] = new Facture(Integer.parseInt(rs.getString("factID")), Integer.parseInt(rs.getString("locationID")), Integer.parseInt(rs.getString("techID")), tempEstPaye, rs.getString("note"));
				countTwo++;
			}
			return tempFact;
		} catch (SQLException ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
        return null;
	}
	/**
	 * Cette méthode retourne toutes les infos qui concernent l'admin courant
	 * @param 
	 * @return
	 */
	public Client getMesInfos() {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            String temp = "SELECT * FROM personne WHERE personneID = " + this.getClientID() + "";
            rs = stmt.executeQuery(temp);
            if(rs.next()) {
				rs.previous();
				return resultSetToClients(rs)[0];
			}
			else throw new DataNotFoundException("Can't find this data in the database");
           
            
        } catch (SQLException ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        } catch (DataNotFoundException ex) {
        	System.out.println(ex.getMessage());
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
	
	private Client[] resultSetToClients(ResultSet rs) {
		Client tempClient[];
		int count = 0;
		try {
			while(rs.next()){
				count++; 
			}
			tempClient = new Client[count];
			int countTwo = 0;
			while(rs.previous());
			while(rs.next()) {
				tempClient[countTwo] = new Client(rs.getString("pseudo"), rs.getString("motDePasse"), rs.getString("nom"), rs.getString("prenom"), rs.getString("dateInscription"), rs.getString("dateNaissance"), rs.getString("adresse"), rs.getString("adresseMail"), false, Integer.parseInt(rs.getString("clientID")));
				countTwo++;
			}
			return tempClient;
		} catch (SQLException ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
        return null;
	}
}