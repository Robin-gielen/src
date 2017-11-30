package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * cette classe implÃ©mente un technicien qui est une Personne qui est identifiÃ© par son techID
 * @author Tanguy Alexandre
 * 2TL2 
 * Groupe 15
 *
 */
public class Technicien extends Personne{
	private int techID;
	/**
	 * Ce constructeur permet de crÃ©er un technicien sans spÃ©cifier son techID qui sera crÃ©er dans la DB et son privilÃ¨ge sera par dÃ©faut Ã  1 (=technicien)
	 * @param pseudo c'est son pseudo pour se connecter Ã  l'application
	 * @param motDePasse c'est son mot de passe pour ce connecter Ã  l'application
	 * @param nom c'est son nom
	 * @param prenom c'est son prÃ©nom
	 */
	public Technicien(String pseudo, String motDePasse, String nom, String prenom) {
		super(pseudo, motDePasse, nom, prenom, 1);
	}
	/**
	 * Ce constructeur permet de crÃ©er un technicien 
	 * @param pseudo c'est son pseudo pour se connecter Ã  l'application
	 * @param motDePasse c'est son mot de passe pour ce connecter Ã  l'application
	 * @param nom c'est son nom
	 * @param prenom c'est son prÃ©nom
	 * @param privilege cela reprÃ©sente les privilÃ¨ges qu'il aura (0=Admin, 1=Technicien, 2= Client)
	 * @param techID c'est l'identifiant du technicien
	 */
	public Technicien(String pseudo, String motDePasse, String nom, String prenom, int privilege, int techID) {
		super(pseudo, motDePasse, nom, prenom, privilege);
		this.techID = techID;
	}
	
	public Technicien(String pseudo, String motDePasse) {
		super(pseudo, motDePasse);
	}
	
	@Override
	/**
	 * Cette mÃ©thode permet d'afficher en chaine de caractÃ¨re les diffÃ©rents attributs d'un technicien
	 */
	public String toString() {
		return super.toString()+"techID=" + techID;
	}

	@Override
	/**
	 * Cette mÃ©thode permetra au technicien de se connecter Ã  l'application 
	 * @param pseudo c'est le pseudo du technicien
	 * @param motDePasse c'est le mot de passe du technicien
	 */
	public int connect(String pseudo, String motDePasse) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_test?useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personne WHERE pseudo='" +pseudo+"'" + "AND motDePasse='"+motDePasse+"'" + "AND privilege=1");
            if(rs.next()) {
            	 System.out.println("personneID: " + rs.getString("personneID") + " pseudo: " + rs.getString("pseudo") + " mdp: " + rs.getString("motDePasse"));
                 if (rs.getString("pseudo").equals(pseudo) && rs.getString("motDePasse").equals(motDePasse)) {
                 	System.out.println("vous etes connecté");
                 	return 0; //connection OK 
                 }
                 else {
                 	System.out.println("vous etes pas connecté");
                 	return -1; //connection pas OK
                 }
            }
            else {
            	System.out.println("L'utilisateur ou le mot de passe est incorrect");
            	return -1;
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
	 * cette mÃ©thode sert Ã  rÃ©cupÃ©rer une voiture pour afficher les attributs de celle-ci
	 * @param voitID c'est l'identifiant de la voiture 
	 * @return un objet de type voiture 
	 */
	public Voiture getVoiture(int voitID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_test?useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM voiture where voitID='"+voitID+"'");
            return resultSetToVoitures(rs)[0];
            
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
	 * Cette mÃ©thode permet de modifier le kilometrage d'une voiture 
	 * @param voitID c'est l'identifiant d'une voiture
	 * @param kilometrage c'est le kilometrage lors de la fin de la location
	 */
	public int setKilometrage(int voitID, long kilometrage) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_test?useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM voiture where voitID='"+voitID+"'");
            if(rs.next()) {
            	if(kilometrage>Long.parseLong(rs.getString("kilometrage"))) {
                	return (stmt.executeUpdate("update voiture set kilometrage="+kilometrage+" where voitID='"+voitID+"'"));
                }
                else {
                	return 0;
                }
            }
            else {
            	return -1;
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
		return -1;
	}
	/**
	 * cette mÃ©thode permet d'ajouter une note par rapport Ã  une location d'une voiture
	 * @param locationID c'est l'identifiant d'une location
	 * @param note c'est la note que l'on ajoute Ã  une location
	 */
	public void setNote(int factID, String note) {
		Connection conn = null;
        Statement stmt = null;
        int result ;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_test?useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
                	result = stmt.executeUpdate("update facture set note='"+note+"' where factID='"+factID+"'");
                	System.out.println(result);
                //return ;
                    
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
	}
	/**
	 * cette mÃ©thode permet de modifier le faite que l'accompte Ã  Ã©tÃ© payÃ© ou non 
	 * @param locationID c'est l'identifiant d'une location
	 * @param estPaye c'est l'Ã©tat de l'accompte d'une location true si payÃ©, false si non payÃ©
	 */
	public void setAccompteStatut(int locationID, boolean estPaye) {
		Connection conn = null;
        Statement stmt = null;
        int result ;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_test?useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            if(estPaye== true) {
                	result = stmt.executeUpdate("update location set accomptePaye='"+1+"' where locationID='"+locationID+"'");
                	System.out.println("l'accompte a été payé : " + result);
            }
            else {
            	result = stmt.executeUpdate("update location set accomptePaye='"+0+"' where locationID='"+locationID+"'");
            	System.out.println("l'accompte n'est pas payé : " + result);
            	
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
	}
		
	/**
	 * cette mÃ©thode permet de crÃ©er une facture 
	 * @param locationID c'est la location Ã  laquelle est liÃ© la facture
	 * @param estPaye c'est l'Ã©tat de payement d'une location true si payÃ©, false si non payÃ©
	 */
	public void createFacture(int locationID, boolean estPaye) {
		Connection conn = null;
        Statement stmt = null;
        int result ;
        ResultSet rs = null;
        int tempMontant = 0;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_test?useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT voiture.prix+assurance.prix as montant FROM voiture JOIN location ON voiture.voitID=location.voitureID JOIN assurance ON location.assurID=assurance.assurID where location.locationID="+locationID);
            if (rs.next()) {
            	tempMontant=Integer.parseInt(rs.getString("montant"));
            }
            else System.out.println("data pas trouv�e dans BDD"); 
            if(estPaye== false && tempMontant!=0){
				result = stmt.executeUpdate("insert into facture (montant, locationID, techID, estPaye, note) values ("+tempMontant+","+ locationID+", 1, 0, \"note facture\")");
            	System.out.println(result);
				}
			else if (estPaye==true && tempMontant!=0){
				result= stmt.executeUpdate("insert into facture (montant, locationID, techID, estPaye, note) values ("+tempMontant+","+ locationID+", 1, 1, \"note facture\")");
			}
			else {
				System.out.println("probleme connexion BDD");
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
	
	public Location getLocationsClient(int clientID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM location WHERE personneID =" + clientID);
            if(rs.next()) {
				rs.previous();
				return resultSetToLocations(rs)[0];
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
	
	public Facture getFacture(int factID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM facture");
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

	public Facture getFacturesClient(int clientID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT factID, location.locationID, techID, estPaye, note FROM facture INNER JOIN location ON facture.locationID=location.locationID INNER JOIN personne ON location.personneID = personne.personneID WHERE personne.personneID =" + clientID);
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
        System.out.println("Probleme co BDD");
    	return null;
	}
	
	/**
	 * 
	 * @param rs un ResultSet issu d'un SELECT * from voiture
	 * @returnun tableau de Voiture[] issu du ResultSet
	 */
	public Voiture[] resultSetToVoitures(ResultSet rs) {
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
		} catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
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
	public static void main(String[] args) {
		Technicien dewulf = new Technicien("moi", "moi", "moi", "moi");
		dewulf.connect("moi", "moi");
		System.out.println(dewulf.getVoiture(23));
		//dewulf.setKilometrage(11, 22000);
		//dewulf.setNote(1, "Test");
		//dewulf.setAccompteStatut(1, false);
		//dewulf.createFacture(2, false);
		
	}
	
}
