package controller;

import model.Technicien;
import vue.TechnicienVue;

public class TechnicienController {
	
	Technicien model; 
	TechnicienVue vue;
	public TechnicienController(Technicien model) {
		this.model = model;
	}

	public void addView(TechnicienVue vueConsole) {
		this.vue = vueConsole;
	}

}
