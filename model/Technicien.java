package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://XT3-ZC:3306/newschema?autoReconnect=true&useSSL=false", "tanguybmx", "1234");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personne WHERE pseudo='" +pseudo+"'" + "AND motDePasse='"+motDePasse+"'" + "AND privilege=1");
            if(rs.next()) {
            	 System.out.println("personneID: " + rs.getString("personneID") + " pseudo: " + rs.getString("pseudo") + " mdp: " + rs.getString("motDePasse"));
                 if (rs.getString("pseudo").equals(pseudo) && rs.getString("motDePasse").equals(motDePasse)) {
                 	System.out.println("vous etes connect�");
                 	return 0; //connection OK 
                 }
                 else {
                 	System.out.println("vous etes pas connect�");
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
	 * cette méthode sert à récupérer une voiture pour afficher les attributs de celle-ci
	 * @param voitID c'est l'identifiant de la voiture 
	 * @return un objet de type voiture 
	 */
	public Voiture getVoiture(int voitID) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://XT3-ZC:3306/newschema?autoReconnect=true&useSSL=false", "tanguybmx", "1234");
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
	 * Cette méthode permet de modifier le kilometrage d'une voiture 
	 * @param voitID c'est l'identifiant d'une voiture
	 * @param kilometrage c'est le kilometrage lors de la fin de la location
	 */
	public void setKilometrage(int voitID, long kilometrage) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int result ;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://XT3-ZC:3306/newschema?autoReconnect=true&useSSL=false", "tanguybmx", "1234");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM voiture where voitID='"+voitID+"'");
            if(rs.next()) {
            	if(kilometrage>Long.parseLong(rs.getString("kilometrage"))) {
                	result = stmt.executeUpdate("update voiture set kilometrage="+kilometrage+" where voitID='"+voitID+"'");
                	System.out.println(result);
                //return ;
                }
                else {
                	System.out.println("Kilometrage inf�rieur au kilomtrage pr�c�dent");
                }
            }
            else {
            	System.out.println("Voiture existe pas");
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
	 * cette méthode permet d'ajouter une note par rapport à une location d'une voiture
	 * @param locationID c'est l'identifiant d'une location
	 * @param note c'est la note que l'on ajoute à une location
	 */
	public void setNote(int factID, String note) {
		Connection conn = null;
        Statement stmt = null;
        int result ;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://XT3-ZC:3306/newschema?autoReconnect=true&useSSL=false", "tanguybmx", "1234");
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
	 * cette méthode permet de modifier le faite que l'accompte à été payé ou non 
	 * @param locationID c'est l'identifiant d'une location
	 * @param estPaye c'est l'état de l'accompte d'une location true si payé, false si non payé
	 */
	public void setAccompteStatut(int locationID, boolean estPaye) {
		Connection conn = null;
        Statement stmt = null;
        int result ;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://XT3-ZC:3306/newschema?autoReconnect=true&useSSL=false", "tanguybmx", "1234");
            stmt = conn.createStatement();
            if(estPaye== true) {
                	result = stmt.executeUpdate("update location set accomptePaye='"+1+"' where locationID='"+locationID+"'");
                	System.out.println("l'accompte a �t� pay�");
            }
            else {
            	result = stmt.executeUpdate("update location set accomptePaye='"+0+"' where locationID='"+locationID+"'");
            	System.out.println("l'accompte n'est pas pay�");
            	
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
	 * cette méthode permet de créer une facture 
	 * @param locationID c'est la location à laquelle est lié la facture
	 * @param estPaye c'est l'état de payement d'une location true si payé, false si non payé
	 */
	public void createFacture(int locationID, boolean estPaye) {
		Connection conn = null;
        Statement stmt = null;
        int result ;
        ResultSet rs = null;
        int tempMontant = 0;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://XT3-ZC:3306/newschema?autoReconnect=true&useSSL=false", "tanguybmx", "1234");
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
				
				tempVoit[countTwo] = new Voiture(Integer.parseInt(rs.getString("voitID")), (double)Integer.parseInt(rs.getString("prix")), rs.getString("marque"),rs.getString("modele"),  Integer.parseInt(rs.getString("annee")),  rs.getString("type"),  rs.getString("carburant"),  rs.getString("couleur"),  tempEstManuelle,  Integer.parseInt(rs.getString("roueMotrice")),  (long)Integer.parseInt(rs.getString("kilometrage")),  (double)Integer.parseInt(rs.getString("volumeCoffre")),  (double)Integer.parseInt(rs.getString("hauteur")),  (double)Integer.parseInt(rs.getString("poids")),  tempEstLouee,  rs.getString("note"),  Integer.parseInt(rs.getString("agenceID")));
				countTwo++;
			}
			return tempVoit;
		} catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
        return null;
    }
	
	public static void main(String[] args) {
		Technicien dewulf = new Technicien("tech", "tech", "tech", "tech");
		dewulf.connect("tech", "tech");
		System.out.println(dewulf.getVoiture(11));
		dewulf.setKilometrage(11, 22000);
		dewulf.setNote(1, "Test");
		dewulf.setAccompteStatut(1, false);
		dewulf.createFacture(1, true);
		
	}
	
}
