/**
 * 
 */
package capitulo5;

import utils.Utils;

/**
 * @author Thiago.Pereira
 *
 */
public class Conteudo7MathAPIs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Utils.separador("MIN() AND MAX()");

		int first = Math.max(3, 7); // 7
		System.out.println(first);
		int second = Math.min(7, -9); // -9
		System.out.println(second);
		
		Utils.separador("ROUND()");
		
		long low = Math.round(123.45); // 123
		System.out.println(low);
		long high = Math.round(123.50); // 124
		System.out.println(high);
		int fromFloat = Math.round(123.477f); // 123
		System.out.println(fromFloat);

		Utils.separador("POW()");
		
		double squared = Math.pow(5, 2); // 25.0
		System.out.println(squared);
		
		Utils.separador("RANDOM()");
		
		double num = Math.random();
		System.out.println(num);
	}

}
