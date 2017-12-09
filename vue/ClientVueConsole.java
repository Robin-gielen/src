package vue;

import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import controller.ClientController;
import model.Assurance;
import model.Client;
import model.Voiture;



public class ClientVueConsole extends ClientVue implements Observer {
	protected Scanner sc;
	
	public ClientVueConsole(Client model,
			ClientController controller) {
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
		affiche("Pour afficher la liste des voitures dispo : A");
		affiche("Pour afficher la liste des voitures louées: B");
		affiche("Pour afficher l'ID de la location : C");
		affiche("Pour afficher le tarif d'une voiture : D");
		affiche("Pour afficher la liste des assurances : E");
		affiche("Pour louer une voiture : F");
		
		
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
							Voiture [] tempVoit = model.getListVoitureDisp();
							for (Voiture voiture : tempVoit) {
								System.out.println(voiture);
							}
							printHelp();
							break;
						case"B" :
							model.setClientID(1);
							Voiture [] tempVoit2 = model.getListVoitureLouees();
							if (tempVoit2 != null) {
								for (Voiture voiture : tempVoit2) {
									System.out.println(voiture);
								}
							}
							printHelp();
							break;
						case"C" : 
							affiche("Entrez maintenant le numéro de la voiture louee dont vous souhaitez l'ID de la location");
							int voit1 = sc.nextInt();
							System.out.println("locationID pour la voiture numéro "+ voit1 + " : "+model.getLocationID(voit1));
							printHelp();
							break;
						case"D" :
							affiche("Entrez maintenant le numéro de la voiture choisie :");
							int voitID = sc.nextInt();
							affiche("Entrez maintenant le numéro de l'assurance choisie :");
							int assurID = sc.nextInt();
							System.out.println("Le prix de la voiture numéro " + voitID + " avec l'assurance " + assurID + " est de : " + model.getTarif(voitID, assurID));
							printHelp();
							break;
						case "E" :
							Assurance [] tempAssur = model.getAssurance();
							for (Assurance assur : tempAssur) {
								System.out.println(assur);
							}
							printHelp();
							break;
						case "F" : 
							model.setClientID(1);
							affiche("Entrez maintenant le numéro de la voiture choisie :");
							int voitID2 = sc.nextInt();
							affiche("Entrez maintenant le numéro de l'assurance choisie :");
							int assurID2 = sc.nextInt();
							int tempResult = model.createLocation(voitID2, assurID2);
							if (tempResult == 1) {
								System.out.println("Voiture louee ok");
							}
							else if (tempResult == 0) {
								System.out.println("Voiture louee pas ok");
							}
							else if (tempResult == -1) {
								System.out.println("Probleme co BDD");
							}
							else if (tempResult == -2) {
								System.out.println("Voiture déjà louee");
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
