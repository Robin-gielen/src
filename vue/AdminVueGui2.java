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

import model.Admin;
import model.Client;

public class AdminVueGui2 extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel infoJPanel;
	private JPanel factureJPanel;
	private JPanel locationJPanel;
	private JPanel voitureJPanel;
	private JPanel clientJPanel;
	private JPanel voitureGestionJPanel;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnValider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin model = new Admin();
					AdminVueGui2 frame = new AdminVueGui2(model);
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
	public AdminVueGui2(Admin model) {
		infoJPanel = new JPanel();
		factureJPanel = new JPanel();
		locationJPanel = new JPanel();
		voitureJPanel = new JPanel();
		clientJPanel = new JPanel();
		voitureGestionJPanel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		
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
				voitureGestionJPanel.setVisible(false);
				getContentPane().add(infoJPanel);
			}
		});
		menuBar.add(btnInfo);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		infoJPanel.setLayout(gridBagLayout);
		
		
		JButton btnFacture = new JButton("Facture");
		btnFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(true);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(false);
				clientJPanel.setVisible(false);
				voitureGestionJPanel.setVisible(false);
				getContentPane().add(factureJPanel);
			}
		});
		menuBar.add(btnFacture);
		
			//Tout le contenu du menu Facture
		
		
		
		JButton btnLocation = new JButton("Location");
		btnLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(true);
				voitureJPanel.setVisible(false);
				clientJPanel.setVisible(false);
				voitureGestionJPanel.setVisible(false);
			}
		});
		menuBar.add(btnLocation);
		
		JButton btnVoiture = new JButton("Voitures");
		btnVoiture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(true);
				clientJPanel.setVisible(false);
				voitureGestionJPanel.setVisible(false);
			}
		});
		menuBar.add(btnVoiture);
		
		JButton btnClient = new JButton("Clients");
		btnClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(true);
				clientJPanel.setVisible(false);
				voitureGestionJPanel.setVisible(false);
			}
		});
		menuBar.add(btnClient);
		
		JButton btnGestionVoiture = new JButton("Gestion Voitures");
		btnGestionVoiture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoJPanel.setVisible(false);
				factureJPanel.setVisible(false);
				locationJPanel.setVisible(false);
				voitureJPanel.setVisible(true);
				clientJPanel.setVisible(false);
				voitureGestionJPanel.setVisible(false);
			}
		});
		menuBar.add(btnGestionVoiture);
		
		//Tout le contenu du menu infos 
		JLabel lblMesInfos = new JLabel("Mes infos :");
		lblMesInfos.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMesInfos = new GridBagConstraints();
		gbc_lblMesInfos.anchor = GridBagConstraints.EAST;
		gbc_lblMesInfos.insets = new Insets(0, 0, 5, 5);
		gbc_lblMesInfos.gridx = 0;
		gbc_lblMesInfos.gridy = 0;
		infoJPanel.add(lblMesInfos, gbc_lblMesInfos);
		
		JTextPane textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 5, 0);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 1;
		gbc_textPane.gridy = 1;
		infoJPanel.add(textPane, gbc_textPane);
		
		JLabel lblInfosDeLa = new JLabel("Infos de la voiture n\u00B0 :");
		GridBagConstraints gbc_lblInfosDeLa = new GridBagConstraints();
		gbc_lblInfosDeLa.anchor = GridBagConstraints.EAST;
		gbc_lblInfosDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosDeLa.gridx = 0;
		gbc_lblInfosDeLa.gridy = 2;
		infoJPanel.add(lblInfosDeLa, gbc_lblInfosDeLa);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		infoJPanel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane_1 = new JTextPane();
		GridBagConstraints gbc_textPane_1 = new GridBagConstraints();
		gbc_textPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_textPane_1.fill = GridBagConstraints.BOTH;
		gbc_textPane_1.gridx = 1;
		gbc_textPane_1.gridy = 3;
		infoJPanel.add(textPane_1, gbc_textPane_1);
		
		JLabel lblInfosSurLe = new JLabel("Infos sur le client n\u00B0 :");
		GridBagConstraints gbc_lblInfosSurLe = new GridBagConstraints();
		gbc_lblInfosSurLe.anchor = GridBagConstraints.EAST;
		gbc_lblInfosSurLe.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosSurLe.gridx = 0;
		gbc_lblInfosSurLe.gridy = 4;
		infoJPanel.add(lblInfosSurLe, gbc_lblInfosSurLe);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 4;
		infoJPanel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JTextPane textPane_2 = new JTextPane();
		GridBagConstraints gbc_textPane_2 = new GridBagConstraints();
		gbc_textPane_2.insets = new Insets(0, 0, 5, 0);
		gbc_textPane_2.fill = GridBagConstraints.BOTH;
		gbc_textPane_2.gridx = 1;
		gbc_textPane_2.gridy = 5;
		infoJPanel.add(textPane_2, gbc_textPane_2);
		
		JLabel lblInfosSurLa = new JLabel("Infos sur la location n\u00B0 :");
		GridBagConstraints gbc_lblInfosSurLa = new GridBagConstraints();
		gbc_lblInfosSurLa.anchor = GridBagConstraints.EAST;
		gbc_lblInfosSurLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosSurLa.gridx = 0;
		gbc_lblInfosSurLa.gridy = 6;
		infoJPanel.add(lblInfosSurLa, gbc_lblInfosSurLa);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 6;
		infoJPanel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JTextPane textPane_3 = new JTextPane();
		GridBagConstraints gbc_textPane_3 = new GridBagConstraints();
		gbc_textPane_3.fill = GridBagConstraints.BOTH;
		gbc_textPane_3.gridx = 1;
		gbc_textPane_3.gridy = 7;
		infoJPanel.add(textPane_3, gbc_textPane_3);
		
		infoJPanel.setVisible(true);
		factureJPanel.setVisible(false);
		locationJPanel.setVisible(false);
		voitureJPanel.setVisible(true);
		clientJPanel.setVisible(false);
		voitureGestionJPanel.setVisible(false);
		
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
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().add(afficheListClient(Integer.parseInt(textField_4.getText()), model));
			}
		});
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.anchor = GridBagConstraints.EAST;
		gbc_btnValider.gridx = 1;
		gbc_btnValider.gridy = 7;
		factureJPanel.add(btnValider, gbc_btnValider);
		
		infoJPanel.setVisible(true);
		getContentPane().add(infoJPanel);
	}
	
	public JPanel afficheListClient(int clientID, Admin model) {
		JPanel tempClientJPanel = new JPanel();
		Client tempClient = model.getClient(clientID);
		
		
		JLabel lblMesInfos = new JLabel("Mes infos :");
		lblMesInfos.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMesInfos = new GridBagConstraints();
		gbc_lblMesInfos.anchor = GridBagConstraints.EAST;
		gbc_lblMesInfos.insets = new Insets(0, 0, 5, 5);
		gbc_lblMesInfos.gridx = 0;
		gbc_lblMesInfos.gridy = 0;
		infoJPanel.add(lblMesInfos, gbc_lblMesInfos);
		
		JTextPane textPane = new JTextPane();
		textPane.setText(tempClient.getClientID()+"");
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 5, 0);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 1;
		gbc_textPane.gridy = 1;
		infoJPanel.add(textPane, gbc_textPane);
		
		JLabel lblInfosDeLa = new JLabel("Infos de la voiture n\u00B0 :");
		GridBagConstraints gbc_lblInfosDeLa = new GridBagConstraints();
		gbc_lblInfosDeLa.anchor = GridBagConstraints.EAST;
		gbc_lblInfosDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosDeLa.gridx = 0;
		gbc_lblInfosDeLa.gridy = 2;
		infoJPanel.add(lblInfosDeLa, gbc_lblInfosDeLa);
		
		textField_1 = new JTextField();
		textField_1.setText(tempClient.getNom());
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		infoJPanel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane_1 = new JTextPane();
		GridBagConstraints gbc_textPane_1 = new GridBagConstraints();
		gbc_textPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_textPane_1.fill = GridBagConstraints.BOTH;
		gbc_textPane_1.gridx = 1;
		gbc_textPane_1.gridy = 3;
		infoJPanel.add(textPane_1, gbc_textPane_1);
		
		JLabel lblInfosSurLe = new JLabel("Infos sur le client n\u00B0 :");
		GridBagConstraints gbc_lblInfosSurLe = new GridBagConstraints();
		gbc_lblInfosSurLe.anchor = GridBagConstraints.EAST;
		gbc_lblInfosSurLe.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosSurLe.gridx = 0;
		gbc_lblInfosSurLe.gridy = 4;
		infoJPanel.add(lblInfosSurLe, gbc_lblInfosSurLe);
		
		textField_2 = new JTextField();
		textField_2.setText(tempClient.getPrenom());
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 4;
		infoJPanel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JTextPane textPane_2 = new JTextPane();
		GridBagConstraints gbc_textPane_2 = new GridBagConstraints();
		gbc_textPane_2.insets = new Insets(0, 0, 5, 0);
		gbc_textPane_2.fill = GridBagConstraints.BOTH;
		gbc_textPane_2.gridx = 1;
		gbc_textPane_2.gridy = 5;
		infoJPanel.add(textPane_2, gbc_textPane_2);
		
		JLabel lblInfosSurLa = new JLabel("Infos sur la location n\u00B0 :");
		GridBagConstraints gbc_lblInfosSurLa = new GridBagConstraints();
		gbc_lblInfosSurLa.anchor = GridBagConstraints.EAST;
		gbc_lblInfosSurLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfosSurLa.gridx = 0;
		gbc_lblInfosSurLa.gridy = 6;
		infoJPanel.add(lblInfosSurLa, gbc_lblInfosSurLa);
		
		textField_3 = new JTextField();
		textField_3.setText(tempClient.getAdresse());
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 6;
		infoJPanel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JTextPane textPane_3 = new JTextPane();
		GridBagConstraints gbc_textPane_3 = new GridBagConstraints();
		gbc_textPane_3.fill = GridBagConstraints.BOTH;
		gbc_textPane_3.gridx = 1;
		gbc_textPane_3.gridy = 7;
		infoJPanel.add(textPane_3, gbc_textPane_3);
		return tempClientJPanel;
		
	}
}