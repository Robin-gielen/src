package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JInternalFrame;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class TechnicienVueGui extends JFrame {

	private JPanel infoJPanel;
	private JPanel factureJPanel;
	private JPanel locationJPanel;
	private JPanel voitureJPanel;
	private JPanel kilometrageJPanel;
	private JPanel clientJPanel;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JButton btnValider;

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
		
		JButton btnInfo = new JButton("INFO");
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
		
		JButton btnNouvelleFacture = new JButton("Nouvelle Facture");
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
		
		JButton btnInfoLocation = new JButton("Info Location");
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
		
		JButton btnInfoVoiture = new JButton("Info Voiture");
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
		
		JButton btnCheckUp = new JButton("CheckUp");
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
		
		JButton btnListeClient = new JButton("Liste Clients");
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
		JLabel lblMesInfos = new JLabel("Mes infos :");
		lblMesInfos.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMesInfos = new GridBagConstraints();
		gbc_lblMesInfos.anchor = GridBagConstraints.EAST;
		gbc_lblMesInfos.insets = new Insets(0, 0, 5, 5);
		gbc_lblMesInfos.gridx = 0;
		gbc_lblMesInfos.gridy = 3;
		infoJPanel.add(lblMesInfos, gbc_lblMesInfos);
		
		JTextPane textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 5, 0);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 1;
		gbc_textPane.gridy = 4;
		infoJPanel.add(textPane, gbc_textPane);
		
		//facture
		
		factureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_factureJPanel = new GridBagLayout();
		gbl_factureJPanel.columnWidths = new int[]{0, 0, 0};
		gbl_factureJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_factureJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_factureJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		factureJPanel.setLayout(gbl_factureJPanel);
		
		JLabel lblNDeLocation = new JLabel("N\u00B0 de location :");
		GridBagConstraints gbc_lblNDeLocation = new GridBagConstraints();
		gbc_lblNDeLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeLocation.anchor = GridBagConstraints.EAST;
		gbc_lblNDeLocation.gridx = 0;
		gbc_lblNDeLocation.gridy = 0;
		factureJPanel.add(lblNDeLocation, gbc_lblNDeLocation);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 0;
		factureJPanel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEtatDePayement = new JLabel("Etat de payement :");
		GridBagConstraints gbc_lblEtatDePayement = new GridBagConstraints();
		gbc_lblEtatDePayement.anchor = GridBagConstraints.EAST;
		gbc_lblEtatDePayement.insets = new Insets(0, 0, 5, 5);
		gbc_lblEtatDePayement.gridx = 0;
		gbc_lblEtatDePayement.gridy = 2;
		factureJPanel.add(lblEtatDePayement, gbc_lblEtatDePayement);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 2;
		factureJPanel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNote = new JLabel("Note :");
		GridBagConstraints gbc_lblNote = new GridBagConstraints();
		gbc_lblNote.anchor = GridBagConstraints.EAST;
		gbc_lblNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblNote.gridx = 0;
		gbc_lblNote.gridy = 4;
		factureJPanel.add(lblNote, gbc_lblNote);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 4;
		factureJPanel.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.anchor = GridBagConstraints.EAST;
		gbc_btnValider.gridx = 1;
		gbc_btnValider.gridy = 7;
		factureJPanel.add(btnValider, gbc_btnValider);
		
		factureJPanel.setVisible(false);
		
		//location
		locationJPanel = new JPanel();
		locationJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		GridBagLayout gbl_locationJPanel = new GridBagLayout();
		gbl_locationJPanel.columnWidths = new int[]{0, 0, 0};
		gbl_locationJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_locationJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_locationJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		locationJPanel.setLayout(gbl_locationJPanel);
		
		JLabel lblNDeLocation1 = new JLabel("N\u00B0 de location :");
		GridBagConstraints gbc_lblNDeLocation1 = new GridBagConstraints();
		gbc_lblNDeLocation1.anchor = GridBagConstraints.EAST;
		gbc_lblNDeLocation1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeLocation1.gridx = 0;
		gbc_lblNDeLocation1.gridy = 3;
		locationJPanel.add(lblNDeLocation1, gbc_lblNDeLocation1);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		locationJPanel.add(textField_7, gbc_textField);
		textField_7.setColumns(10);
		
		JButton btnRechercher = new JButton("Rechercher");
		GridBagConstraints gbc_btnRechercher = new GridBagConstraints();
		gbc_btnRechercher.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercher.gridx = 1;
		gbc_btnRechercher.gridy = 4;
		locationJPanel.add(btnRechercher, gbc_btnRechercher);
		
		JTextPane textPane1 = new JTextPane();
		GridBagConstraints gbc_textPane1 = new GridBagConstraints();
		gbc_textPane1.insets = new Insets(0, 0, 5, 0);
		gbc_textPane1.fill = GridBagConstraints.BOTH;
		gbc_textPane1.gridx = 1;
		gbc_textPane1.gridy = 5;
		locationJPanel.add(textPane1, gbc_textPane1);
		
		locationJPanel.setVisible(false);
		
		//voiture
		
		voitureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		GridBagLayout gbl_voitureJPanel = new GridBagLayout();
		gbl_voitureJPanel.columnWidths = new int[]{0, 0, 0};
		gbl_voitureJPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_voitureJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_voitureJPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		voitureJPanel.setLayout(gbl_voitureJPanel);
		
		JLabel lblNDeVoiture = new JLabel("N° de Voiture :");
		GridBagConstraints gbc_lblNDeVoiture = new GridBagConstraints();
		gbc_lblNDeVoiture.anchor = GridBagConstraints.EAST;
		gbc_lblNDeVoiture.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeVoiture.gridx = 0;
		gbc_lblNDeVoiture.gridy = 3;
		voitureJPanel.add(lblNDeVoiture, gbc_lblNDeVoiture);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 0);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 3;
		voitureJPanel.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		
		JButton btnRechercherVoit = new JButton("Rechercher");
		GridBagConstraints gbc_btnRechercherVoit = new GridBagConstraints();
		gbc_btnRechercherVoit.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercherVoit.gridx = 1;
		gbc_btnRechercherVoit.gridy = 4;
		voitureJPanel.add(btnRechercherVoit, gbc_btnRechercherVoit);
		
		JTextPane textPane1Voit = new JTextPane();
		GridBagConstraints gbc_textPane1Voit = new GridBagConstraints();
		gbc_textPane1Voit.insets = new Insets(0, 0, 5, 0);
		gbc_textPane1Voit.fill = GridBagConstraints.BOTH;
		gbc_textPane1Voit.gridx = 1;
		gbc_textPane1Voit.gridy = 5;
		voitureJPanel.add(textPane1Voit, gbc_textPane1Voit);
		
		voitureJPanel.setVisible(false);
		
		//check up
		kilometrageJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_kilometrageJPanel = new GridBagLayout();
		gbl_kilometrageJPanel.columnWidths = new int[]{97, 322, 0};
		gbl_kilometrageJPanel.rowHeights = new int[]{20, 23, 14, 0, 0, 0, 0, 0, 0, 0};
		gbl_kilometrageJPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_kilometrageJPanel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		kilometrageJPanel.setLayout(gbl_kilometrageJPanel);
		
		JLabel lblNDeVoiture1 = new JLabel("N\u00B0 de voiture :");
		GridBagConstraints gbc_lblNDeVoiture1 = new GridBagConstraints();
		gbc_lblNDeVoiture1.anchor = GridBagConstraints.WEST;
		gbc_lblNDeVoiture1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeVoiture1.gridx = 0;
		gbc_lblNDeVoiture1.gridy = 0;
		kilometrageJPanel.add(lblNDeVoiture1, gbc_lblNDeVoiture1);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.insets = new Insets(0, 0, 5, 0);
		gbc_textField_9.gridx = 1;
		gbc_textField_9.gridy = 0;
		kilometrageJPanel.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider1 = new GridBagConstraints();
		gbc_btnValider1.insets = new Insets(0, 0, 5, 0);
		gbc_btnValider1.gridx = 1;
		gbc_btnValider1.gridy = 1;
		kilometrageJPanel.add(btnValider, gbc_btnValider1);
		
		JLabel lblAncienKilometrage = new JLabel("Ancien kilometrage :");
		GridBagConstraints gbc_lblAncienKilometrage = new GridBagConstraints();
		gbc_lblAncienKilometrage.anchor = GridBagConstraints.NORTH;
		gbc_lblAncienKilometrage.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncienKilometrage.gridx = 0;
		gbc_lblAncienKilometrage.gridy = 2;
		kilometrageJPanel.add(lblAncienKilometrage, gbc_lblAncienKilometrage);
		
		JTextPane textPane11 = new JTextPane();
		GridBagConstraints gbc_textPane11 = new GridBagConstraints();
		gbc_textPane11.insets = new Insets(0, 0, 5, 0);
		gbc_textPane11.fill = GridBagConstraints.BOTH;
		gbc_textPane11.gridx = 1;
		gbc_textPane11.gridy = 2;
		kilometrageJPanel.add(textPane11, gbc_textPane11);
		
		JLabel lblKilometrageActuel = new JLabel("Kilometrage actuel :");
		GridBagConstraints gbc_lblKilometrageActuel = new GridBagConstraints();
		gbc_lblKilometrageActuel.anchor = GridBagConstraints.EAST;
		gbc_lblKilometrageActuel.insets = new Insets(0, 0, 5, 5);
		gbc_lblKilometrageActuel.gridx = 0;
		gbc_lblKilometrageActuel.gridy = 3;
		kilometrageJPanel.add(lblKilometrageActuel, gbc_lblKilometrageActuel);
		
		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 0);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 1;
		gbc_textField_10.gridy = 3;
		kilometrageJPanel.add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		JButton btnSoumettreKilometrage = new JButton("Soumettre kilometrage");
		GridBagConstraints gbc_btnSoumettreKilometrage = new GridBagConstraints();
		gbc_btnSoumettreKilometrage.insets = new Insets(0, 0, 5, 0);
		gbc_btnSoumettreKilometrage.gridx = 1;
		gbc_btnSoumettreKilometrage.gridy = 5;
		kilometrageJPanel.add(btnSoumettreKilometrage, gbc_btnSoumettreKilometrage);
		
		JLabel lblAncienneNote = new JLabel("Ancienne note :");
		GridBagConstraints gbc_lblAncienneNote = new GridBagConstraints();
		gbc_lblAncienneNote.anchor = GridBagConstraints.WEST;
		gbc_lblAncienneNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncienneNote.gridx = 0;
		gbc_lblAncienneNote.gridy = 6;
		kilometrageJPanel.add(lblAncienneNote, gbc_lblAncienneNote);
		
		JTextPane textPane_11 = new JTextPane();
		GridBagConstraints gbc_textPane_11 = new GridBagConstraints();
		gbc_textPane_11.insets = new Insets(0, 0, 5, 0);
		gbc_textPane_11.fill = GridBagConstraints.BOTH;
		gbc_textPane_11.gridx = 1;
		gbc_textPane_11.gridy = 6;
		kilometrageJPanel.add(textPane_11, gbc_textPane_11);
		
		JLabel lblNouvelleNote = new JLabel("Nouvelle note :");
		GridBagConstraints gbc_lblNouvelleNote = new GridBagConstraints();
		gbc_lblNouvelleNote.anchor = GridBagConstraints.WEST;
		gbc_lblNouvelleNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblNouvelleNote.gridx = 0;
		gbc_lblNouvelleNote.gridy = 7;
		kilometrageJPanel.add(lblNouvelleNote, gbc_lblNouvelleNote);
		
		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 0);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 1;
		gbc_textField_11.gridy = 7;
		kilometrageJPanel.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JButton btnSoumettreNote = new JButton("Soumettre note");
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
		
		JLabel lblListeDesClients = new JLabel("Liste des clients :");
		GridBagConstraints gbc_lblListeDesClients = new GridBagConstraints();
		gbc_lblListeDesClients.insets = new Insets(0, 0, 5, 5);
		gbc_lblListeDesClients.gridx = 0;
		gbc_lblListeDesClients.gridy = 0;
		clientJPanel.add(lblListeDesClients, gbc_lblListeDesClients);
		
		JTextPane textPane111 = new JTextPane();
		GridBagConstraints gbc_textPane111 = new GridBagConstraints();
		gbc_textPane111.fill = GridBagConstraints.BOTH;
		gbc_textPane111.gridx = 1;
		gbc_textPane111.gridy = 1;
		clientJPanel.add(textPane111, gbc_textPane111);
		clientJPanel.setVisible(false);

}
	}
