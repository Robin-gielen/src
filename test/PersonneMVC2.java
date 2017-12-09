package test;
/**
 * @author Groupe 15
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import vue.ClientVue;
import vue.ClientVueConsole;
import vue.TechnicienVue;
import vue.TechnicienVueConsole;

public class PersonneMVC2 implements Observer{
	protected Scanner sc;

	public PersonneMVC2() {
		update(null, null);
		sc = new Scanner(System.in);
		new Thread (new ReadInput()).start();	
	}

	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new PersonneMVC2();
			}
		});
		
	}
	
	private class ReadInput implements Runnable{
		public void run() {
			while(true){
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
						if (((Admin)model).getPrivilege() == 0) {
							//Création des contrôleurs : Un pour chaque vue
							//Chaque contrôleur doit avoir une référence vers le modèle pour pouvoir le commander
							
							//PersonneController ctrlGUI = new PersonneController(model);
							AdminController ctrlConsole = new AdminController((Admin)model);
							
							//Création des vues.
							//Chaque vue doit connaître son contrôleur et avoir une référence vers le modèle pour pouvoir l'observer
							
							//PersonneVue vueGUI = new PersonneVueGUI(model, ctrlGUI, 200, 200);
							AdminVue vueConsole = new AdminVueConsole((Admin)model, ctrlConsole);
							
							//On donne la référence à la vue pour chaque contrôleur
							ctrlConsole.addView(vueConsole);
						}
						else if (((Technicien)model).getPrivilege() == 1) {
							//Création des contrôleurs : Un pour chaque vue
							//Chaque contrôleur doit avoir une référence vers le modèle pour pouvoir le commander
							
							//PersonneController ctrlGUI = new PersonneController(model);
							TechnicienController ctrlConsole = new TechnicienController((Technicien)model);
							
							//Création des vues.
							//Chaque vue doit connaître son contrôleur et avoir une référence vers le modèle pour pouvoir l'observer
							
							//PersonneVue vueGUI = new PersonneVueGUI(model, ctrlGUI, 200, 200);
							TechnicienVue vueConsole = new TechnicienVueConsole((Technicien)model, ctrlConsole);
							
							//On donne la référence à la vue pour chaque contrôleur
							ctrlConsole.addView(vueConsole);
						}
						else if (((Client)model).getPrivilege() == 2) {
							//Création des contrôleurs : Un pour chaque vue
							//Chaque contrôleur doit avoir une référence vers le modèle pour pouvoir le commander
							
							//PersonneController ctrlGUI = new PersonneController(model);
							ClientController ctrlConsole = new ClientController((Client)model);
							
							//Création des vues.
							//Chaque vue doit connaître son contrôleur et avoir une référence vers le modèle pour pouvoir l'observer
							
							//PersonneVue vueGUI = new PersonneVueGUI(model, ctrlGUI, 200, 200);
							ClientVue vueConsole = new ClientVueConsole((Client)model, ctrlConsole);
							
							//On donne la référence à la vue pour chaque contrôleur
							ctrlConsole.addView(vueConsole);
						}
							break;
						case"non" :
							
							
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
            rs.next();
            System.out.println("personneID" + rs.getString("personneID") + "pseudo" + rs.getString("pseudo") + "mdp" + rs.getString("motDePasse"));
            if (rs.getString("pseudo").equals(pseudo) && rs.getString("motDePasse").equals(motDePasse)) {
            	if(Integer.parseInt(rs.getString("privilege"))==0) {
            		Admin admin = new Admin(pseudo, motDePasse);
            		affiche("connect�");
            		return admin;
            	}
            	else if(Integer.parseInt(rs.getString("privilege"))==1) {
            		
            		Technicien technicien = new Technicien(pseudo, motDePasse );
            		affiche("connect�");
            		return technicien;
            	}
            	
            	else if(Integer.parseInt(rs.getString("privilege"))==2) {
            		Client client = new Client(pseudo, motDePasse);
            		affiche("connect�");
            		return client;
            	}
            	else {
            		affiche("Il y a un brobl�me votre compte");
            		return null;
            	}
            }
            else {
            	affiche("login ou/et mot de passe incorrect");
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
