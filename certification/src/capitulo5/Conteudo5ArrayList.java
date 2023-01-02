/**
 * 
 */
package capitulo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import utils.Utils;

/**
 * @author Thiago.Pereira
 *
 */
public class Conteudo5ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Utils.separador("ArrayList");

		ArrayList list1 = new ArrayList(); // ArrayList<Object>
		list1.add("teste");
		list1.add(1);

		System.out.println(list1.toString());

		var list2 = new ArrayList<>(); // ArrayList<Object>
		list2.add("teste");
		list2.add(1);
		System.out.println(list2.toString());

		List<String> list3 = new ArrayList<>();
		// ArrayList<String> list3 = new List<>(); // DOES NOT COMPILE, List is an
		// interface

		Utils.separador("add()");

		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.add(Boolean.TRUE); // [hawk, true]
		System.out.println(list); // [hawk, true]

		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		// safer.add(Boolean.TRUE); // DOES NOT COMPILE

		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		// birds.add(2, "robin"); // java.lang.IndexOutOfBoundsException Index: 2, Size: 1
		birds.add(1, "robin"); // [hawk, robin]
		birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		System.out.println(birds); // [blue jay, cardinal, hawk, robin]

		Utils.separador("remove()");

		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk"); // [hawk]
		birds2.add("hawk"); // [hawk, hawk]
		System.out.println(birds2.remove("cardinal")); // prints false
		System.out.println(birds2.remove("hawk")); // prints true
		System.out.println(birds2.remove(0)); // prints hawk
		System.out.println(birds2); // []
		// birds2.remove(100); // throws an IndexOutOfBoundsException.
		
		Utils.separador("set()");

		List<String> birds3 = new ArrayList<>();
		birds3.add("hawk"); // [hawk]
		System.out.println(birds3.size()); // 1
		birds3.set(0, "robin"); // [robin]
		System.out.println(birds3.size()); // 1
		// birds3.set(1, "robin"); // IndexOutOfBoundsException
		
		Utils.separador("isEmpty() and size()");
		
		List<String> birds4 = new ArrayList<>(10);
		System.out.println(birds4.isEmpty()); // true
		System.out.println(birds4.size()); // 0
		birds4.add("hawk"); // [hawk]
		birds4.add("hawk"); // [hawk, hawk]
		System.out.println(birds4.isEmpty()); // false
		System.out.println(birds4.size()); // 2
		
		Utils.separador("clear()");
		
		List<String> birds5 = new ArrayList<>();
		birds5.add("hawk"); // [hawk]
		birds5.add("hawk"); // [hawk, hawk]
		System.out.println(birds5.isEmpty()); // false
		System.out.println(birds5.size()); // 2
		birds5.clear(); // []
		System.out.println(birds5.isEmpty()); // true
		System.out.println(birds5.size()); // 0
		
		Utils.separador("contains()");
		
		List<String> birds6 = new ArrayList<>();
		birds6.add("hawk"); // [hawk]
		System.out.println(birds6.contains("hawk")); // true
		System.out.println(birds6.contains("robin")); // false
		
		Utils.separador("equals()");
		
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two)); // true
		one.add("a"); // [a]
		System.out.println(one.equals(two)); // false
		two.add("a"); // [a]
		System.out.println(one.equals(two)); // true
		one.add("b"); // [a,b]
		two.add(0, "b"); // [b,a]
		System.out.println(one.equals(two)); // false
		
		Utils.separador("AUTOBOXING AND UNBOXING");
		
		List<Integer> weights = new ArrayList<>();
		Integer w = 50;
		weights.add(w); // [50]
		weights.add(Integer.valueOf(60)); // [50, 60]
		weights.remove(new Integer(50)); // [60]
		double first = weights.get(0); // 60.0
		System.out.println(first);
		
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		Integer h = heights.get(0);
		System.out.println(h);
		//int h = heights.get(0); // NullPointerException
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);
		System.out.println(numbers);
		numbers.remove(new Integer(1));
		System.out.println(numbers);
		
		Utils.separador("CONVERTING BETWEEN ARRAY AND LIST");
		
		List<String> list4 = new ArrayList<>();
		list4.add("hawk");
		list4.add("robin");
		Object[] objectArray = list4.toArray();
		String[] stringArray = list4.toArray(new String[0]);
		list4.clear();
		System.out.println(objectArray.length); // 2
		System.out.println(stringArray.length); // 2
		
		System.out.println();
		
		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list5 = Arrays.asList(array); // returns fixed size list
		System.out.println(list5.size()); // 2
		list5.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		System.out.println(Arrays.toString(array));// [new, test]
		// list5.remove(1); // throws UnsupportedOperationException
		
		System.out.println();

		String[] array2 = { "hawk", "robin" }; // [hawk, robin]
		List<String> list6 = List.of(array2); // CREATES immutable list
		System.out.println(list6.size()); // 2
		array2[0] = "new";
		System.out.println(Arrays.toString(array2)); // [new, robin]
		System.out.println(list6); // [hawk, robin]
		// list6.set(1, "test"); // throws UnsupportedOperationException
		
		Utils.separador("USING VARARGS TO CREATE A LIST");
		
		List<String> fixedSizeList = Arrays.asList("a", "b", "c");
		List<String> expandableList = new ArrayList<>(fixedSizeList);
		
		Utils.separador("SORTING");
		
		List<Integer> numbers2 = new ArrayList<>();
		numbers2.add(99);
		numbers2.add(5);
		numbers2.add(81);
		Collections.sort(numbers2);
		System.out.println(numbers2); // [5, 81, 99]
		
	}
}
