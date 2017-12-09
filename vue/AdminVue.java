package vue;

import java.util.Observer;

import controller.AdminController;
import model.Admin;

public abstract class AdminVue implements Observer{

	protected Admin model;
	protected AdminController controller;
	
	AdminVue(Admin model, 
			AdminController controller) {
		this.model = model;
		this.controller = controller; 
		//Connexion entre la vue et le modele
		model.addObserver(this);
	}
	
	public abstract void affiche(String string);
}
