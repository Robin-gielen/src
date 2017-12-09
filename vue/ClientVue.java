package vue;

import java.util.Observer;

import controller.ClientController;
import model.Client;

public abstract class ClientVue implements Observer{

	protected Client model;
	protected ClientController controller;
	
	ClientVue(Client model2, 
			ClientController controller) {
		this.model = model2;
		this.controller = controller; 
		//Connexion entre la vue et le modele
		model2.addObserver(this);
	}
	
	public abstract void affiche(String string);
}
