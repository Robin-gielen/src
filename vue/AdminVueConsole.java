package vue;
import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import controller.AdminController;
import model.Admin;
import model.Facture;
import model.Location;
import model.Voiture;



public class AdminVueConsole extends AdminVue implements Observer {
	protected Scanner sc;
	
	public AdminVueConsole(Admin model,
			AdminController controller) {
		super(model, controller);
		update(null, null);
		sc = new Scanner(System.in);
		new Thread (new ReadInput()).start();	
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(model);
		printHelp();
		
	}
	

	private void printHelp(){
		affiche("Pour afficher les données d'un client grâce à son ID : A");
		
		affiche("Pour afficher les données d'une facture grace à son ID : B + ID de la facture");
		affiche("Pour afficher toutes les factures d'un client : C + ID du client");
		
		affiche("pour afficher les données d'une location grace à son ID : D + ID de la location");
		affiche("Pour afficher toutes les locations d'un client : E + ID du client");
		
		affiche("Pour afficher la liste des voitures : F");
		affiche("Pour afficher toutes les voitures louees : G");
		
		affiche("Pour afficher l'ID du client qui loue la voiture : H");
		
		affiche("Pour modifier un client : I + ID du client");
		affiche("Pour supprimer un client de la BDD : J + ID du client");
		
		affiche("Pour ajouter une voiture à la BDD : K + ID du client");
		affiche("Pour supprimer une voiture de la BDD : L + ID de la voiture");
	}
	
	private class ReadInput implements Runnable{
		public void run() {
			while(true){
				try{
					String c = sc.next();
					if(c.length()!=1){
						affiche("Format d'input incorrect");
						printHelp();
					}
					switch(c){
						case "A" :
							affiche("Entrez maintenant l'ID du client :");
							int client1 = sc.nextInt();
							affiche("Les infos du client numéro " + client1 + " sont :");
							System.out.println(model.getClient(client1));
							printHelp();
							break;
						case "B" : 
							affiche("Entrez maintenant l'ID de la facture :");
							int fact1 = sc.nextInt();
							affiche("Les infos de la facture numéro " + fact1 + " sont :");
							System.out.println(model.getFacture(fact1));
							printHelp();
							break;
						case "C" :
							affiche("Entrez maintenant l'ID du client :");
							int clientFact1 = sc.nextInt();
							affiche("Les factures du client numéro " + clientFact1 + " sont :");
							Facture [] tempFacture = model.getFacturesClient(clientFact1);
							if (tempFacture != null) {
								for (Facture facture : tempFacture) {
									System.out.println(facture);
								}
							}
							printHelp();
							break;
						case "D" :
							affiche("Entrez maintenant l'ID de la location :");
							int loc1 = sc.nextInt();
							affiche("Les infos de la location numéro " + loc1 + " sont :");
							System.out.println(model.getLocation(loc1));
							printHelp();
							break;
						case "E" :
							affiche("Entrez maintenant l'ID du client :");
							int clientLoc1 = sc.nextInt();							
							affiche("Les locations du client numéro " + clientLoc1 + " sont :");
							Location [] tempLocation = model.getLocationsClient(clientLoc1);
							if(tempLocation != null) {
								for (Location location : tempLocation) {
									System.out.println(location);
								}
							}
							printHelp();
							break;
						case "F" :
							Voiture [] tempVoiture = model.getListVoit();
							for (Voiture voiture : tempVoiture) {
								System.out.println(voiture);
							}
							printHelp();
							break;
						case "G" :
							Voiture [] tempVoiture2 = model.getListVoitLouees();
							for (Voiture voiture : tempVoiture2) {
								System.out.println(voiture);
							}
							printHelp();
							break;
						case "H" :
							int clientLoc2 = sc.nextInt();
							System.out.println(model.getClientIDFromVoitID(clientLoc2));
							printHelp();
							break;
						case "I" :
							//model.alterClient(clientID, nom, prenom, dateInscription, dateNaissance, adresse, adresseMail);
							printHelp();
							break;
						case "J" :
							affiche("Entrez maintenant l'ID du client :");
							int client2 = sc.nextInt();
							int tempInt1 = model.rmClient(client2);
							if( tempInt1 == 1) {
								affiche("Client retiré");
							}
							else if (tempInt1 == 0) {
								affiche("Client non retiré");
							}
							else if (tempInt1 == -1) {
								affiche("Problème de connexion à la BDD");
							}
							printHelp();
							break;
						case "K" :
							//model.addVoiture(prix, marque, modele, annee, carburant, couleur, type, estManuelle, roueMotrice, kilometrage, volumeCoffre, hauteur, poids, note, agenceID);
							printHelp();
							break;
						case "L" :
							affiche("Entrez maintenant l'ID de la voiture :");
							int voit1 = sc.nextInt();
							int tempInt2 = model.rmVoiture(voit1);
							if( tempInt2 == 1) {
								affiche("Voiture retirée");
							}
							else if (tempInt2 == 0) {
								affiche("Voiture non retirée");
							}
							else if (tempInt2 == -1) {
								affiche("Problème de connexion à la BDD");
							}
							printHelp();
							break;
						default : 
							affiche("OpÃ©ration incorrecte");
							printHelp();
					}
				}
				catch(InputMismatchException e){
					affiche("Format d'input incorrect");
					printHelp();
				}
			}
		}
	}


	@Override
	public void affiche(String string) {
		System.out.println(string);
		
	}

}
