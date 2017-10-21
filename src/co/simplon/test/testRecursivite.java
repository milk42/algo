

package co.simplon.test;


 
public class testRecursivite {
	

	public static void main(String[] args) {
		
		permutation("", "abcd");
		
		public static void permutation (String prefix, String reste)
		
			if (reste.length() == 0) {
				 System.out.println(prefix);
		
			}else {
				
					for(int i = 0; i < reste.length(); i++)

							permutation(prefix + reste.charAt(i), reste.substring(0,i) + reste.substring( i + 1, reste.length()));
					
			}
	
			}

}
