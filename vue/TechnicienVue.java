package vue;

import java.util.Observer;

import controller.TechnicienController;
import model.Technicien;

public abstract class TechnicienVue implements Observer{

	protected Technicien model;
	protected TechnicienController controller;
	
	TechnicienVue(Technicien model2, 
			TechnicienController controller) {
		this.model = model2;
		this.controller = controller; 
		//Connexion entre la vue et le modele
		model2.addObserver(this);
	}
	
	public abstract void affiche(String string);
}