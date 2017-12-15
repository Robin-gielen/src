package vue;

import java.awt.Container;
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

public class ClientVueGui extends JFrame {
	
	private JPanel infoJPanel;
	private JPanel listeVoitureJPanel;
	private JPanel contactJPanel;
	private JPanel locationJPanel;
	private JTextField textFieldPrenomC;
	private JTextField textFieldNomC;
	private JTextField textFieldID;
	private JTextField textFieldNaissance;
	private JTextField textFieldMailC;
	private JTextField textFieldPseudo;
	private JTextField textFieldAdresseC;
	private JTextField textFieldAssurance;
	private JTextField textFieldNumAss;
	private JTextField textFieldNumVoit;
	private JTextField textFieldMailA;
	private JTextField textFieldNomA;
	private JTextField textFieldPrenomA;
	private JTextField textFieldMailT;
	private JTextField textFieldNomT;
	private JTextField textFieldPrenomT;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientVueGui frame = new ClientVueGui();
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
	public ClientVueGui() {
		infoJPanel = new JPanel();
		listeVoitureJPanel = new JPanel();
		contactJPanel = new JPanel();
		locationJPanel = new JPanel();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 525);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnInfo = new JButton("Infos perso");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(true);
				listeVoitureJPanel.setVisible(false);
				contactJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				getContentPane().add(infoJPanel);
				
			}
		});
		menuBar.add(btnInfo);
		
		JButton btnListeVoiture = new JButton("Liste des voitures");
		btnListeVoiture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(false);
				listeVoitureJPanel.setVisible(true);
				contactJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				getContentPane().add(listeVoitureJPanel);
			}
		});

		menuBar.add(btnListeVoiture);
		
		JButton btnContact = new JButton("Contact");
		btnContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(false);
				listeVoitureJPanel.setVisible(false);
				contactJPanel.setVisible(true);
				locationJPanel.setVisible(false);
				getContentPane().add(contactJPanel);
			}
		});
		menuBar.add(btnContact);
		
		JButton btnLocation = new JButton("Location");
		btnLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(false);
				listeVoitureJPanel.setVisible(false);
				contactJPanel.setVisible(false);
				locationJPanel.setVisible(true);
				getContentPane().add(locationJPanel);
			}
		});
		menuBar.add(btnLocation);
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		infoJPanel.setLayout(gridBagLayout);
		infoJPanel.setVisible(false);
		
		JLabel lblMesInfos = new JLabel("Mes infos :");
		lblMesInfos.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMesInfos = new GridBagConstraints();
		gbc_lblMesInfos.anchor = GridBagConstraints.EAST;
		gbc_lblMesInfos.insets = new Insets(0, 0, 5, 5);
		gbc_lblMesInfos.gridx = 0;
		gbc_lblMesInfos.gridy = 0;
		infoJPanel.add(lblMesInfos, gbc_lblMesInfos);
		
		JLabel lblInfosDeLa = new JLabel("Prenom :");
		GridBagConstraints gbc_lblInfosDeLa = new GridBagConstraints();
		gbc_lblInfosDeLa.anchor = GridBagConstraints.EAST;
		gbc_lblInfosDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosDeLa.gridx = 0;
		gbc_lblInfosDeLa.gridy = 2;
		infoJPanel.add(lblInfosDeLa, gbc_lblInfosDeLa);
		
		textFieldPrenomC = new JTextField();
		GridBagConstraints gbc_textFieldPrenomC = new GridBagConstraints();
		gbc_textFieldPrenomC.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldPrenomC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPrenomC.gridx = 1;
		gbc_textFieldPrenomC.gridy = 2;
		infoJPanel.add(textFieldPrenomC, gbc_textFieldPrenomC);
		textFieldPrenomC.setColumns(10);
		
		JLabel lblInfosSurLe = new JLabel("Nom :");
		GridBagConstraints gbc_lblInfosSurLe = new GridBagConstraints();
		gbc_lblInfosSurLe.anchor = GridBagConstraints.EAST;
		gbc_lblInfosSurLe.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosSurLe.gridx = 0;
		gbc_lblInfosSurLe.gridy = 3;
		infoJPanel.add(lblInfosSurLe, gbc_lblInfosSurLe);
		
		textFieldNomC = new JTextField();
		GridBagConstraints gbc_textFieldNomC = new GridBagConstraints();
		gbc_textFieldNomC.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNomC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNomC.gridx = 1;
		gbc_textFieldNomC.gridy = 3;
		infoJPanel.add(textFieldNomC, gbc_textFieldNomC);
		textFieldNomC.setColumns(10);
		
		JLabel lblInfosSurLa = new JLabel("ID :");
		GridBagConstraints gbc_lblInfosSurLa = new GridBagConstraints();
		gbc_lblInfosSurLa.anchor = GridBagConstraints.EAST;
		gbc_lblInfosSurLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosSurLa.gridx = 0;
		gbc_lblInfosSurLa.gridy = 4;
		infoJPanel.add(lblInfosSurLa, gbc_lblInfosSurLa);
		
		textFieldID = new JTextField();
		GridBagConstraints gbc_textFieldID = new GridBagConstraints();
		gbc_textFieldID.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldID.gridx = 1;
		gbc_textFieldID.gridy = 4;
		infoJPanel.add(textFieldID, gbc_textFieldID);
		textFieldID.setColumns(10);
		
		JLabel lblDateDeNaissance = new JLabel("Date naissance : ");
		GridBagConstraints gbc_lblDateDeNaissance = new GridBagConstraints();
		gbc_lblDateDeNaissance.anchor = GridBagConstraints.EAST;
		gbc_lblDateDeNaissance.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateDeNaissance.gridx = 0;
		gbc_lblDateDeNaissance.gridy = 5;
		infoJPanel.add(lblDateDeNaissance, gbc_lblDateDeNaissance);
		

		infoJPanel.setVisible(false);
		getContentPane().add(infoJPanel);
		
		textFieldNaissance = new JTextField();
		GridBagConstraints gbc_textFieldNaissance = new GridBagConstraints();
		gbc_textFieldNaissance.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNaissance.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNaissance.gridx = 1;
		gbc_textFieldNaissance.gridy = 5;
		infoJPanel.add(textFieldNaissance, gbc_textFieldNaissance);
		textFieldNaissance.setColumns(10);
		
		JLabel lblAdresseMail = new JLabel("Adresse mail :");
		GridBagConstraints gbc_lblAdresseMail = new GridBagConstraints();
		gbc_lblAdresseMail.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresseMail.gridx = 0;
		gbc_lblAdresseMail.gridy = 6;
		infoJPanel.add(lblAdresseMail, gbc_lblAdresseMail);
		
		textFieldMailC = new JTextField();
		GridBagConstraints gbc_textFieldMailC = new GridBagConstraints();
		gbc_textFieldMailC.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMailC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMailC.gridx = 1;
		gbc_textFieldMailC.gridy = 6;
		infoJPanel.add(textFieldMailC, gbc_textFieldMailC);
		textFieldMailC.setColumns(10);
		
		JLabel lblPseudo = new JLabel("Pseudo :");
		GridBagConstraints gbc_lblPseudo = new GridBagConstraints();
		gbc_lblPseudo.anchor = GridBagConstraints.EAST;
		gbc_lblPseudo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPseudo.gridx = 0;
		gbc_lblPseudo.gridy = 7;
		infoJPanel.add(lblPseudo, gbc_lblPseudo);
		
		textFieldPseudo = new JTextField();
		GridBagConstraints gbc_textFieldPseudo = new GridBagConstraints();
		gbc_textFieldPseudo.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldPseudo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPseudo.gridx = 1;
		gbc_textFieldPseudo.gridy = 7;
		infoJPanel.add(textFieldPseudo, gbc_textFieldPseudo);
		textFieldPseudo.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		GridBagConstraints gbc_lblAdresse = new GridBagConstraints();
		gbc_lblAdresse.anchor = GridBagConstraints.EAST;
		gbc_lblAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse.gridx = 0;
		gbc_lblAdresse.gridy = 8;
		infoJPanel.add(lblAdresse, gbc_lblAdresse);
		
		textFieldAdresseC = new JTextField();
		GridBagConstraints gbc_textFieldAdresseC = new GridBagConstraints();
		gbc_textFieldAdresseC.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldAdresseC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAdresseC.gridx = 1;
		gbc_textFieldAdresseC.gridy = 8;
		infoJPanel.add(textFieldAdresseC, gbc_textFieldAdresseC);
		textFieldAdresseC.setColumns(10);
		
		JLabel lblAssurance = new JLabel("Assurance :");
		GridBagConstraints gbc_lblAssurance = new GridBagConstraints();
		gbc_lblAssurance.anchor = GridBagConstraints.EAST;
		gbc_lblAssurance.insets = new Insets(0, 0, 5, 5);
		gbc_lblAssurance.gridx = 0;
		gbc_lblAssurance.gridy = 9;
		infoJPanel.add(lblAssurance, gbc_lblAssurance);
		
		textFieldAssurance = new JTextField();
		GridBagConstraints gbc_textFieldAssurance = new GridBagConstraints();
		gbc_textFieldAssurance.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldAssurance.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAssurance.gridx = 1;
		gbc_textFieldAssurance.gridy = 9;
		infoJPanel.add(textFieldAssurance, gbc_textFieldAssurance);
		textFieldAssurance.setColumns(10);
		
		// Contact
		
		GridBagLayout gridBagLayout1 = new GridBagLayout();
		gridBagLayout1.columnWidths = new int[]{0, 0, 0};
		gridBagLayout1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		contactJPanel.setLayout(gridBagLayout1);
		contactJPanel.setVisible(false);
		
		JLabel lblInfosSurLadmin = new JLabel("Infos sur l'admin");
		GridBagConstraints gbc_lblInfosSurLadmin = new GridBagConstraints();
		gbc_lblInfosSurLadmin.anchor = GridBagConstraints.WEST;
		gbc_lblInfosSurLadmin.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosSurLadmin.gridx = 0;
		gbc_lblInfosSurLadmin.gridy = 0;
		contactJPanel.add(lblInfosSurLadmin, gbc_lblInfosSurLadmin);
		
		JLabel lblAdresseMailA = new JLabel("Adresse mail :");
		GridBagConstraints gbc_lblAdresseMailA = new GridBagConstraints();
		gbc_lblAdresseMailA.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresseMailA.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseMailA.gridx = 0;
		gbc_lblAdresseMailA.gridy = 2;
		contactJPanel.add(lblAdresseMailA, gbc_lblAdresseMailA);
		
		textFieldMailA = new JTextField();
		GridBagConstraints gbc_textFieldMailA = new GridBagConstraints();
		gbc_textFieldMailA.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMailA.fill = GridBagConstraints.BOTH;
		gbc_textFieldMailA.gridx = 1;
		gbc_textFieldMailA.gridy = 2;
		contactJPanel.add(textFieldMailA, gbc_textFieldMailA);
		textFieldMailA.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom :");
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblNom.anchor = GridBagConstraints.EAST;
		gbc_lblNom.gridx = 0;
		gbc_lblNom.gridy = 3;
		contactJPanel.add(lblNom, gbc_lblNom);
		
		textFieldNomA = new JTextField();
		GridBagConstraints gbc_textFieldNomA = new GridBagConstraints();
		gbc_textFieldNomA.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNomA.fill = GridBagConstraints.BOTH;
		gbc_textFieldNomA.gridx = 1;
		gbc_textFieldNomA.gridy = 3;
		contactJPanel.add(textFieldNomA, gbc_textFieldNomA);
		textFieldNomA.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Prenom :");
		GridBagConstraints gbc_lblPrnom = new GridBagConstraints();
		gbc_lblPrnom.anchor = GridBagConstraints.EAST;
		gbc_lblPrnom.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrnom.gridx = 0;
		gbc_lblPrnom.gridy = 4;
		contactJPanel.add(lblPrnom, gbc_lblPrnom);
		
		textFieldPrenomA = new JTextField();
		GridBagConstraints gbc_textFieldPrenomA = new GridBagConstraints();
		gbc_textFieldPrenomA.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldPrenomA.fill = GridBagConstraints.BOTH;
		gbc_textFieldPrenomA.gridx = 1;
		gbc_textFieldPrenomA.gridy = 4;
		contactJPanel.add(textFieldPrenomA, gbc_textFieldPrenomA);
		textFieldPrenomA.setColumns(10);
		
		JLabel lblInfoSurLe = new JLabel("Infos sur le technicien");
		GridBagConstraints gbc_lblInfoSurLe = new GridBagConstraints();
		gbc_lblInfoSurLe.anchor = GridBagConstraints.WEST;
		gbc_lblInfoSurLe.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfoSurLe.gridx = 0;
		gbc_lblInfoSurLe.gridy = 6;
		contactJPanel.add(lblInfoSurLe, gbc_lblInfoSurLe);
		
		JLabel lblAdresseMailT = new JLabel("Adresse mail :");
		GridBagConstraints gbc_lblAdresseMailT = new GridBagConstraints();
		gbc_lblAdresseMailT.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseMailT.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresseMailT.gridx = 0;
		gbc_lblAdresseMailT.gridy = 8;
		contactJPanel.add(lblAdresseMailT, gbc_lblAdresseMailT);
		
		textFieldMailT = new JTextField();
		GridBagConstraints gbc_textFieldMailT = new GridBagConstraints();
		gbc_textFieldMailT.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMailT.fill = GridBagConstraints.BOTH;
		gbc_textFieldMailT.gridx = 1;
		gbc_textFieldMailT.gridy = 8;
		contactJPanel.add(textFieldMailT, gbc_textFieldMailT);
		textFieldMailT.setColumns(10);
		
		JLabel lblNomT = new JLabel("Nom :");
		GridBagConstraints gbc_lblNomT = new GridBagConstraints();
		gbc_lblNomT.anchor = GridBagConstraints.EAST;
		gbc_lblNomT.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomT.gridx = 0;
		gbc_lblNomT.gridy = 9;
		contactJPanel.add(lblNomT, gbc_lblNomT);
		
		textFieldNomT = new JTextField();
		GridBagConstraints gbc_textFieldNomT = new GridBagConstraints();
		gbc_textFieldNomT.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNomT.fill = GridBagConstraints.BOTH;
		gbc_textFieldNomT.gridx = 1;
		gbc_textFieldNomT.gridy = 9;
		contactJPanel.add(textFieldNomT, gbc_textFieldNomT);
		textFieldNomT.setColumns(10);
		
		JLabel lblPrenomT = new JLabel("Prenom :");
		GridBagConstraints gbc_lblPrenomT = new GridBagConstraints();
		gbc_lblPrenomT.anchor = GridBagConstraints.EAST;
		gbc_lblPrenomT.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrenomT.gridx = 0;
		gbc_lblPrenomT.gridy = 10;
		contactJPanel.add(lblPrenomT, gbc_lblPrenomT);
		
		textFieldPrenomT = new JTextField();
		GridBagConstraints gbc_textFieldPrenomT = new GridBagConstraints();
		gbc_textFieldPrenomT.fill = GridBagConstraints.BOTH;
		gbc_textFieldPrenomT.gridx = 1;
		gbc_textFieldPrenomT.gridy = 10;
		contactJPanel.add(textFieldPrenomT, gbc_textFieldPrenomT);
		textFieldPrenomT.setColumns(10);
		
		// Location
		
		locationJPanel = new JPanel();
		locationJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_contentPane1 = new GridBagLayout();
		gbl_contentPane1.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		locationJPanel.setLayout(gbl_contentPane1);
		
		JLabel lblNDassurance = new JLabel("Numero d'assurance :");
		GridBagConstraints gbc_lblNDassurance = new GridBagConstraints();
		gbc_lblNDassurance.anchor = GridBagConstraints.WEST;
		gbc_lblNDassurance.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDassurance.gridx = 0;
		gbc_lblNDassurance.gridy = 2;
		locationJPanel.add(lblNDassurance, gbc_lblNDassurance);
		
		textFieldNumAss = new JTextField();
		GridBagConstraints gbc_textFieldNumAss = new GridBagConstraints();
		gbc_textFieldNumAss.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNumAss.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNumAss.gridx = 1;
		gbc_textFieldNumAss.gridy = 2;
		locationJPanel.add(textFieldNumAss, gbc_textFieldNumAss);
		textFieldNumAss.setColumns(10);
		
		JLabel lblNDeVoiture = new JLabel("Numero de voiture :");
		GridBagConstraints gbc_lblNDeVoiture = new GridBagConstraints();
		gbc_lblNDeVoiture.anchor = GridBagConstraints.WEST;
		gbc_lblNDeVoiture.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeVoiture.gridx = 0;
		gbc_lblNDeVoiture.gridy = 4;
		locationJPanel.add(lblNDeVoiture, gbc_lblNDeVoiture);
		
		textFieldNumVoit = new JTextField();
		GridBagConstraints gbc_textFieldNumVoit = new GridBagConstraints();
		gbc_textFieldNumVoit.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNumVoit.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNumVoit.gridx = 1;
		gbc_textFieldNumVoit.gridy = 4;
		locationJPanel.add(textFieldNumVoit, gbc_textFieldNumVoit);
		textFieldNumVoit.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 7;
		locationJPanel.add(btnNewButton, gbc_btnNewButton);
		
		/**
		Pour afficher la liste des voitures 
		private JMenuBar menuBar = new JMenuBar();
	  private JMenu test1 = new JMenu("style de la voiture");
	  private final JMenu mnTest = new JMenu("Test");
	  private final JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
	  private final JMenu mnBerline = new JMenu("Berline");
	  private final JMenu mnCamionette = new JMenu("Camionette");
	  private final JMenu mnBmw = new JMenu("BMW");
	  private final JMenu mnVw = new JMenu("VW");
	  private final JMenu mnAudi = new JMenu("Audi");
	  private final JMenu mnCitroen = new JMenu("Citroen");
	  private final JMenu mnJaune = new JMenu("Jaune");
	  private final JMenu mnJaune_1 = new JMenu("Jaune");
	  private final JMenu mnJaune_2 = new JMenu("Jaune");
	  private final JMenu mnCitroen_1 = new JMenu("Citroen");
	  private final JMenu mnJaune_3 = new JMenu("Jaune");
	  private final JMenu mnNoir = new JMenu("Noir");
	  private final JMenu mnBleu = new JMenu("Bleu");
	  private final JMenu mnRouge = new JMenu("Rouge");
	  private final JMenu mnVert = new JMenu("Vert");
	  private final JMenu mnAutomatique = new JMenu("Automatique");
	  private final JMenu mnAutomatique_1 = new JMenu("Automatique");
	  private final JMenu mnManuelle = new JMenu("Manuelle");
	  private final JMenu mnAutomatique_2 = new JMenu("Automatique");
	  private final JMenu mnManuelle_1 = new JMenu("Manuelle");
	  private final JMenu mnAutomatique_3 = new JMenu("Automatique");
	  private final JMenu mnManuelle_2 = new JMenu("Manuelle");
	  private final JMenu mnAutomatique_4 = new JMenu("Automatique");
	  private final JMenu mnManuelle_3 = new JMenu("Manuelle");
	  private final JMenu mnManuelle_4 = new JMenu("Manuelle");
	  private final JMenu mnAutomatique_5 = new JMenu("Automatique");
	  private final JMenu mnManuelle_5 = new JMenu("Manuelle");


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListeVoituresWindowBuilder frame = new ListeVoituresWindowBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ListeVoituresWindowBuilder() {
		this.setSize(400, 200);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    //On met nos radios dans un ButtonGroup
	    ButtonGroup bg = new ButtonGroup();

	    this.menuBar.add(test1);
	    
	    test1.add(mnBerline);
	    
	    mnBerline.add(mnBmw);
	    
	    mnBmw.add(mnJaune);
	    
	    mnJaune.add(mnAutomatique_1);
	    
	    mnJaune.add(mnManuelle);
	    
	    mnBmw.add(mnNoir);
	    
	    mnNoir.add(mnAutomatique_2);
	    
	    mnNoir.add(mnManuelle_1);
	    
	    mnBmw.add(mnBleu);
	    
	    mnBleu.add(mnAutomatique_3);
	    
	    mnBleu.add(mnManuelle_2);
	    
	    mnBmw.add(mnRouge);
	    
	    mnRouge.add(mnAutomatique_4);
	    
	    mnRouge.add(mnManuelle_4);
	    
	    mnBmw.add(mnVert);
	    
	    mnVert.add(mnAutomatique_5);
	    
	    mnVert.add(mnManuelle_5);
	    
	    mnBerline.add(mnVw);
	    
	    mnVw.add(mnJaune_1);
	    
	    mnJaune_1.add(mnAutomatique);
	    mnAutomatique.add(mnManuelle_3);
	    mnAutomatique.add(mnJaune_2);
	    
	    mnBerline.add(mnAudi);
	    
	    mnBerline.add(mnCitroen);
	    
	    mnCitroen.add(mnJaune_3);
	    
	    test1.add(mnCamionette);
	    
	    mnCamionette.add(mnCitroen_1);
	    this.setJMenuBar(menuBar);
	    
	    menuBar.add(mnTest);
	    
	    mnTest.add(mntmNewMenuItem);
	    this.setVisible(true);
	}

}
