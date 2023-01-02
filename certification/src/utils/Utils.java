/**
 * 
 */
package utils;

/**
 * @author Thiago.Pereira
 *
 */
public class Utils {

	/**
	 *  separador
	 *  
	 */
	public static void separador() {
		separador(null);
	}
	
	/**
	 * separador
	 * 
	 * @param pValue
	 */
	public static final void separador(final String pValue) {
		
		System.out.println("");
		
		final StringBuilder sb = new StringBuilder("--");
		
		if(pValue != null) {
			sb.append(pValue);
		}
		
		while(sb.length() < 48) {
			sb.append("-");
		}
		
		System.out.print(sb.toString());
		System.out.println("------------------------------------------------");
		//System.out.println("");
	}
	
}
