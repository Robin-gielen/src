package vue;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TechnicienVueGui extends JFrame {

	private JPanel infoJPanel;
	private JPanel factureJPanel;
	private JPanel locationJPanel;
	private JPanel voitureJPanel;
	private JPanel kilometrageJPanel;
	private JPanel clientJPanel;
	
	private JTextField textFieldFactureNumLoca;
	private JTextField textFieldFactEtatDePayement;
	private JTextField textFieldFactNote;
	private JTextField textFieldLocaNumLoca;
	private JTextField textFieldLocaNumVoit;
	private JTextField textFieldCheckNumVoit;
	private JTextField textFieldCheckKmActu;
	private JTextField textFieldCheckNouvNote;
	
	private JTextPane textPaneLocation;
	private JTextPane textPaneVoit;
	
	
	private JLabel lblMesInfos;
	private JLabel lblNDeLocation;
	private JLabel lblEtatDePayement;
	private JLabel lblNote;
	private JLabel lblNDeLocation1;
	private JLabel lblNDeVoiture;
	private JLabel lblNDeVoitureCheckUp;
	private JLabel lblAncienKilometrage;
	private JLabel lblKilometrageActuel;
	private JLabel lblAncienneNote;
	private JLabel lblNouvelleNote;
	private JLabel lblListeDesClients;
	
	
	private JTextPane textPaneInfo;
	private JTextPane textPaneAncienKm;
	private JTextPane textPaneNote;
	private JTextPane textPaneClient;
	
	private JButton btnInfo;
	private JButton btnNouvelleFacture;
	private JButton btnInfoLocation;
	private JButton btnInfoVoiture;
	private JButton btnCheckUp;
	private JButton btnListeClient;
	private JButton btnRechercher;
	private JButton btnRechercherVoit;
	private JButton btnValider;
	private JButton btnSoumettreKilometrage;
	private JButton btnSoumettreNote;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TechnicienVueGui frame = new TechnicienVueGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TechnicienVueGui() {
		infoJPanel = new JPanel();
		factureJPanel = new JPanel();
		locationJPanel = new JPanel();
		voitureJPanel = new JPanel();
		kilometrageJPanel = new JPanel();
		clientJPanel = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		btnInfo = new JButton("INFO");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(true);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				clientJPanel.setVisible(false);
				kilometrageJPanel.setVisible(false);
				getContentPane().add(infoJPanel);
				
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
				clientJPanel.setVisible(false);
				kilometrageJPanel.setVisible(false);
				getContentPane().add(factureJPanel);
				
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
				clientJPanel.setVisible(false);
				kilometrageJPanel.setVisible(false);
				getContentPane().add(locationJPanel);
				
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
				clientJPanel.setVisible(false);
				kilometrageJPanel.setVisible(false);
				getContentPane().add(voitureJPanel);
				
			}
		});
		menuBar.add(btnInfoVoiture);
		
		btnCheckUp = new JButton("CheckUp");
		btnCheckUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kilometrageJPanel.setVisible(true);
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				clientJPanel.setVisible(false);
				getContentPane().add(kilometrageJPanel);
			}
		});
		menuBar.add(btnCheckUp);
		
		btnListeClient = new JButton("Liste Clients");
		btnListeClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientJPanel.setVisible(true);
				kilometrageJPanel.setVisible(false);
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				getContentPane().add(clientJPanel);
			}
		});
		menuBar.add(btnListeClient);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		infoJPanel.setLayout(gridBagLayout);
		

		infoJPanel.setVisible(true);
		getContentPane().add(infoJPanel);
		
		//infos 
		lblMesInfos = new JLabel("Mes infos :");
		lblMesInfos.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMesInfos = new GridBagConstraints();
		gbc_lblMesInfos.anchor = GridBagConstraints.EAST;
		gbc_lblMesInfos.insets = new Insets(0, 0, 5, 5);
		gbc_lblMesInfos.gridx = 0;
		gbc_lblMesInfos.gridy = 3;
		infoJPanel.add(lblMesInfos, gbc_lblMesInfos);
		
		textPaneInfo = new JTextPane();
		GridBagConstraints gbc_textPaneInfo = new GridBagConstraints();
		gbc_textPaneInfo.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneInfo.fill = GridBagConstraints.BOTH;
		gbc_textPaneInfo.gridx = 1;
		gbc_textPaneInfo.gridy = 4;
		infoJPanel.add(textPaneInfo, gbc_textPaneInfo);
		
		//facture
		
		factureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_factureJPanel = new GridBagLayout();
		gbl_factureJPanel.columnWidths = new int[]{0, 0, 0};
		gbl_factureJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_factureJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_factureJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		textFieldFactEtatDePayement = new JTextField();
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
		
		btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.anchor = GridBagConstraints.EAST;
		gbc_btnValider.gridx = 1;
		gbc_btnValider.gridy = 7;
		factureJPanel.add(btnValider, gbc_btnValider);
		
		factureJPanel.setVisible(false);
		
		//location
		locationJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		GridBagLayout gbl_locationJPanel = new GridBagLayout();
		gbl_locationJPanel.columnWidths = new int[]{0, 0, 0};
		gbl_locationJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_locationJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_locationJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		locationJPanel.setLayout(gbl_locationJPanel);
		
		lblNDeLocation1 = new JLabel("N\u00B0 de location :");
		GridBagConstraints gbc_lblNDeLocation1 = new GridBagConstraints();
		gbc_lblNDeLocation1.anchor = GridBagConstraints.EAST;
		gbc_lblNDeLocation1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeLocation1.gridx = 0;
		gbc_lblNDeLocation1.gridy = 3;
		locationJPanel.add(lblNDeLocation1, gbc_lblNDeLocation1);
		
		textFieldLocaNumLoca = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		locationJPanel.add(textFieldLocaNumLoca, gbc_textField);
		textFieldLocaNumLoca.setColumns(10);
		
		btnRechercher = new JButton("Rechercher");
		GridBagConstraints gbc_btnRechercher = new GridBagConstraints();
		gbc_btnRechercher.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercher.gridx = 1;
		gbc_btnRechercher.gridy = 4;
		locationJPanel.add(btnRechercher, gbc_btnRechercher);
		
		textPaneLocation = new JTextPane();
		GridBagConstraints gbc_textPaneLocation = new GridBagConstraints();
		gbc_textPaneLocation.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneLocation.fill = GridBagConstraints.BOTH;
		gbc_textPaneLocation.gridx = 1;
		gbc_textPaneLocation.gridy = 5;
		locationJPanel.add(textPaneLocation, gbc_textPaneLocation);
		
		locationJPanel.setVisible(false);
		
		//voiture
		
		voitureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		GridBagLayout gbl_voitureJPanel = new GridBagLayout();
		gbl_voitureJPanel.columnWidths = new int[]{0, 0, 0};
		gbl_voitureJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_voitureJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_voitureJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		voitureJPanel.setLayout(gbl_voitureJPanel);
		
		lblNDeVoiture = new JLabel("N° de Voiture :");
		GridBagConstraints gbc_lblNDeVoiture = new GridBagConstraints();
		gbc_lblNDeVoiture.anchor = GridBagConstraints.EAST;
		gbc_lblNDeVoiture.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeVoiture.gridx = 0;
		gbc_lblNDeVoiture.gridy = 3;
		voitureJPanel.add(lblNDeVoiture, gbc_lblNDeVoiture);
		
		textFieldLocaNumVoit = new JTextField();
		GridBagConstraints gbc_textFieldLocaNumVoit = new GridBagConstraints();
		gbc_textFieldLocaNumVoit.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLocaNumVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLocaNumVoit.gridx = 1;
		gbc_textFieldLocaNumVoit.gridy = 3;
		voitureJPanel.add(textFieldLocaNumVoit, gbc_textFieldLocaNumVoit);
		textFieldLocaNumVoit.setColumns(10);
		
		
		btnRechercherVoit = new JButton("Rechercher");
		GridBagConstraints gbc_btnRechercherVoit = new GridBagConstraints();
		gbc_btnRechercherVoit.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherVoit.gridx = 1;
		gbc_btnRechercherVoit.gridy = 4;
		voitureJPanel.add(btnRechercherVoit, gbc_btnRechercherVoit);
		
		textPaneVoit = new JTextPane();
		GridBagConstraints gbc_textPaneVoit = new GridBagConstraints();
		gbc_textPaneVoit.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneVoit.fill = GridBagConstraints.BOTH;
		gbc_textPaneVoit.gridx = 1;
		gbc_textPaneVoit.gridy = 5;
		voitureJPanel.add(textPaneVoit, gbc_textPaneVoit);
		
		voitureJPanel.setVisible(false);
		
		//check up
		kilometrageJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_kilometrageJPanel = new GridBagLayout();
		gbl_kilometrageJPanel.columnWidths = new int[]{97, 322, 0};
		gbl_kilometrageJPanel.rowHeights = new int[]{20, 23, 14, 0, 0, 0, 0, 0, 0, 0};
		gbl_kilometrageJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_kilometrageJPanel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		kilometrageJPanel.setLayout(gbl_kilometrageJPanel);
		
		lblNDeVoitureCheckUp = new JLabel("N\u00B0 de voiture :");
		GridBagConstraints gbc_lblNDeVoitureCheckUp = new GridBagConstraints();
		gbc_lblNDeVoitureCheckUp.anchor = GridBagConstraints.WEST;
		gbc_lblNDeVoitureCheckUp.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeVoitureCheckUp.gridx = 0;
		gbc_lblNDeVoitureCheckUp.gridy = 0;
		kilometrageJPanel.add(lblNDeVoitureCheckUp, gbc_lblNDeVoitureCheckUp);
		
		textFieldCheckNumVoit = new JTextField();
		GridBagConstraints gbc_textFieldCheckNumVoit = new GridBagConstraints();
		gbc_textFieldCheckNumVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCheckNumVoit.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCheckNumVoit.gridx = 1;
		gbc_textFieldCheckNumVoit.gridy = 0;
		kilometrageJPanel.add(textFieldCheckNumVoit, gbc_textFieldCheckNumVoit);
		textFieldCheckNumVoit.setColumns(10);
		
		btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider1 = new GridBagConstraints();
		gbc_btnValider1.insets = new Insets(0, 0, 5, 0);
		gbc_btnValider1.gridx = 1;
		gbc_btnValider1.gridy = 1;
		kilometrageJPanel.add(btnValider, gbc_btnValider1);
		
		lblAncienKilometrage = new JLabel("Ancien kilometrage :");
		GridBagConstraints gbc_lblAncienKilometrage = new GridBagConstraints();
		gbc_lblAncienKilometrage.anchor = GridBagConstraints.NORTH;
		gbc_lblAncienKilometrage.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncienKilometrage.gridx = 0;
		gbc_lblAncienKilometrage.gridy = 2;
		kilometrageJPanel.add(lblAncienKilometrage, gbc_lblAncienKilometrage);
		
		textPaneAncienKm = new JTextPane();
		GridBagConstraints gbc_textPaneAncienKm = new GridBagConstraints();
		gbc_textPaneAncienKm.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneAncienKm.fill = GridBagConstraints.BOTH;
		gbc_textPaneAncienKm.gridx = 1;
		gbc_textPaneAncienKm.gridy = 2;
		kilometrageJPanel.add(textPaneAncienKm, gbc_textPaneAncienKm);
		
		lblKilometrageActuel = new JLabel("Kilometrage actuel :");
		GridBagConstraints gbc_lblKilometrageActuel = new GridBagConstraints();
		gbc_lblKilometrageActuel.anchor = GridBagConstraints.EAST;
		gbc_lblKilometrageActuel.insets = new Insets(0, 0, 5, 5);
		gbc_lblKilometrageActuel.gridx = 0;
		gbc_lblKilometrageActuel.gridy = 3;
		kilometrageJPanel.add(lblKilometrageActuel, gbc_lblKilometrageActuel);
		
		textFieldCheckKmActu = new JTextField();
		GridBagConstraints gbc_textFieldCheckKmActu = new GridBagConstraints();
		gbc_textFieldCheckKmActu.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCheckKmActu.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCheckKmActu.gridx = 1;
		gbc_textFieldCheckKmActu.gridy = 3;
		kilometrageJPanel.add(textFieldCheckKmActu, gbc_textFieldCheckKmActu);
		textFieldCheckKmActu.setColumns(10);
		
		btnSoumettreKilometrage = new JButton("Soumettre kilometrage");
		GridBagConstraints gbc_btnSoumettreKilometrage = new GridBagConstraints();
		gbc_btnSoumettreKilometrage.insets = new Insets(0, 0, 5, 0);
		gbc_btnSoumettreKilometrage.gridx = 1;
		gbc_btnSoumettreKilometrage.gridy = 5;
		kilometrageJPanel.add(btnSoumettreKilometrage, gbc_btnSoumettreKilometrage);
		
		lblAncienneNote = new JLabel("Ancienne note :");
		GridBagConstraints gbc_lblAncienneNote = new GridBagConstraints();
		gbc_lblAncienneNote.anchor = GridBagConstraints.WEST;
		gbc_lblAncienneNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncienneNote.gridx = 0;
		gbc_lblAncienneNote.gridy = 6;
		kilometrageJPanel.add(lblAncienneNote, gbc_lblAncienneNote);
		
		textPaneNote = new JTextPane();
		GridBagConstraints gbc_textPaneNote = new GridBagConstraints();
		gbc_textPaneNote.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneNote.fill = GridBagConstraints.BOTH;
		gbc_textPaneNote.gridx = 1;
		gbc_textPaneNote.gridy = 6;
		kilometrageJPanel.add(textPaneNote, gbc_textPaneNote);
		
		lblNouvelleNote = new JLabel("Nouvelle note :");
		GridBagConstraints gbc_lblNouvelleNote = new GridBagConstraints();
		gbc_lblNouvelleNote.anchor = GridBagConstraints.WEST;
		gbc_lblNouvelleNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblNouvelleNote.gridx = 0;
		gbc_lblNouvelleNote.gridy = 7;
		kilometrageJPanel.add(lblNouvelleNote, gbc_lblNouvelleNote);
		
		textFieldCheckNouvNote = new JTextField();
		GridBagConstraints gbc_textFieldCheckNouvNote = new GridBagConstraints();
		gbc_textFieldCheckNouvNote.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCheckNouvNote.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCheckNouvNote.gridx = 1;
		gbc_textFieldCheckNouvNote.gridy = 7;
		kilometrageJPanel.add(textFieldCheckNouvNote, gbc_textFieldCheckNouvNote);
		textFieldCheckNouvNote.setColumns(10);
		
		btnSoumettreNote = new JButton("Soumettre note");
		GridBagConstraints gbc_btnSoumettreNote = new GridBagConstraints();
		gbc_btnSoumettreNote.gridx = 1;
		gbc_btnSoumettreNote.gridy = 8;
		kilometrageJPanel.add(btnSoumettreNote, gbc_btnSoumettreNote);
		
		kilometrageJPanel.setVisible(false);
		
		//liste client
		
		clientJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_clientJPanel = new GridBagLayout();
		gbl_clientJPanel.columnWidths = new int[]{0, 0, 0};
		gbl_clientJPanel.rowHeights = new int[]{0, 0, 0};
		gbl_clientJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_clientJPanel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		clientJPanel.setLayout(gbl_clientJPanel);
		
		lblListeDesClients = new JLabel("Liste des clients :");
		GridBagConstraints gbc_lblListeDesClients = new GridBagConstraints();
		gbc_lblListeDesClients.insets = new Insets(0, 0, 5, 5);
		gbc_lblListeDesClients.gridx = 0;
		gbc_lblListeDesClients.gridy = 0;
		clientJPanel.add(lblListeDesClients, gbc_lblListeDesClients);
		
		textPaneClient = new JTextPane();
		GridBagConstraints gbc_textPaneClient = new GridBagConstraints();
		gbc_textPaneClient.fill = GridBagConstraints.BOTH;
		gbc_textPaneClient.gridx = 1;
		gbc_textPaneClient.gridy = 1;
		clientJPanel.add(textPaneClient, gbc_textPaneClient);
		clientJPanel.setVisible(false);

	}
}
