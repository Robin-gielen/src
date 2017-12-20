package vue;

import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import controller.TechnicienController;
import model.Facture;
import model.Location;
import model.Technicien;



public class TechnicienVueConsole extends TechnicienVue implements Observer {
	protected Scanner sc;
	
	public TechnicienVueConsole(Technicien model,
			TechnicienController controller) {
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
		affiche("");
		affiche("");
		affiche("");
		affiche("");
		affiche("");
		affiche("");
		affiche("Pour afficher les donn�es d'une voiture gr�ce � son ID : A");
		
		affiche("Pour enregistrer le nouveau kilometrage d'une voiture : B");
		
		affiche("Pour cr�er une nouvelle facture : C");
		
		affiche("Pour afficher les donn�es d'une facture : D");
		affiche("Pour afficher les factures d'un client : E");
		
		affiche("Pour afficher les donn�es d'une location : F");
		affiche("Pour afficher les locations d'un client : G");
		
		affiche("Pour changer le statut de l'accompte d'une location : H");
		
		affiche("Pour changer la note d'une facture : I");
		
		affiche("Pour afficher toutes vos infos : J");
		
		affiche("Pour afficher les donn�es d'un client : K");
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
							affiche("Entrez maintenant l'ID de la voiture :");
							int voiture1 = sc.nextInt();
							affiche("Les infos de la voiture numéro " + voiture1 + " sont :");
							System.out.println(model.getVoiture(voiture1));
							printHelp();
							break;
						case "B" : 
							affiche("Entrez maintenant l'ID de la voiture :");
							int voiture2 = sc.nextInt();
							affiche("Entrez maintenant le nouveau kilometrage de la voiture :");
							long kilometrage= sc.nextLong();
							int tempInt = model.setKilometrage(voiture2, kilometrage);
							if (tempInt == 1) {
			                	affiche("Kilometrage mis a jour");
			                	printHelp();
			                	break;
							}
							else if (tempInt == 0) {
								affiche("Kilometrage inférieur au kilométrage précédent");
								printHelp();
								break;
							}
							else if (tempInt == -1) {
				            	affiche("Voiture existe pas");
				            	printHelp();
				            	break;
							}
						case "C" :
							affiche("Entrez maintenant l'ID de la location pour laquelle vous voulez créer une facture :");
							int loc1 = sc.nextInt();
							affiche("Entrez maintenant le statut du payement, TRUE si payé, FALSE si non payé :");
							String tempEstPaye = sc.next();
							boolean tempBool;
							if(tempEstPaye.equals("TRUE")) {
								tempBool = true;
							}
							else {
								tempBool = false;
							}
							int tempInt2 = model.createFacture(loc1, tempBool);
							int loc2 = sc.nextInt();
							affiche("Entrez maintenant le nombre de kilometre supplementaire que le client a fait :");
							int tempInt2 = model.createFacture(loc1, tempBool, "", loc2);
							if (tempInt2 == 1) {
								System.out.println("Facture créé");
							}
							else if (tempInt2 == 0) {
								System.out.println("Problème lors de la création de la facture");
							}
							else System.out.println("Problème de connexion à la BDD");
							printHelp();
							break;
						case "D" : 
							affiche("Entrez maintenant l'ID de la facture :");
							int fact1 = sc.nextInt();
							affiche("Les infos de la facture numéro " + fact1 + " sont :");
							System.out.println(model.getFacture(fact1));
							printHelp();
							break;
						case "E" :
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
						case "F" :
							affiche("Entrez maintenant l'ID de la location :");
							int loc2 = sc.nextInt();
							affiche("Les infos de la location numéro " + loc2 + " sont :");
							System.out.println(model.getLocation(loc2));
							int loc3 = sc.nextInt();
							affiche("Les infos de la location numéro " + loc3 + " sont :");
							System.out.println(model.getLocation(loc3));
							printHelp();
							break;
						case "G" :
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
						case "H" :
							affiche("Entrez maintenant l'ID de la location :");
							int voiture3 = sc.nextInt();
							affiche("Entrez maintenant le nouveau statut TRUE si payée, FALSE si pas payée :");
							String tempEstPaye2 = sc.next();
							boolean tempBool2;
							if(tempEstPaye2.equals("TRUE")) {
								tempBool2 = true;
							}
							else {
								tempBool2 = false;
							}
							if(model.setAccompteStatut(voiture3, tempBool2) == 1) {
								System.out.println("Le statut a été mis à jour");
							}
							else if (model.setAccompteStatut(voiture3, tempBool2) == 0) {
								System.out.println("Problème de connexion à la BDD");
							}
							else System.out.println("Le statut n'a pas pu être mis a jour");
							printHelp();
							break;
						case "I" :
							affiche("Entrez maintenant l'ID de la facture :");
							int fact2 = sc.nextInt();
							affiche("Entrez maintenant la nouvelle note de la voiture");
							String tempString = sc.next();
							if(model.setNote(fact2, tempString) == 1) {
								System.out.println("Note mise à jour");
							}
							else System.out.println("Problème lors de la mise à jour");
							printHelp();
							break;
						case "J" :
							System.out.println(model.getMesInfos());
							printHelp();
							break;
						case "K" :
							affiche("Entrez maintenant l'ID du client :");
							int client2 = sc.nextInt();
							System.out.println(model.getClient(client2));
							break;
						default : 
							affiche("Operation incorrecte");
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
