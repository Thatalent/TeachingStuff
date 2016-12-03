/**
 * @author Rose
 * This homework will teach you how to use Arrays and Strings.
 * YOU WILL NEED TO REFER TO:
 * https://docs.oracle.com/javase/7/docs/api/java/lang/reflect/Array.html
 * https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 * and Google for the first task.
 */

package FirstPackage;

/* (big 'A') Arrays is inherently different from (little 'a') arrays. 
 * You do NOT need to import Arrays in order to use arrays. We're just
 * importing Arrays in order to do cool stuff with our arrays.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FifthClass {

	public static void main(String[] args) {
		
		
		/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ARRAYS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ **/
		
		
		/* both of the following arrays are sized to fit 10 numbers.
		 * there are two ways to initialize an array:
		 */
		int[] a1 = new int[10];
		int[] a2 = { 41, 14, 33, 25, 7, 20, 16, 4, 35, 19 };
		/* index #:   0   1   2  3   4   5   6  7   8   9  */
		
		
		/* in this case, we're using Arrays' toString method to print out the array. */
		// TASK #1: what is happening on line 40? (Google is your friend!)
		System.out.println(Arrays.toString(a1));
		System.out.println("when we don't use Arrays.toString, we get this:\n" + a2);
		
		/**prints out memory location of a2 on your system**/
		
		
		// TASK #2: write the code that will write 10 random numbers to a1
		Random rand = new Random();
		for(int i = 0; i < a1.length; i++){
			/*insert your code here*/
			a1[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(a1));
		/**
		a[0] = (some random number)
		a[1] = (some random number)
		...
		a[9] = (some random number)**/
		
		// TASK #3: write the code that will sort a2 from smallest to largest value
		// (hint: look at Arrays on the API)
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));
		
		
		// TASK #4: write the code that will print out every odd NUMBER in a1
		// (hint: you will need a for loop)
		for(int i = 0; i < a1.length; i++){
			//37%10 = 7
			if( a1[i] % 2 == 1 ){
				System.out.print(a1[i] + "\t");
			}

		}
		System.out.println();
		
		// TASK #5: write the code that will print out every odd INDEX in a1
		for(int i = 1; i < a1.length;){
			System.out.print(a1[i] + "\t");
			
			i = i + 2;
		}
		
		/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~STRINGS AND CHARS~~~~~~~~~~~~~~~~~~~~~~~~~~~~ **/
		
		
		/* there are two ways to initialize Strings;
		 * s1's initialization is the "normal" way to do it:
		 */
		String s1 = "Hello World!";
		String s2 = new String("milk, bread, eggs, flour, sugar");
		//String s3 = 
		
		/* chars are just single characters (or symbols). in Java they are indicated by single quotes.
		 * chars can be converted to single character Strings, 
		 * but Strings longer than 1 character cannot be converted to a char.
		 */
		char c1 = 'k';
		char c2 = '!';
		
		/* Strings can be thought of as arrays of characters.
		 * in the case of s1, the String indices are as follows:
		 * 				H  e  l  l  o     W  o  r  l  d  !
		 * index # :    0  1  2  3  4  5  6  7  8  9  10 11
		 */
		
		// TASK #6: find and print out the char found at the 6th index of s1
		// (hint: look at String's functions on the API)
		System.out.println();
		System.out.println(s1.charAt(6));
		
		
		// TASK #7: write the code that will replace "flour" with "butter" in s2
		System.out.println(/*write code here*/ s2.replace("flour", "butter"));
		
		
		
		/** CHALLENGE
		 * Write the code that will prompt the user for a phrase/word.
		 * Then you will check to see if it is a palindrome.
		 * A palindrome is read backwards the same way it is read forward.
		 * Palindrome examples: "racecar", "kayak", and "a santa at nasa"
		 * Your checker should be able to take in phrases as well as words.
		 * Your checker should ignore spaces and upper cases, eg "Ragu Sugar" should return true.
		 * (hint: at the bare minimum, you will need an input Scanner, 
		 * a while loop with an if statement nested inside, String's .charAt function)
		 * (double hint: take a look at either String's .equalsIgnoreCase function, or 
		 * String's .to____Case functions)
		 **/

	}

}
