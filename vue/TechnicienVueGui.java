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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.Facture;
import model.Location;
import model.Technicien;

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
	private JTextField textFieldFactKmSupp;
	private JTextField textFieldLocaNumLoca;
	private JTextField textFieldVoitNumVoit;
	private JTextField textFieldCheckNumVoit;
	private JTextField textFieldCheckKmActu;
	private JTextField textFieldFactNumFact;
	private JTextField textFieldFactNumClient;
	private JTextField textFieldLocaNumClient;
	private JTextField textFieldLocation;
	private JTextField textFieldVoit;
	private JTextField textFieldInfo;
	private JTextField textFieldInfoFact;
	private JTextField textFieldAncienKm;
	
	
	private JLabel lblMesInfos;
	private JLabel lblNDeLocation;
	private JLabel lblEtatDePayement;
	private JLabel lblNote;
	private JLabel lblKmSupp;
	private JLabel lblNDeLocation1;
	private JLabel lblNDeVoiture;
	private JLabel lblNDeVoitureCheckUp;
	private JLabel lblAncienKilometrage;
	private JLabel lblKilometrageActuel;
	private JLabel lblNDeClient;
	private JLabel lblNDeFacture;
	
	private JButton btnInfo;
	private JButton btnNouvelleFacture;
	private JButton btnInfoLocation;
	private JButton btnInfoVoiture;
	private JButton btnCheckUp;
	private JButton btnValider;
	private JButton btnRechercher;
	private JButton btnRechercherVoit;
	private JButton btnValider2;
	private JButton btnSoumettreKilometrage;
	private JButton btnInfoFacture;
	private JButton btnRechercherNumClient;
	private JButton btnRechercherFacture;
	private JButton btnRechercherFacturepd;
	
	static Technicien model = new Technicien("Tanguybmx", "12345");
	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TechnicienVueGui frame = new TechnicienVueGui(model);
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
	public TechnicienVueGui(Technicien model) {
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
				setContentPane(infoJPanel);
				
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
				setContentPane(factureJPanel);
				
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
				setContentPane(locationJPanel);
				
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
				setContentPane(voitureJPanel);
				
			}
		});
		menuBar.add(btnInfoVoiture);
		
		btnInfoFacture = new JButton("Info Facture");
		btnInfoFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFactureJPanel.setVisible(true);
				checkUpJPanel.setVisible(false);
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				setContentPane(infoFactureJPanel);
			}
		});
		menuBar.add(btnInfoFacture);
		
		btnCheckUp = new JButton("CheckUp");
		btnCheckUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkUpJPanel.setVisible(true);
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				infoFactureJPanel.setVisible(false);
				setContentPane(checkUpJPanel);
			}
		});
		menuBar.add(btnCheckUp);
		
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
		
		textFieldInfo = new JTextField();
		GridBagConstraints gbc_textFieldInfo = new GridBagConstraints();
		gbc_textFieldInfo.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldInfo.fill = GridBagConstraints.BOTH;
		gbc_textFieldInfo.gridx = 1;
		gbc_textFieldInfo.gridy = 1;
		
		textFieldInfo.setText("information du technicien");
		
		infoJPanel.add(textFieldInfo, gbc_textFieldInfo);

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
		
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.createFacture(Integer.parseInt(textFieldFactureNumLoca.getText()),false, textFieldFactNote.getText(), Double.parseDouble(textFieldFactKmSupp.getText()));
			}
		});
		
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
		
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLocation.setText(model.getLocation(Integer.parseInt(textFieldLocaNumLoca.getText())).toString());
				
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
		
		btnRechercherNumClient = new JButton("Rechercher location àpd du n° de client");
		GridBagConstraints gbc_btnRechercherNumClient = new GridBagConstraints();
		gbc_btnRechercherNumClient.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherNumClient.gridx = 1;
		gbc_btnRechercherNumClient.gridy = 3;
		locationJPanel.add(btnRechercherNumClient, gbc_btnRechercherNumClient);
		
		btnRechercherNumClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempString="";
				Location[] tempLocas = model.getLocationsClient(Integer.parseInt(textFieldLocaNumClient.getText()));
				for (Location location : tempLocas) {
					tempString+= location.toString()+"\n";
				}
				textFieldLocation.setText(tempString);
			}
		});
		
		textFieldLocation = new JTextField();
		GridBagConstraints gbc_textFieldLocation = new GridBagConstraints();
		gbc_textFieldLocation.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLocation.fill = GridBagConstraints.BOTH;
		gbc_textFieldLocation.gridx = 1;
		gbc_textFieldLocation.gridy = 4;
		locationJPanel.add(textFieldLocation, gbc_textFieldLocation);
		
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
		
		textFieldVoitNumVoit = new JTextField();
		GridBagConstraints gbc_textFieldVoitNumVoit = new GridBagConstraints();
		gbc_textFieldVoitNumVoit.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldVoitNumVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldVoitNumVoit.gridx = 1;
		gbc_textFieldVoitNumVoit.gridy = 3;
		voitureJPanel.add(textFieldVoitNumVoit, gbc_textFieldVoitNumVoit);
		textFieldVoitNumVoit.setColumns(10);
		
		
		btnRechercherVoit = new JButton("Rechercher");
		GridBagConstraints gbc_btnRechercherVoit = new GridBagConstraints();
		gbc_btnRechercherVoit.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherVoit.gridx = 1;
		gbc_btnRechercherVoit.gridy = 4;
		voitureJPanel.add(btnRechercherVoit, gbc_btnRechercherVoit);
		
		btnRechercherVoit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldVoit.setText(model.getVoiture(Integer.parseInt(textFieldVoitNumVoit.getText())).toString());
				
			}
		});
		
		textFieldVoit = new JTextField();
		GridBagConstraints gbc_textFieldVoit = new GridBagConstraints();
		gbc_textFieldVoit.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldVoit.fill = GridBagConstraints.BOTH;
		gbc_textFieldVoit.gridx = 1;
		gbc_textFieldVoit.gridy = 5;
		voitureJPanel.add(textFieldVoit, gbc_textFieldVoit);
		
		voitureJPanel.setVisible(false);
		
		//info Facture 
		
		infoFactureJPanel = new JPanel();
		infoFactureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_infoFactureJPanel = new GridBagLayout();
		gbl_infoFactureJPanel.columnWidths = new int[]{0, 0, 0};
		gbl_infoFactureJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_infoFactureJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_infoFactureJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		infoFactureJPanel.setLayout(gbl_infoFactureJPanel);
		
		lblNDeFacture = new JLabel("N\u00B0 de facture :");
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
		
		btnRechercherFacture = new JButton("Rechercher facture");
		GridBagConstraints gbc_btnRechercherFacture = new GridBagConstraints();
		gbc_btnRechercherFacture.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherFacture.gridx = 1;
		gbc_btnRechercherFacture.gridy = 1;
		infoFactureJPanel.add(btnRechercherFacture, gbc_btnRechercherFacture);
		
		btnRechercherFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldInfoFact.setText(model.getFacture(Integer.parseInt(textFieldFactNumFact.getText())).toString());
				
			}
		});
		
		lblNDeClient = new JLabel("N\u00B0 de client :");
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
		
		btnRechercherFacturepd = new JButton("Rechercher facture \u00E0pd du n\u00B0 de client");
		GridBagConstraints gbc_btnRechercherFacturepd = new GridBagConstraints();
		gbc_btnRechercherFacturepd.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherFacturepd.gridx = 1;
		gbc_btnRechercherFacturepd.gridy = 3;
		infoFactureJPanel.add(btnRechercherFacturepd, gbc_btnRechercherFacturepd);
		
		btnRechercherFacturepd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempString="";
				Facture[] tempFacts = model.getFacturesClient(Integer.parseInt(textFieldFactNumClient.getText()));
				for (Facture facture : tempFacts) {
					tempString+= facture.toString()+"\n";
				}
				textFieldInfoFact.setText(tempString);
				
			}
		});
		
		textFieldInfoFact = new JTextField();
		GridBagConstraints gbc_textFieldInfoFact = new GridBagConstraints();
		gbc_textFieldInfoFact.fill = GridBagConstraints.BOTH;
		gbc_textFieldInfoFact.gridx = 1;
		gbc_textFieldInfoFact.gridy = 5;
		infoFactureJPanel.add(textFieldInfoFact, gbc_textFieldInfoFact);
		infoFactureJPanel.setVisible(false);
		
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
		
		btnValider2 = new JButton("Valider");
		GridBagConstraints gbc_btnValider1 = new GridBagConstraints();
		gbc_btnValider1.insets = new Insets(0, 0, 5, 0);
		gbc_btnValider1.gridx = 1;
		gbc_btnValider1.gridy = 1;
		checkUpJPanel.add(btnValider2, gbc_btnValider1);
		
		btnValider2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//à faire
				lblAncienKilometrage.setVisible(true);
				textFieldAncienKm.setVisible(true);
				lblKilometrageActuel.setVisible(true);
				textFieldCheckKmActu.setVisible(true);
				btnSoumettreKilometrage.setVisible(true);
				textFieldAncienKm.setText((model.getVoiture(Integer.parseInt(textFieldCheckNumVoit.getText()))).getKilometrage()+"");
				
				
				
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
				//à faire
				model.setKilometrage(Integer.parseInt(textFieldCheckNumVoit.getText()), Long.parseLong(textFieldCheckKmActu.getText()));
			}
		});
		
		checkUpJPanel.setVisible(false);
		lblAncienKilometrage.setVisible(false);
		textFieldAncienKm.setVisible(false);
		lblKilometrageActuel.setVisible(false);
		textFieldCheckKmActu.setVisible(false);
		btnSoumettreKilometrage.setVisible(false);

		
		//rendre non éditable tout les JTextField
		textFieldLocation.setEditable(false);
		textFieldVoit.setEditable(false);
		textFieldInfo.setEditable(false);
		textFieldAncienKm.setEditable(false);
		textFieldInfoFact.setEditable(false);

	}
}
