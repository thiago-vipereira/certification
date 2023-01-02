/**
 * 
 */
package capitulo5;

import utils.Utils;

/**
 * @author Thiago.Pereira
 *
 */
public class Conteudo3Equality {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Utils.separador("EQUALS() AND == ");

		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true

		String x = "Hello World";
		String z = " Hello World".trim();
		System.out.println(x.equals(z)); // true

		Conteudo3Equality t1 = new Conteudo3Equality();
		Conteudo3Equality t2 = new Conteudo3Equality();
		Conteudo3Equality t3 = t1;
		System.out.println(t1 == t3); // true
		System.out.println(t1 == t2); // false
		System.out.println(t1.equals(t2)); // false

		String string = "a";
		StringBuilder builder = new StringBuilder("a");
		// System.out.println(string == builder); //DOES NOT COMPILE, they are different types.

		Utils.separador("STRING POOL");

		String a = "Hello World";
		String b = "Hello World";
		System.out.println(a == b); // true

		// Remember that Strings are immutable and literals are pooled

		// Although c and d happen to evaluate to the same string, one is computed at RUNTIME.
		String c = "Hello World";
		String d = " Hello World".trim();
		System.out.println(c == d); // false
		
		String singleString = "hello world";
		String concat = "hello ";
		concat += "world";
		System.out.println(singleString == concat); // false

		String e = "Hello World";
		String f = new String("Hello World");
		System.out.println(e == f); // false
		
		String name = "Hello World";
		String name2 = new String("Hello World").intern();
		System.out.println(name == name2); // true
		// The intern() method will use an object in the string pool if one is present.
		
		String first = "rat" + 1;
		String second = "r" + "a" + "t" + "1";
		String third = "r" + "a" + "t" + new String("1");
		System.out.println(first == second); // true
		System.out.println(first == second.intern()); // true
		System.out.println(first == third); // false
		System.out.println(first == third.intern()); // true

	}

}
