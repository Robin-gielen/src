package test;
/**
 * @author Groupe 15
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import controller.AdminController;
import controller.ClientController;
import controller.TechnicienController;
import model.Admin;
import model.Client;
import model.Personne;
import model.Technicien;
import vue.AdminVue;
import vue.AdminVueConsole;
import vue.AdminVueGui;
import vue.ClientVue;
import vue.ClientVueConsole;
import vue.ClientVueGui;
import vue.TechnicienVue;
import vue.TechnicienVueConsole;
import vue.TechnicienVueGui;

public class PersonneMVC implements Observer{
	protected Scanner sc;

	public PersonneMVC() {
		update(null, null);
		sc = new Scanner(System.in);
		new Thread (new ReadInput()).start();	
	}

	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new PersonneMVC();
			}
		});
		
	}
	
	private class ReadInput implements Runnable{
		public void run() {
			boolean connecte = false;
			while(!connecte){
				try{
					printHelp();
					String c = sc.next();
					
					switch(c){
						case "oui" :
						affiche("Entrez votre login");
						String tempLogin= sc.next();
						affiche("Entrez votre mot de passe");
						String tempMdp=sc.next();
						Personne model = connect(tempLogin,tempMdp);
						if (model!=null) {
							if (model.getPrivilege()==0) {  // instanceof v�rifie si model est bien une instance de admin (evite les erreurs de cast)
								//Création des contrôleurs : Un pour chaque vue
								AdminController ctrlConsole = new AdminController((Admin)model);
								AdminController ctrlGui = new AdminController((Admin)model);
								
								//Création des vues.
								AdminVue vueConsole = new AdminVueConsole((Admin)model, ctrlConsole);
								AdminVue vueGui = new AdminVueGui((Admin)model, ctrlGui);
								
								//On donne la référence à la vue pour chaque contrôleur
								ctrlConsole.addView(vueConsole);
								ctrlGui.addView(vueGui);
								connecte = true;
							}
							else if (model.getPrivilege() == 1) { // instanceof v�rifie si model est bien une instance de technicien (evite les erreurs de cast)
								affiche("TEST 1");
								//Création des contrôleurs : Un pour chaque vue
								TechnicienController ctrlConsole = new TechnicienController((Technicien)model);
								TechnicienController ctrlGui = new TechnicienController((Technicien)model);
								
								//Création des vues.
								TechnicienVue vueConsole = new TechnicienVueConsole((Technicien)model, ctrlConsole);
								TechnicienVue vueGui = new TechnicienVueGui((Technicien)model, ctrlGui);
								
								//On donne la référence à la vue pour chaque contrôleur
								ctrlConsole.addView(vueConsole);
								ctrlGui.addView(vueGui);
								connecte = true;
							}
							else if (model.getPrivilege() == 2) {
								//Création des contrôleurs : Un pour chaque vue
								ClientController ctrlConsole = new ClientController((Client)model);
								ClientController ctrlGui = new ClientController((Client)model);
								
								//Création des vues.
								ClientVue vueConsole = new ClientVueConsole((Client)model, ctrlConsole);
								ClientVue vueGui = new ClientVueGui((Client)model, ctrlGui);
								
								//On donne la référence à la vue pour chaque contrôleur
								ctrlConsole.addView(vueConsole);
								ctrlGui.addView(vueGui);
								
								connecte = true;
							}
							else {
								affiche ("Il y a un probleme avec votre compte, si vous etes surs de vous, contactez un admin.");
							}
						}
						else affiche ("Votre nom d'utilisateur et/ou votre mot de passe est incorrect, si vous etes surs de vous, contactez un admin.");
						
							break;
						case"non" :
							affiche("Vous allez maintenant cr�er un compte.");
							affiche("Choisissez votre pseudo :");
							String pseudo = sc.next();
							while ((pseudo.length() < 0) || (pseudo.length() > 45)) {
								affiche("Format de pseudo incorrect (doit etre > 0 et < 45 en un seul mot), r�-entrez");
								pseudo = sc.next();
							}
							affiche("Choisissez votre mot de passe :");
							String motDePasse = sc.next();
							String dateInscription = LocalDate.now().toString();
							affiche("Entrez votre date de naissance, selon le format JJ-MM-AAAA :");
							String dateNaissance = sc.next();
							affiche("Entrez votre nom :");
							String nom = sc.next();
							affiche("Entrez votre pr�nom :");
							String prenom = sc.next();
							affiche("Entrez votre adresse :");
							String adresse = sc.next();
							affiche("Entrez votre adresse mail :");
							String adresseMail = sc.next();
							Client nouveauClient = new Client(pseudo, motDePasse, nom, prenom, dateInscription, dateNaissance, adresse, adresseMail, true, 0);
							System.out.println(nouveauClient);
							break;
						default : 
							affiche("Opération incorrecte");
							printHelp();
					}
				}
				catch(InputMismatchException e){
					affiche("Format d'input incorrect");
					printHelp();
				}
			}
		}
	
	}
	
	private void printHelp(){
		affiche("Avez-vous un compte : oui ou non");
		
	}
	
	public void affiche(String string) {
		System.out.println(string);
		
	}

	public Personne connect(String pseudo, String motDePasse) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test?autoReconnect=true&useSSL=false", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personne WHERE pseudo='" +pseudo+"'" + "AND motDePasse='"+motDePasse+"'");
            if(!rs.next()) {
            	return null;
            }
            if (rs.getString("pseudo").equals(pseudo) && rs.getString("motDePasse").equals(motDePasse)) {
            	if(Integer.parseInt(rs.getString("privilege"))==0) {
            		Admin admin = new Admin(pseudo, motDePasse, rs.getString("nom"), rs.getString("prenom"), Integer.parseInt(rs.getString("personneID")));
            		return admin;
            	}
            	else if(Integer.parseInt(rs.getString("privilege"))==1) {
            		Technicien technicien = new Technicien(pseudo, motDePasse, rs.getString("nom"), rs.getString("prenom"), Integer.parseInt(rs.getString("personneID")));
            		return technicien;
            	}
            	
            	else if(Integer.parseInt(rs.getString("privilege"))==2) {
            		Client client = new Client(pseudo, motDePasse, rs.getString("nom"), rs.getString("prenom"), rs.getString("dateInscription"), rs.getString("dateNaissance"), rs.getString("adresse"), rs.getString("adresseMail"), false, Integer.parseInt(rs.getString("personneID")));
            		return client;
            	}
            	else {
            		return null;
            	}
            }
            else {
            	return null;
            	
            }
            
        } catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        	return null; //connection pas OK
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

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
