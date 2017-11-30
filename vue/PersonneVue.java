package vue;

import java.util.Observer;

import controller.PersonneController;
import model.Admin;

public abstract class PersonneVue implements Observer{

	protected Admin model;
	protected PersonneController controller;
	
	PersonneVue(Admin model, 
			PersonneController controller) {
		this.model = model;
		this.controller = controller; 
		//Connexion entre la vue et le modele
		model.addObserver(this);
	}
	
	public abstract void affiche(String string);
}
