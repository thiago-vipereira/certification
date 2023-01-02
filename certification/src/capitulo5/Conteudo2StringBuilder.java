/**
 * 
 */
package capitulo5;

import utils.Utils;

/**
 * @author Thiago.Pereira
 *
 */
public class Conteudo2StringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Utils.separador("StringBuilder is mutable");

		StringBuilder alpha = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++)
			alpha.append(current);
		System.out.println(alpha);

		Utils.separador("A and B is the same object");

		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("A=" + a);
		System.out.println("B=" + b);

		Utils.separador("charAt(), indexOf(), length(), and substring()");

		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);

		Utils.separador("append");

		StringBuilder sb2 = new StringBuilder().append(1).append('c');
		sb2.append("-").append(true);
		System.out.println(sb2); // 1c-true

		Utils.separador("insert");

		StringBuilder sb3 = new StringBuilder("animals");
		sb3.insert(7, "-"); // sb = animals
		sb3.insert(0, "-"); // sb = -animals
		sb3.insert(4, "-"); // sb = -ani-mals
		System.out.println(sb3);

		Utils.separador("delete and deleteCharAt");

		StringBuilder sb4 = new StringBuilder("abcdef");
		sb4.delete(1, 3); // sb = adef
		System.out.println(sb4);
		// sb4.deleteCharAt(5); // throws an exception
		sb4.delete(1, 100); // sb = a
		// If you specify a second parameter that is past the end, Java will just assume
		// you meant the end
		System.out.println(sb4);
		
		Utils.separador("replace");
		
		StringBuilder builder = new StringBuilder("pigeon dirty");
		builder.replace(3, 6, "sty");
		System.out.println(builder); // pigsty dirty
		
		StringBuilder builder2 = new StringBuilder("pigeon dirty");
		builder2.replace(3, 100, "");
		System.out.println(builder2); // pig
		
		Utils.separador("reverse");
		
		StringBuilder builder3 = new StringBuilder("ABC");
		builder3.reverse();
		System.out.println(builder3); // CBA
		
		Utils.separador("toString");

		StringBuilder sb5 = new StringBuilder("ABC");
		String s = sb5.toString();
		System.out.println(s);
	}

}
