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
		affiche("Pour afficher la liste des voitures : AfficheList");
		affiche("Pour afficher la liste des assurances : AfficheAssurance");
		affiche("Pour louer une voiture, Louer + numéro de la voiture(voir liste des voitures)");
	}
	
	private class ReadInput implements Runnable{
		public void run() {
			while(true){
				try{
					String c = sc.next();
					int i = sc.nextInt();
					int j = sc.nextInt();
					switch(c){
						case "AfficheList" :
							Voiture [] tempVoit = model.getListVoitureDisp();
							for (Voiture voiture : tempVoit) {
								System.out.println(voiture);
							}
							printHelp();
							//controller.rendreLivre(i);
							break;
						case "AfficheAssurance" :
							Assurance [] tempAssur = model.getAssurance();
							for (Assurance assur : tempAssur) {
								System.out.println(assur);
							}
							printHelp();
						case "Louer" : 
							model.createLocation(i, j);
							//controller.emprunteLivre(i);
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
