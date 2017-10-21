/**
 * 
 */
package co.simplon.test;



public class Main {

	
	public static void main(String[] args) {
		
			String temps = "beau";
			testif(temps);
			long debutProgramme = System.currentTimeMillis();
			System.out.println(System.currentTimeMillis());
		
			//test if
		
			
	
				//beau
				//pluvieux
				//neigeux
		//if(condition){
		//	code si condition est vrai.
		//} else {
		//	code si condition est fausse.
		//}
	
		
		
		
				/*if(temps.equals("pluvieux")) {
					
					System.out.println("Prendre un chapeau");
				} else if (temps.equalsIgnoreCase("beau")) {
					
					System.out.println("Prendre un parapluie");*/
			
			
			// test for
			
			int[] tab = {1,12,3,4,5};
			int valeurCherchee = 5;
		
			testFor(tab, valeurCherchee);
			
			int[] tab2 = {1,12,3,4,5,6,7};
			int valeurCherchee2 = 7;
		
			
			
			System.out.println("delta : " + (System.currentTimeMillis() - debutProgramme));
					
					
				}
	
				public static void testif (String temps) {
					
					System.out.println("Appel de la fonction testif avec "+ temps);
					
					if(temps.equals("pluvieux")) {
						
						System.out.println("Prendre un chapeau");
						
					} else if (temps.equalsIgnoreCase("beau")) {
						
						System.out.println("Prendre un parapluie");
						
					} else 
						System.out.println("Prendre autre chose de plus chaud");
				
					
			
	}
				
				
				
				public static void testFor (int[] tabDeValeurs, int recherche) {
					
					System.out.println("Appel de la fonction testFor avec " + tabDeValeurs + " & " + recherche);
					System.out.println("Parcours du tableau");
					
					for (int i=0; i < tabDeValeurs.length; i++) {
						
						if (tabDeValeurs[i] > 10) {
							System.out.println("Valeur "+ tabDeValeurs[i] + " à eviter car supérieur à 10");
							continue;
						}
						
						if(tabDeValeurs[i] == recherche)
						
						System.out.println(" - element " + i + " : " + tabDeValeurs[i]);
						//break;
					
					else 
						continue;
					
						
						System.out.println("Suite d'instructions....");
					
				}
				}

}
