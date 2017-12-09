package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin extends Personne {
	private int adminID;
	Voiture [] voitures;
	
	public Admin() {
		super("pseudo", "motDePasse");
	}
	
	public Admin(String pseudo, String motDePasse, String nom, String prenom) {
		super(pseudo, motDePasse, nom, prenom, 0);
	}

	
	public Admin(String pseudo, String motDePasse) {
		super(pseudo, motDePasse);
	}

	/**
	 * @return the adminID
	 */
	public int getAdminID() {
		return adminID;
	}

	/**
	 * @param adminID the adminID to set
	 */
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	/**
	 * 
	 * @return le tableau des toutes les voitures qui existent 
	 */
	public Voiture[] getListVoit() {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM voiture");
            if(rs.next()) {
				rs.previous();
				return resultSetToVoitures(rs);
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
	 * @return le tableau des toutes les voitures louees
	 */
	public Voiture[] getListVoitLouees() {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM voiture WHERE estLouee='1'");
            if(rs.next()) {
				rs.previous();
				return resultSetToVoitures(rs);
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
	
	public String addVoiture(double prix, String marque, String modele, int annee, String carburant, String couleur, String type, boolean estManuelle, int roueMotrice, long kilometrage, double volumeCoffre, double hauteur, double poids, String note, int agenceID) {
		int tempEstManuelle;
		if (estManuelle) {
			tempEstManuelle = 1; 
		}
		else tempEstManuelle = 0;
		
		Connection conn = null;
        Statement stmt = null;
        int rs;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeUpdate("INSERT INTO voiture (prix, marque, modele, annee, carburant, couleur, type, estManuelle, roueMotrice, kilometrage, volumeCoffre, hauteur, poids, note, agenceID) VALUES (" + prix + ", '" + marque + "', '" + modele + "', " + annee + ", '" + carburant + "', '" + couleur + "', '" + type + "', " + tempEstManuelle + ", " + roueMotrice + ", " + kilometrage + ", " + volumeCoffre + ", " + hauteur + ", " + poids + ", '" + note + "', " + agenceID+")");
            if (rs == 1) {
                return ("Voiture ajoutée");
            }
            else return ("Voiture pas ajoutée");
            
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
    	return "Probleme co BDD";
	}

	public int rmVoiture(int voitID) {
		Connection conn = null;
        Statement stmt = null;
        int rs;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeUpdate("DELETE FROM voiture WHERE voitID =" + voitID);
            if (rs == 1) {
            	return 1;
            }
            else return 0;
            
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
    	return -1;
	}
	
	public Facture getFacture(int factID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM facture WHERE factID="+factID);
            if(rs.next()) {
				rs.previous();
				return resultSetToFactures(rs)[0];
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

	public Facture[] getFacturesClient(int clientID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT factID, location.locationID, techID, estPaye, note FROM facture INNER JOIN location ON facture.locationID=location.locationID INNER JOIN personne ON location.personneID = personne.personneID WHERE personne.personneID =" + clientID);
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
        System.out.println("Probleme co BDD");
    	return null;
	}
	
	public Client getClient(int clientID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personne WHERE personneID =" + clientID);
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
        System.out.println("Probleme co BDD");
    	return null;
	}
	
	public int rmClient(int clientID) {
		Connection conn = null;
        Statement stmt = null;
        int rs;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeUpdate("DELETE FROM personne WHERE personneID =" + clientID);
            if (rs == 1) {
            	return 1;
            }
            else return 0;
            
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
    	return -1;
	}
	
	public int alterClient(int clientID, String nom, String prenom, String dateInscription, String dateNaissance, String adresse, String adresseMail) {
		Connection conn = null;
        Statement stmt = null;
        int rs;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            String query = "UPDATE personne SET nom='" + nom + "', prenom='" + prenom + "', dateInscription='" + dateInscription + "', dateNaissance='" + dateNaissance + "', adresse='" + adresse + "', adresseMail='" + adresseMail +"' WHERE personneID =" + clientID;
            rs = stmt.executeUpdate(query);
            if (rs == 1) {
            	return 1;
            }
            else return 0;
            
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
    	return -1;
	}
	
	public Location getLocation(int locationID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM location WHERE locationID =" + locationID);
            if(rs.next()) {
				rs.previous();
				return resultSetToLocations(rs)[0];
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
        System.out.println("Probleme co BDD");
    	return null;
	}
	
	public Location[] getLocationsClient(int clientID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM location WHERE personneID =" + clientID);
            if(rs.next()) {
				rs.previous();
				return resultSetToLocations(rs);
			}
			else throw new DataNotFoundException("Can't find this data in the database");
        } catch (SQLException ex) {
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
	
	public int getClientIDFromVoitID(int voitId) {
		return 0;
	}
	
	public static void main(String[] args) {
		Admin admin = new Admin("moi", "moi", "moi", "moi");
		admin.connect("moi", "moi");
		/*Voiture listVoit[] = admin.getListVoit();
		for (Voiture voiture : listVoit) {
			System.out.println(voiture);
		}*/
		Voiture listVoit[] = admin.getListVoitLouees();
		if(listVoit!=null) {
			for (Voiture voiture : listVoit) {
				System.out.println(voiture);
			}
		}
		// Les méthodes misent en commentaires fonctionnent
		//System.out.println(admin.addVoiture(600.0, "opel", "corsa", 2015, "diesel", "rouge", "citadine", false, 4, 51213, 150.4, 194.5, 987.6, "Bonne voiture", 1));
		//System.out.println(admin.rmVoiture(16));
		//System.out.println(admin.getFacture(2));
		//System.out.println(admin.getFacturesClient(1));
		//System.out.println(admin.getClient(2));
		//System.out.println(admin.rmClient(4));
		//System.out.println(admin.alterClient(3, "michel", "goffin", "01-01-2000", "10-07-1998", "ruelle fay", "at@ephec.be"));
		//System.out.println(admin.getLocation(2));
		//System.out.println(admin.getLocationsClient(2));
	}
	
	@Override
	public int connect(String pseudo, String motDePasse) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personne WHERE pseudo='" +pseudo+"'" + "AND motDePasse='"+motDePasse+"'" + "AND privilege=0");
            if(rs.next()) {
            	System.out.println("personneID: " + rs.getString("personneID") + " pseudo: " + rs.getString("pseudo") + " mdp: " + rs.getString("motDePasse"));
	            if (rs.getString("pseudo").equals(pseudo) && rs.getString("motDePasse").equals(motDePasse)) {
	            	System.out.println("vous etes connecté");
	            	return 0; //connection OK 
	            }
	            else {
	            	System.out.println("vous n'etes pas connecté");
	            	return -1; //connection pas OK
	            }
            }
            else System.out.println("Cet utilisateur n'existe pas ou le mot de passe n'est pas le bon"); return -1;
        } catch (SQLException ex) {
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
			while(rs.previous());
			while(rs.next()) {
				if(Integer.parseInt(rs.getString("accomptePaye"))==1) {
					tempAccomptePaye = true; 
				}
				else tempAccomptePaye = false;
				tempLoc[countTwo] = new Location(Integer.parseInt(rs.getString("locationId")), Integer.parseInt(rs.getString("personneID")), Integer.parseInt(rs.getString("assurID")), Integer.parseInt(rs.getString("voitureID")), 
						Integer.parseInt(rs.getString("accompte")), tempAccomptePaye, Long.parseLong(rs.getString("kmInitial")));
				countTwo++;
			}
			return tempLoc;
		} catch (SQLException ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
        return null;
	}
	
	/**
	 * 
	 * @param rs un ResultSet issu d'un SELECT * from facture
	 * @return un tableau de factures correspondant aux factures de la requete SQL
	 */
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
				tempClient[countTwo] = new Client(rs.getString("pseudo"), rs.getString("motDePasse"), rs.getString("nom"), rs.getString("prenom"), rs.getString("dateInscription"), rs.getString("dateNaissance"), rs.getString("adresse"), rs.getString("adresseMail"));
				countTwo++;
			}
			return tempClient;
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
