

package co.simplon.test;


public class anagrame {

	
	public static void main(String[] args) {
			
			
	
			String valeur = "abcd";
			
			char[] tabCaracteres = valeur.toCharArray();
			
			for(int i = 0; i < tabCaracteres.length ; i++)
		
			{
				for (int j = 0; j < tabCaracteres.length; j++)
				{
					if(i == j) {
						continue;
					}
					
					String resultat = "";
					
					for(int k=0; k < tabCaracteres.length ; k++)
					{
						if((k != i) && (k != j))
								resultat = resultat + tabCaracteres[k];
						else if (k == i)
							 resultat = resultat + tabCaracteres[j];
						else if (k == j)
							 resultat = resultat + tabCaracteres[i];
					}
					System.out.println(resultat);
				}
			}
	}

}
