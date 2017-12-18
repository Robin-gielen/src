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

	private static final long serialVersionUID = 1L;
	private JPanel infoJPanel;
	private JPanel factureJPanel;
	private JPanel locationJPanel;
	private JPanel voitureJPanel;
	private JPanel checkUpJPanel;
	private JPanel infoFactureJPanel;
	
	private JTextField textFieldFactureNumLoca;
	private JTextField textFieldFactEtatDePayement;
	private JTextField textFieldFactNote;
	private JTextField textFieldLocaNumLoca;
	private JTextField textFieldLocaNumVoit;
	private JTextField textFieldCheckNumVoit;
	private JTextField textFieldCheckKmActu;
	private JTextField textFieldCheckNouvNote;
	private JTextField textFieldFactNumFact;
	private JTextField textFieldFactNumClient;
	private JTextField textFieldLocaNumClient;
	
	
	private JLabel lblMesInfos;
	/*private JLabel lblListeVoiture;
	private JLabel lblInfoListeClient;
	private JLabel lblInfoListeLoca;
	private JLabel lblInfoListeFact;*/
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
	private JLabel lblNDeClient;
	
	private JTextPane textPaneLocation;
	private JTextPane textPaneVoit;
	private JTextPane textPaneInfo;
	/*private JTextPane textPaneListeVoit;
	private JTextPane textPaneListeClient;
	private JTextPane textPaneListeLoca;
	private JTextPane textPaneListeFact;*/
	private JTextPane textPaneAncienKm;
	private JTextPane textPaneNote;
	
	private JButton btnInfo;
	private JButton btnNouvelleFacture;
	private JButton btnInfoLocation;
	private JButton btnInfoVoiture;
	private JButton btnCheckUp;
	private JButton btnRechercher;
	private JButton btnRechercherVoit;
	private JButton btnValider;
	private JButton btnSoumettreKilometrage;
	private JButton btnSoumettreNote;
	private JButton btnInfoFacture;
	private JButton btnRechercherNumClient;

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
		checkUpJPanel = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		btnInfo = new JButton("INFO");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(true);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				checkUpJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
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
				checkUpJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
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
				checkUpJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
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
				checkUpJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
				getContentPane().add(voitureJPanel);
				
			}
		});
		menuBar.add(btnInfoVoiture);
		
		btnCheckUp = new JButton("CheckUp");
		btnCheckUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkUpJPanel.setVisible(true);
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
				getContentPane().add(checkUpJPanel);
			}
		});
		menuBar.add(btnCheckUp);
		
		btnInfoFacture = new JButton("Info Facture");
		btnInfoFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFactureJPanel.setVisible(true);
				checkUpJPanel.setVisible(false);
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				getContentPane().add(infoFactureJPanel);
			}
		});
		menuBar.add(btnInfoFacture);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
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
		gbc_lblMesInfos.gridy = 1;
		infoJPanel.add(lblMesInfos, gbc_lblMesInfos);
		
		textPaneInfo = new JTextPane();
		GridBagConstraints gbc_textPaneInfo = new GridBagConstraints();
		gbc_textPaneInfo.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneInfo.fill = GridBagConstraints.BOTH;
		gbc_textPaneInfo.gridx = 1;
		gbc_textPaneInfo.gridy = 1;
		infoJPanel.add(textPaneInfo, gbc_textPaneInfo);
		
		/*lblListeVoiture = new JLabel("Liste voitures :");
		lblListeVoiture.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblListeVoiture = new GridBagConstraints();
		gbc_lblListeVoiture.anchor = GridBagConstraints.EAST;
		gbc_lblListeVoiture.insets = new Insets(0, 0, 5, 5);
		gbc_lblListeVoiture.gridx = 0;
		gbc_lblListeVoiture.gridy = 2;
		infoJPanel.add(lblListeVoiture, gbc_lblListeVoiture);
		
		textPaneListeVoit = new JTextPane();
		GridBagConstraints gbc_textPaneListeVoit = new GridBagConstraints();
		gbc_textPaneListeVoit.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneListeVoit.fill = GridBagConstraints.BOTH;
		gbc_textPaneListeVoit.gridx = 1;
		gbc_textPaneListeVoit.gridy = 2;
		infoJPanel.add(textPaneListeVoit, gbc_textPaneListeVoit);
		
		lblInfoListeClient = new JLabel("Liste clients :");
		lblInfoListeClient.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblInfoListeClient = new GridBagConstraints();
		gbc_lblInfoListeClient.anchor = GridBagConstraints.EAST;
		gbc_lblInfoListeClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfoListeClient.gridx = 0;
		gbc_lblInfoListeClient.gridy = 4;
		infoJPanel.add(lblInfoListeClient, gbc_lblInfoListeClient);
		
		textPaneListeClient = new JTextPane();
		GridBagConstraints gbc_textPaneListeClient = new GridBagConstraints();
		gbc_textPaneListeClient.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneListeClient.fill = GridBagConstraints.BOTH;
		gbc_textPaneListeClient.gridx = 1;
		gbc_textPaneListeClient.gridy = 4;
		infoJPanel.add(textPaneListeClient, gbc_textPaneListeClient);
		
		lblInfoListeLoca = new JLabel("Liste locations :");
		lblInfoListeClient.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblInfoListeLoca = new GridBagConstraints();
		gbc_lblInfoListeLoca.anchor = GridBagConstraints.EAST;
		gbc_lblInfoListeLoca.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfoListeLoca.gridx = 0;
		gbc_lblInfoListeLoca.gridy = 6;
		infoJPanel.add(lblInfoListeLoca, gbc_lblInfoListeLoca);
		
		textPaneListeLoca = new JTextPane();
		GridBagConstraints gbc_textPaneListeLoca = new GridBagConstraints();
		gbc_textPaneListeLoca.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneListeLoca.fill = GridBagConstraints.BOTH;
		gbc_textPaneListeLoca.gridx = 1;
		gbc_textPaneListeLoca.gridy = 6;
		infoJPanel.add(textPaneListeLoca, gbc_textPaneListeLoca);
		
		lblInfoListeFact = new JLabel("Liste factures :");
		lblInfoListeFact.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblInfoListeFact = new GridBagConstraints();
		gbc_lblInfoListeFact.anchor = GridBagConstraints.EAST;
		gbc_lblInfoListeFact.insets = new Insets(0, 0, 0, 5);
		gbc_lblInfoListeFact.gridx = 0;
		gbc_lblInfoListeFact.gridy = 8;
		infoJPanel.add(lblInfoListeFact, gbc_lblInfoListeFact);
		
		textPaneListeFact = new JTextPane();
		GridBagConstraints gbc_textPaneListeFact = new GridBagConstraints();
		gbc_textPaneListeFact.fill = GridBagConstraints.BOTH;
		gbc_textPaneListeFact.gridx = 1;
		gbc_textPaneListeFact.gridy = 8;
		infoJPanel.add(textPaneListeFact, gbc_textPaneListeFact);*/
		infoJPanel.setVisible(true);
		
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
		
		btnRechercherNumClient = new JButton("Rechercher location àpd du n° de client");
		GridBagConstraints gbc_btnRechercherNumClient = new GridBagConstraints();
		gbc_btnRechercherNumClient.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherNumClient.gridx = 1;
		gbc_btnRechercherNumClient.gridy = 3;
		locationJPanel.add(btnRechercherNumClient, gbc_btnRechercherNumClient);
		
		textPaneLocation = new JTextPane();
		GridBagConstraints gbc_textPaneLocation = new GridBagConstraints();
		gbc_textPaneLocation.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneLocation.fill = GridBagConstraints.BOTH;
		gbc_textPaneLocation.gridx = 1;
		gbc_textPaneLocation.gridy = 4;
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
		checkUpJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_checkUpJPanel = new GridBagLayout();
		gbl_checkUpJPanel.columnWidths = new int[]{97, 322, 0};
		gbl_checkUpJPanel.rowHeights = new int[]{20, 23, 14, 0, 0, 0, 0, 0, 0, 0};
		gbl_checkUpJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_checkUpJPanel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider1 = new GridBagConstraints();
		gbc_btnValider1.insets = new Insets(0, 0, 5, 0);
		gbc_btnValider1.gridx = 1;
		gbc_btnValider1.gridy = 1;
		checkUpJPanel.add(btnValider, gbc_btnValider1);
		
		lblAncienKilometrage = new JLabel("Ancien kilometrage :");
		GridBagConstraints gbc_lblAncienKilometrage = new GridBagConstraints();
		gbc_lblAncienKilometrage.anchor = GridBagConstraints.NORTH;
		gbc_lblAncienKilometrage.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncienKilometrage.gridx = 0;
		gbc_lblAncienKilometrage.gridy = 2;
		checkUpJPanel.add(lblAncienKilometrage, gbc_lblAncienKilometrage);
		
		textPaneAncienKm = new JTextPane();
		GridBagConstraints gbc_textPaneAncienKm = new GridBagConstraints();
		gbc_textPaneAncienKm.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneAncienKm.fill = GridBagConstraints.BOTH;
		gbc_textPaneAncienKm.gridx = 1;
		gbc_textPaneAncienKm.gridy = 2;
		checkUpJPanel.add(textPaneAncienKm, gbc_textPaneAncienKm);
		
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
		
		lblAncienneNote = new JLabel("Ancienne note :");
		GridBagConstraints gbc_lblAncienneNote = new GridBagConstraints();
		gbc_lblAncienneNote.anchor = GridBagConstraints.WEST;
		gbc_lblAncienneNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncienneNote.gridx = 0;
		gbc_lblAncienneNote.gridy = 6;
		checkUpJPanel.add(lblAncienneNote, gbc_lblAncienneNote);
		
		textPaneNote = new JTextPane();
		GridBagConstraints gbc_textPaneNote = new GridBagConstraints();
		gbc_textPaneNote.insets = new Insets(0, 0, 5, 0);
		gbc_textPaneNote.fill = GridBagConstraints.BOTH;
		gbc_textPaneNote.gridx = 1;
		gbc_textPaneNote.gridy = 6;
		checkUpJPanel.add(textPaneNote, gbc_textPaneNote);
		
		lblNouvelleNote = new JLabel("Nouvelle note :");
		GridBagConstraints gbc_lblNouvelleNote = new GridBagConstraints();
		gbc_lblNouvelleNote.anchor = GridBagConstraints.WEST;
		gbc_lblNouvelleNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblNouvelleNote.gridx = 0;
		gbc_lblNouvelleNote.gridy = 7;
		checkUpJPanel.add(lblNouvelleNote, gbc_lblNouvelleNote);
		
		textFieldCheckNouvNote = new JTextField();
		GridBagConstraints gbc_textFieldCheckNouvNote = new GridBagConstraints();
		gbc_textFieldCheckNouvNote.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCheckNouvNote.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCheckNouvNote.gridx = 1;
		gbc_textFieldCheckNouvNote.gridy = 7;
		checkUpJPanel.add(textFieldCheckNouvNote, gbc_textFieldCheckNouvNote);
		textFieldCheckNouvNote.setColumns(10);
		
		btnSoumettreNote = new JButton("Soumettre note");
		GridBagConstraints gbc_btnSoumettreNote = new GridBagConstraints();
		gbc_btnSoumettreNote.gridx = 1;
		gbc_btnSoumettreNote.gridy = 8;
		checkUpJPanel.add(btnSoumettreNote, gbc_btnSoumettreNote);
		
		checkUpJPanel.setVisible(false);
		
		//info Facture
		
		infoFactureJPanel = new JPanel();
		infoFactureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_infoFactureJPanel = new GridBagLayout();
		gbl_infoFactureJPanel.columnWidths = new int[]{0, 0, 0};
		gbl_infoFactureJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_infoFactureJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_infoFactureJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		infoFactureJPanel.setLayout(gbl_infoFactureJPanel);
		
		JLabel lblNDeFacture = new JLabel("N\u00B0 de facture :");
		GridBagConstraints gbc_lblNDeFacture = new GridBagConstraints();
		gbc_lblNDeFacture.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeFacture.anchor = GridBagConstraints.EAST;
		gbc_lblNDeFacture.gridx = 0;
		gbc_lblNDeFacture.gridy = 0;
		infoFactureJPanel.add(lblNDeFacture, gbc_lblNDeFacture);
		
		textFieldFactNumFact= new JTextField();
		GridBagConstraints gbc_textFieldFactNumFact= new GridBagConstraints();
		gbc_textFieldFactNumFact.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldFactNumFact.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactNumFact.gridx = 1;
		gbc_textFieldFactNumFact.gridy = 0;
		infoFactureJPanel.add(textFieldFactNumFact, gbc_textFieldFactNumFact);
		textFieldFactNumFact.setColumns(10);
		
		JButton btnRechercherFacture = new JButton("Rechercher facture");
		GridBagConstraints gbc_btnRechercherFacture = new GridBagConstraints();
		gbc_btnRechercherFacture.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherFacture.gridx = 1;
		gbc_btnRechercherFacture.gridy = 1;
		infoFactureJPanel.add(btnRechercherFacture, gbc_btnRechercherFacture);
		
		JLabel lblNDeClient = new JLabel("N\u00B0 de client :");
		GridBagConstraints gbc_lblNDeFactClient = new GridBagConstraints();
		gbc_lblNDeFactClient.anchor = GridBagConstraints.EAST;
		gbc_lblNDeFactClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeFactClient.gridx = 0;
		gbc_lblNDeFactClient.gridy = 2;
		infoFactureJPanel.add(lblNDeClient, gbc_lblNDeFactClient);
		
		textFieldFactNumClient = new JTextField();
		GridBagConstraints gbc_textFieldFactNumClient = new GridBagConstraints();
		gbc_textFieldFactNumClient.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldFactNumClient.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFactNumClient.gridx = 1;
		gbc_textFieldFactNumClient.gridy = 2;
		infoFactureJPanel.add(textFieldFactNumClient, gbc_textFieldFactNumClient);
		textFieldFactNumClient.setColumns(10);
		
		JButton btnRechercherFacturepd = new JButton("Rechercher facture \u00E0pd du n\u00B0 de client");
		GridBagConstraints gbc_btnRechercherFacturepd = new GridBagConstraints();
		gbc_btnRechercherFacturepd.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherFacturepd.gridx = 1;
		gbc_btnRechercherFacturepd.gridy = 3;
		infoFactureJPanel.add(btnRechercherFacturepd, gbc_btnRechercherFacturepd);
		
		JTextPane textPaneInfoFact = new JTextPane();
		GridBagConstraints gbc_textPaneInfoFact = new GridBagConstraints();
		gbc_textPaneInfoFact.fill = GridBagConstraints.BOTH;
		gbc_textPaneInfoFact.gridx = 1;
		gbc_textPaneInfoFact.gridy = 5;
		infoFactureJPanel.add(textPaneInfoFact, gbc_textPaneInfoFact);
		infoFactureJPanel.setVisible(false);
		

	}
}
