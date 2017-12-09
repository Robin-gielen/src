package controller;

import model.Client;
import vue.ClientVue;

public class ClientController {
	
	Client model; 
	ClientVue vue;
	public ClientController(Client model) {
		this.model = model;
	}

	public void addView(ClientVue vueConsole) {
		this.vue = vueConsole;
	}

}
