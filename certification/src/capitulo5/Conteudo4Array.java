/**
 * 
 */
package capitulo5;

import java.util.Arrays;

import utils.Utils;

/**
 * @author Thiago.Pereira
 *
 */
public class Conteudo4Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Utils.separador("ARRAY OF PRIMITIVES");

		int[] numbers1 = new int[3]; // An empty array
		int[] numbers2 = new int[] { 42, 55, 99 }; // An initialized array
		int[] numbers3 = { 42, 55, 99 }; // anonymous array

		// You can type the [] before or after the name, and adding a space is optional.
		// This means that all five of these statements do the exact same thing:
		int[] numAnimals;
		int[] numAnimals2;
		int[] numAnimals3;
		int numAnimals4[];
		int numAnimals5[];

		Utils.separador("MULTIPLE “ARRAYS” IN DECLARATIONS");

		int[] ids, types; // ok
		// int ids[], types; not ok

		Utils.separador("CREATING AN ARRAY WITH REFERENCE VARIABLES");

		String[] bugs = { "cricket", "beetle", "ladybug" };
		String[] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString()); // [Ljava.lang.String;@1e643faf
		System.out.println(Arrays.toString(bugs));// [cricket, beetle, ladybug]

		String names[] = new String[2];
		// System.out.println(names[2]); // java.lang.ArrayIndexOutOfBoundsException

		Utils.separador("CASTING");

		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		// againStrings[0] = new StringBuilder(); // DOES NOT COMPILE

		// objects[0] = new StringBuilder();
		// We have a String[] referred to from an Object[] variable. At runtime, the
		// code throws an ArrayStoreException.

		Utils.separador("USING AN ARRAY");

		String[] birds = new String[6];
		System.out.println(birds.length); // 6 and all six elements of the array are null

		Utils.separador("SORTING");

		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		Arrays.toString(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

		// pula linha
		System.out.println();

		String[] stringsSort = { "10", "9", "100" };
		Arrays.sort(stringsSort);
		for (String string : stringsSort)
			System.out.println(string + " ");

		Utils.separador("SEARCHING");

		// Java also provides a convenient way to search—but only if the array is
		// already sorted
		int[] numbersSearch = { 2, 4, 6, 8 };
		System.out.println(Arrays.binarySearch(numbersSearch, 2)); // 0
		System.out.println(Arrays.binarySearch(numbersSearch, 4)); // 1
		System.out.println(Arrays.binarySearch(numbersSearch, 1)); // -1
		System.out.println(Arrays.binarySearch(numbersSearch, 3)); // -2
		System.out.println(Arrays.binarySearch(numbersSearch, 9)); // -5

		int[] numbersSearch2 = new int[] { 3, 2, 1 };
		System.out.println(Arrays.binarySearch(numbersSearch2, 2));
		System.out.println(Arrays.binarySearch(numbersSearch2, 3));

		Utils.separador("COMPARING");

		// A negative number means the first array is smaller than the second.
		// A zero means the arrays are equal.
		// A positive number means the first array is larger than the second.

		System.out.println(Arrays.compare(new int[] { 1 }, new int[] { 2 }));

		System.out.println(Arrays.compare(new int[] { 4, 3 }, new int[] { 1, 2, 3 }));

		System.out.println(Arrays.compare(new int[] { 1, 2 }, new int[] { 1 }));
		System.out.println(Arrays.compare(new String[] { "a" }, new String[] { "aa" }));
		System.out.println(Arrays.compare(new String[] { "a" }, new String[] { "A" }));
		System.out.println(Arrays.compare(new String[] { "a" }, new String[] { null }));

		Utils.separador("mismatch");

		// If the arrays are equal, mismatch() returns -1. Otherwise, it returns the
		// first index where they differ
		System.out.println(Arrays.mismatch(new int[] { 1 }, new int[] { 1 })); // -1
		System.out.println(Arrays.mismatch(new String[] { "a" }, new String[] { "A" })); // 0
		System.out.println(Arrays.mismatch(new int[] { 1, 2 }, new int[] { 1 })); // 1
		
		Utils.separador("Using a Multidimensional Array");
		
		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " "); // print element
			System.out.println(); // time for a new row
		}
		
		System.out.println();
		
		for (int[] inner : twoD) {
			for (int num : inner)
				System.out.print(num + " ");
			System.out.println();
		}

	}
}
