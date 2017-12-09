package controller;

import model.Admin;
import vue.AdminVue;

public class AdminController {
	
	Admin model; 
	AdminVue vue;
	public AdminController(Admin model) {
		this.model = model;
	}

	public void addView(AdminVue vueConsole) {
		this.vue = vueConsole;
	}

}
