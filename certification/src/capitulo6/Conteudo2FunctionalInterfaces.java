/**
 * 
 */
package capitulo6;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import utils.Utils;

/**
 * @author Thiago.Pereira
 *
 */
public class Conteudo2FunctionalInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Interface - params - return type
		//Comparator - Two    - int
		//Consumer   - One    - void
		//Predicate  - One    - boolean
		//Supplier   - None   - One (type varies)


		Utils.separador("PREDICATE");
		// retorna boolean
		final Predicate<String> predicate = x -> x.isBlank();
		System.out.println(predicate.test(""));
		
		Utils.separador("CONSUMER");
		// void
		final Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("Hello World");
		
		Utils.separador("SUPPLIER");
		// T get()
		Supplier<String> supplier = () -> "default";
		System.out.println(supplier.get());
		
		Utils.separador("COMPARATOR");
		// return INT
		Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();
		System.out.println(comparator.compare("a", "ab"));
	}
	
}
