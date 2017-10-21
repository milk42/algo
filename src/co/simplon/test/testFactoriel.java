
package co.simplon.test;


public class testFactoriel {

	public static void main(String[] args) {
	
		int valeur = 5;
		int resultat = 1;
		
		
		for(int i = 1; i <= valeur; i++) 
			resultat = resultat * i;
		
		System.out.println("resultat : " + resultat);
		System.out.println("resultat : "+ factoriel(valeur));
		
	}
	
		public static int factoriel(int nombre) {
			
			System.out.println("appel de la fonction factoriel avec "+ nombre);
			
				if(nombre == 1) {
			return nombre;
		
			
			}else {
				
				return nombre * factoriel(nombre - 1);
			}
				
		}	
		}

