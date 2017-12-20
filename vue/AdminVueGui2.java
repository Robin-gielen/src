package vue;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import controller.AdminController;
import model.Admin;
import model.Client;
import model.Facture;
import model.Location;
import model.Voiture;

public class AdminVueGui2 extends AdminVue {

	
	/**
	 * 
	 */
	private JPanel personneJPanel;
	private JPanel alterClientJPanel;
	private JPanel factureJPanel;
	private JPanel locationJPanel;
	private JPanel voitureJPanel;
	private JPanel mesInfosJPanel;
	private JPanel alterVoitureJPanel;
	
	
	private JButton btnPersonneJPanel;
	private JButton btnAlterClientJPanel;
	private JButton btnFactureJPanel;
	private JButton btnLocationJPanel;
	private JButton btnVoitureJPanel;
	private JButton btnMesInfosJPanel;
	private JButton btnAlterVoitureJPanel;
	
	private JButton btnPersonneJPanelClients;
	private JButton btnPersonneJPanelTechs;
	private JButton btnPersonneJPanelAdmins;
	
	private JTextPane jtextPanePersonne;
	
	//infos client
	private JButton btnRechercherLeClient;
	private JTextField textFieldID;
	private JTextField textFieldNom;
	private JTextField textFieldDateN;
	private JTextField textFieldMail;
	private JTextField textFieldPseudo;
	private JTextField textFieldAdresse;
	private JTextField textFieldPrenom;
	private JButton btnValiderClient;
	
	//location
	private JTextField textFieldLocaMessage;
	private JTextField textFieldLocation;
	private JLabel lblVeuillezIndiquerLidLoca;
	private JLabel lblLaccompteEstilPay;
	private JLabel lblLocaClientID;
	private JLabel lblLocaAssurID;
	private JLabel lblLocaVoitureID;
	private JLabel lblLocaAccompte;
	private JLabel lblLocaKmInitial;
	private JLabel lblLocaEstEnCours;
	
	private JButton btnValiderLoca;
	
	private JTextField textFieldLocaEstPaye;
	private JTextField textFieldLocaClientID;
	private JTextField textFieldLocaAssurID;
	private JTextField textFieldLocaVoitureID;
	private JTextField textFieldLocaAccompte;
	private JTextField textFieldLocaKmInitial;
	private JTextField textFieldLocaEstEnCours;
	
	//facture
	private JLabel lblVeuillezIndiquerLidFact;
	private JLabel lblFactMontant;
	private JLabel lblFactLocaID;
	private JLabel lblFactTechID;
	private JLabel lblFactEstPaye;
	private JLabel lblFactNote;
	
	private JButton btnValiderFact;
	
	private JTextField textFieldVeuillezIndiquerLidFact;
	private JTextField textFieldFactMontant;
	private JTextField textFieldFactLocaID;
	private JTextField textFieldFactTechID;
	private JTextField textFieldFactEstPaye;
	private JTextField textFieldFactNote;
	
	private JTextField textFieldFactMessage;
	
	
	//Onglet voitures
	private JTextArea textArea;
	
	/**
	 * 
	 */
	public AdminVueGui2(Admin model, AdminController controlleur) {
		super(model, controlleur);
		JFrame AdminJFrame = new JFrame();
		AdminJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdminJFrame.setBounds(100, 100, 1200, 600);
		
		JMenuBar menuBar = new JMenuBar();
		AdminJFrame.setJMenuBar(menuBar);
		
		personneJPanel = new JPanel();

		alterClientJPanel = new JPanel();
		factureJPanel = new JPanel();
		locationJPanel = new JPanel();
		voitureJPanel = new JPanel();
		mesInfosJPanel = new JPanel();
		alterVoitureJPanel = new JPanel();
		
		//Instanciation des buttons de la menuBar
		btnPersonneJPanel = new JButton("Gestion des personnes");
		btnAlterClientJPanel = new JButton("Modification des infos clients");
		btnFactureJPanel = new JButton("Gestion des factures");
		btnLocationJPanel = new JButton("Gestion des locations");
		btnMesInfosJPanel = new JButton("Mes Infos");
		btnVoitureJPanel = new JButton("Gestion des voitures");
		btnAlterVoitureJPanel = new JButton("Modification des voitures");
		
		//Ajout des actionsListener aux bouttons de la menuBar
		btnPersonneJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(true);
				alterClientJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				mesInfosJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(personneJPanel);
			}
		});
		btnAlterClientJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				alterClientJPanel.setVisible(true);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				mesInfosJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(alterClientJPanel);
			}
		});
		btnFactureJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				alterClientJPanel.setVisible(false);
				factureJPanel.setVisible(true);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				mesInfosJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(factureJPanel);
			}
		});
		btnLocationJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				alterClientJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(true);
				voitureJPanel.setVisible(false);
				mesInfosJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(locationJPanel);
			}
		});
		btnVoitureJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				alterClientJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(true);
				mesInfosJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(voitureJPanel);
			}
		});
		btnMesInfosJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				alterClientJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				mesInfosJPanel.setVisible(true);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(mesInfosJPanel);
			}
		});
		btnAlterVoitureJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				alterClientJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				mesInfosJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(true);
				AdminJFrame.setContentPane(alterVoitureJPanel);
			}
		});
		
		//Ajout des buttons a la menuBar
		menuBar.add(btnPersonneJPanel);
		menuBar.add(btnAlterClientJPanel);
		menuBar.add(btnFactureJPanel);
		menuBar.add(btnLocationJPanel);
		menuBar.add(btnVoitureJPanel);
		menuBar.add(btnMesInfosJPanel);
		menuBar.add(btnAlterVoitureJPanel);
		
		jtextPanePersonne = new JTextPane();
		personneJPanel.add(jtextPanePersonne);
		
		btnPersonneJPanelClients = new JButton("Affiche la liste des clients");
		btnPersonneJPanelTechs = new JButton("Affiche la liste des techniciens");
		btnPersonneJPanelAdmins = new JButton("Affiche la liste des admins");
		
		btnPersonneJPanelClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPersonneJPanelTechs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPersonneJPanelAdmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		personneJPanel.add(btnPersonneJPanelClients, FlowLayout.CENTER);
		personneJPanel.add(btnPersonneJPanelTechs, FlowLayout.CENTER);
		personneJPanel.add(btnPersonneJPanelAdmins, FlowLayout.CENTER);
		
		
		
		// Definition de la fenetre d'affichage/modification du client
		
		alterClientJPanel = new JPanel();
		alterClientJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_clientJPanel = new GridBagLayout();
		gbl_clientJPanel.columnWidths = new int[]{0, 500, 380, 0};
		gbl_clientJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_clientJPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_clientJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		alterClientJPanel.setLayout(gbl_clientJPanel);
		
		JLabel lblVoiciLesInformations = new JLabel("Voici les informations du client");
		GridBagConstraints gbc_lblVoiciLesInformations = new GridBagConstraints();
		gbc_lblVoiciLesInformations.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoiciLesInformations.gridx = 0;
		gbc_lblVoiciLesInformations.gridy = 1;
		alterClientJPanel.add(lblVoiciLesInformations, gbc_lblVoiciLesInformations);
		
		JLabel lblSonId = new JLabel("Son ID");
		GridBagConstraints gbc_lblSonId = new GridBagConstraints();
		gbc_lblSonId.anchor = GridBagConstraints.EAST;
		gbc_lblSonId.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonId.gridx = 0;
		gbc_lblSonId.gridy = 3;
		alterClientJPanel.add(lblSonId, gbc_lblSonId);
		
		textFieldID = new JTextField();
		GridBagConstraints gbc_textFieldID = new GridBagConstraints();
		gbc_textFieldID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldID.gridwidth = 1;
		gbc_textFieldID.gridheight =1;
		gbc_textFieldID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldID.gridx = 1;
		gbc_textFieldID.gridy = 3;
		alterClientJPanel.add(textFieldID, gbc_textFieldID);
		textFieldID.setColumns(10);
		
		btnRechercherLeClient = new JButton("Rechercher le client ");
		btnRechercherLeClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isInteger(textFieldID.getText())) {
					textFieldNom.setText("Entrez un numÃ©ro de client correcte");
				}
				else {
					Client tempClient = model.getClient(Integer.parseInt(textFieldID.getText()));
					if (tempClient != null) {
						textFieldNom.setText(tempClient.getNom());
						textFieldPrenom.setText(tempClient.getPrenom());
						textFieldPseudo.setText(tempClient.getPseudo());
						textFieldMail.setText(tempClient.getAdresseMail());
						textFieldDateN.setText(tempClient.getDateNaissance());
						textFieldAdresse.setText(tempClient.getAdresse());
					}
					else {
						textFieldNom.setText("Ce client n'existe pas");
						textFieldPrenom.setText("");
						textFieldPseudo.setText("");
						textFieldMail.setText("");
						textFieldDateN.setText("");
						textFieldAdresse.setText("");
					}
				}
			}
		});
		GridBagConstraints gbc_btnRechercherLeClient = new GridBagConstraints();
		gbc_btnRechercherLeClient.anchor = GridBagConstraints.WEST;
		gbc_btnRechercherLeClient.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherLeClient.gridx = 2;
		gbc_btnRechercherLeClient.gridy = 3;
		alterClientJPanel.add(btnRechercherLeClient, gbc_btnRechercherLeClient);
		
		JLabel lblSonNom = new JLabel("son nom");
		GridBagConstraints gbc_lblSonNom = new GridBagConstraints();
		gbc_lblSonNom.anchor = GridBagConstraints.EAST;
		gbc_lblSonNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonNom.gridx = 0;
		gbc_lblSonNom.gridy = 5;
		alterClientJPanel.add(lblSonNom, gbc_lblSonNom);
		
		textFieldNom = new JTextField();
		GridBagConstraints gbc_textFieldNom = new GridBagConstraints();
		gbc_textFieldNom.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNom.gridx = 1;
		gbc_textFieldNom.gridy = 5;
		alterClientJPanel.add(textFieldNom, gbc_textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblSaDateDe = new JLabel("Sa date de naissance");
		GridBagConstraints gbc_lblSaDateDe = new GridBagConstraints();
		gbc_lblSaDateDe.anchor = GridBagConstraints.EAST;
		gbc_lblSaDateDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblSaDateDe.gridx = 0;
		gbc_lblSaDateDe.gridy = 6;
		alterClientJPanel.add(lblSaDateDe, gbc_lblSaDateDe);
		
		textFieldDateN = new JTextField();
		GridBagConstraints gbc_textFieldDateN = new GridBagConstraints();
		gbc_textFieldDateN.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldDateN.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDateN.gridx = 1;
		gbc_textFieldDateN.gridy = 6;
		alterClientJPanel.add(textFieldDateN, gbc_textFieldDateN);
		textFieldDateN.setColumns(10);
		
		JLabel lblSonAdresseMail = new JLabel("Son adresse mail");
		GridBagConstraints gbc_lblSonAdresseMail = new GridBagConstraints();
		gbc_lblSonAdresseMail.anchor = GridBagConstraints.EAST;
		gbc_lblSonAdresseMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonAdresseMail.gridx = 0;
		gbc_lblSonAdresseMail.gridy = 7;
		alterClientJPanel.add(lblSonAdresseMail, gbc_lblSonAdresseMail);
		
		textFieldMail = new JTextField();
		GridBagConstraints gbc_textFieldMail = new GridBagConstraints();
		gbc_textFieldMail.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMail.gridx = 1;
		gbc_textFieldMail.gridy = 7;
		alterClientJPanel.add(textFieldMail, gbc_textFieldMail);
		textFieldMail.setColumns(10);
		
		JLabel lblSonPseudo = new JLabel("Son pseudo");
		GridBagConstraints gbc_lblSonPseudo = new GridBagConstraints();
		gbc_lblSonPseudo.anchor = GridBagConstraints.EAST;
		gbc_lblSonPseudo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonPseudo.gridx = 0;
		gbc_lblSonPseudo.gridy = 8;
		alterClientJPanel.add(lblSonPseudo, gbc_lblSonPseudo);
		
		textFieldPseudo = new JTextField();
		GridBagConstraints gbc_textFieldPseudo = new GridBagConstraints();
		gbc_textFieldPseudo.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldPseudo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPseudo.gridx = 1;
		gbc_textFieldPseudo.gridy = 8;
		alterClientJPanel.add(textFieldPseudo, gbc_textFieldPseudo);
		textFieldPseudo.setColumns(10);
		
		JLabel lblSonAdresse = new JLabel("Son adresse");
		GridBagConstraints gbc_lblSonAdresse = new GridBagConstraints();
		gbc_lblSonAdresse.anchor = GridBagConstraints.EAST;
		gbc_lblSonAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonAdresse.gridx = 0;
		gbc_lblSonAdresse.gridy = 9;
		alterClientJPanel.add(lblSonAdresse, gbc_lblSonAdresse);
		
		textFieldAdresse = new JTextField();
		GridBagConstraints gbc_textFieldAdresse = new GridBagConstraints();
		gbc_textFieldAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldAdresse.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAdresse.gridx = 1;
		gbc_textFieldAdresse.gridy = 9;
		alterClientJPanel.add(textFieldAdresse, gbc_textFieldAdresse);
		textFieldAdresse.setColumns(10);
		
		JLabel lblSonPrenom = new JLabel("Son prenom");
		GridBagConstraints gbc_lblSonPrenom = new GridBagConstraints();
		gbc_lblSonPrenom.anchor = GridBagConstraints.EAST;
		gbc_lblSonPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonPrenom.gridx = 0;
		gbc_lblSonPrenom.gridy = 10;
		alterClientJPanel.add(lblSonPrenom, gbc_lblSonPrenom);
		
		textFieldPrenom = new JTextField();
		GridBagConstraints gbc_textFieldPrenom = new GridBagConstraints();
		gbc_textFieldPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPrenom.gridx = 1;
		gbc_textFieldPrenom.gridy = 10;
		alterClientJPanel.add(textFieldPrenom, gbc_textFieldPrenom);
		textFieldPrenom.setColumns(10);
		
		btnValiderClient = new JButton("Modifier le client");
		btnValiderClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnValiderClient = new GridBagConstraints();
		gbc_btnValiderClient.insets = new Insets(0, 0, 5, 5);
		gbc_btnValiderClient.anchor = GridBagConstraints.EAST;
		gbc_btnValiderClient.gridx = 1;
		gbc_btnValiderClient.gridy = 12;
		alterClientJPanel.add(btnValiderClient, gbc_btnValiderClient);
		
		alterClientJPanel.setLayout(gbl_clientJPanel);
		
		
		
		// Definition de la fenetre d'affiche des locations
		
	
		locationJPanel = new JPanel();
		locationJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_LocationJPanel = new GridBagLayout();
		gbl_LocationJPanel.columnWidths = new int[]{0, 500, 380, 0};
		gbl_LocationJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_LocationJPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_LocationJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		locationJPanel.setLayout(gbl_LocationJPanel);
		
		lblVeuillezIndiquerLidLoca = new JLabel("ID de la location");
		GridBagConstraints gbc_lblVeuillezIndiquerLidLoca = new GridBagConstraints();
		gbc_lblVeuillezIndiquerLidLoca.insets = new Insets(0, 0, 5, 5);
		gbc_lblVeuillezIndiquerLidLoca.anchor = GridBagConstraints.EAST;
		gbc_lblVeuillezIndiquerLidLoca.gridx = 0;
		gbc_lblVeuillezIndiquerLidLoca.gridy = 0;
		locationJPanel.add(lblVeuillezIndiquerLidLoca, gbc_lblVeuillezIndiquerLidLoca);
		
		textFieldLocation = new JTextField();
		GridBagConstraints gbc_textFieldLocation = new GridBagConstraints();
		gbc_textFieldLocation.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLocation.gridx = 1;
		gbc_textFieldLocation.gridy = 0;
		locationJPanel.add(textFieldLocation, gbc_textFieldLocation);
		textFieldLocation.setColumns(10);
		
		btnValiderLoca = new JButton("Afficher la location");
		btnValiderLoca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!isInteger(textFieldLocation.getText())) {
					textFieldLocaMessage.setText("Entrez un numero de location correcte");
					textFieldLocaEstPaye.setText("");
					textFieldLocaClientID.setText("");
					textFieldLocaAssurID.setText("");
					textFieldLocaVoitureID.setText("");
					textFieldLocaAccompte.setText("");
					textFieldLocaKmInitial.setText("");
					textFieldLocaEstEnCours.setText("");
				}
				else {
					Location tempLocation = model.getLocation(Integer.parseInt(textFieldLocation.getText()));
					if (tempLocation != null) {
						if(tempLocation.isAccomptePaye()) {
							textFieldLocaEstPaye.setText("Oui");
						}
						else {
							textFieldLocaEstPaye.setText("Non");
						}
						textFieldLocaClientID.setText(tempLocation.getClientID()+"");
						textFieldLocaAssurID.setText(tempLocation.getAssurID()+"");
						textFieldLocaVoitureID.setText(tempLocation.getVoitureID()+"");
						textFieldLocaAccompte.setText(tempLocation.getAccompte()+"");
						textFieldLocaKmInitial.setText(tempLocation.getKmInitial()+"");
						if(tempLocation.isAccomptePaye()) {
							textFieldLocaEstEnCours.setText("Oui");
						}
						else {
							textFieldLocaEstEnCours.setText("Non");
						}
					}
					else {
						textFieldLocaMessage.setText("Cette location n'existe pas");
						textFieldLocaEstPaye.setText("");
						textFieldLocaClientID.setText("");
						textFieldLocaAssurID.setText("");
						textFieldLocaVoitureID.setText("");
						textFieldLocaAccompte.setText("");
						textFieldLocaKmInitial.setText("");
						textFieldLocaEstEnCours.setText("");
					}
				}
			}
		});
		
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.insets = new Insets(0, 0, 5, 5);
		gbc_btnValider.anchor = GridBagConstraints.EAST;
		gbc_btnValider.gridx = 1;
		gbc_btnValider.gridy = 0;
		locationJPanel.add(btnValiderLoca, gbc_btnValider);
		
		lblLaccompteEstilPay = new JLabel("L'accompte est-il pay\u00E9?");
		GridBagConstraints gbc_lblLaccompteEstilPay = new GridBagConstraints();
		gbc_lblLaccompteEstilPay.insets = new Insets(0, 0, 5, 5);
		gbc_lblLaccompteEstilPay.anchor = GridBagConstraints.EAST;
		gbc_lblLaccompteEstilPay.gridx = 0;
		gbc_lblLaccompteEstilPay.gridy = 3;
		locationJPanel.add(lblLaccompteEstilPay, gbc_lblLaccompteEstilPay);
		
		textFieldLocaEstPaye = new JTextField();
		textFieldLocaEstPaye.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldLocaEstPaye.setEditable(false);
		GridBagConstraints gbc_textFieldLocaEstPaye = new GridBagConstraints();
		gbc_textFieldLocaEstPaye.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLocaEstPaye.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaEstPaye.gridx = 1;
		gbc_textFieldLocaEstPaye.gridy = 3;
		locationJPanel.add(textFieldLocaEstPaye, gbc_textFieldLocaEstPaye);
		
		lblLocaClientID = new JLabel("ID du client :");
		GridBagConstraints gbc_lbllblLocaClientID = new GridBagConstraints();
		gbc_lbllblLocaClientID.insets = new Insets(0, 0, 5, 5);
		gbc_lbllblLocaClientID.anchor = GridBagConstraints.EAST;
		gbc_lbllblLocaClientID.gridx = 0;
		gbc_lbllblLocaClientID.gridy = 4;
		locationJPanel.add(lblLocaClientID, gbc_lbllblLocaClientID);
		
		textFieldLocaClientID = new JTextField();
		textFieldLocaClientID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldLocaClientID.setEditable(false);
		GridBagConstraints gbc_textFieldLocaClientID = new GridBagConstraints();
		gbc_textFieldLocaClientID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLocaClientID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaClientID.gridx = 1;
		gbc_textFieldLocaClientID.gridy = 4;
		locationJPanel.add(textFieldLocaClientID, gbc_textFieldLocaClientID);
		textFieldLocaClientID.setColumns(10);
		
		lblLocaAssurID = new JLabel("ID de l'assurance :");
		GridBagConstraints gbc_lblLocaAssurID = new GridBagConstraints();
		gbc_lblLocaAssurID.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocaAssurID.anchor = GridBagConstraints.EAST;
		gbc_lblLocaAssurID.gridx = 0;
		gbc_lblLocaAssurID.gridy = 5;
		locationJPanel.add(lblLocaAssurID, gbc_lblLocaAssurID);
		
		textFieldLocaAssurID = new JTextField();
		textFieldLocaAssurID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldLocaAssurID.setEditable(false);
		GridBagConstraints gbc_textFieldLocaAssurID = new GridBagConstraints();
		gbc_textFieldLocaAssurID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLocaAssurID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaAssurID.gridx = 1;
		gbc_textFieldLocaAssurID.gridy = 5;
		locationJPanel.add(textFieldLocaAssurID, gbc_textFieldLocaAssurID);
		textFieldLocaAssurID.setColumns(10);
		
		lblLocaVoitureID = new JLabel("ID de la voiture :");
		GridBagConstraints gbc_lblLocaVoitureID = new GridBagConstraints();
		gbc_lblLocaVoitureID.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocaVoitureID.anchor = GridBagConstraints.EAST;
		gbc_lblLocaVoitureID.gridx = 0;
		gbc_lblLocaVoitureID.gridy = 6;
		locationJPanel.add(lblLocaVoitureID, gbc_lblLocaVoitureID);
		
		textFieldLocaVoitureID = new JTextField();
		textFieldLocaVoitureID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldLocaVoitureID.setEditable(false);
		GridBagConstraints gbc_textFieldLocaVoitureID = new GridBagConstraints();
		gbc_textFieldLocaVoitureID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLocaVoitureID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaVoitureID.gridx = 1;
		gbc_textFieldLocaVoitureID.gridy = 6;
		locationJPanel.add(textFieldLocaVoitureID, gbc_textFieldLocaVoitureID);
		textFieldLocaVoitureID.setColumns(10);

		lblLocaAccompte = new JLabel("Prix de l'accompte :");
		GridBagConstraints gbc_lblLocaAccompte = new GridBagConstraints();
		gbc_lblLocaAccompte.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocaAccompte.anchor = GridBagConstraints.EAST;
		gbc_lblLocaAccompte.gridx = 0;
		gbc_lblLocaAccompte.gridy = 7;
		locationJPanel.add(lblLocaAccompte, gbc_lblLocaAccompte);
		
		textFieldLocaAccompte = new JTextField();
		textFieldLocaAccompte.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldLocaAccompte.setEditable(false);
		GridBagConstraints gbc_textFieldLocaAccompte = new GridBagConstraints();
		gbc_textFieldLocaAccompte.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLocaAccompte.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaAccompte.gridx = 1;
		gbc_textFieldLocaAccompte.gridy = 7;
		locationJPanel.add(textFieldLocaAccompte, gbc_textFieldLocaAccompte);
		textFieldLocaAccompte.setColumns(10);
		
		lblLocaKmInitial = new JLabel("Killometrage lors de la location :");
		GridBagConstraints gbc_lblLocaKmInitial = new GridBagConstraints();
		gbc_lblLocaKmInitial.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocaKmInitial.anchor = GridBagConstraints.EAST;
		gbc_lblLocaKmInitial.gridx = 0;
		gbc_lblLocaKmInitial.gridy = 8;
		locationJPanel.add(lblLocaKmInitial, gbc_lblLocaKmInitial);
		
		textFieldLocaKmInitial = new JTextField();
		textFieldLocaKmInitial.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldLocaKmInitial.setEditable(false);
		GridBagConstraints gbc_textFieldLocaKmInitial = new GridBagConstraints();
		gbc_textFieldLocaKmInitial.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLocaKmInitial.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaKmInitial.gridx = 1;
		gbc_textFieldLocaKmInitial.gridy = 8;
		locationJPanel.add(textFieldLocaKmInitial, gbc_textFieldLocaKmInitial);
		textFieldLocaKmInitial.setColumns(10);
		
		lblLocaEstEnCours = new JLabel("Location en cours :");
		GridBagConstraints gbc_lblLocaEstEnCours = new GridBagConstraints();
		gbc_lblLocaEstEnCours.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocaEstEnCours.anchor = GridBagConstraints.EAST;
		gbc_lblLocaEstEnCours.gridx = 0;
		gbc_lblLocaEstEnCours.gridy = 9;
		locationJPanel.add(lblLocaEstEnCours, gbc_lblLocaEstEnCours);
		
		textFieldLocaEstEnCours = new JTextField();
		textFieldLocaEstEnCours.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldLocaEstEnCours.setEditable(false);
		GridBagConstraints gbc_textFieldLocaEstEnCours = new GridBagConstraints();
		gbc_textFieldLocaEstEnCours.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLocaEstEnCours.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaEstEnCours.gridx = 1;
		gbc_textFieldLocaEstEnCours.gridy = 9;
		locationJPanel.add(textFieldLocaEstEnCours, gbc_textFieldLocaEstEnCours);
		textFieldLocaEstEnCours.setColumns(10);
		
		textFieldLocaMessage = new JTextField();
		textFieldLocaMessage.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldLocaMessage.setEditable(false);
		GridBagConstraints gbc_textFieldLocaMessage = new GridBagConstraints();
		gbc_textFieldLocaMessage.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLocaMessage.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaMessage.gridx = 1;
		gbc_textFieldLocaMessage.gridy = 10;
		locationJPanel.add(textFieldLocaMessage, gbc_textFieldLocaMessage);
		textFieldLocaMessage.setColumns(10);

		// Definition de la fenetre d'affichage des factures 
		
		factureJPanel = new JPanel();
		factureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_factureJPanel = new GridBagLayout();
		gbl_factureJPanel.columnWidths = new int[]{0,600, 0, 0};
		gbl_factureJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_factureJPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_factureJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		factureJPanel.setLayout(gbl_factureJPanel);
		
		lblVeuillezIndiquerLidFact = new JLabel("ID de la facture :");
		GridBagConstraints gbc_lblVeuillezIndiquerLidFact = new GridBagConstraints();
		gbc_lblVeuillezIndiquerLidFact.insets = new Insets(0, 0, 5, 5);
		gbc_lblVeuillezIndiquerLidFact.anchor = GridBagConstraints.EAST;
		gbc_lblVeuillezIndiquerLidFact.gridx = 0;
		gbc_lblVeuillezIndiquerLidFact.gridy = 0;
		factureJPanel.add(lblVeuillezIndiquerLidFact, gbc_lblVeuillezIndiquerLidFact);
		
		textFieldVeuillezIndiquerLidFact = new JTextField();
		GridBagConstraints gbc_textFieldVeuillezIndiquerLidFact = new GridBagConstraints();
		gbc_textFieldVeuillezIndiquerLidFact.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVeuillezIndiquerLidFact.gridx = 1;
		gbc_textFieldVeuillezIndiquerLidFact.gridy = 0;
		factureJPanel.add(textFieldVeuillezIndiquerLidFact, gbc_textFieldVeuillezIndiquerLidFact);
		textFieldVeuillezIndiquerLidFact.setColumns(10);
		
		lblFactMontant = new JLabel("Montant de la facture :");
		GridBagConstraints gbc_lblFactMontant = new GridBagConstraints();
		gbc_lblFactMontant.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactMontant.anchor = GridBagConstraints.EAST;
		gbc_lblFactMontant.gridx = 0;
		gbc_lblFactMontant.gridy = 2;
		factureJPanel.add(lblFactMontant, gbc_lblFactMontant);
		
		textFieldFactMontant = new JTextField();
		textFieldFactMontant.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactMontant.setEditable(false);
		GridBagConstraints gbc_textFieldFactMontant = new GridBagConstraints();
		gbc_textFieldFactMontant.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactMontant.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactMontant.gridx = 1;
		gbc_textFieldFactMontant.gridy = 2;
		factureJPanel.add(textFieldFactMontant, gbc_textFieldFactMontant);
		textFieldFactMontant.setColumns(10);
		
		lblFactLocaID = new JLabel("ID de la location :");
		GridBagConstraints gbc_lblFactLocaID = new GridBagConstraints();
		gbc_lblFactLocaID.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactLocaID.anchor = GridBagConstraints.EAST;
		gbc_lblFactLocaID.gridx = 0;
		gbc_lblFactLocaID.gridy = 3;
		factureJPanel.add(lblFactLocaID, gbc_lblFactLocaID);
		
		textFieldFactLocaID = new JTextField();
		textFieldFactLocaID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactLocaID.setEditable(false);
		GridBagConstraints gbc_textFieldFactLocaID = new GridBagConstraints();
		gbc_textFieldFactLocaID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactLocaID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactLocaID.gridx = 1;
		gbc_textFieldFactLocaID.gridy = 3;
		factureJPanel.add(textFieldFactLocaID, gbc_textFieldFactLocaID);
		textFieldFactLocaID.setColumns(10);
		
		lblFactTechID = new JLabel("ID du technicien :");
		GridBagConstraints gbc_lblFactTechID = new GridBagConstraints();
		gbc_lblFactTechID.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactTechID.anchor = GridBagConstraints.EAST;
		gbc_lblFactTechID.gridx = 0;
		gbc_lblFactTechID.gridy = 4;
		factureJPanel.add(lblFactTechID, gbc_lblFactTechID);
		
		textFieldFactTechID = new JTextField();
		textFieldFactTechID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactTechID.setEditable(false);
		GridBagConstraints gbc_textFieldFactTechID = new GridBagConstraints();
		gbc_textFieldFactTechID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactTechID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactTechID.gridx = 1;
		gbc_textFieldFactTechID.gridy = 4;
		factureJPanel.add(textFieldFactTechID, gbc_textFieldFactTechID);
		textFieldFactTechID.setColumns(10);
		
		lblFactEstPaye = new JLabel("La facture est payee :");
		GridBagConstraints gbc_lblFactEstPaye = new GridBagConstraints();
		gbc_lblFactEstPaye.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactEstPaye.anchor = GridBagConstraints.EAST;
		gbc_lblFactEstPaye.gridx = 0;
		gbc_lblFactEstPaye.gridy = 5;
		factureJPanel.add(lblFactEstPaye, gbc_lblFactEstPaye);
		
		textFieldFactEstPaye = new JTextField();
		textFieldFactEstPaye.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactEstPaye.setEditable(false);
		GridBagConstraints gbc_textFieldFactEstPaye = new GridBagConstraints();
		gbc_textFieldFactEstPaye.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactEstPaye.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactEstPaye.gridx = 1;
		gbc_textFieldFactEstPaye.gridy = 5;
		factureJPanel.add(textFieldFactEstPaye, gbc_textFieldFactEstPaye);
		textFieldFactEstPaye.setColumns(10);
		
		lblFactNote = new JLabel("Note de la facture :");
		GridBagConstraints gbc_lblFactNote = new GridBagConstraints();
		gbc_lblFactNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactNote.anchor = GridBagConstraints.EAST;
		gbc_lblFactNote.gridx = 0;
		gbc_lblFactNote.gridy = 6;
		factureJPanel.add(lblFactNote, gbc_lblFactNote);
		
		textFieldFactNote = new JTextField();
		textFieldFactNote.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactNote.setEditable(false);
		GridBagConstraints gbc_textFieldFactNote = new GridBagConstraints();
		gbc_textFieldFactNote.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactNote.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactNote.gridx = 1;
		gbc_textFieldFactNote.gridy = 6;
		factureJPanel.add(textFieldFactNote, gbc_textFieldFactNote);
		textFieldFactNote.setColumns(10);
	
		btnValiderFact = new JButton("Afficher la facture");
		btnValiderFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!isInteger(textFieldVeuillezIndiquerLidFact.getText())) {
					textFieldFactMessage.setText("Entrez un numéro de facture correcte");
					textFieldFactLocaID.setText("");
					textFieldFactMontant.setText("");
					textFieldFactTechID.setText("");
					textFieldFactNote.setText("");
					textFieldFactEstPaye.setText("");
				}
				else {
					Facture tempFacture = model.getFacture(Integer.parseInt(textFieldVeuillezIndiquerLidFact.getText()));
					if (tempFacture != null) {
						if(tempFacture.isEstPaye()) {
							textFieldFactEstPaye.setText("Oui");
						}
						else {
							textFieldFactEstPaye.setText("Non");
						}
						textFieldFactLocaID.setText(tempFacture.getLocationID()+"");
						textFieldFactMontant.setText(tempFacture.getMontant()+"");
						textFieldFactTechID.setText(tempFacture.getTechID()+"");
						textFieldFactNote.setText(tempFacture.getNote());
					}
					else {
						textFieldFactMessage.setText("Cette facture n'existe pas");
						textFieldFactLocaID.setText("");
						textFieldFactMontant.setText("");
						textFieldFactTechID.setText("");
						textFieldFactNote.setText("");
					}
				}
			}
		});
		GridBagConstraints gbc_btnValiderFact = new GridBagConstraints();
		gbc_btnValiderFact.insets = new Insets(0, 0, 5, 5);
		gbc_btnValiderFact.anchor = GridBagConstraints.EAST;
		gbc_btnValiderFact.gridx = 1;
		gbc_btnValiderFact.gridy = 0;
		factureJPanel.add(btnValiderFact, gbc_btnValiderFact);
		

		textFieldFactMessage = new JTextField();
		textFieldFactMessage.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactMessage.setEditable(false);
		GridBagConstraints gbc_textFieldFactMessage = new GridBagConstraints();
		gbc_textFieldFactMessage.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactMessage.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactMessage.gridx = 1;
		gbc_textFieldFactMessage.gridy = 10;
		factureJPanel.add(textFieldFactMessage, gbc_textFieldFactMessage);
		textFieldFactMessage.setColumns(10);
		
		AdminJFrame.setVisible(true);
		AdminJFrame.setContentPane(personneJPanel);
		
		// Liste Voitures 
		
		voitureJPanel = new JPanel();
		voitureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		voitureJPanel.setLayout(gbl_contentPane);
		
		JButton btnToutesLesVoitures = new JButton("Toutes les voitures");
		btnToutesLesVoitures.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempString ="";
				Voiture [] tempVoits = model.getListVoit();
				if (tempVoits != null) {
					for (Voiture voiture : tempVoits) {
						tempString += voiture.toString();
						tempString += "\n";
					}
					textArea.setText(tempString);
					
				}
				else textArea.setText("Erreur lors de la récupération des voitures");
			}
		});
		GridBagConstraints gbc_btnToutesLesVoitures = new GridBagConstraints();
		gbc_btnToutesLesVoitures.anchor = GridBagConstraints.WEST;
		gbc_btnToutesLesVoitures.insets = new Insets(0, 0, 5, 5);
		gbc_btnToutesLesVoitures.gridx = 0;
		gbc_btnToutesLesVoitures.gridy = 0;
		voitureJPanel.add(btnToutesLesVoitures, gbc_btnToutesLesVoitures);
		
		JButton btnVoituresLoues = new JButton("Voitures lou\u00E9es");
		btnVoituresLoues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempString = "";
				Voiture [] tempVoits = model.getListVoitLouees();
				if (tempVoits != null) {
					for (Voiture voiture : tempVoits) {
						tempString += voiture.toString();
						tempString += "\n";
					}
					textArea.setText(tempString);
				}
				else textArea.setText("Erreur lors de la récupération des voitures");
			}
		});
		GridBagConstraints gbc_btnVoituresLoues = new GridBagConstraints();
		gbc_btnVoituresLoues.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoituresLoues.gridx = 1;
		gbc_btnVoituresLoues.gridy = 0;
		voitureJPanel.add(btnVoituresLoues, gbc_btnVoituresLoues);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 6;
		gbc_textField.gridheight = 15;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		voitureJPanel.add(textArea, gbc_textField);
		textArea.setColumns(10);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	      SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	            Admin model = new Admin();
	            AdminController controlleur = new AdminController(model);
				@SuppressWarnings("unused")
				AdminVueGui2 frame = new AdminVueGui2(model, controlleur);
	           
	         }
	      });
	   }
	
	public boolean isInteger(String string) {
	    try {
	        Integer.valueOf(string);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void affiche(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
