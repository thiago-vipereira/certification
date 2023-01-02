/**
 * 
 */
package capitulo6.conteudo1Lambda;

import java.util.ArrayList;
import java.util.List;

import utils.Utils;

/**
 * @author Thiago.Pereira
 *
 */
public class Conteudo1Lambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Utils.separador("Writing Simple Lambdas");

		// list of animals
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		// pass class that does check
		print(animals, new CheckIfHopper());
		// pass by lambda
		print(animals, a -> a.canSwim());
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {

			// the general check
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}

}
