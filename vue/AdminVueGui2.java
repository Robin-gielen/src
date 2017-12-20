package vue;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import controller.AdminController;
import model.Admin;
import model.Client;
import model.Location;

public class AdminVueGui2 extends AdminVue {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel personneJPanel;
	private JPanel infosJPanel;
	private JPanel factureJPanel;
	private JPanel locationJPanel;
	private JPanel voitureJPanel;
	private JPanel alterClientJPanel;
	private JPanel alterVoitureJPanel;
	
	
	private JButton btnPersonneJPanel;
	private JButton btnInfosJPanel;
	private JButton btnFactureJPanel;
	private JButton btnLocationJPanel;
	private JButton btnVoitureJPanel;
	private JButton btnAlterClientJPanel;
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
	
	private JTextField textFieldLocaEstLouee;
	private JTextField textFieldLocaClientID;
	private JTextField textFieldLocaAssurID;
	private JTextField textFieldLocaVoitureID;
	private JTextField textFieldLocaAccompte;
	private JTextField textFieldLocaKmInitial;
	private JTextField textFieldLocaEstEnCours;
	
	//facture
	private JLabel lblVeuillezIndiquerLid;
	private JLabel lblFactID;
	private JLabel lblFactMontant;
	private JLabel lblFactLocaID;
	private JLabel lblFactTechID;
	private JLabel lblFactEstPaye;
	private JLabel lblFactNote;
	
	private JButton btnValiderFact;
	
	private JTextField textFieldVeuillezIndiquerLid;
	private JTextField textFieldFactID;
	private JTextField textFieldFactMontant;
	private JTextField textFieldFactLocaID;
	private JTextField textFieldFactTechID;
	private JTextField textFieldFactEstPaye;
	private JTextField textFieldFactNote;
	
	
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

		infosJPanel = new JPanel();
		factureJPanel = new JPanel();
		locationJPanel = new JPanel();
		voitureJPanel = new JPanel();
		alterClientJPanel = new JPanel();
		alterVoitureJPanel = new JPanel();
		
		//Instanciation des buttons de la menuBar
		btnPersonneJPanel = new JButton("Gestion des personnes");
		btnInfosJPanel = new JButton("Gestion des infos clients");
		btnFactureJPanel = new JButton("Gestion des factures");
		btnLocationJPanel = new JButton("Gestion des locations");
		btnAlterClientJPanel = new JButton("Modification des clients");
		btnVoitureJPanel = new JButton("Gestion des voitures");
		btnAlterVoitureJPanel = new JButton("Modification des voitures");
		
		//Ajout des actionsListener aux bouttons de la menuBar
		btnPersonneJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(true);
				infosJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				alterClientJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(personneJPanel);
			}
		});
		btnInfosJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				infosJPanel.setVisible(true);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				alterClientJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(infosJPanel);
			}
		});
		btnFactureJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				infosJPanel.setVisible(false);
				factureJPanel.setVisible(true);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				alterClientJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(factureJPanel);
			}
		});
		btnLocationJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				infosJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(true);
				voitureJPanel.setVisible(false);
				alterClientJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(locationJPanel);
			}
		});
		btnVoitureJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				infosJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(true);
				alterClientJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(voitureJPanel);
			}
		});
		btnAlterClientJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				infosJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				alterClientJPanel.setVisible(true);
				alterVoitureJPanel.setVisible(false);
				AdminJFrame.setContentPane(alterClientJPanel);
			}
		});
		btnAlterVoitureJPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personneJPanel.setVisible(false);
				infosJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				alterClientJPanel.setVisible(false);
				alterVoitureJPanel.setVisible(true);
				AdminJFrame.setContentPane(alterVoitureJPanel);
			}
		});
		
		//Ajout des buttons a la menuBar
		menuBar.add(btnPersonneJPanel);
		menuBar.add(btnInfosJPanel);
		menuBar.add(btnFactureJPanel);
		menuBar.add(btnLocationJPanel);
		menuBar.add(btnVoitureJPanel);
		menuBar.add(btnAlterClientJPanel);
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
		
		infosJPanel = new JPanel();
		infosJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_clientJPanel = new GridBagLayout();
		gbl_clientJPanel.columnWidths = new int[]{0, 500, 380, 0};
		gbl_clientJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_clientJPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_clientJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		infosJPanel.setLayout(gbl_clientJPanel);
		
		JLabel lblVoiciLesInformations = new JLabel("Voici les informations du client");
		GridBagConstraints gbc_lblVoiciLesInformations = new GridBagConstraints();
		gbc_lblVoiciLesInformations.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoiciLesInformations.gridx = 0;
		gbc_lblVoiciLesInformations.gridy = 1;
		infosJPanel.add(lblVoiciLesInformations, gbc_lblVoiciLesInformations);
		
		JLabel lblSonId = new JLabel("Son ID");
		GridBagConstraints gbc_lblSonId = new GridBagConstraints();
		gbc_lblSonId.anchor = GridBagConstraints.EAST;
		gbc_lblSonId.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonId.gridx = 0;
		gbc_lblSonId.gridy = 3;
		infosJPanel.add(lblSonId, gbc_lblSonId);
		
		textFieldID = new JTextField();
		GridBagConstraints gbc_textFieldID = new GridBagConstraints();
		gbc_textFieldID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldID.gridwidth = 1;
		gbc_textFieldID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldID.gridx = 1;
		gbc_textFieldID.gridy = 3;
		infosJPanel.add(textFieldID, gbc_textFieldID);
		textFieldID.setColumns(10);
		
		btnRechercherLeClient = new JButton("Rechercher le client ");
		btnRechercherLeClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isInteger(textFieldID.getText())) {
					textFieldNom.setText("Entrez un numéro de client correcte");
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
		infosJPanel.add(btnRechercherLeClient, gbc_btnRechercherLeClient);
		
		JLabel lblSonNom = new JLabel("son nom");
		GridBagConstraints gbc_lblSonNom = new GridBagConstraints();
		gbc_lblSonNom.anchor = GridBagConstraints.EAST;
		gbc_lblSonNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonNom.gridx = 0;
		gbc_lblSonNom.gridy = 5;
		infosJPanel.add(lblSonNom, gbc_lblSonNom);
		
		textFieldNom = new JTextField();
		GridBagConstraints gbc_textFieldNom = new GridBagConstraints();
		gbc_textFieldNom.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNom.gridx = 1;
		gbc_textFieldNom.gridy = 5;
		infosJPanel.add(textFieldNom, gbc_textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblSaDateDe = new JLabel("Sa date de naissance");
		GridBagConstraints gbc_lblSaDateDe = new GridBagConstraints();
		gbc_lblSaDateDe.anchor = GridBagConstraints.EAST;
		gbc_lblSaDateDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblSaDateDe.gridx = 0;
		gbc_lblSaDateDe.gridy = 6;
		infosJPanel.add(lblSaDateDe, gbc_lblSaDateDe);
		
		textFieldDateN = new JTextField();
		GridBagConstraints gbc_textFieldDateN = new GridBagConstraints();
		gbc_textFieldDateN.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldDateN.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDateN.gridx = 1;
		gbc_textFieldDateN.gridy = 6;
		infosJPanel.add(textFieldDateN, gbc_textFieldDateN);
		textFieldDateN.setColumns(10);
		
		JLabel lblSonAdresseMail = new JLabel("Son adresse mail");
		GridBagConstraints gbc_lblSonAdresseMail = new GridBagConstraints();
		gbc_lblSonAdresseMail.anchor = GridBagConstraints.EAST;
		gbc_lblSonAdresseMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonAdresseMail.gridx = 0;
		gbc_lblSonAdresseMail.gridy = 7;
		infosJPanel.add(lblSonAdresseMail, gbc_lblSonAdresseMail);
		
		textFieldMail = new JTextField();
		GridBagConstraints gbc_textFieldMail = new GridBagConstraints();
		gbc_textFieldMail.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMail.gridx = 1;
		gbc_textFieldMail.gridy = 7;
		infosJPanel.add(textFieldMail, gbc_textFieldMail);
		textFieldMail.setColumns(10);
		
		JLabel lblSonPseudo = new JLabel("Son pseudo");
		GridBagConstraints gbc_lblSonPseudo = new GridBagConstraints();
		gbc_lblSonPseudo.anchor = GridBagConstraints.EAST;
		gbc_lblSonPseudo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonPseudo.gridx = 0;
		gbc_lblSonPseudo.gridy = 8;
		infosJPanel.add(lblSonPseudo, gbc_lblSonPseudo);
		
		textFieldPseudo = new JTextField();
		GridBagConstraints gbc_textFieldPseudo = new GridBagConstraints();
		gbc_textFieldPseudo.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldPseudo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPseudo.gridx = 1;
		gbc_textFieldPseudo.gridy = 8;
		infosJPanel.add(textFieldPseudo, gbc_textFieldPseudo);
		textFieldPseudo.setColumns(10);
		
		JLabel lblSonAdresse = new JLabel("Son adresse");
		GridBagConstraints gbc_lblSonAdresse = new GridBagConstraints();
		gbc_lblSonAdresse.anchor = GridBagConstraints.EAST;
		gbc_lblSonAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonAdresse.gridx = 0;
		gbc_lblSonAdresse.gridy = 9;
		infosJPanel.add(lblSonAdresse, gbc_lblSonAdresse);
		
		textFieldAdresse = new JTextField();
		GridBagConstraints gbc_textFieldAdresse = new GridBagConstraints();
		gbc_textFieldAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldAdresse.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAdresse.gridx = 1;
		gbc_textFieldAdresse.gridy = 9;
		infosJPanel.add(textFieldAdresse, gbc_textFieldAdresse);
		textFieldAdresse.setColumns(10);
		
		JLabel lblSonPrenom = new JLabel("Son prenom");
		GridBagConstraints gbc_lblSonPrenom = new GridBagConstraints();
		gbc_lblSonPrenom.anchor = GridBagConstraints.EAST;
		gbc_lblSonPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonPrenom.gridx = 0;
		gbc_lblSonPrenom.gridy = 10;
		infosJPanel.add(lblSonPrenom, gbc_lblSonPrenom);
		
		textFieldPrenom = new JTextField();
		GridBagConstraints gbc_textFieldPrenom = new GridBagConstraints();
		gbc_textFieldPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPrenom.gridx = 1;
		gbc_textFieldPrenom.gridy = 10;
		infosJPanel.add(textFieldPrenom, gbc_textFieldPrenom);
		textFieldPrenom.setColumns(10);
		
		btnValiderClient = new JButton("Valider");
		btnValiderClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnValiderClient = new GridBagConstraints();
		gbc_btnValiderClient.insets = new Insets(0, 0, 5, 5);
		gbc_btnValiderClient.anchor = GridBagConstraints.EAST;
		gbc_btnValiderClient.gridx = 1;
		gbc_btnValiderClient.gridy = 12;
		infosJPanel.add(btnValiderClient, gbc_btnValiderClient);
		
		infosJPanel.setLayout(gbl_clientJPanel);
		
		// Definition de l'onglet location
		locationJPanel = new JPanel();
		locationJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_LocationJPanel = new GridBagLayout();
		gbl_LocationJPanel.columnWidths = new int[]{0, 500, 380, 0};
		gbl_LocationJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_LocationJPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_LocationJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		locationJPanel.setLayout(gbl_LocationJPanel);
		
		lblVeuillezIndiquerLidLoca = new JLabel("Veuillez indiquer l'ID de la location");
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
		
		btnValiderFact = new JButton("Valider");
		btnValiderFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!isInteger(textFieldLocation.getText())) {
					textFieldLocation.setText("Entrez un numéro de client correcte");
				}
				else {
					Location tempLocation = model.getLocation(Integer.parseInt(textFieldLocation.getText()));
					if (tempLocation != null) {
						if(tempLocation.isAccomptePaye()) {
							textFieldLocaEstLouee.setText("Oui");
						}
						else {
							textFieldLocaEstLouee.setText("Non");
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
						textFieldNom.setText("Ce client n'existe pas");
						textFieldLocaEstLouee.setText("");
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
		locationJPanel.add(btnValiderFact, gbc_btnValider);
		
		lblLaccompteEstilPay = new JLabel("L'accompte est-il pay\u00E9?");
		GridBagConstraints gbc_lblLaccompteEstilPay = new GridBagConstraints();
		gbc_lblLaccompteEstilPay.insets = new Insets(0, 0, 5, 5);
		gbc_lblLaccompteEstilPay.gridx = 0;
		gbc_lblLaccompteEstilPay.gridy = 3;
		locationJPanel.add(lblLaccompteEstilPay, gbc_lblLaccompteEstilPay);
		
		textFieldLocaEstLouee = new JTextField();
		textFieldLocaEstLouee.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldLocaEstLouee.setEditable(false);
		GridBagConstraints gbc_textFieldLocaEstLouee = new GridBagConstraints();
		gbc_textFieldLocaEstLouee.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLocaEstLouee.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaEstLouee.gridx = 1;
		gbc_textFieldLocaEstLouee.gridy = 3;
		locationJPanel.add(textFieldLocaEstLouee, gbc_textFieldLocaEstLouee);
		
		lblLocaClientID = new JLabel("ID du client :");
		GridBagConstraints gbc_lbllblLocaClientID = new GridBagConstraints();
		gbc_lbllblLocaClientID.insets = new Insets(0, 0, 5, 5);
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

		AdminJFrame.setVisible(true);
		
		// Liste Voitures
		
		/**
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblVoitid = new JLabel("VoitID");
		contentPane.add(lblVoitid, "2, 2");
		
		JLabel lblPrix = new JLabel("Prix");
		contentPane.add(lblPrix, "4, 2");
		
		JLabel lblMarque = new JLabel("Marque");
		contentPane.add(lblMarque, "6, 2");
		
		JLabel lblModele = new JLabel("Modele");
		contentPane.add(lblModele, "8, 2");
		
		JLabel lblAnnee = new JLabel("Annee");
		contentPane.add(lblAnnee, "10, 2");
		
		JLabel lblCarburant = new JLabel("Carburant");
		contentPane.add(lblCarburant, "12, 2");
		
		JLabel lblCouleur = new JLabel("Couleur");
		contentPane.add(lblCouleur, "14, 2");
		
		JLabel lblMOuA = new JLabel("M ou A");
		contentPane.add(lblMOuA, "16, 2");
		
		JLabel lblVolCoffre = new JLabel("Vol Coffre");
		contentPane.add(lblVolCoffre, "18, 2");
		
		JLabel lblNbRMotrice = new JLabel("Nb R Motrice");
		contentPane.add(lblNbRMotrice, "20, 2");
		
		JLabel lblKm = new JLabel("Km");
		contentPane.add(lblKm, "22, 2");
		
		JLabel lblHaut = new JLabel("Haut");
		contentPane.add(lblHaut, "24, 2");
		
		JLabel lblPoids = new JLabel("Poids");
		contentPane.add(lblPoids, "26, 2");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "2, 4, fill, default");
		textField_2.setColumns(10);
		
		textFieldVoitID = new JTextField();
		contentPane.add(textFieldVoitID, "4, 4, fill, default");
		textFieldVoitID.setColumns(10);
		
		textFieldPrix = new JTextField();
		contentPane.add(textFieldPrix, "6, 4, fill, default");
		textFieldPrix.setColumns(10);
		
		textFieldMarque = new JTextField();
		contentPane.add(textFieldMarque, "8, 4, fill, default");
		textFieldMarque.setColumns(10);
		
		textFieldModele = new JTextField();
		contentPane.add(textFieldModele, "10, 4, fill, default");
		textFieldModele.setColumns(10);
		
		textFieldAnnee = new JTextField();
		contentPane.add(textFieldAnnee, "12, 4, fill, default");
		textFieldAnnee.setColumns(10);
		
		textFieldCarburant = new JTextField();
		contentPane.add(textFieldCarburant, "14, 4, fill, default");
		textFieldCarburant.setColumns(10);
		
		textFieldCouleur = new JTextField();
		contentPane.add(textFieldCouleur, "16, 4, fill, default");
		textFieldCouleur.setColumns(10);
		
		textFieldMA = new JTextField();
		contentPane.add(textFieldMA, "18, 4, fill, default");
		textFieldMA.setColumns(10);
		
		textFieldVolC = new JTextField();
		contentPane.add(textFieldVolC, "20, 4, fill, default");
		textFieldVolC.setColumns(10);
		
		textFieldNbRM = new JTextField();
		contentPane.add(textFieldNbRM, "22, 4, fill, default");
		textFieldNbRM.setColumns(10);
		
		textFieldKm = new JTextField();
		contentPane.add(textFieldKm, "24, 4, fill, default");
		textFieldKm.setColumns(10);
		
		textFieldHaut = new JTextField();
		contentPane.add(textFieldHaut, "26, 4, fill, default");
		textFieldHaut.setColumns(10);
		
		textFieldPoids = new JTextField();
		contentPane.add(textFieldPoids, "26, 4, fill, default");
		textFieldPoids.setColumns(10);
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "2, 6, fill, default");
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "4, 6, fill, default");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		contentPane.add(textField_5, "6, 6, fill, default");
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		contentPane.add(textField_6, "8, 6, fill, default");
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		contentPane.add(textField_7, "10, 6, fill, default");
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		contentPane.add(textField_8, "12, 6, fill, default");
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		contentPane.add(textField_9, "14, 6, fill, default");
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		contentPane.add(textField_10, "16, 6, fill, default");
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		contentPane.add(textField_11, "18, 6, fill, default");
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		contentPane.add(textField_12, "20, 6, fill, default");
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		contentPane.add(textField_13, "22, 6, fill, default");
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		contentPane.add(textField_14, "24, 6, fill, default");
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		contentPane.add(textField_15, "26, 6, fill, default");
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		contentPane.add(textField_16, "2, 8, fill, default");
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		contentPane.add(textField_17, "4, 8, fill, default");
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		contentPane.add(textField_18, "6, 8, fill, default");
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		contentPane.add(textField_19, "8, 8, fill, default");
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		contentPane.add(textField_20, "10, 8, fill, default");
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		contentPane.add(textField_21, "12, 8, fill, default");
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		contentPane.add(textField_22, "14, 8, fill, default");
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		contentPane.add(textField_23, "16, 8, fill, default");
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		contentPane.add(textField_24, "18, 8, fill, default");
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		contentPane.add(textField_25, "20, 8, fill, default");
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		contentPane.add(textField_26, "22, 8, fill, default");
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		contentPane.add(textField_27, "24, 8, fill, default");
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		contentPane.add(textField_28, "26, 8, fill, default");
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		contentPane.add(textField_29, "2, 10, fill, default");
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		contentPane.add(textField_30, "4, 10, fill, default");
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		contentPane.add(textField_31, "6, 10, fill, default");
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		contentPane.add(textField_32, "8, 10, fill, default");
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		contentPane.add(textField_33, "10, 10, fill, default");
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		contentPane.add(textField_34, "12, 10, fill, default");
		textField_34.setColumns(10);
		
		textField_35 = new JTextField();
		contentPane.add(textField_35, "14, 10, fill, default");
		textField_35.setColumns(10);
		
		textField_36 = new JTextField();
		contentPane.add(textField_36, "16, 10, fill, default");
		textField_36.setColumns(10);
		
		textField_37 = new JTextField();
		contentPane.add(textField_37, "18, 10, fill, default");
		textField_37.setColumns(10);
		
		textField_38 = new JTextField();
		contentPane.add(textField_38, "20, 10, fill, default");
		textField_38.setColumns(10);
		
		textField_39 = new JTextField();
		contentPane.add(textField_39, "22, 10, fill, default");
		textField_39.setColumns(10);
		
		textField_40 = new JTextField();
		contentPane.add(textField_40, "24, 10, fill, default");
		textField_40.setColumns(10);
		
		textField_41 = new JTextField();
		contentPane.add(textField_41, "26, 10, fill, default");
		textField_41.setColumns(10);
		
		textField_42 = new JTextField();
		contentPane.add(textField_42, "2, 12, fill, default");
		textField_42.setColumns(10);
		
		textField_43 = new JTextField();
		contentPane.add(textField_43, "4, 12, fill, default");
		textField_43.setColumns(10);
		
		textField_44 = new JTextField();
		contentPane.add(textField_44, "6, 12, fill, default");
		textField_44.setColumns(10);
		
		textField_45 = new JTextField();
		contentPane.add(textField_45, "8, 12, fill, default");
		textField_45.setColumns(10);
		
		textField_46 = new JTextField();
		contentPane.add(textField_46, "10, 12, fill, default");
		textField_46.setColumns(10);
		
		textField_47 = new JTextField();
		contentPane.add(textField_47, "12, 12, fill, default");
		textField_47.setColumns(10);
		
		textField_48 = new JTextField();
		contentPane.add(textField_48, "14, 12, fill, default");
		textField_48.setColumns(10);
		
		textField_49 = new JTextField();
		contentPane.add(textField_49, "16, 12, fill, default");
		textField_49.setColumns(10);
		
		textField_50 = new JTextField();
		contentPane.add(textField_50, "18, 12, fill, default");
		textField_50.setColumns(10);
		
		textField_51 = new JTextField();
		contentPane.add(textField_51, "20, 12, fill, default");
		textField_51.setColumns(10);
		
		textField_52 = new JTextField();
		contentPane.add(textField_52, "22, 12, fill, default");
		textField_52.setColumns(10);
		
		textField_53 = new JTextField();
		contentPane.add(textField_53, "24, 12, fill, default");
		textField_53.setColumns(10);
		
		textField_54 = new JTextField();
		contentPane.add(textField_54, "26, 12, fill, default");
		textField_54.setColumns(10);
		
		**/
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	      SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	            Admin model = new Admin();
	            AdminController controlleur = new AdminController(model);
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
