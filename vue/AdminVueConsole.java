package vue;
import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import controller.AdminController;
import model.Admin;



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
		affiche("Pour supprimer : D + num�ro de voiture");
		affiche("Pour rendre : L + numéro de livre.");
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
					int i = sc.nextInt();
					if(i<0 || i> 30){
						affiche("Numéro de voiture incorrect");
						printHelp(); 
					}
					switch(c){
						case "D" :
							model.rmVoiture(i);
							System.out.println("le test marche R"+i);
							//controller.rendreLivre(i);
							break;
						case "E" : 
							System.out.println("le test marche E"+i);
							//controller.emprunteLivre(i);
							break;
						default : 
							affiche("Opération incorrecte");
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
