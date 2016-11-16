/**
 * @author Rose
 * This homework will teach you how to use Arrays and Strings.
 * REFER TO:
 * https://docs.oracle.com/javase/7/docs/api/java/lang/reflect/Array.html
 * https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 */

package FirstPackage;

/* (big 'A') Arrays is inherently different from (little 'a') arrays. 
 * You do NOT need to import Arrays in order to use arrays. We're just
 * importing Arrays in order to do cool stuff with our arrays.
 */
import java.util.Arrays;
import java.util.Random;


public class FifthClass {

	public static void main(String[] args) {

		/* each of the following arrays have a size of 10 (they can hold 10 numbers).
		 * there are multiple ways to initialize an array: 
		 */
		int[] a1 = new int[10];
		int[] a2 = { 0, 10 };
		int[] a3 = { 41, 13, 33, 25, 7, 20, 16, 4, 35, 19 };
		/* index #    0   1   2  3   4   5   6  7   8   9  */

		
		// TASK #1: write the code that will write 10 random numbers to a1
		// (hint: both arrays and Strings begin counting at index 0
		Random rand = new Random();
		for(int i = 0; i < a1.length; i++){
			/*insert your code here*/
		}
		
		
		
		// TASK #2: write the code that will print out every odd number in a2
		// (hint: you will need a for loop)
		
		
		
		// TASK #3: write the code that will sort a3 from smallest to largest value
		// (hint: look at Arrays on the API)
		
		/* in this case, we're using Arrays to print the array as a String value. */
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		
		
		
		
		/* there are two ways to initialize Strings;
		 * s1's initialization is the "normal" way to do it:
		 */
		String s1 = "";
		String s2 = new String("");
	}

}
