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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	

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
		
		infoJPanel.setVisible(true);
		getContentPane().add(infoJPanel);
		
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
		
		//liste voiture
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 370);
		listeVoitureJPanel = new JPanel();
		listeVoitureJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		listeVoitureJPanel.setLayout(gbl_contentPane);
		
		JLabel lblVeuillezIndiquerVos = new JLabel("Veuillez indiquer vos options");
		GridBagConstraints gbc_lblVeuillezIndiquerVos = new GridBagConstraints();
		gbc_lblVeuillezIndiquerVos.insets = new Insets(0, 0, 5, 5);
		gbc_lblVeuillezIndiquerVos.gridx = 0;
		gbc_lblVeuillezIndiquerVos.gridy = 0;
		listeVoitureJPanel.add(lblVeuillezIndiquerVos, gbc_lblVeuillezIndiquerVos);
		
		JLabel lblIndiquezLaMarque = new JLabel("Indiquez la marque ");
		GridBagConstraints gbc_lblIndiquezLaMarque = new GridBagConstraints();
		gbc_lblIndiquezLaMarque.insets = new Insets(0, 0, 5, 5);
		gbc_lblIndiquezLaMarque.gridx = 0;
		gbc_lblIndiquezLaMarque.gridy = 2;
		listeVoitureJPanel.add(lblIndiquezLaMarque, gbc_lblIndiquezLaMarque);
		
		textField = new JTextField("BMW, VW, Audi, Skoda, Citroen");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 2;
		listeVoitureJPanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblIndiquezLaCouleur = new JLabel("Indiquez la couleur");
		GridBagConstraints gbc_lblIndiquezLaCouleur = new GridBagConstraints();
		gbc_lblIndiquezLaCouleur.insets = new Insets(0, 0, 5, 5);
		gbc_lblIndiquezLaCouleur.gridx = 0;
		gbc_lblIndiquezLaCouleur.gridy = 3;
		listeVoitureJPanel.add(lblIndiquezLaCouleur, gbc_lblIndiquezLaCouleur);
		
		textField_1 = new JTextField("Noir, Brun, Jaune, Orange");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		listeVoitureJPanel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIndiquezLeKilometrage = new JLabel("Indiquez le kilometrage");
		GridBagConstraints gbc_lblIndiquezLeKilometrage = new GridBagConstraints();
		gbc_lblIndiquezLeKilometrage.insets = new Insets(0, 0, 5, 5);
		gbc_lblIndiquezLeKilometrage.gridx = 0;
		gbc_lblIndiquezLeKilometrage.gridy = 4;
		listeVoitureJPanel.add(lblIndiquezLeKilometrage, gbc_lblIndiquezLeKilometrage);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		listeVoitureJPanel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAutomatiquemanuel = new JLabel("Boite de transmission");
		GridBagConstraints gbc_lblAutomatiquemanuel = new GridBagConstraints();
		gbc_lblAutomatiquemanuel.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutomatiquemanuel.gridx = 0;
		gbc_lblAutomatiquemanuel.gridy = 5;
		listeVoitureJPanel.add(lblAutomatiquemanuel, gbc_lblAutomatiquemanuel);
		
		textField_3 = new JTextField("Automatique ou manuel");
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 5;
		listeVoitureJPanel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTypeberlineBreakEtc = new JLabel("Type de voiture");
		GridBagConstraints gbc_lblTypeberlineBreakEtc = new GridBagConstraints();
		gbc_lblTypeberlineBreakEtc.insets = new Insets(0, 0, 5, 5);
		gbc_lblTypeberlineBreakEtc.gridx = 0;
		gbc_lblTypeberlineBreakEtc.gridy = 6;
		listeVoitureJPanel.add(lblTypeberlineBreakEtc, gbc_lblTypeberlineBreakEtc);
		
		textField_4 = new JTextField("Berline, Break, citadine, camionette");
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 6;
		listeVoitureJPanel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNbrDeRoues = new JLabel("Nbr de roues motrices");
		GridBagConstraints gbc_lblNbrDeRoues = new GridBagConstraints();
		gbc_lblNbrDeRoues.insets = new Insets(0, 0, 5, 5);
		gbc_lblNbrDeRoues.gridx = 0;
		gbc_lblNbrDeRoues.gridy = 7;
		listeVoitureJPanel.add(lblNbrDeRoues, gbc_lblNbrDeRoues);
		
		textField_5 = new JTextField("2 ou 4");
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 7;
		listeVoitureJPanel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPrix = new JLabel("Prix");
		GridBagConstraints gbc_lblPrix = new GridBagConstraints();
		gbc_lblPrix.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrix.gridx = 0;
		gbc_lblPrix.gridy = 8;
		listeVoitureJPanel.add(lblPrix, gbc_lblPrix);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 8;
		listeVoitureJPanel.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.anchor = GridBagConstraints.EAST;
		gbc_btnValider.gridx = 2;
		gbc_btnValider.gridy = 11;
		listeVoitureJPanel.add(btnValider, gbc_btnValider);
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagePourSIdentifier frame = new PagePourSIdentifier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	public PagePourSIdentifier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("38dlu:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblBienvenue = new JLabel("Bienvenue");
		contentPane.add(lblBienvenue, "4, 2");
		
		JLabel lblVousAvezDj = new JLabel("Vous avez d\u00E9j\u00E0 un compte?");
		contentPane.add(lblVousAvezDj, "2, 4");
		
		JLabel lblPseudo = new JLabel("Pseudo");
		contentPane.add(lblPseudo, "2, 8, right, default");
		
		textField = new JTextField();
		contentPane.add(textField, "4, 8, fill, default");
		textField.setColumns(10);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		contentPane.add(lblMotDePasse, "2, 10, right, default");
		
		passwordField = new JPasswordField();
		contentPane.add(passwordField, "4, 10, fill, default");
		
		JButton btnSeConnecter = new JButton("Se connecter");
		contentPane.add(btnSeConnecter, "6, 10, center, default");
		
		JLabel lblVousNavezPas = new JLabel("Vous n'avez pas de compte?");
		contentPane.add(lblVousNavezPas, "2, 16");
		
		JButton btnCliquezIciPour = new JButton("Cliquez ici pour le cr\u00E9er");
		btnCliquezIciPour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnCliquezIciPour, "6, 16, left, default");
		**/
		
		/**
	public class PagePourSeConnecterGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblVotreNom;
	private JTextField textField_1;
	private JLabel lblVotreDateDe;
	private JTextField textField_2;
	private JLabel lblVotreAdresseMail;
	private JTextField textField_3;
	private JLabel lblVotreAdresseville;
	private JTextField textField_4;
	private JLabel lblVotreAssurance;
	private JTextField textField_5;
	private JLabel lblVotrePseudo;
	private JTextField textField_6;
	private JLabel lblVotreMotDe;
	private JPasswordField passwordField;
	private JButton btnCrerLeCompte;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagePourSeConnecterGUI frame = new PagePourSeConnecterGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PagePourSeConnecterGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
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
		
		JLabel lblVeuillezIndiquerVos = new JLabel("Veuillez indiquer vos donn\u00E9es personnelles");
		contentPane.add(lblVeuillezIndiquerVos, "2, 2");
		
		JLabel lblVotrePrnom = new JLabel("Votre pr\u00E9nom");
		contentPane.add(lblVotrePrnom, "2, 6, right, default");
		
		textField = new JTextField();
		contentPane.add(textField, "4, 6, fill, default");
		textField.setColumns(10);
		
		lblVotreNom = new JLabel("Votre nom");
		contentPane.add(lblVotreNom, "2, 8, right, default");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "4, 8, fill, default");
		textField_1.setColumns(10);
		
		lblVotreDateDe = new JLabel("Votre date de naissance");
		contentPane.add(lblVotreDateDe, "2, 10, right, default");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "4, 10, fill, default");
		textField_2.setColumns(10);
		
		lblVotreAdresseMail = new JLabel("Votre adresse mail");
		contentPane.add(lblVotreAdresseMail, "2, 12, right, default");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "4, 12, fill, default");
		textField_3.setColumns(10);
		
		lblVotreAdresseville = new JLabel("Votre adresse(Ville + rue)");
		contentPane.add(lblVotreAdresseville, "2, 14, right, default");
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "4, 14, fill, default");
		textField_4.setColumns(10);
		
		lblVotreAssurance = new JLabel("Votre assurance");
		contentPane.add(lblVotreAssurance, "2, 16, right, default");
		
		textField_5 = new JTextField();
		contentPane.add(textField_5, "4, 16, fill, default");
		textField_5.setColumns(10);
		
		lblVotrePseudo = new JLabel("Votre pseudo");
		contentPane.add(lblVotrePseudo, "2, 18, right, default");
		
		textField_6 = new JTextField();
		contentPane.add(textField_6, "4, 18, fill, default");
		textField_6.setColumns(10);
		
		lblVotreMotDe = new JLabel("Votre mot de passe");
		contentPane.add(lblVotreMotDe, "2, 20, right, default");
		
		passwordField = new JPasswordField();
		contentPane.add(passwordField, "4, 20, fill, default");
		
		btnCrerLeCompte = new JButton("Cr\u00E9er le compte");
		contentPane.add(btnCrerLeCompte, "4, 22, right, default");

		**/
	}

}
