package controller;

import model.Admin;
import vue.PersonneVue;

public class PersonneController {
	
	Admin model; 
	PersonneVue vue;
	public PersonneController(Admin model) {
		this.model = model;
	}

	public void addView(PersonneVue vue) {
		this.vue = vue;
	}

}
