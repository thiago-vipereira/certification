/**
 * 
 */
package capitulo6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import utils.Utils;

/**
 * @author Thiago.Pereira
 *
 */
public class Conteudo3Variables {

	/**
	 * String - color
	 */
	private static String color;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Utils.separador("PARAMETER LIST");

		// tipo String
		Predicate<String> p1 = x -> true;
		Predicate<String> p2 = (var x) -> true;
		Predicate<String> p3 = (String x) -> true;

		// tipo Integer
		Consumer<Integer> consumer = (var x) -> System.out.println(x);
		consumer.accept(123);

		// tipo Integer
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.sort((var x, var y) -> x.compareTo(y));

		System.out.println(list.toString());

		Utils.separador("LOCAL VARIABLES INSIDE THE LAMBDA BODY");

		// (a, b) -> { int c = 0; return 5;} // COMPILE
		// (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE

		int b = 1;
		Predicate<Integer> pred1 = a -> {
			// int b = 0; variavel ja declarada
			int c = 0;
			return b == c;
		};

		Utils.separador("VARIABLES REFERENCED FROM THE LAMBDA BODY");

		// Variable Type     - Rule
		// --------------------------------
		// Instance variable - Allowed
		// Static variable   - Allowed
		// Local variable    - Allowed if effectively final
		// Method parameter  - Allowed if effectively final
		// Lambda parameter  - Allowed

		// Parametros de metodo e variaveis locais podem ser referenciados se eles
		// são efetivamente finais (final)
		String volume = "loudly";
		Consumer<String> consumer2 = s -> System.out.println(args[0] + " says " + volume + " that she is " + color);

		String name = "Caty";
		color = "black";

		// volume = "z";
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		// Local variable volume defined in an enclosing scope must be final or
		// effectively final
		Consumer<String> consumer3 = s -> System.out.println(name + " says " + volume + " that she is " + color);
		color = "softly";

	}

}
