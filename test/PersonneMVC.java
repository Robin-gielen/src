package test;
/**
 * @author Groupe 15
 */

import controller.AdminController;
import controller.ClientController;
import controller.TechnicienController;
import model.Admin;
import model.Client;
import model.Technicien;
import vue.AdminVue;
import vue.AdminVueConsole;
import vue.ClientVue;
import vue.ClientVueConsole;
import vue.TechnicienVue;
import vue.TechnicienVueConsole;

public class PersonneMVC {
	public PersonneMVC(int i) {
		if (i == 0) {
			Admin model = new Admin("pseudoTest", "MDPTest");
			//Création des contrôleurs : Un pour chaque vue
			//Chaque contrôleur doit avoir une référence vers le modèle pour pouvoir le commander
			
			//PersonneController ctrlGUI = new PersonneController(model);
			AdminController ctrlConsole = new AdminController(model);
			
			//Création des vues.
			//Chaque vue doit connaître son contrôleur et avoir une référence vers le modèle pour pouvoir l'observer
			
			//PersonneVue vueGUI = new PersonneVueGUI(model, ctrlGUI, 200, 200);
			AdminVue vueConsole = new AdminVueConsole(model, ctrlConsole);
			
			//On donne la référence à la vue pour chaque contrôleur
			ctrlConsole.addView(vueConsole);
		}
		else if (i == 1) {
			Technicien model = new Technicien("pseudoTest", "MDPTest");
			//Création des contrôleurs : Un pour chaque vue
			//Chaque contrôleur doit avoir une référence vers le modèle pour pouvoir le commander
			
			//PersonneController ctrlGUI = new PersonneController(model);
			TechnicienController ctrlConsole = new TechnicienController(model);
			
			//Création des vues.
			//Chaque vue doit connaître son contrôleur et avoir une référence vers le modèle pour pouvoir l'observer
			
			//PersonneVue vueGUI = new PersonneVueGUI(model, ctrlGUI, 200, 200);
			TechnicienVue vueConsole = new TechnicienVueConsole(model, ctrlConsole);
			
			//On donne la référence à la vue pour chaque contrôleur
			ctrlConsole.addView(vueConsole);
		}
		else if (i == 2) {
			Client model = new Client("pseudoTest", "MDPTest");
			//Création des contrôleurs : Un pour chaque vue
			//Chaque contrôleur doit avoir une référence vers le modèle pour pouvoir le commander
			
			//PersonneController ctrlGUI = new PersonneController(model);
			ClientController ctrlConsole = new ClientController(model);
			
			//Création des vues.
			//Chaque vue doit connaître son contrôleur et avoir une référence vers le modèle pour pouvoir l'observer
			
			//PersonneVue vueGUI = new PersonneVueGUI(model, ctrlGUI, 200, 200);
			ClientVue vueConsole = new ClientVueConsole(model, ctrlConsole);
			
			//On donne la référence à la vue pour chaque contrôleur
			ctrlConsole.addView(vueConsole);
		}
		
	}

	public static void main(String args[]) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		if (Integer.parseInt(args[0]) == 0) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new PersonneMVC(0);
				}
			});
		}
		else if (Integer.parseInt(args[0]) == 1) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new PersonneMVC(1);
				}
			});
		}
		else if (Integer.parseInt(args[0]) == 2) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new PersonneMVC(2);
				}
			});
		}
		else System.out.println("incorrect parameter");
		
	}
	
	public void affiche(String string) {
		System.out.println(string);
		
	}
}
