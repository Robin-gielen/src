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
		
		//affiche tous le monde
		affiche("Pour afficher les données d'une personne grâce à son ID : A");
		//affiche mes infos
		
		affiche("Pour afficher les données d'une facture grace à son ID : B");
		affiche("Pour afficher toutes les factures d'un client : C + ID du client");
		
		affiche("pour afficher les données d'une location grace à son ID : D");
		affiche("Pour afficher toutes les locations d'un client : E + ID du client");
		
		//affiche une voiture
		affiche("Pour afficher la liste des voitures : F");
		affiche("Pour afficher toutes les voitures louees : G");
		
		affiche("Pour afficher les infos du client qui loue la voiture : H");
		
		affiche("Pour modifier un client : I");
		affiche("Pour supprimer un client de la BDD : J");
		
		affiche("Pour ajouter une voiture à la BDD : K");
		affiche("Pour supprimer une voiture de la BDD : L");
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
							affiche("Les infos de la personne numéro " + client1 + " sont :");
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
							int tempClientID;
							String tempNom;
							String tempPrenom;
							String tempDateInscription;
							String tempDateNaissance; 
							String tempAdresse; 
							String tempAdresseMail;
							affiche("Entrez maintenant l'Id du client à changer:");
							tempClientID = sc.nextInt();
							affiche("Entrez maintenant le nom (changé) du client :");
							tempNom = sc.next();
							affiche("Entrez maintenant le prenom (changé) du client :");
							tempPrenom = sc.next();
							affiche("Entrez maintenant la date d'inscription (changée) du client :");
							tempDateInscription = sc.next();
							affiche("Entrez maintenant la date de naissance (changée) du client :");
							tempDateNaissance = sc.next();
							affiche("Entrez maintenant l'adresse (changée) du client :");
							tempAdresse = sc.next();
							affiche("Entrez maintenant l'adresse mail (changée) du client :");
							tempAdresseMail = sc.next();
							if (model.alterClient(tempClientID, tempNom, tempPrenom, tempDateInscription, tempDateNaissance, tempAdresse, tempAdresseMail) == 1) {
								System.out.println("Client modifié");
							}
							else if (model.alterClient(tempClientID, tempNom, tempPrenom, tempDateInscription, tempDateNaissance, tempAdresse, tempAdresseMail) == 0) {
								System.out.println("Client pas modifié");
							}
							else if (model.alterClient(tempClientID, tempNom, tempPrenom, tempDateInscription, tempDateNaissance, tempAdresse, tempAdresseMail) == -1) {
								System.out.println("Problème connexion à la BDD");
							}
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
							double tempPrix;
							String tempMarque;
							String tempModele;
							int tempAnnee; 
							String tempCarburant; 
							String tempCouleur; 
							String tempType;
							String tempEstManuelleS; 
							boolean tempEstManuelle;
							int tempRoueMotrice; 
							long tempKilometrage; 
							double tempVolumeCoffre; 
							double tempHauteur; 
							double tempPoids; 
							String tempNote; 
							int tempAgenceId; 
							affiche("Entrez maintenant le prix de la futur voiture :");
							tempPrix = sc.nextDouble();
							affiche("Entrez maintenant la marque de la futur voiture :");
							tempMarque = sc.next();
							affiche("Entrez maintenant le modele de la futur voiture :");
							tempModele = sc.next();
							affiche("Entrez maintenant l'année de mise en circulation de la futur voiture :");
							tempAnnee = sc.nextInt();
							affiche("Entrez maintenant le carburant de la futur voiture :");
							tempCarburant = sc.next();
							affiche("Entrez maintenant la couleur de la futur voiture :");
							tempCouleur = sc.next();
							affiche("Entrez maintenant le type de la futur voiture :");
							tempType = sc.next();
							affiche("Entrez maintenant si la voiture est manuelle (true) ou automatique (false) :");
							tempEstManuelleS = sc.next();
							affiche("Entrez maintenant le nombre de roues motrices de la futur voiture :");
							tempRoueMotrice = sc.nextInt();
							affiche("Entrez maintenant le kilométrage de la futur voiture :");
							tempKilometrage = sc.nextLong();
							affiche("Entrez maintenant le volume du coffre de la futur voiture :");
							tempVolumeCoffre = sc.nextDouble();
							affiche("Entrez maintenant la hauteur de la futur voiture :");
							tempHauteur = sc.nextDouble();
							affiche("Entrez maintenant le poids de la futur voiture :");
							tempPoids = sc.nextDouble();
							affiche("Entrez maintenant la note de la futur voiture :");
							tempNote = sc.next();
							affiche("Entrez maintenant l'agenceID ou sera la futur voiture :");
							tempAgenceId = sc.nextInt();
							if(tempEstManuelleS.equals("TRUE")) {
								tempEstManuelle = true; 
							}
							else tempEstManuelle = false;
							model.addVoiture(tempPrix, tempMarque, tempModele, tempAnnee, tempCarburant, tempCouleur, tempType, tempEstManuelle, tempRoueMotrice, tempKilometrage, tempVolumeCoffre, tempHauteur, tempPoids, tempNote, tempAgenceId);
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
