/**
 * 
 */
package capitulo5;

import utils.Utils;

/**
 * @author Thiago.Pereira
 *
 */
public class Conteudo1String {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Utils.separador("String + int");

		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c
		System.out.println("c" + 1 + 2); // c12
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); //64
		
		Utils.separador("using +=");
		
		String s = "1"; // s currently holds "1"
		s += "2"; // s currently holds "12"
		s += 3; // s currently holds "123"
		System.out.println(s); // 123
		
		Utils.separador("concat");
		
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2); //12

		Utils.separador("charAt");
		
		String string = "animals";
		System.out.println(string.length()); // 7
		
		System.out.println(string.charAt(0)); // a
		System.out.println(string.charAt(6)); // s
		//System.out.println(string.charAt(7)); // throws exception
		//java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		
		Utils.separador("indexOf");
		
		System.out.println(string.indexOf('a')); // 0
		System.out.println(string.indexOf("al")); // 4
		System.out.println(string.indexOf('a', 4)); // 4
		System.out.println(string.indexOf("al", 5)); // -1

		Utils.separador("substring");
		
		// a n i m a l s
		//0 1 2 3 4 5 6 7
		System.out.println(string.substring(3)); // mals
		System.out.println(string.substring(string.indexOf('m'))); // mals
		System.out.println(string.substring(3, 4)); // m
		System.out.println(string.substring(3, 7)); // mals
		System.out.println(string.substring(3, 3)); // empty string
		//System.out.println(string.substring(3, 2)); // throws exception
		//java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 7
		//System.out.println(string.substring(3, 8)); // throws exception
		//java.lang.StringIndexOutOfBoundsException: begin 3, end 8, length 7

		Utils.separador("toUpperCase and toLowerCase");
		
		System.out.println(string.toUpperCase()); // ANIMALS
		System.out.println("Abc123".toLowerCase()); // abc123
		
		Utils.separador("equals and equalsIgnoreCase");
		
		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true
		System.out.println("abc".equalsIgnoreCase("ABC")); // true
		
		Utils.separador("startsWith and endsWith");
		
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false

		Utils.separador("replace");
		
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc
		
		Utils.separador("contains");
		
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false
		
		Utils.separador("trim and strip");
		
		System.out.println("abc".strip()); // abc
		System.out.println("\t a b c\n".strip()); // a b c
		String text = " abc\t ";
		System.out.println(text.trim().length()); // 3
		System.out.println(text.strip().length()); // 3
		System.out.println(text.stripLeading().length()); // 5
		System.out.println(text.stripTrailing().length());// 4
		
		Utils.separador("immutable");
		
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}
	
}
