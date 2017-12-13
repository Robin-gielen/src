package vue;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.AdminController;
import model.Admin;
import model.Client;
import model.Facture;
import model.Location;
import model.Technicien;
import model.Voiture;


public class AdminVueGui extends AdminVue implements ActionListener{

	private JFrame adminJFrame;
	private JTextField marqueVoiture = new JTextField(20);
	private JTextField modelVoiture = new JTextField(20);
	private JTextField numeroVoiture = new JTextField(20);
	private JTextField numeroAssurance = new JTextField(20);

	private JButton emprunteJButton = new JButton("Valide Location");
	
	private JLabel message = new JLabel(" ");
	private JTable table;
	JPanel textContent = new JPanel();
	

	public AdminVueGui(Admin model,
			AdminController controller, int posX, int posY) {
		
		super(model, controller);
		
		//Construction de la fenêtre
		adminJFrame = new JFrame("Bibliothèque MVC");	
		textContent.setLayout(new BoxLayout(textContent, BoxLayout.Y_AXIS));
		updateTable();
		textContent.add(table.getTableHeader());
		textContent.add(table);
		textContent.add(message);
		
		
		adminJFrame.add(textContent, BorderLayout.NORTH);
		
		JPanel fieldZone = new JPanel();
		fieldZone.setLayout(new BoxLayout(fieldZone, BoxLayout.X_AXIS));
		JLabel fieldLabel = new JLabel("Numéro du livre �  emprunter/rendre : ");
		fieldZone.add(fieldLabel);
		fieldZone.add(marqueVoiture);
		fieldZone.add(modelVoiture);
		fieldZone.add(numeroVoiture);
		fieldZone.add(numeroAssurance);
		adminJFrame.add(fieldZone, BorderLayout.CENTER);
		JPanel panelbuttons = new JPanel();
		panelbuttons.add(emprunteJButton);
		
		adminJFrame.add(panelbuttons, BorderLayout.SOUTH);
		adminJFrame.pack();
		adminJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminJFrame.setSize(500, 400);
		adminJFrame.setLocation(300, 400);
		adminJFrame.setVisible(true);
		
		//Définition des actions sur les éléments de la GUI
		emprunteJButton.addActionListener(this);
		adminJFrame.pack();
		

		
		
	}
	
	
	
	
	
	public void afficheListVoiture(Voiture [] listVoit) {
		Voiture [] voitures =  model.getListVoit();
		Object [][] data = new Object[voitures.length][3];

		for(int i=0; i<voitures.length; i++){
			data[i][0] = i;
			data[i][1] = voitures[i].getMarque();
			data[i][2] = voitures[i].getModele();
			data[i][0] = i;
			data[i][0] = i;
			data[i][0] = i;
			data[i][0] = i;
			data[i][0] = i;
			data[i][0] = i;
			data[i][0] = i;
			data[i][0] = i;
			
		}
		String[] head = {"Numero voiture", "Marque voiture", "Modele voiture"};
		table = new JTable(data, head);
	}
	
	public void afficheListClient(Client [] listClient) {
		
	}
	
	public void afficheListTechnicien(Technicien [] listTech) {
		
	}
	
	public void afficheListAdmin(Admin [] listAdmin) {
	
	}
	
	public void afficheListFacture(Facture [] listFacture) {
		
	}
	
	public void afficheListLocation(Location [] listLocation) {
		
	}
	
	public void alterClient() {
		
	}
	
	public void rmClient() {
		
	}
	
	public void ajouterVoiture() {
		
	}
	
	public void rmVoiture() {
		
	}
	
	public void affiche(String msg){
		message.setText(msg);
	}
	
	public void updateTable(){
		Voiture [] voitures =  model.getListVoit();
		Object [][] data = new Object[voitures.length][3];

		for(int i=0; i<voitures.length; i++){
			data[i][0] = i;
			data[i][1] = voitures[i].getMarque();
			data[i][2] = voitures[i].getModele();
		}
		String[] head = {"Numero voiture", "Marque voiture", "Modele voiture"};
		table = new JTable(data, head);
			
	}
	
	@Override
	public void update(Observable o, Object arg) {
		updateTable();
		textContent.remove(1);
		textContent.add(table, 1);	
		adminJFrame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 Object  source=e.getSource();
		 int numVoit = getNumeroVoiture();   
		 if(numVoit < 0 || numVoit > 99){
			 affiche("Erreur, ceci n'est pas un numero de voiture valide ");
			 return;
		 }
	     if  (source==emprunteJButton){
	    	 model.rmVoiture(numVoit);
	     }
		
	}
	
	public int getNumeroVoiture() {
		int result = 0;
		try {
			result = Integer.valueOf(numeroVoiture.getText()).intValue();
		}
		catch (NumberFormatException e){
			result = -1;
		}
		return result;
	}
	public int getNumeroAssurance() {
		int result = 0;
		try {
			result = Integer.valueOf(numeroAssurance.getText()).intValue();
		}
		catch (NumberFormatException e){
			result = -1;
		}
		return result;
	}

}