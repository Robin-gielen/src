package vue;

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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.TechnicienController;
import model.Client;
import model.Facture;
import model.Location;
import model.Technicien;
import model.Voiture;

public class TechnicienVueGui extends TechnicienVue {

	private JPanel infoJPanel;
	private JPanel factureJPanel;
	private JPanel locationJPanel;
	private JPanel voitureJPanel;
	private JPanel infoClientJPanel;
	private JPanel checkAccJPanel;
	private JPanel checkUpJPanel;
	private JPanel infoFactureJPanel;
	
	private JTextField textFieldNumLoca;
	private JTextField textFieldFactureNumLoca;
	private JTextField textFieldFactEtatDePayement;
	private JTextField textFieldFactNote;
	private JTextField textFieldFactKmSupp;
	private JTextField textFieldFactMessage;
	private JTextField textFieldLocaNumLoca;
	private JTextField textFieldCheckNumVoit;
	private JTextField textFieldCheckKmActu;
	private JTextField textFieldLocaNumClient;
	private JTextField textFieldLocaNumClient2;
	private JTextField textFieldAssurance;
	private JTextField textFieldAssurance2;
	private JTextField textFieldMonId;
	private JTextField textFieldMonPseudo;
	private JTextField textFieldMonMdp;
	private JTextField textFieldMonNom;
	private JTextField textFieldMonPrenom;
	private JTextField textFieldAncienKm;
	private JTextField textFieldNVoit;
	private JTextField textFieldMontantAcc;
	private JTextField textFieldEtatAcc;
	private JTextField textFieldKilometrage;
	private JTextField textFieldEtatLocation;
	private JTextField textFieldVeuillezIndiquerLidClient;
	
	private JLabel lblMonId;
	private JLabel lblMonPseudo;
	private JLabel lblMonMdp;
	private JLabel lblMonNom;
	private JLabel lblMonPrenom;
	private JLabel lblNAssurance;
	private JLabel lblNAssurance2;
	private JLabel lblNDeLocation;
	private JLabel lblNDeLocation2;
	private JLabel lblEtatDePayement;
	private JLabel lblNote;
	private JLabel lblKmSupp;
	private JLabel lblNDeLocation1;
	private JLabel lblNDeVoitureCheckUp;
	private JLabel lblAncienKilometrage;
	private JLabel lblKilometrageActuel;
	private JLabel lblNDeClient;
	private JLabel lblNDeClient2;
	private JLabel lblNVoit;
	private JLabel lblMontantAcc;
	private JLabel lblEtatAcc;
	private JLabel lblKilometrage;
	private JLabel lblEtatLocation;
	
	private JButton btnInfo;
	private JButton btnNouvelleFacture;
	private JButton btnInfoLocation;
	private JButton btnInfoVoiture;
	private JButton btnInfoClient;
	private JButton btnCheckAcc;
	private JButton btnCheckUp;
	private JButton btnValider;
	private JButton btnRechercher;
	private JButton btnValider2;
	private JButton btnSoumettreKilometrage;
	private JButton btnInfoFacture;
	private JButton btnRechercherNumClient;
	private JButton btnValiderFact2;
	
	private JTextArea textAreaLocaNumClient;
	
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
	private JTextField textFieldFactNote2;
	
	private JTextField textFieldFactMessage2;
	private JTextField textFieldPrenomC;
	private JTextField textFieldNomC;
	private JTextField textFieldID;
	private JTextField textFieldNaissance;
	private JTextField textFieldMailC;
	private JTextField textFieldPseudo;
	private JTextField textFieldAdresseC;
	private JTextField textFieldIdFact;
	private JLabel lblFactClientID;
	private JTextField textFieldFactClientID;
	private JTextArea textAreaInfoFact;
	private JLabel blNDeFact1;
	private JLabel blNDeClient1;
	private JButton validerClientId;
	private JTextField textFieldCheckNumLoca;
	private JButton btnValiderAcc;
	private JLabel lblNDeLocationCheckAcc;
	private JTextField textFieldStatutAcc;
	private JLabel lblStatutAcc;
	private JLabel lblStatutAccActuel;
	private JTextField textFieldStatutAccActuel;
	private JButton btnSoumettreAccStatut;
	private JTextField textFieldErreurStatut;
	private JLabel lblVoitInfosVoit;
	private JLabel lblVoitIDVoit;
	private JTextField textFieldVoitIDVoit;
	private JLabel lblVoitPrixVoit;
	private JTextField textFieldVoitPrixVoit;
	private JLabel lblVoitMarqueVoit;
	private JTextField textFieldVoitMarqueVoit;
	private JLabel lblVoitModeleVoit;
	private JTextField textFieldVoitModeleVoit;
	private JLabel lblVoitAnneeVoit;
	private JTextField textFieldVoitAnneeVoit;
	private JLabel lblVoitTypeVoit;
	private JTextField textFieldVoitTypeVoit;
	private JLabel lblVoitCarburantVoit;
	private JTextField textFieldVoitCarburantVoit;
	private JLabel lblVoitCouleurVoit;
	private JTextField textFieldVoitCouleurVoit;
	private JLabel lblVoitEstManuelleVoit;
	private JTextField textFieldVoitEstManuelleVoit;
	private JLabel lblVoitRoueMotriceVoit;
	private JTextField textFieldVoitRoueMotriceVoit;
	private JLabel lblVoitKilometrageVoit;
	private JTextField textFieldVoitKilometrageVoit;
	private JLabel lblVoitVolumeCoffreVoit;
	private JTextField textFieldVoitVolumeCoffreVoit;
	private JLabel lblVoitHauteurVoit;
	private JTextField textFieldVoitHauteurVoit;
	private JLabel lblVoitPoidsVoit;
	private JTextField textFieldVoitPoidsVoit;
	private JLabel lblVoitEstLoueeVoit;
	private JTextField textFieldVoitEstLoueeVoit;
	private JLabel lblVoitNoteVoit;
	private JTextField textFieldVoitNoteVoit;
	private JLabel lblVoitAgenceIDVoit;
	private JTextField textFieldVoitAgenceIDVoit;
	private JTextField textFieldVoitMessage;
	private JButton btn_afficheVoit;

	/**
	 * Create the frame.
	 */
	public TechnicienVueGui(Technicien model, TechnicienController controlleur) {
		super(model, controlleur);
		JFrame technicienJFrame = new JFrame();
		technicienJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		technicienJFrame.setBounds(100, 100, 900, 500);
		
		JMenuBar menuBar = new JMenuBar();
		technicienJFrame.setJMenuBar(menuBar);
		
		infoJPanel = new JPanel();
		factureJPanel = new JPanel();
		locationJPanel = new JPanel();
		voitureJPanel = new JPanel();
		checkAccJPanel = new JPanel();
		checkUpJPanel = new JPanel();
		
		
		
		
		btnInfo = new JButton("INFO");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(true);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				checkAccJPanel.setVisible(false);
				checkUpJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
				infoClientJPanel.setVisible(false);
				technicienJFrame.setContentPane(infoJPanel);
				
			}
		});
		menuBar.add(btnInfo);
		
		btnNouvelleFacture = new JButton("Nouvelle Facture");
		btnNouvelleFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				factureJPanel.setVisible(true);
				infoJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				checkAccJPanel.setVisible(false);
				checkUpJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
				infoClientJPanel.setVisible(false);
				technicienJFrame.setContentPane(factureJPanel);
				
			}
		});
		menuBar.add(btnNouvelleFacture);
		
		btnInfoLocation = new JButton("Info Location");
		btnInfoLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationJPanel.setVisible(true);
				factureJPanel.setVisible(false);
				infoJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				checkAccJPanel.setVisible(false);
				checkUpJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
				infoClientJPanel.setVisible(false);
				technicienJFrame.setContentPane(locationJPanel);
				
			}
		});
		menuBar.add(btnInfoLocation);
		
		btnInfoVoiture = new JButton("Info Voiture");
		btnInfoVoiture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voitureJPanel.setVisible(true);
				locationJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				infoJPanel.setVisible(false);
				checkUpJPanel.setVisible(false);
				checkAccJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
				infoClientJPanel.setVisible(false);
				technicienJFrame.setContentPane(voitureJPanel);
				
			}
		});
		menuBar.add(btnInfoVoiture);
		
		btnInfoFacture = new JButton("Info Facture");
		btnInfoFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFactureJPanel.setVisible(true);
				checkUpJPanel.setVisible(false);
				checkAccJPanel.setVisible(false);
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				infoClientJPanel.setVisible(false);
				technicienJFrame.setContentPane(infoFactureJPanel);
			}
		});
		menuBar.add(btnInfoFacture);
		
		btnInfoClient = new JButton("Info Client");
		btnInfoClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoClientJPanel.setVisible(true);
				infoFactureJPanel.setVisible(false);
				checkAccJPanel.setVisible(false);
				checkUpJPanel.setVisible(false);
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				technicienJFrame.setContentPane(infoClientJPanel);
			}
		});
		menuBar.add(btnInfoClient);
		
		btnCheckAcc = new JButton("Check Accompte");
		btnCheckAcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkAccJPanel.setVisible(true);
				infoClientJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
				checkUpJPanel.setVisible(false);
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				technicienJFrame.setContentPane(checkAccJPanel);
			}
		});
		menuBar.add(btnCheckAcc);
		
		btnCheckUp = new JButton("CheckUp");
		btnCheckUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkUpJPanel.setVisible(true);
				checkAccJPanel.setVisible(false);
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
				infoClientJPanel.setVisible(false);
				technicienJFrame.setContentPane(checkUpJPanel);
			}
		});
		menuBar.add(btnCheckUp);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		infoJPanel.setLayout(gridBagLayout);
		

		
		
		
		//infos 
		
		infoJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_infoJPanel = new GridBagLayout();
		gbl_infoJPanel.columnWidths = new int[]{0, 500, 380, 0};
		gbl_infoJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_infoJPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_infoJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		infoJPanel.setLayout(gbl_infoJPanel);
		
		lblMonId = new JLabel("Mon ID :");
		lblMonId.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMonId = new GridBagConstraints();
		gbc_lblMonId.anchor = GridBagConstraints.EAST;
		gbc_lblMonId.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonId.gridx = 0;
		gbc_lblMonId.gridy = 1;
		infoJPanel.add(lblMonId, gbc_lblMonId);
		
		textFieldMonId = new JTextField();
		textFieldMonId.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldMonId = new GridBagConstraints();
		gbc_textFieldMonId.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMonId.fill = GridBagConstraints.BOTH;
		gbc_textFieldMonId.gridx = 1;
		gbc_textFieldMonId.gridy = 1;
		infoJPanel.add(textFieldMonId, gbc_textFieldMonId);
		
		lblMonPseudo = new JLabel("Mon pseudo :");
		lblMonPseudo.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMonPseudo = new GridBagConstraints();
		gbc_lblMonPseudo.anchor = GridBagConstraints.EAST;
		gbc_lblMonPseudo.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonPseudo.gridx = 0;
		gbc_lblMonPseudo.gridy = 2;
		infoJPanel.add(lblMonPseudo, gbc_lblMonPseudo);
		
		textFieldMonPseudo = new JTextField();
		textFieldMonPseudo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldMonPseudo = new GridBagConstraints();
		gbc_textFieldMonPseudo.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMonPseudo.fill = GridBagConstraints.BOTH;
		gbc_textFieldMonPseudo.gridx = 1;
		gbc_textFieldMonPseudo.gridy = 2;
		infoJPanel.add(textFieldMonPseudo, gbc_textFieldMonPseudo);
		
		lblMonMdp = new JLabel("Mon mot de passe :");
		lblMonMdp.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMonMdp = new GridBagConstraints();
		gbc_lblMonMdp.anchor = GridBagConstraints.EAST;
		gbc_lblMonMdp.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonMdp.gridx = 0;
		gbc_lblMonMdp.gridy = 3;
		infoJPanel.add(lblMonMdp, gbc_lblMonMdp);
		
		textFieldMonMdp = new JTextField();
		textFieldMonMdp.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldMonMdp = new GridBagConstraints();
		gbc_textFieldMonMdp.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMonMdp.fill = GridBagConstraints.BOTH;
		gbc_textFieldMonMdp.gridx = 1;
		gbc_textFieldMonMdp.gridy = 3;
		infoJPanel.add(textFieldMonMdp, gbc_textFieldMonMdp);
		
		lblMonNom = new JLabel("Mon nom :");
		lblMonNom.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMonNom = new GridBagConstraints();
		gbc_lblMonNom.anchor = GridBagConstraints.EAST;
		gbc_lblMonNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonNom.gridx = 0;
		gbc_lblMonNom.gridy = 4;
		infoJPanel.add(lblMonNom, gbc_lblMonNom);
		
		textFieldMonNom = new JTextField();
		textFieldMonNom.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldMonNom = new GridBagConstraints();
		gbc_textFieldMonNom.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMonNom.fill = GridBagConstraints.BOTH;
		gbc_textFieldMonNom.gridx = 1;
		gbc_textFieldMonNom.gridy = 4;
		infoJPanel.add(textFieldMonNom, gbc_textFieldMonNom);
		
		lblMonPrenom = new JLabel("Mon prénom :");
		lblMonPrenom.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMonPrenom = new GridBagConstraints();
		gbc_lblMonPrenom.anchor = GridBagConstraints.EAST;
		gbc_lblMonPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonPrenom.gridx = 0;
		gbc_lblMonPrenom.gridy = 5;
		infoJPanel.add(lblMonPrenom, gbc_lblMonPrenom);
		
		textFieldMonPrenom = new JTextField();
		textFieldMonPrenom.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldMonPrenom = new GridBagConstraints();
		gbc_textFieldMonPrenom.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMonPrenom.fill = GridBagConstraints.BOTH;
		gbc_textFieldMonPrenom.gridx = 1;
		gbc_textFieldMonPrenom.gridy = 5;
		infoJPanel.add(textFieldMonPrenom, gbc_textFieldMonPrenom);

		textFieldMonId.setText(model.getTechID()+"");
		textFieldMonMdp.setText(model.getMotDePasse()+"");
		textFieldMonNom.setText(model.getNom()+"");
		textFieldMonPrenom.setText(model.getPrenom()+"");
		textFieldMonPseudo.setText(model.getPseudo()+"");
		
		//facture
		
		factureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_factureJPanel = new GridBagLayout();
		gbl_factureJPanel.columnWidths = new int[]{0, 500, 380, 0};
		gbl_factureJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_factureJPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_factureJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		factureJPanel.setLayout(gbl_factureJPanel);
		
		lblNDeLocation = new JLabel("N\u00B0 de location :");
		GridBagConstraints gbc_lblNDeLocation = new GridBagConstraints();
		gbc_lblNDeLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeLocation.anchor = GridBagConstraints.EAST;
		gbc_lblNDeLocation.gridx = 0;
		gbc_lblNDeLocation.gridy = 0;
		factureJPanel.add(lblNDeLocation, gbc_lblNDeLocation);
		
		textFieldFactureNumLoca = new JTextField();
		GridBagConstraints gbc_textFieldFactureNumLoca = new GridBagConstraints();
		gbc_textFieldFactureNumLoca.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldFactureNumLoca.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactureNumLoca.gridx = 1;
		gbc_textFieldFactureNumLoca.gridy = 0;
		factureJPanel.add(textFieldFactureNumLoca, gbc_textFieldFactureNumLoca);
		textFieldFactureNumLoca.setColumns(10);
		
		lblEtatDePayement = new JLabel("Etat de payement :");
		GridBagConstraints gbc_lblEtatDePayement = new GridBagConstraints();
		gbc_lblEtatDePayement.anchor = GridBagConstraints.EAST;
		gbc_lblEtatDePayement.insets = new Insets(0, 0, 5, 5);
		gbc_lblEtatDePayement.gridx = 0;
		gbc_lblEtatDePayement.gridy = 2;
		factureJPanel.add(lblEtatDePayement, gbc_lblEtatDePayement);
		
		textFieldFactEtatDePayement = new JTextField("false");
		GridBagConstraints gbc_textFieldFactEtatDePayement = new GridBagConstraints();
		gbc_textFieldFactEtatDePayement.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldFactEtatDePayement.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactEtatDePayement.gridx = 1;
		gbc_textFieldFactEtatDePayement.gridy = 2;
		factureJPanel.add(textFieldFactEtatDePayement, gbc_textFieldFactEtatDePayement);
		textFieldFactEtatDePayement.setColumns(10);
		
		lblNote = new JLabel("Note :");
		GridBagConstraints gbc_lblNote = new GridBagConstraints();
		gbc_lblNote.anchor = GridBagConstraints.EAST;
		gbc_lblNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblNote.gridx = 0;
		gbc_lblNote.gridy = 4;
		factureJPanel.add(lblNote, gbc_lblNote);
		
		textFieldFactNote = new JTextField();
		GridBagConstraints gbc_textFieldFactNote = new GridBagConstraints();
		gbc_textFieldFactNote.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldFactNote.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactNote.gridx = 1;
		gbc_textFieldFactNote.gridy = 4;
		factureJPanel.add(textFieldFactNote, gbc_textFieldFactNote);
		textFieldFactNote.setColumns(10);
		
		lblKmSupp = new JLabel("Kilomètre supplémentaire :");
		GridBagConstraints gbc_lblKmSupp = new GridBagConstraints();
		gbc_lblKmSupp.anchor = GridBagConstraints.EAST;
		gbc_lblKmSupp.insets = new Insets(0, 0, 5, 5);
		gbc_lblKmSupp.gridx = 0;
		gbc_lblKmSupp.gridy = 5;
		factureJPanel.add(lblKmSupp, gbc_lblKmSupp);
		
		textFieldFactKmSupp = new JTextField();
		GridBagConstraints gbc_textFieldFactKmSupp = new GridBagConstraints();
		gbc_textFieldFactKmSupp.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldFactKmSupp.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactKmSupp.gridx = 1;
		gbc_textFieldFactKmSupp.gridy = 5;
		factureJPanel.add(textFieldFactKmSupp, gbc_textFieldFactKmSupp);
		textFieldFactNote.setColumns(10);
		
		btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.anchor = GridBagConstraints.EAST;
		gbc_btnValider.gridx = 1;
		gbc_btnValider.gridy = 8;
		factureJPanel.add(btnValider, gbc_btnValider);
		
		textFieldFactMessage = new JTextField();
		textFieldFactMessage.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldFactMessage = new GridBagConstraints();
		gbc_textFieldFactMessage.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldFactMessage.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactMessage.gridx = 1;
		gbc_textFieldFactMessage.gridy = 9;
		factureJPanel.add(textFieldFactMessage, gbc_textFieldFactMessage);
		textFieldFactNote.setColumns(10);
		
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isInteger(textFieldFactureNumLoca.getText())) {
					if(!textFieldFactureNumLoca.getText().equals("") && !textFieldFactEtatDePayement.getText().equals("") 
							&& !textFieldFactNote.getText().equals("")&& !textFieldFactKmSupp.getText().equals("")) {
						if(model.createFacture(Integer.parseInt(textFieldFactureNumLoca.getText()),false, textFieldFactNote.getText(), Double.parseDouble(textFieldFactKmSupp.getText()))==1) {
							textFieldFactMessage.setText("Facture creee correctement");
						}
						else textFieldFactMessage.setText("Problème lors de la creation de la facture");
					}
					else textFieldFactMessage.setText("Veuillez remplir tous les champs");
				}
				else textFieldFactMessage.setText("Cette location n'existe pas");
				
			}
		});
		
		factureJPanel.setVisible(false);
		
		//location
		
		locationJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_LocationJPanel = new GridBagLayout();
		gbl_LocationJPanel.columnWidths = new int[]{0, 500, 380, 0};
		gbl_LocationJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_LocationJPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_LocationJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		locationJPanel.setLayout(gbl_LocationJPanel);
		
		lblNDeLocation1 = new JLabel("N\u00B0 de location :");
		GridBagConstraints gbc_lblNDeLocation1 = new GridBagConstraints();
		gbc_lblNDeLocation1.anchor = GridBagConstraints.EAST;
		gbc_lblNDeLocation1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeLocation1.gridx = 0;
		gbc_lblNDeLocation1.gridy = 0;
		locationJPanel.add(lblNDeLocation1, gbc_lblNDeLocation1);
		
		textFieldLocaNumLoca = new JTextField();
		GridBagConstraints gbc_textFieldLocaNumLoca = new GridBagConstraints();
		gbc_textFieldLocaNumLoca.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLocaNumLoca.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaNumLoca.gridx = 1;
		gbc_textFieldLocaNumLoca.gridy = 0;
		locationJPanel.add(textFieldLocaNumLoca, gbc_textFieldLocaNumLoca);
		textFieldLocaNumLoca.setColumns(10);
		
		btnRechercher = new JButton("Rechercher location");
		GridBagConstraints gbc_btnRechercher = new GridBagConstraints();
		gbc_btnRechercher.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercher.gridx = 1;
		gbc_btnRechercher.gridy = 1;
		locationJPanel.add(btnRechercher, gbc_btnRechercher);
		
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNDeLocation2.setVisible(true);
				textFieldNumLoca.setVisible(true);
				lblNDeClient2.setVisible(true);
				textFieldLocaNumClient2.setVisible(true);
				lblNAssurance.setVisible(true);
				textFieldAssurance.setVisible(true);
				lblNAssurance2.setVisible(true);
				textFieldAssurance2.setVisible(true);
				lblNVoit.setVisible(true);
				textFieldNVoit.setVisible(true);
				lblMontantAcc.setVisible(true);
				textFieldMontantAcc.setVisible(true);
				lblEtatAcc.setVisible(true);
				textFieldEtatAcc.setVisible(true);
				lblKilometrage.setVisible(true);
				textFieldKilometrage.setVisible(true);
				lblEtatLocation.setVisible(true);
				textFieldEtatLocation.setVisible(true);
				textAreaLocaNumClient.setVisible(false);
				if(isInteger(textFieldLocaNumLoca.getText())) {
					Location tempLoca = model.getLocation(Integer.parseInt(textFieldLocaNumLoca.getText()));
					if (tempLoca != null) {
						textFieldNumLoca.setText(tempLoca.getLocationID()+"");
						textFieldLocaNumClient2.setText(tempLoca.getClientID()+"");
						textFieldAssurance.setText(tempLoca.getAssurID()+"");
						textFieldAssurance2.setText(tempLoca.getAssurID()+"");
						textFieldNVoit.setText(tempLoca.getVoitureID()+"");
						textFieldMontantAcc.setText(tempLoca.getAccompte()+"");
						String tempIsAccomptePaye;
						if(tempLoca.isAccomptePaye()) {
							tempIsAccomptePaye = "Oui";
						}
						else tempIsAccomptePaye = "Non";
						textFieldEtatAcc.setText(tempIsAccomptePaye);
						textFieldKilometrage.setText(tempLoca.getKmInitial()+"");
						String tempIsEstEnCours;
						if(tempLoca.isEstEnCours()) {
							tempIsEstEnCours = "Oui";
						}
						else tempIsEstEnCours = "Non";
						textFieldEtatLocation.setText(tempIsEstEnCours);
					}
					else {
						textFieldNumLoca.setText("Cette location n'existe pas");
						textFieldLocaNumClient2.setText("");
						textFieldAssurance.setText("");
						textFieldAssurance2.setText("");
						textFieldNVoit.setText("");
						textFieldMontantAcc.setText("");
						textFieldEtatAcc.setText("");
						textFieldKilometrage.setText("");
						textFieldEtatLocation.setText("");
					}
					
				}
				else {
					textFieldNumLoca.setText("Entrez un numéro de location correcte");
					textFieldLocaNumClient2.setText("");
					textFieldAssurance.setText(""); 
					textFieldAssurance2.setText("");
					textFieldNVoit.setText("");
					textFieldMontantAcc.setText("");
					textFieldEtatAcc.setText("");
					textFieldKilometrage.setText("");
					textFieldEtatLocation.setText("");
				}
			}
		});
		
		lblNDeClient = new JLabel("N\u00B0 de client :");
		GridBagConstraints gbc_lblNDeClient = new GridBagConstraints();
		gbc_lblNDeClient.anchor = GridBagConstraints.EAST;
		gbc_lblNDeClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeClient.gridx = 0;
		gbc_lblNDeClient.gridy = 2;
		locationJPanel.add(lblNDeClient, gbc_lblNDeClient);
		
		textFieldLocaNumClient = new JTextField();
		GridBagConstraints gbc_textFieldLocaNumClient = new GridBagConstraints();
		gbc_textFieldLocaNumClient.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLocaNumClient.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaNumClient.gridx = 1;
		gbc_textFieldLocaNumClient.gridy = 2;
		locationJPanel.add(textFieldLocaNumClient, gbc_textFieldLocaNumClient);
		textFieldLocaNumClient.setColumns(10);
		
		btnRechercherNumClient = new JButton("Rechercher location a partir du n° de client");
		GridBagConstraints gbc_btnRechercherNumClient = new GridBagConstraints();
		gbc_btnRechercherNumClient.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherNumClient.gridx = 1;
		gbc_btnRechercherNumClient.gridy = 3;
		locationJPanel.add(btnRechercherNumClient, gbc_btnRechercherNumClient);
		
		btnRechercherNumClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaLocaNumClient.setVisible(true);
				lblNDeLocation2.setVisible(false);
				textFieldNumLoca.setVisible(false);
				lblNDeClient2.setVisible(false);
				textFieldLocaNumClient2.setVisible(false);
				lblNAssurance.setVisible(false);
				textFieldAssurance.setVisible(false);
				lblNAssurance2.setVisible(false);
				textFieldAssurance2.setVisible(false);
				lblNVoit.setVisible(false);
				textFieldNVoit.setVisible(false);
				lblMontantAcc.setVisible(false);
				textFieldMontantAcc.setVisible(false);
				lblEtatAcc.setVisible(false);
				textFieldEtatAcc.setVisible(false);
				lblKilometrage.setVisible(false);
				textFieldKilometrage.setVisible(false);
				lblEtatLocation.setVisible(false);
				textFieldEtatLocation.setVisible(false);
				String tempString="";
				if(isInteger(textFieldLocaNumClient.getText())) {
					Location[] tempLocas = model.getLocationsClient(Integer.parseInt(textFieldLocaNumClient.getText()));
					if(tempLocas != null) {
						for (Location location : tempLocas) {
							tempString+= location.toString()+"\n";
						}
						textAreaLocaNumClient.setText(tempString);
					}
					else textAreaLocaNumClient.setText("Ce client n'existe pas ou n'a pas de location");
				}
				else textAreaLocaNumClient.setText("Entrez un numero de client correcte");
			}
		});
		
		lblNDeLocation2 = new JLabel("N\u00B0 de location :");
		GridBagConstraints gbc_lblNDeLocation2 = new GridBagConstraints();
		gbc_lblNDeLocation2.anchor = GridBagConstraints.EAST;
		gbc_lblNDeLocation2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeLocation2.gridx = 0;
		gbc_lblNDeLocation2.gridy = 4;
		locationJPanel.add(lblNDeLocation2, gbc_lblNDeLocation2);
		
		textFieldNumLoca = new JTextField();
		textFieldNumLoca.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldNumLoca = new GridBagConstraints();
		gbc_textFieldNumLoca.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNumLoca.fill = GridBagConstraints.BOTH;
		gbc_textFieldNumLoca.gridx = 1;
		gbc_textFieldNumLoca.gridy = 4;
		locationJPanel.add(textFieldNumLoca, gbc_textFieldNumLoca);
		
		lblNDeClient2 = new JLabel("N\u00B0 de client :");
		GridBagConstraints gbc_lblNDeClient2 = new GridBagConstraints();
		gbc_lblNDeClient2.anchor = GridBagConstraints.EAST;
		gbc_lblNDeClient2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeClient2.gridx = 0;
		gbc_lblNDeClient2.gridy = 5;
		locationJPanel.add(lblNDeClient2, gbc_lblNDeClient2);
		
		textFieldLocaNumClient2 = new JTextField();
		textFieldLocaNumClient2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldLocaNumClient2 = new GridBagConstraints();
		gbc_textFieldLocaNumClient2.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLocaNumClient2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaNumClient2.gridx = 1;
		gbc_textFieldLocaNumClient2.gridy = 5;
		locationJPanel.add(textFieldLocaNumClient2, gbc_textFieldLocaNumClient2);
		textFieldLocaNumClient.setColumns(10);
		
		lblNAssurance = new JLabel("N° d'assurance :");
		GridBagConstraints gbc_lblNAssurance = new GridBagConstraints();
		gbc_lblNAssurance.anchor = GridBagConstraints.EAST;
		gbc_lblNAssurance.insets = new Insets(0, 0, 5, 5);
		gbc_lblNAssurance.gridx = 0;
		gbc_lblNAssurance.gridy = 6;
		locationJPanel.add(lblNAssurance, gbc_lblNAssurance);
		
		textFieldAssurance = new JTextField();
		textFieldAssurance.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldAssurance = new GridBagConstraints();
		gbc_textFieldAssurance.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldAssurance.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAssurance.gridx = 1;
		gbc_textFieldAssurance.gridy = 6;
		locationJPanel.add(textFieldAssurance, gbc_textFieldAssurance);
		textFieldLocaNumClient.setColumns(10);
		
		lblNAssurance2 = new JLabel("Type d'assurance :");
		GridBagConstraints gbc_lblNAssurance2 = new GridBagConstraints();
		gbc_lblNAssurance2.anchor = GridBagConstraints.EAST;
		gbc_lblNAssurance2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNAssurance2.gridx = 0;
		gbc_lblNAssurance2.gridy = 7;
		locationJPanel.add(lblNAssurance2, gbc_lblNAssurance2);
		
		textFieldAssurance2 = new JTextField();
		textFieldAssurance2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldAssurance2 = new GridBagConstraints();
		gbc_textFieldAssurance2.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldAssurance2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAssurance2.gridx = 1;
		gbc_textFieldAssurance2.gridy = 7;
		locationJPanel.add(textFieldAssurance2, gbc_textFieldAssurance2);
		textFieldLocaNumClient.setColumns(10);
		
		lblNVoit = new JLabel("Id de voiture :");
		GridBagConstraints gbc_lblNVoit = new GridBagConstraints();
		gbc_lblNVoit.gridwidth = 1;
		gbc_lblNVoit.anchor = GridBagConstraints.EAST;
		gbc_lblNVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblNVoit.gridx = 0;
		gbc_lblNVoit.gridy = 8;
		locationJPanel.add(lblNVoit, gbc_lblNVoit);
		
		textFieldNVoit = new JTextField();
		textFieldNVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldNVoit = new GridBagConstraints();
		gbc_textFieldNVoit.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNVoit.gridwidth = 1;
		gbc_textFieldNVoit.gridheight = 1;
		gbc_textFieldNVoit.gridx = 1;
		gbc_textFieldNVoit.gridy = 8;
		locationJPanel.add(textFieldNVoit, gbc_textFieldNVoit);
		textFieldNVoit.setColumns(10);
		
		lblMontantAcc = new JLabel("Montant accompte :");
		GridBagConstraints gbc_lblMontantAcc = new GridBagConstraints();
		gbc_lblMontantAcc.anchor = GridBagConstraints.EAST;
		gbc_lblMontantAcc.insets = new Insets(0, 0, 5, 5);
		gbc_lblMontantAcc.gridx = 0;
		gbc_lblMontantAcc.gridy = 9;
		locationJPanel.add(lblMontantAcc, gbc_lblMontantAcc);
		
		textFieldMontantAcc = new JTextField();
		textFieldMontantAcc.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldMontantAcc = new GridBagConstraints();
		gbc_textFieldMontantAcc.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMontantAcc.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMontantAcc.gridx = 1;
		gbc_textFieldMontantAcc.gridy = 9;
		locationJPanel.add(textFieldMontantAcc, gbc_textFieldMontantAcc);
		textFieldMontantAcc.setColumns(10);
		
		lblEtatAcc = new JLabel("Etat accompte :");
		GridBagConstraints gbc_lblEtatAcc = new GridBagConstraints();
		gbc_lblEtatAcc.anchor = GridBagConstraints.EAST;
		gbc_lblEtatAcc.insets = new Insets(0, 0, 5, 5);
		gbc_lblEtatAcc.gridx = 0;
		gbc_lblEtatAcc.gridy = 10;
		locationJPanel.add(lblEtatAcc, gbc_lblEtatAcc);
		
		textFieldEtatAcc = new JTextField();
		textFieldEtatAcc.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldEtatAcc = new GridBagConstraints();
		gbc_textFieldEtatAcc.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldEtatAcc.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEtatAcc.gridx = 1;
		gbc_textFieldEtatAcc.gridy = 10;
		locationJPanel.add(textFieldEtatAcc, gbc_textFieldEtatAcc);
		textFieldEtatAcc.setColumns(10);
		
		lblKilometrage = new JLabel("Kilometrage actuel :");
		GridBagConstraints gbc_lblKilometrage = new GridBagConstraints();
		gbc_lblKilometrage.anchor = GridBagConstraints.EAST;
		gbc_lblKilometrage.insets = new Insets(0, 0, 5, 5);
		gbc_lblKilometrage.gridx = 0;
		gbc_lblKilometrage.gridy = 11;
		locationJPanel.add(lblKilometrage, gbc_lblKilometrage);
		
		textFieldKilometrage = new JTextField();
		textFieldKilometrage.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldKilometrage = new GridBagConstraints();
		gbc_textFieldKilometrage.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldKilometrage.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldKilometrage.gridx = 1;
		gbc_textFieldKilometrage.gridy = 11;
		locationJPanel.add(textFieldKilometrage, gbc_textFieldKilometrage);
		textFieldKilometrage.setColumns(10);
		
		lblEtatLocation = new JLabel("Etat de Location actuel :");
		GridBagConstraints gbc_lblEtatLocation = new GridBagConstraints();
		gbc_lblEtatLocation.anchor = GridBagConstraints.EAST;
		gbc_lblEtatLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblEtatLocation.gridx = 0;
		gbc_lblEtatLocation.gridy = 12;
		locationJPanel.add(lblEtatLocation, gbc_lblEtatLocation);
		
		textFieldEtatLocation = new JTextField();
		textFieldEtatLocation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldEtatLocation = new GridBagConstraints();
		gbc_textFieldEtatLocation.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldEtatLocation.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEtatLocation.gridx = 1;
		gbc_textFieldEtatLocation.gridy = 12;
		locationJPanel.add(textFieldEtatLocation, gbc_textFieldEtatLocation);
		textFieldEtatLocation.setColumns(10);
		
		textAreaLocaNumClient = new JTextArea();
		GridBagConstraints gbc_textAreaLocaNumClient = new GridBagConstraints();
		gbc_textAreaLocaNumClient.insets = new Insets(0, 0, 5, 0);
		gbc_textAreaLocaNumClient.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAreaLocaNumClient.gridx = 1;
		gbc_textAreaLocaNumClient.gridy = 4;
		locationJPanel.add(textAreaLocaNumClient, gbc_textAreaLocaNumClient);
		textAreaLocaNumClient.setColumns(10);
		textAreaLocaNumClient.setVisible(false);
		
		locationJPanel.setVisible(false);
		
		// Affichage d'une voiture 
		
		GridBagLayout gbl_alterVoiture = new GridBagLayout();
		gbl_alterVoiture.columnWidths = new int[]{0, 0, 0};
		gbl_alterVoiture.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		gbl_alterVoiture.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_alterVoiture.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0, Double.MIN_VALUE};
		voitureJPanel.setLayout(gbl_alterVoiture);
		
		lblVoitInfosVoit = new JLabel("Infos de la voiture");
		GridBagConstraints gbc_lblVoitInfosVoit = new GridBagConstraints();
		gbc_lblVoitInfosVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitInfosVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitInfosVoit.gridx = 0;
		gbc_lblVoitInfosVoit.gridy = 0;
		voitureJPanel.add(lblVoitInfosVoit, gbc_lblVoitInfosVoit);
		
		lblVoitIDVoit = new JLabel("ID de la voiture :");
		GridBagConstraints gbc_lblVoitIDVoit = new GridBagConstraints();
		gbc_lblVoitIDVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitIDVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitIDVoit.gridx = 0;
		gbc_lblVoitIDVoit.gridy = 1;
		voitureJPanel.add(lblVoitIDVoit, gbc_lblVoitIDVoit);
		
		textFieldVoitIDVoit = new JTextField();
		GridBagConstraints gbc_textFieldVoitIDVoit = new GridBagConstraints();
		gbc_textFieldVoitIDVoit.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldVoitIDVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitIDVoit.gridx = 1;
		gbc_textFieldVoitIDVoit.gridy = 1;
		voitureJPanel.add(textFieldVoitIDVoit, gbc_textFieldVoitIDVoit);
		textFieldVoitIDVoit.setColumns(10);
		
		lblVoitPrixVoit = new JLabel("Prix de la voiture :");
		GridBagConstraints gbc_lblVoitPrixVoit = new GridBagConstraints();
		gbc_lblVoitPrixVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitPrixVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitPrixVoit.gridx = 0;
		gbc_lblVoitPrixVoit.gridy = 2;
		voitureJPanel.add(lblVoitPrixVoit, gbc_lblVoitPrixVoit);
		
		textFieldVoitPrixVoit = new JTextField();
		textFieldVoitPrixVoit.setEditable(false);
		textFieldVoitPrixVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitPrixVoit = new GridBagConstraints();
		gbc_textFieldVoitPrixVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitPrixVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitPrixVoit.gridx = 1;
		gbc_textFieldVoitPrixVoit.gridy = 2;
		voitureJPanel.add(textFieldVoitPrixVoit, gbc_textFieldVoitPrixVoit);
		textFieldVoitPrixVoit.setColumns(10);
		
		lblVoitMarqueVoit = new JLabel("Marque de la voiture :");
		GridBagConstraints gbc_lblVoitMarqueVoit = new GridBagConstraints();
		gbc_lblVoitMarqueVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitMarqueVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitMarqueVoit.gridx = 0;
		gbc_lblVoitMarqueVoit.gridy = 3;
		voitureJPanel.add(lblVoitMarqueVoit, gbc_lblVoitMarqueVoit);
		
		textFieldVoitMarqueVoit = new JTextField();
		textFieldVoitMarqueVoit.setEditable(false);
		textFieldVoitMarqueVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitMarqueVoit = new GridBagConstraints();
		gbc_textFieldVoitMarqueVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitMarqueVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitMarqueVoit.gridx = 1;
		gbc_textFieldVoitMarqueVoit.gridy = 3;
		voitureJPanel.add(textFieldVoitMarqueVoit, gbc_textFieldVoitMarqueVoit);
		textFieldVoitMarqueVoit.setColumns(10);
		
		lblVoitModeleVoit = new JLabel("Modele de la voiture :");
		GridBagConstraints gbc_lblVoitModeleVoit = new GridBagConstraints();
		gbc_lblVoitModeleVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitModeleVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitModeleVoit.gridx = 0;
		gbc_lblVoitModeleVoit.gridy = 4;
		voitureJPanel.add(lblVoitModeleVoit, gbc_lblVoitModeleVoit);
		
		textFieldVoitModeleVoit = new JTextField();
		textFieldVoitModeleVoit.setEditable(false);
		textFieldVoitModeleVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitModeleVoit = new GridBagConstraints();
		gbc_textFieldVoitModeleVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitModeleVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitModeleVoit.gridx = 1;
		gbc_textFieldVoitModeleVoit.gridy =4;
		voitureJPanel.add(textFieldVoitModeleVoit, gbc_textFieldVoitModeleVoit);
		textFieldVoitModeleVoit.setColumns(10);
		
		lblVoitAnneeVoit = new JLabel("Annee de mise en circulation de la voiture :");
		GridBagConstraints gbc_lblVoitAnneeVoit = new GridBagConstraints();
		gbc_lblVoitAnneeVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitAnneeVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitAnneeVoit.gridx = 0;
		gbc_lblVoitAnneeVoit.gridy = 5;
		voitureJPanel.add(lblVoitAnneeVoit, gbc_lblVoitAnneeVoit);
		
		textFieldVoitAnneeVoit = new JTextField();
		textFieldVoitAnneeVoit.setEditable(false);
		textFieldVoitAnneeVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitAnneeVoit = new GridBagConstraints();
		gbc_textFieldVoitAnneeVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitAnneeVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitAnneeVoit.gridx = 1;
		gbc_textFieldVoitAnneeVoit.gridy = 5;
		voitureJPanel.add(textFieldVoitAnneeVoit, gbc_textFieldVoitAnneeVoit);
		textFieldVoitAnneeVoit.setColumns(10);
		
		lblVoitTypeVoit = new JLabel("Type de voiture :");
		GridBagConstraints gbc_lblVoitTypeVoit = new GridBagConstraints();
		gbc_lblVoitTypeVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitTypeVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitTypeVoit.gridx = 0;
		gbc_lblVoitTypeVoit.gridy = 6;
		voitureJPanel.add(lblVoitTypeVoit, gbc_lblVoitTypeVoit);
		
		textFieldVoitTypeVoit = new JTextField();
		textFieldVoitTypeVoit.setEditable(false);
		textFieldVoitTypeVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitTypeVoit = new GridBagConstraints();
		gbc_textFieldVoitTypeVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitTypeVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitTypeVoit.gridx = 1;
		gbc_textFieldVoitTypeVoit.gridy = 6;
		voitureJPanel.add(textFieldVoitTypeVoit, gbc_textFieldVoitTypeVoit);
		textFieldVoitTypeVoit.setColumns(10);
		
		lblVoitCarburantVoit = new JLabel("Carburant de la voiture :");
		GridBagConstraints gbc_lblVoitCarburantVoit = new GridBagConstraints();
		gbc_lblVoitCarburantVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitCarburantVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitCarburantVoit.gridx = 0;
		gbc_lblVoitCarburantVoit.gridy = 7;
		voitureJPanel.add(lblVoitCarburantVoit, gbc_lblVoitCarburantVoit);
		
		textFieldVoitCarburantVoit = new JTextField();
		textFieldVoitCarburantVoit.setEditable(false);
		textFieldVoitCarburantVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitCarburantVoit = new GridBagConstraints();
		gbc_textFieldVoitCarburantVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitCarburantVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitCarburantVoit.gridx = 1;
		gbc_textFieldVoitCarburantVoit.gridy = 7;
		voitureJPanel.add(textFieldVoitCarburantVoit, gbc_textFieldVoitCarburantVoit);
		textFieldVoitCarburantVoit.setColumns(10);
		
		lblVoitCouleurVoit = new JLabel("Couleur de la voiture :");
		GridBagConstraints gbc_lblVoitCouleurVoit = new GridBagConstraints();
		gbc_lblVoitCouleurVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitCouleurVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitCouleurVoit.gridx = 0;
		gbc_lblVoitCouleurVoit.gridy = 8;
		voitureJPanel.add(lblVoitCouleurVoit, gbc_lblVoitCouleurVoit);
		
		textFieldVoitCouleurVoit = new JTextField();
		textFieldVoitCouleurVoit.setEditable(false);
		textFieldVoitCouleurVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitCouleurVoit = new GridBagConstraints();
		gbc_textFieldVoitCouleurVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitCouleurVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitCouleurVoit.gridx = 1;
		gbc_textFieldVoitCouleurVoit.gridy = 8;
		voitureJPanel.add(textFieldVoitCouleurVoit, gbc_textFieldVoitCouleurVoit);
		textFieldVoitCouleurVoit.setColumns(10);
		
		lblVoitEstManuelleVoit = new JLabel("La voiture est manuelle :");
		GridBagConstraints gbc_lblVoitEstManuelleVoit = new GridBagConstraints();
		gbc_lblVoitEstManuelleVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitEstManuelleVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitEstManuelleVoit.gridx = 0;
		gbc_lblVoitEstManuelleVoit.gridy = 9;
		voitureJPanel.add(lblVoitEstManuelleVoit, gbc_lblVoitEstManuelleVoit);
		
		textFieldVoitEstManuelleVoit = new JTextField();
		textFieldVoitEstManuelleVoit.setEditable(false);
		textFieldVoitEstManuelleVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitEstManuelleVoit = new GridBagConstraints();
		gbc_textFieldVoitEstManuelleVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitEstManuelleVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitEstManuelleVoit.gridx = 1;
		gbc_textFieldVoitEstManuelleVoit.gridy = 9;
		voitureJPanel.add(textFieldVoitEstManuelleVoit, gbc_textFieldVoitEstManuelleVoit);
		textFieldVoitEstManuelleVoit.setColumns(10);
		
		lblVoitRoueMotriceVoit = new JLabel("Nombre de roues motrices de la voiture :");
		GridBagConstraints gbc_lblVoitRoueMotriceVoit = new GridBagConstraints();
		gbc_lblVoitRoueMotriceVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitRoueMotriceVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitRoueMotriceVoit.gridx = 0;
		gbc_lblVoitRoueMotriceVoit.gridy = 10;
		voitureJPanel.add(lblVoitRoueMotriceVoit, gbc_lblVoitRoueMotriceVoit);
		
		textFieldVoitRoueMotriceVoit = new JTextField();
		textFieldVoitRoueMotriceVoit.setEditable(false);
		textFieldVoitRoueMotriceVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitRoueMotriceVoit = new GridBagConstraints();
		gbc_textFieldVoitRoueMotriceVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitRoueMotriceVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitRoueMotriceVoit.gridx = 1;
		gbc_textFieldVoitRoueMotriceVoit.gridy = 10;
		voitureJPanel.add(textFieldVoitRoueMotriceVoit, gbc_textFieldVoitRoueMotriceVoit);
		textFieldVoitRoueMotriceVoit.setColumns(10);
		
		lblVoitKilometrageVoit = new JLabel("Kilometrage de la voiture :");
		GridBagConstraints gbc_lblVoitKilometrageVoit = new GridBagConstraints();
		gbc_lblVoitKilometrageVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitKilometrageVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitKilometrageVoit.gridx = 0;
		gbc_lblVoitKilometrageVoit.gridy = 11;
		voitureJPanel.add(lblVoitKilometrageVoit, gbc_lblVoitKilometrageVoit);
		
		textFieldVoitKilometrageVoit = new JTextField();
		textFieldVoitKilometrageVoit.setEditable(false);
		textFieldVoitKilometrageVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitKilometrageVoit = new GridBagConstraints();
		gbc_textFieldVoitKilometrageVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitKilometrageVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitKilometrageVoit.gridx = 1;
		gbc_textFieldVoitKilometrageVoit.gridy = 11;
		voitureJPanel.add(textFieldVoitKilometrageVoit, gbc_textFieldVoitKilometrageVoit);
		textFieldVoitKilometrageVoit.setColumns(10);
		
		lblVoitVolumeCoffreVoit = new JLabel("Volume du coffre de la voiture :");
		GridBagConstraints gbc_lblVoitVolumeCoffreVoit = new GridBagConstraints();
		gbc_lblVoitVolumeCoffreVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitVolumeCoffreVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitVolumeCoffreVoit.gridx = 0;
		gbc_lblVoitVolumeCoffreVoit.gridy = 12;
		voitureJPanel.add(lblVoitVolumeCoffreVoit, gbc_lblVoitVolumeCoffreVoit);
		
		textFieldVoitVolumeCoffreVoit = new JTextField();
		textFieldVoitVolumeCoffreVoit.setEditable(false);
		textFieldVoitVolumeCoffreVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitVolumeCoffreVoit = new GridBagConstraints();
		gbc_textFieldVoitVolumeCoffreVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitVolumeCoffreVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitVolumeCoffreVoit.gridx = 1;
		gbc_textFieldVoitVolumeCoffreVoit.gridy = 12;
		voitureJPanel.add(textFieldVoitVolumeCoffreVoit, gbc_textFieldVoitVolumeCoffreVoit);
		textFieldVoitVolumeCoffreVoit.setColumns(10);
		
		lblVoitHauteurVoit = new JLabel("Hauteur de la voiture :");
		GridBagConstraints gbc_lblVoitHauteurVoit = new GridBagConstraints();
		gbc_lblVoitHauteurVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitHauteurVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitHauteurVoit.gridx = 0;
		gbc_lblVoitHauteurVoit.gridy = 13;
		voitureJPanel.add(lblVoitHauteurVoit, gbc_lblVoitHauteurVoit);
		
		textFieldVoitHauteurVoit = new JTextField();
		textFieldVoitHauteurVoit.setEditable(false);
		textFieldVoitHauteurVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitHauteurVoit = new GridBagConstraints();
		gbc_textFieldVoitHauteurVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitHauteurVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitHauteurVoit.gridx = 1;
		gbc_textFieldVoitHauteurVoit.gridy = 13;
		voitureJPanel.add(textFieldVoitHauteurVoit, gbc_textFieldVoitHauteurVoit);
		textFieldVoitHauteurVoit.setColumns(10);
		
		lblVoitPoidsVoit = new JLabel("Poids de la voiture :");
		GridBagConstraints gbc_lblVoitPoidsVoit = new GridBagConstraints();
		gbc_lblVoitPoidsVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitPoidsVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitPoidsVoit.gridx = 0;
		gbc_lblVoitPoidsVoit.gridy = 14;
		voitureJPanel.add(lblVoitPoidsVoit, gbc_lblVoitPoidsVoit);
		
		textFieldVoitPoidsVoit = new JTextField();
		textFieldVoitPoidsVoit.setEditable(false);
		textFieldVoitPoidsVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitPoidsVoit = new GridBagConstraints();
		gbc_textFieldVoitPoidsVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitPoidsVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitPoidsVoit.gridx = 1;
		gbc_textFieldVoitPoidsVoit.gridy = 14;
		voitureJPanel.add(textFieldVoitPoidsVoit, gbc_textFieldVoitPoidsVoit);
		textFieldVoitPoidsVoit.setColumns(10);
		
		lblVoitEstLoueeVoit = new JLabel("La voiture est louee :");
		GridBagConstraints gbc_lblVoitEstLoueeVoit = new GridBagConstraints();
		gbc_lblVoitEstLoueeVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitEstLoueeVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitEstLoueeVoit.gridx = 0;
		gbc_lblVoitEstLoueeVoit.gridy = 15;
		voitureJPanel.add(lblVoitEstLoueeVoit, gbc_lblVoitEstLoueeVoit);
		
		textFieldVoitEstLoueeVoit = new JTextField();
		textFieldVoitEstLoueeVoit.setEditable(false);
		textFieldVoitEstLoueeVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitEstLoueeVoit = new GridBagConstraints();
		gbc_textFieldVoitEstLoueeVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitEstLoueeVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitEstLoueeVoit.gridx = 1;
		gbc_textFieldVoitEstLoueeVoit.gridy = 15;
		voitureJPanel.add(textFieldVoitEstLoueeVoit, gbc_textFieldVoitEstLoueeVoit);
		textFieldVoitEstLoueeVoit.setColumns(10);
		
		lblVoitNoteVoit = new JLabel("Note de la voiture :");
		GridBagConstraints gbc_lblVoitNoteVoit = new GridBagConstraints();
		gbc_lblVoitNoteVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitNoteVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitNoteVoit.gridx = 0;
		gbc_lblVoitNoteVoit.gridy = 16;
		voitureJPanel.add(lblVoitNoteVoit, gbc_lblVoitNoteVoit);
		
		textFieldVoitNoteVoit = new JTextField();
		textFieldVoitNoteVoit.setEditable(false);
		textFieldVoitNoteVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitNoteVoit = new GridBagConstraints();
		gbc_textFieldVoitNoteVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitNoteVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitNoteVoit.gridx = 1;
		gbc_textFieldVoitNoteVoit.gridy = 16;
		voitureJPanel.add(textFieldVoitNoteVoit, gbc_textFieldVoitNoteVoit);
		textFieldVoitNoteVoit.setColumns(10);
		
		lblVoitAgenceIDVoit = new JLabel("ID de l'agence de la voiture :");
		GridBagConstraints gbc_lblVoitAgenceIDVoit = new GridBagConstraints();
		gbc_lblVoitAgenceIDVoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoitAgenceIDVoit.anchor = GridBagConstraints.EAST;
		gbc_lblVoitAgenceIDVoit.gridx = 0;
		gbc_lblVoitAgenceIDVoit.gridy = 17;
		voitureJPanel.add(lblVoitAgenceIDVoit, gbc_lblVoitAgenceIDVoit);
		
		textFieldVoitAgenceIDVoit = new JTextField();
		textFieldVoitAgenceIDVoit.setEditable(false);
		textFieldVoitAgenceIDVoit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldVoitAgenceIDVoit = new GridBagConstraints();
		gbc_textFieldVoitAgenceIDVoit.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitAgenceIDVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitAgenceIDVoit.gridx = 1;
		gbc_textFieldVoitAgenceIDVoit.gridy = 17;
		voitureJPanel.add(textFieldVoitAgenceIDVoit, gbc_textFieldVoitAgenceIDVoit);
		textFieldVoitAgenceIDVoit.setColumns(10);
		
		textFieldVoitMessage = new JTextField();
		textFieldVoitMessage.setEditable(false);
		textFieldVoitMessage.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldVoitMessage.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldVoitMessage.setEditable(false);
		GridBagConstraints gbc_textFieldVoitMessage = new GridBagConstraints();
		gbc_textFieldVoitMessage.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVoitMessage.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitMessage.gridx = 1;
		gbc_textFieldVoitMessage.gridy = 18;
		voitureJPanel.add(textFieldVoitMessage, gbc_textFieldVoitMessage);
		textFieldVoitMessage.setColumns(10);
		
		btn_afficheVoit = new JButton("Afficher la voiture");
		btn_afficheVoit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(isInteger(textFieldVoitIDVoit.getText())) {
					Voiture tempVoit = model.getVoiture(Integer.parseInt(textFieldVoitIDVoit.getText()));
					if(tempVoit != null) {
						textFieldVoitPrixVoit.setText(tempVoit.getPrix()+"");
						textFieldVoitMarqueVoit.setText(tempVoit.getMarque());
						textFieldVoitModeleVoit.setText(tempVoit.getModele());
						textFieldVoitAnneeVoit.setText(tempVoit.getAnnee()+"");
						textFieldVoitTypeVoit.setText(tempVoit.getType());
						textFieldVoitCarburantVoit.setText(tempVoit.getCarburant());
						textFieldVoitCouleurVoit.setText(tempVoit.getCouleur());
						String tempEstManuelle;
						if(tempVoit.isEstManuelle()) {
							tempEstManuelle = "Oui";
						}
						else tempEstManuelle = "Non";
						textFieldVoitEstManuelleVoit.setText(tempEstManuelle);
						textFieldVoitRoueMotriceVoit.setText(tempVoit.getRoueMotrice()+"");
						textFieldVoitKilometrageVoit.setText(tempVoit.getKilometrage()+"");
						textFieldVoitVolumeCoffreVoit.setText(tempVoit.getVolumeCoffre()+"");
						textFieldVoitHauteurVoit.setText(tempVoit.getHauteur()+"");
						textFieldVoitPoidsVoit.setText(tempVoit.getPoids()+"");
						String tempEstLouee;
						if(tempVoit.isEstLouee()) {
							tempEstLouee = "Oui";
						}
						else tempEstLouee = "Non";
						textFieldVoitEstLoueeVoit.setText(tempEstLouee);
						textFieldVoitNoteVoit.setText(tempVoit.getNote());
						textFieldVoitAgenceIDVoit.setText(tempVoit.getAgenceID()+"");
					}
					else {
						textFieldVoitMessage.setText("Cette voiture n'existe pas");
						textFieldVoitPrixVoit.setText("");
						textFieldVoitMarqueVoit.setText("");
						textFieldVoitModeleVoit.setText("");
						textFieldVoitAnneeVoit.setText("");
						textFieldVoitTypeVoit.setText("");
						textFieldVoitCarburantVoit.setText("");
						textFieldVoitCouleurVoit.setText("");
						textFieldVoitEstManuelleVoit.setText("");
						textFieldVoitRoueMotriceVoit.setText("");
						textFieldVoitKilometrageVoit.setText("");
						textFieldVoitVolumeCoffreVoit.setText("");
						textFieldVoitHauteurVoit.setText("");
						textFieldVoitPoidsVoit.setText("");
						textFieldVoitEstLoueeVoit.setText("");
						textFieldVoitNoteVoit.setText("");
						textFieldVoitAgenceIDVoit.setText("");
					}
				}
				else {
					textFieldVoitMessage.setText("Veuillez entrer un numéro de voiture correcte");
					textFieldVoitPrixVoit.setText("");
					textFieldVoitMarqueVoit.setText("");
					textFieldVoitModeleVoit.setText("");
					textFieldVoitAnneeVoit.setText("");
					textFieldVoitTypeVoit.setText("");
					textFieldVoitCarburantVoit.setText("");
					textFieldVoitCouleurVoit.setText("");
					textFieldVoitEstManuelleVoit.setText("");
					textFieldVoitRoueMotriceVoit.setText("");
					textFieldVoitKilometrageVoit.setText("");
					textFieldVoitVolumeCoffreVoit.setText("");
					textFieldVoitHauteurVoit.setText("");
					textFieldVoitPoidsVoit.setText("");
					textFieldVoitEstLoueeVoit.setText("");
					textFieldVoitNoteVoit.setText("");
					textFieldVoitAgenceIDVoit.setText("");
				}
			}
		});
		GridBagConstraints gbc_btn_afficheVoit = new GridBagConstraints();
		gbc_btn_afficheVoit.insets = new Insets(0, 0, 5, 5);
		gbc_btn_afficheVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn_afficheVoit.gridx = 2;
		gbc_btn_afficheVoit.gridy = 1;
		voitureJPanel.add(btn_afficheVoit, gbc_btn_afficheVoit);
		
		//info Facture 
		
		infoFactureJPanel = new JPanel();
		infoFactureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_infoFactureJPanel = new GridBagLayout();
		gbl_infoFactureJPanel.columnWidths = new int[]{0,600, 0, 0};
		gbl_infoFactureJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_infoFactureJPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_infoFactureJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		infoFactureJPanel.setLayout(gbl_infoFactureJPanel);
		
		lblVeuillezIndiquerLidFact = new JLabel("ID de la facture :");
		GridBagConstraints gbc_lblVeuillezIndiquerLidFact = new GridBagConstraints();
		gbc_lblVeuillezIndiquerLidFact.insets = new Insets(0, 0, 5, 5);
		gbc_lblVeuillezIndiquerLidFact.anchor = GridBagConstraints.EAST;
		gbc_lblVeuillezIndiquerLidFact.gridx = 0;
		gbc_lblVeuillezIndiquerLidFact.gridy = 4;
		infoFactureJPanel.add(lblVeuillezIndiquerLidFact, gbc_lblVeuillezIndiquerLidFact);
		
		blNDeFact1 = new JLabel("N\u00B0 de facture :");
		GridBagConstraints gbc_lblNDeFact11 = new GridBagConstraints();
		gbc_lblNDeFact11.anchor = GridBagConstraints.EAST;
		gbc_lblNDeFact11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeFact11.gridx = 0;
		gbc_lblNDeFact11.gridy = 0;
		infoFactureJPanel.add(blNDeFact1, gbc_lblNDeFact11);
		
		textFieldVeuillezIndiquerLidFact = new JTextField();
		GridBagConstraints gbc_textFieldVeuillezIndiquerLidFact = new GridBagConstraints();
		gbc_textFieldVeuillezIndiquerLidFact.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVeuillezIndiquerLidFact.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVeuillezIndiquerLidFact.gridx = 1;
		gbc_textFieldVeuillezIndiquerLidFact.gridy = 0;
		infoFactureJPanel.add(textFieldVeuillezIndiquerLidFact, gbc_textFieldVeuillezIndiquerLidFact);
		textFieldVeuillezIndiquerLidFact.setColumns(10);
		
		blNDeClient1 = new JLabel("N\u00B0 de client :");
		GridBagConstraints gbc_lblNDeCleint11 = new GridBagConstraints();
		gbc_lblNDeCleint11.anchor = GridBagConstraints.EAST;
		gbc_lblNDeCleint11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeCleint11.gridx = 0;
		gbc_lblNDeCleint11.gridy = 2;
		infoFactureJPanel.add(blNDeClient1, gbc_lblNDeCleint11);
		
		textFieldVeuillezIndiquerLidClient = new JTextField();
		GridBagConstraints gbc_textFieldVeuillezIndiquerLidClient = new GridBagConstraints();
		gbc_textFieldVeuillezIndiquerLidClient.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldVeuillezIndiquerLidClient.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVeuillezIndiquerLidClient.gridx = 1;
		gbc_textFieldVeuillezIndiquerLidClient.gridy = 2;
		infoFactureJPanel.add(textFieldVeuillezIndiquerLidClient, gbc_textFieldVeuillezIndiquerLidClient);
		textFieldVeuillezIndiquerLidClient.setColumns(10);
		
		btnValiderFact2 = new JButton("Rechercher la facture apd de l'id client");
		btnValiderFact2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				textAreaInfoFact.setVisible(true);
				lblVeuillezIndiquerLidFact.setVisible(false);
				textFieldIdFact.setVisible(false);
				lblFactMontant.setVisible(false);
				textFieldFactMontant.setVisible(false);
				lblFactLocaID.setVisible(false);
				textFieldFactLocaID.setVisible(false);
				lblFactTechID.setVisible(false);
				textFieldFactTechID.setVisible(false);
				lblFactClientID.setVisible(false);
				textFieldFactClientID.setVisible(false);
				lblFactEstPaye.setVisible(false);
				textFieldFactEstPaye.setVisible(false); 
				lblFactNote.setVisible(false);
				textFieldFactNote.setVisible(false);
				String tempString="";
				if(isInteger(textFieldVeuillezIndiquerLidClient.getText())) {
					Facture[] tempFacts = model.getFacturesClient(Integer.parseInt(textFieldVeuillezIndiquerLidClient.getText()));
					if(tempFacts != null) {
						for (Facture facture : tempFacts) {
							tempString+= facture.toString()+"\n";
						}
						textAreaInfoFact.setText(tempString);
					}
					else textAreaInfoFact.setText("Ce client n'existe pas ou n'a pas de facture");
				}
				else textAreaInfoFact.setText("Entrez un numero de client correcte");
			}
		});
		GridBagConstraints gbc_btnValiderFact2 = new GridBagConstraints();
		gbc_btnValiderFact2.insets = new Insets(0, 0, 5, 5);
		gbc_btnValiderFact2.anchor = GridBagConstraints.CENTER;
		gbc_btnValiderFact2.gridx = 1;
		gbc_btnValiderFact2.gridy = 3;
		infoFactureJPanel.add(btnValiderFact2, gbc_btnValiderFact2);
		
		textAreaInfoFact = new JTextArea();
		textAreaInfoFact.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textAreaInfoFact.setEditable(false);
		GridBagConstraints gbc_textAreaInfoFact = new GridBagConstraints();
		gbc_textAreaInfoFact.insets = new Insets(0, 0, 5, 5);
		gbc_textAreaInfoFact.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAreaInfoFact.gridx = 1;
		gbc_textAreaInfoFact.gridy = 4;
		infoFactureJPanel.add(textAreaInfoFact, gbc_textAreaInfoFact);
		textAreaInfoFact.setColumns(10);
		textAreaInfoFact.setVisible(false);
		
		textFieldIdFact = new JTextField();
		textFieldIdFact.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldIdFact.setEditable(false);
		
		GridBagConstraints gbc_textFieldIdFact = new GridBagConstraints();
		gbc_textFieldIdFact.anchor = GridBagConstraints.WEST;
		gbc_textFieldIdFact.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldIdFact.gridx = 1;
		gbc_textFieldIdFact.gridy = 4;
		infoFactureJPanel.add(textFieldIdFact, gbc_textFieldIdFact);
		textFieldIdFact.setColumns(10);
		
		lblFactMontant = new JLabel("Montant de la facture :");
		GridBagConstraints gbc_lblFactMontant = new GridBagConstraints();
		gbc_lblFactMontant.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactMontant.anchor = GridBagConstraints.EAST;
		gbc_lblFactMontant.gridx = 0;
		gbc_lblFactMontant.gridy = 5;
		infoFactureJPanel.add(lblFactMontant, gbc_lblFactMontant);
		
		textFieldFactMontant = new JTextField();
		textFieldFactMontant.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactMontant.setEditable(false);
		GridBagConstraints gbc_textFieldFactMontant = new GridBagConstraints();
		gbc_textFieldFactMontant.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactMontant.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactMontant.gridx = 1;
		gbc_textFieldFactMontant.gridy = 5;
		infoFactureJPanel.add(textFieldFactMontant, gbc_textFieldFactMontant);
		textFieldFactMontant.setColumns(10);
		
		lblFactLocaID = new JLabel("ID de la location :");
		GridBagConstraints gbc_lblFactLocaID = new GridBagConstraints();
		gbc_lblFactLocaID.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactLocaID.anchor = GridBagConstraints.EAST;
		gbc_lblFactLocaID.gridx = 0;
		gbc_lblFactLocaID.gridy = 6;
		infoFactureJPanel.add(lblFactLocaID, gbc_lblFactLocaID);
		
		textFieldFactLocaID = new JTextField();
		textFieldFactLocaID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactLocaID.setEditable(false);
		GridBagConstraints gbc_textFieldFactLocaID = new GridBagConstraints();
		gbc_textFieldFactLocaID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactLocaID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactLocaID.gridx = 1;
		gbc_textFieldFactLocaID.gridy = 6;
		infoFactureJPanel.add(textFieldFactLocaID, gbc_textFieldFactLocaID);
		textFieldFactLocaID.setColumns(10);
		
		lblFactTechID = new JLabel("ID du technicien :");
		GridBagConstraints gbc_lblFactTechID = new GridBagConstraints();
		gbc_lblFactTechID.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactTechID.anchor = GridBagConstraints.EAST;
		gbc_lblFactTechID.gridx = 0;
		gbc_lblFactTechID.gridy = 7;
		infoFactureJPanel.add(lblFactTechID, gbc_lblFactTechID);
		
		textFieldFactTechID = new JTextField();
		textFieldFactTechID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactTechID.setEditable(false);
		GridBagConstraints gbc_textFieldFactTechID = new GridBagConstraints();
		gbc_textFieldFactTechID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactTechID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactTechID.gridx = 1;
		gbc_textFieldFactTechID.gridy = 7;
		infoFactureJPanel.add(textFieldFactTechID, gbc_textFieldFactTechID);
		textFieldFactTechID.setColumns(10);
		
		lblFactClientID = new JLabel("ID du Client :");
		GridBagConstraints gbc_lblFactClientID = new GridBagConstraints();
		gbc_lblFactClientID.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactClientID.anchor = GridBagConstraints.EAST;
		gbc_lblFactClientID.gridx = 0;
		gbc_lblFactClientID.gridy = 8;
		infoFactureJPanel.add(lblFactClientID, gbc_lblFactClientID);
		
		textFieldFactClientID = new JTextField();
		textFieldFactClientID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactClientID.setEditable(false);
		GridBagConstraints gbc_textFieldFactClientID = new GridBagConstraints();
		gbc_textFieldFactClientID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactClientID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactClientID.gridx = 1;
		gbc_textFieldFactClientID.gridy = 8;
		infoFactureJPanel.add(textFieldFactClientID, gbc_textFieldFactClientID);
		textFieldFactClientID.setColumns(10);
		
		lblFactEstPaye = new JLabel("La facture est payee :");
		GridBagConstraints gbc_lblFactEstPaye = new GridBagConstraints();
		gbc_lblFactEstPaye.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactEstPaye.anchor = GridBagConstraints.EAST;
		gbc_lblFactEstPaye.gridx = 0;
		gbc_lblFactEstPaye.gridy = 9;
		infoFactureJPanel.add(lblFactEstPaye, gbc_lblFactEstPaye);
		
		textFieldFactEstPaye = new JTextField();
		textFieldFactEstPaye.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactEstPaye.setEditable(false);
		GridBagConstraints gbc_textFieldFactEstPaye = new GridBagConstraints();
		gbc_textFieldFactEstPaye.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactEstPaye.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactEstPaye.gridx = 1;
		gbc_textFieldFactEstPaye.gridy = 9;
		infoFactureJPanel.add(textFieldFactEstPaye, gbc_textFieldFactEstPaye);
		textFieldFactEstPaye.setColumns(10);
		
		lblFactNote = new JLabel("Note de la facture :");
		GridBagConstraints gbc_lblFactNote = new GridBagConstraints();
		gbc_lblFactNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactNote.anchor = GridBagConstraints.EAST;
		gbc_lblFactNote.gridx = 0;
		gbc_lblFactNote.gridy = 10;
		infoFactureJPanel.add(lblFactNote, gbc_lblFactNote);
		
		textFieldFactNote2 = new JTextField();
		textFieldFactNote2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactNote2.setEditable(false);
		GridBagConstraints gbc_textFieldFactNote2 = new GridBagConstraints();
		gbc_textFieldFactNote2.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactNote2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactNote2.gridx = 1;
		gbc_textFieldFactNote2.gridy = 10;
		infoFactureJPanel.add(textFieldFactNote2, gbc_textFieldFactNote2);
		textFieldFactNote2.setColumns(10);
	
		btnValiderFact = new JButton("Rechercher la facture");
		btnValiderFact.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				lblVeuillezIndiquerLidFact.setVisible(true);
				textFieldIdFact.setVisible(true);
				lblFactMontant.setVisible(true);
				textFieldFactMontant.setVisible(true);
				lblFactLocaID.setVisible(true);
				textFieldFactLocaID.setVisible(true);
				lblFactTechID.setVisible(true);
				textFieldFactTechID.setVisible(true);
				lblFactClientID.setVisible(true);
				textFieldFactClientID.setVisible(true);
				lblFactEstPaye.setVisible(true);
				textFieldFactEstPaye.setVisible(true);
				lblFactNote.setVisible(true);
				textFieldFactNote.setVisible(true);
				textAreaInfoFact.setVisible(false);
				if (!isInteger(textFieldVeuillezIndiquerLidFact.getText())) {
					textFieldFactMessage2.setText("Entrez un numéro de facture correcte");
					textFieldIdFact.setText("");
					textFieldFactLocaID.setText("");
					textFieldFactMontant.setText("");
					textFieldFactTechID.setText("");
					textFieldFactClientID.setText("");
					textFieldFactNote2.setText("");
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
						textFieldFactClientID.setText(model.getLocation(tempFacture.getLocationID()).getClientID()+"");
						textFieldFactNote2.setText(tempFacture.getNote());
						textFieldIdFact.setText(tempFacture.getFactID()+"");
					}
					else {
						textFieldFactMessage2.setText("Cette facture n'existe pas");
						textFieldFactLocaID.setText("");
						textFieldFactMontant.setText("");
						textFieldFactTechID.setText("");
						textFieldFactNote2.setText("");
						textFieldIdFact.setText("");
						textFieldFactClientID.setText("");
						textFieldFactEstPaye.setText("");
					} 
				}
			}
		});
		GridBagConstraints gbc_btnValiderFact = new GridBagConstraints();
		gbc_btnValiderFact.insets = new Insets(0, 0, 5, 5);
		gbc_btnValiderFact.anchor = GridBagConstraints.CENTER;
		gbc_btnValiderFact.gridx = 1;
		gbc_btnValiderFact.gridy = 1;
		infoFactureJPanel.add(btnValiderFact, gbc_btnValiderFact);
		

		textFieldFactMessage2 = new JTextField();
		textFieldFactMessage2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldFactMessage2.setEditable(false);
		GridBagConstraints gbc_textFieldFactMessage2 = new GridBagConstraints();
		gbc_textFieldFactMessage2.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFactMessage2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactMessage2.gridx = 1;
		gbc_textFieldFactMessage2.gridy = 10;
		infoFactureJPanel.add(textFieldFactMessage2, gbc_textFieldFactMessage2);
		textFieldFactMessage2.setColumns(10);
		
		// info client
		 
		infoClientJPanel =new JPanel();
		GridBagLayout gbl_infoClient = new GridBagLayout();
		gbl_infoClient.columnWidths = new int[]{0, 0, 0};
		gbl_infoClient.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_infoClient.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_infoClient.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		infoClientJPanel.setLayout(gbl_infoClient);
		
		JLabel lblInfosDeLa = new JLabel("Prenom :");
		GridBagConstraints gbc_lblInfosDeLa = new GridBagConstraints();
		gbc_lblInfosDeLa.anchor = GridBagConstraints.EAST;
		gbc_lblInfosDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosDeLa.gridx = 0;
		gbc_lblInfosDeLa.gridy = 3;
		infoClientJPanel.add(lblInfosDeLa, gbc_lblInfosDeLa);
		
		textFieldPrenomC = new JTextField();
		textFieldPrenomC.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldPrenomC = new GridBagConstraints();
		gbc_textFieldPrenomC.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldPrenomC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPrenomC.gridx = 1;
		gbc_textFieldPrenomC.gridy = 3;
		infoClientJPanel.add(textFieldPrenomC, gbc_textFieldPrenomC);
		textFieldPrenomC.setColumns(10);
		
		JLabel lblInfosSurLe = new JLabel("Nom :");
		GridBagConstraints gbc_lblInfosSurLe = new GridBagConstraints();
		gbc_lblInfosSurLe.anchor = GridBagConstraints.EAST;
		gbc_lblInfosSurLe.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosSurLe.gridx = 0;
		gbc_lblInfosSurLe.gridy = 4;
		infoClientJPanel.add(lblInfosSurLe, gbc_lblInfosSurLe);
		
		textFieldNomC = new JTextField();
		textFieldNomC.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldNomC = new GridBagConstraints();
		gbc_textFieldNomC.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNomC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNomC.gridx = 1;
		gbc_textFieldNomC.gridy = 4;
		infoClientJPanel.add(textFieldNomC, gbc_textFieldNomC);
		textFieldNomC.setColumns(10);
		
		JLabel lblInfosSurLa = new JLabel("ID :");
		GridBagConstraints gbc_lblInfosSurLa = new GridBagConstraints();
		gbc_lblInfosSurLa.anchor = GridBagConstraints.EAST;
		gbc_lblInfosSurLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosSurLa.gridx = 0;
		gbc_lblInfosSurLa.gridy = 2;
		infoClientJPanel.add(lblInfosSurLa, gbc_lblInfosSurLa);
		
		textFieldID = new JTextField();
		textFieldID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldID = new GridBagConstraints();
		gbc_textFieldID.anchor = GridBagConstraints.WEST;
		gbc_textFieldID.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldID.gridx = 1;
		gbc_textFieldID.gridy = 2;
		infoClientJPanel.add(textFieldID, gbc_textFieldID);
		textFieldID.setColumns(10);
		
		validerClientId = new JButton("Rechercher");
		validerClientId.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				if(isInteger(textFieldID.getText())) {
					Client tempClient = model.getClient(Integer.parseInt(textFieldID.getText()));
					if(tempClient != null) {
						textFieldPrenomC.setText(tempClient.getPrenom());
						textFieldNomC.setText(tempClient.getNom());
						textFieldNaissance.setText(tempClient.getDateNaissance());
						textFieldMailC.setText(tempClient.getAdresseMail());
						textFieldPseudo.setText(tempClient.getPseudo());
						textFieldAdresseC.setText(tempClient.getAdresse()); 
					}
					else {
						textFieldPrenomC.setText("Ce client n'existe pas");
						textFieldNomC.setText("");
						textFieldNaissance.setText("");
						textFieldMailC.setText("");
						textFieldPseudo.setText("");
						textFieldAdresseC.setText(""); 
					}
				}
				else {
					textFieldPrenomC.setText("Entrez un numero de client correcte"); 
					textFieldNomC.setText("");
					textFieldNaissance.setText("");
					textFieldMailC.setText("");
					textFieldPseudo.setText(""); 
					textFieldAdresseC.setText(""); 
				}
			}
		}); 
		GridBagConstraints gbc_validerClientId = new GridBagConstraints();
		gbc_validerClientId.anchor = GridBagConstraints.CENTER;
		gbc_validerClientId.insets = new Insets(0, 0, 5, 0);
		gbc_validerClientId.gridx = 1;
		gbc_validerClientId.gridy = 2;
		infoClientJPanel.add(validerClientId, gbc_validerClientId);
		
		JLabel lblDateDeNaissance = new JLabel("Date naissance : "); 
		GridBagConstraints gbc_lblDateDeNaissance = new GridBagConstraints();
		gbc_lblDateDeNaissance.anchor = GridBagConstraints.EAST;
		gbc_lblDateDeNaissance.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateDeNaissance.gridx = 0;
		gbc_lblDateDeNaissance.gridy = 5;
		infoClientJPanel.add(lblDateDeNaissance, gbc_lblDateDeNaissance);
		
		textFieldNaissance = new JTextField();
		textFieldNaissance.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldNaissance = new GridBagConstraints();
		gbc_textFieldNaissance.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNaissance.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNaissance.gridx = 1;
		gbc_textFieldNaissance.gridy = 5;
		infoClientJPanel.add(textFieldNaissance, gbc_textFieldNaissance);
		textFieldNaissance.setColumns(10);
		
		JLabel lblAdresseMail = new JLabel("Adresse mail :");
		GridBagConstraints gbc_lblAdresseMail = new GridBagConstraints();
		gbc_lblAdresseMail.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresseMail.gridx = 0;
		gbc_lblAdresseMail.gridy = 6;
		infoClientJPanel.add(lblAdresseMail, gbc_lblAdresseMail);
		
		textFieldMailC = new JTextField();
		textFieldMailC.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldMailC = new GridBagConstraints();
		gbc_textFieldMailC.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMailC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMailC.gridx = 1;
		gbc_textFieldMailC.gridy = 6;
		infoClientJPanel.add(textFieldMailC, gbc_textFieldMailC);
		textFieldMailC.setColumns(10);
		
		JLabel lblPseudo = new JLabel("Pseudo :");
		GridBagConstraints gbc_lblPseudo = new GridBagConstraints();
		gbc_lblPseudo.anchor = GridBagConstraints.EAST;
		gbc_lblPseudo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPseudo.gridx = 0;
		gbc_lblPseudo.gridy = 7;
		infoClientJPanel.add(lblPseudo, gbc_lblPseudo);
		
		textFieldPseudo = new JTextField();
		textFieldPseudo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldPseudo = new GridBagConstraints();
		gbc_textFieldPseudo.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldPseudo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPseudo.gridx = 1;
		gbc_textFieldPseudo.gridy = 7;
		infoClientJPanel.add(textFieldPseudo, gbc_textFieldPseudo);
		textFieldPseudo.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		GridBagConstraints gbc_lblAdresse = new GridBagConstraints();
		gbc_lblAdresse.anchor = GridBagConstraints.EAST;
		gbc_lblAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse.gridx = 0;
		gbc_lblAdresse.gridy = 8;
		infoClientJPanel.add(lblAdresse, gbc_lblAdresse);
		
		textFieldAdresseC = new JTextField();
		textFieldAdresseC.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		GridBagConstraints gbc_textFieldAdresseC = new GridBagConstraints();
		gbc_textFieldAdresseC.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldAdresseC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAdresseC.gridx = 1;
		gbc_textFieldAdresseC.gridy = 8;
		infoClientJPanel.add(textFieldAdresseC, gbc_textFieldAdresseC);
		textFieldAdresseC.setColumns(10);

		
		
		textFieldPrenomC.setEditable(false);
		textFieldNomC.setEditable(false);
		textFieldNaissance.setEditable(false);
		textFieldMailC.setEditable(false);
		textFieldPseudo.setEditable(false);
		textFieldAdresseC.setEditable(false);
		
		// check acc
		checkAccJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_checkAccJPanel = new GridBagLayout();
		gbl_checkAccJPanel.columnWidths = new int[]{0, 500, 380, 0};
		gbl_checkAccJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_checkAccJPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_checkAccJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		checkAccJPanel.setLayout(gbl_checkAccJPanel);
		
		lblNDeLocationCheckAcc = new JLabel("N\u00B0 de location :");
		GridBagConstraints gbc_lblNDeLocationCheckAcc = new GridBagConstraints();
		gbc_lblNDeLocationCheckAcc.anchor = GridBagConstraints.WEST;
		gbc_lblNDeLocationCheckAcc.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeLocationCheckAcc.gridx = 0;
		gbc_lblNDeLocationCheckAcc.gridy = 0;
		checkAccJPanel.add(lblNDeLocationCheckAcc, gbc_lblNDeLocationCheckAcc);
		
		textFieldCheckNumLoca = new JTextField();
		GridBagConstraints gbc_textFieldCheckNumLoca = new GridBagConstraints();
		gbc_textFieldCheckNumLoca.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCheckNumLoca.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCheckNumLoca.gridx = 1;
		gbc_textFieldCheckNumLoca.gridy = 0;
		checkAccJPanel.add(textFieldCheckNumLoca, gbc_textFieldCheckNumLoca);
		textFieldCheckNumLoca.setColumns(10);
		
		btnValiderAcc = new JButton("Valider");
		GridBagConstraints gbc_btnValider1 = new GridBagConstraints();
		gbc_btnValider1.insets = new Insets(0, 0, 5, 0);
		gbc_btnValider1.gridx = 1;
		gbc_btnValider1.gridy = 1;
		checkAccJPanel.add(btnValiderAcc, gbc_btnValider1);
		
		btnValiderAcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//à faire
				lblStatutAcc.setVisible(true);
				textFieldStatutAcc.setVisible(true);
				lblStatutAccActuel.setVisible(true);
				textFieldStatutAccActuel.setVisible(true);
				btnSoumettreAccStatut.setVisible(true);
				if(isInteger(textFieldCheckNumLoca.getText())) {
					Location tempLocation= model.getLocation(Integer.parseInt(textFieldCheckNumLoca.getText()));
					if(tempLocation!= null) {
						textFieldStatutAcc.setText(tempLocation.isAccomptePaye()+"");
					}
					else {
						textFieldErreurStatut.setText("Vous avez introduit un id n'existant pas");
					}
				}
				else {
					textFieldErreurStatut.setText("Vous avez introduit un mauvais format d'id ");
				}
				
			}
		});
		
		lblStatutAcc = new JLabel("Ancien statut de l'accompte :");
		GridBagConstraints gbc_lblStatutAcc = new GridBagConstraints();
		gbc_lblStatutAcc.anchor = GridBagConstraints.NORTH;
		gbc_lblStatutAcc.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatutAcc.gridx = 0;
		gbc_lblStatutAcc.gridy = 2;
		checkAccJPanel.add(lblStatutAcc, gbc_lblStatutAcc);
		
		textFieldStatutAcc = new JTextField();
		textFieldStatutAcc.setEditable(false);
		GridBagConstraints gbc_textFieldStatutAcc = new GridBagConstraints();
		gbc_textFieldStatutAcc.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldStatutAcc.fill = GridBagConstraints.BOTH;
		gbc_textFieldStatutAcc.gridx = 1;
		gbc_textFieldStatutAcc.gridy = 2;
		checkAccJPanel.add(textFieldStatutAcc, gbc_textFieldStatutAcc);
		
		lblStatutAccActuel = new JLabel("Est payé :");
		GridBagConstraints gbc_lblStatutAccActuel = new GridBagConstraints();
		gbc_lblStatutAccActuel.anchor = GridBagConstraints.EAST;
		gbc_lblStatutAccActuel.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatutAccActuel.gridx = 0;
		gbc_lblStatutAccActuel.gridy = 3;
		checkAccJPanel.add(lblStatutAccActuel, gbc_lblStatutAccActuel);
		
		textFieldStatutAccActuel = new JTextField();
		GridBagConstraints gbc_textFieldStatutAccActuel = new GridBagConstraints();
		gbc_textFieldStatutAccActuel.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldStatutAccActuel.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStatutAccActuel.gridx = 1;
		gbc_textFieldStatutAccActuel.gridy = 3;
		checkAccJPanel.add(textFieldStatutAccActuel, gbc_textFieldStatutAccActuel);
		textFieldStatutAccActuel.setColumns(10);
		
		btnSoumettreAccStatut = new JButton("Soumettre statut accompte");
		GridBagConstraints gbc_btnAccStatut = new GridBagConstraints();
		gbc_btnAccStatut.insets = new Insets(0, 0, 5, 0);
		gbc_btnAccStatut.gridx = 1;
		gbc_btnAccStatut.gridy = 5;
		checkAccJPanel.add(btnSoumettreAccStatut, gbc_btnAccStatut);
		
		textFieldErreurStatut = new JTextField();
		textFieldErreurStatut.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldErreurStatut.setEditable(false);
		GridBagConstraints gbc_textFieldErreurStatut = new GridBagConstraints();
		gbc_textFieldErreurStatut.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldErreurStatut.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldErreurStatut.gridx = 1;
		gbc_textFieldErreurStatut.gridy = 6;
		checkAccJPanel.add(textFieldErreurStatut, gbc_textFieldErreurStatut);
		textFieldErreurStatut.setColumns(10);
		
		lblStatutAcc.setVisible(false);
		textFieldStatutAcc.setVisible(false);
		lblStatutAccActuel.setVisible(false);
		textFieldStatutAccActuel.setVisible(false);
		btnSoumettreAccStatut.setVisible(false);
		
		btnSoumettreAccStatut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempStatut=textFieldStatutAccActuel.getText().toString();
				System.out.println(tempStatut);
				if(tempStatut.equals("oui")) {
				model.setAccompteStatut(Integer.parseInt(textFieldCheckNumLoca.getText()), true);
				
				}
				else if(tempStatut.equals("non")) {
					model.setAccompteStatut(Integer.parseInt(textFieldCheckNumLoca.getText()), false);
				}
				else {
					textFieldErreurStatut.setText("réponse uniquement par oui ou non");
				}
			}
		});
		
		//check up
		
		checkUpJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_checkUpJPanel = new GridBagLayout();
		gbl_checkUpJPanel.columnWidths = new int[]{0, 500, 380, 0};
		gbl_checkUpJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_checkUpJPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_checkUpJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		checkUpJPanel.setLayout(gbl_checkUpJPanel);
		
		lblNDeVoitureCheckUp = new JLabel("N\u00B0 de voiture :");
		GridBagConstraints gbc_lblNDeVoitureCheckUp = new GridBagConstraints();
		gbc_lblNDeVoitureCheckUp.anchor = GridBagConstraints.WEST;
		gbc_lblNDeVoitureCheckUp.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeVoitureCheckUp.gridx = 0;
		gbc_lblNDeVoitureCheckUp.gridy = 0;
		checkUpJPanel.add(lblNDeVoitureCheckUp, gbc_lblNDeVoitureCheckUp);
		
		textFieldCheckNumVoit = new JTextField();
		GridBagConstraints gbc_textFieldCheckNumVoit = new GridBagConstraints();
		gbc_textFieldCheckNumVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCheckNumVoit.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCheckNumVoit.gridx = 1;
		gbc_textFieldCheckNumVoit.gridy = 0;
		checkUpJPanel.add(textFieldCheckNumVoit, gbc_textFieldCheckNumVoit);
		textFieldCheckNumVoit.setColumns(10);
		
		btnValider2 = new JButton("Valider");
		GridBagConstraints gbc_btnValider11 = new GridBagConstraints();
		gbc_btnValider11.insets = new Insets(0, 0, 5, 0);
		gbc_btnValider11.gridx = 1;
		gbc_btnValider11.gridy = 1;
		checkUpJPanel.add(btnValider2, gbc_btnValider11);
		
		btnValider2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//à faire
				lblAncienKilometrage.setVisible(true);
				textFieldAncienKm.setVisible(true);
				lblKilometrageActuel.setVisible(true);
				textFieldCheckKmActu.setVisible(true);
				btnSoumettreKilometrage.setVisible(true);
				if(isInteger(textFieldCheckNumVoit.getText())) {
					Voiture tempVoiture= model.getVoiture(Integer.parseInt(textFieldCheckNumVoit.getText()));
					if(tempVoiture!= null) {
						textFieldAncienKm.setText(tempVoiture.getKilometrage()+"");
					}
					else {
						textFieldAncienKm.setText("Vous avez introduit un id n'existant pas");
					}
				}
				else {
					textFieldAncienKm.setText("Vous avez introduit un mauvais format d'id ");
				}
				
			}
		});
		
		lblAncienKilometrage = new JLabel("Ancien kilometrage :");
		GridBagConstraints gbc_lblAncienKilometrage = new GridBagConstraints();
		gbc_lblAncienKilometrage.anchor = GridBagConstraints.NORTH;
		gbc_lblAncienKilometrage.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncienKilometrage.gridx = 0;
		gbc_lblAncienKilometrage.gridy = 2;
		checkUpJPanel.add(lblAncienKilometrage, gbc_lblAncienKilometrage);
		
		textFieldAncienKm = new JTextField();
		GridBagConstraints gbc_textFieldAncienKm = new GridBagConstraints();
		gbc_textFieldAncienKm.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldAncienKm.fill = GridBagConstraints.BOTH;
		gbc_textFieldAncienKm.gridx = 1;
		gbc_textFieldAncienKm.gridy = 2;
		checkUpJPanel.add(textFieldAncienKm, gbc_textFieldAncienKm);
		
		lblKilometrageActuel = new JLabel("Kilometrage actuel :");
		GridBagConstraints gbc_lblKilometrageActuel = new GridBagConstraints();
		gbc_lblKilometrageActuel.anchor = GridBagConstraints.EAST;
		gbc_lblKilometrageActuel.insets = new Insets(0, 0, 5, 5);
		gbc_lblKilometrageActuel.gridx = 0;
		gbc_lblKilometrageActuel.gridy = 3;
		checkUpJPanel.add(lblKilometrageActuel, gbc_lblKilometrageActuel);
		
		textFieldCheckKmActu = new JTextField();
		GridBagConstraints gbc_textFieldCheckKmActu = new GridBagConstraints();
		gbc_textFieldCheckKmActu.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCheckKmActu.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCheckKmActu.gridx = 1;
		gbc_textFieldCheckKmActu.gridy = 3;
		checkUpJPanel.add(textFieldCheckKmActu, gbc_textFieldCheckKmActu);
		textFieldCheckKmActu.setColumns(10);
		
		btnSoumettreKilometrage = new JButton("Soumettre kilometrage");
		GridBagConstraints gbc_btnSoumettreKilometrage = new GridBagConstraints();
		gbc_btnSoumettreKilometrage.insets = new Insets(0, 0, 5, 0);
		gbc_btnSoumettreKilometrage.gridx = 1;
		gbc_btnSoumettreKilometrage.gridy = 5;
		checkUpJPanel.add(btnSoumettreKilometrage, gbc_btnSoumettreKilometrage);
		
		btnSoumettreKilometrage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isInteger(textFieldCheckNumVoit.getText())) {
					if(isDouble(textFieldCheckNumVoit.getText())){
						if (Integer.parseInt(textFieldAncienKm.getText()) > 700000) {
							textFieldAncienKm.setText("Le kilometrage est trop eleve");
						}
						else {
							model.setKilometrage(Integer.parseInt(textFieldCheckNumVoit.getText()), Long.parseLong(textFieldCheckKmActu.getText()));
						}
					}
					else textFieldAncienKm.setText("Vous avez introduit un mauvais kilometrage");
				}
				else {
					textFieldAncienKm.setText("Vous avez introduit un mauvais format d'id ");
				}
			}
		});
		
		
		checkUpJPanel.setVisible(false);
		lblAncienKilometrage.setVisible(false);
		textFieldAncienKm.setVisible(false);
		lblKilometrageActuel.setVisible(false);
		textFieldCheckKmActu.setVisible(false);
		btnSoumettreKilometrage.setVisible(false);

		
		//rendre non éditable tout les JTextField
		textFieldMonId.setEditable(false);
		textFieldMonPseudo.setEditable(false);
		textFieldMonMdp.setEditable(false);
		textFieldMonNom.setEditable(false);
		textFieldMonPrenom.setEditable(false);
		textFieldFactMessage.setEditable(false);
		textFieldFactMessage2.setEditable(false);
		textFieldNumLoca.setEditable(false);
		textFieldLocaNumClient2.setEditable(false);
		textFieldAssurance.setEditable(false);
		textFieldAssurance2.setEditable(false);
		textFieldNVoit.setEditable(false);
		textFieldMontantAcc.setEditable(false);
		textFieldEtatAcc.setEditable(false);
		textFieldKilometrage.setEditable(false);
		textFieldEtatLocation.setEditable(false);
		textAreaLocaNumClient.setEditable(false);
		
		textFieldAncienKm.setEditable(false);

		technicienJFrame.setVisible(true);
		technicienJFrame.setContentPane(infoJPanel);
	}
	public boolean isInteger(String string) {
	    try {
	        Integer.valueOf(string);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	public boolean isDouble(String string) {
	    try {
	        Double.valueOf(string);
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
