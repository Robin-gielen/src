package vue;
import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import controller.TechnicienController;
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
		affiche("Pour afficher les données d'une voiture grâce à son ID : A");
		affiche("Pour enregistrer le nouveau kilometrage d'une voiture : B");
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
							else affiche("Probleme co BDD"); printHelp(); break;
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