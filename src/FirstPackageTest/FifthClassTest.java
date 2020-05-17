package FirstPackageTest;

//import static org.junit.Assert.*;
//
//import org.junit.Assert;
//import org.junit.Test;

import FirstPackage.FifthClass;

public class FifthClassTest {

	String firstTry = "racecar",
			secondTry = "suitcase",
			thirdTry = "rubber",
			fourthTry = "A Santa at NASA",
			fifthTry = "tattarrattat ",
			sixthTry = "evitative",
			seventhTry = "Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned.",
			eigthTry = "Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned. But tub, Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned.",
			ninthTry = "God! A red nugget! A fat egg under a dog!";
	

	private static boolean testIsPalindrome(String testString) {

		boolean result = FifthClass.isPalindrome(testString.replaceAll("[^a-zA-Z]", ""));
		
		return result;
	}

//	@Test
//	public void firstPalindromeTest(){
//
//		Assert.assertTrue(testIsPalindrome(firstTry));
//	}
//
//	@Test
//	public void secondPalindromeTest(){
//
//		Assert.assertTrue(testIsPalindrome(secondTry));
//	}
//
//	@Test
//	public void thirdPalindromeTest(){
//
//		Assert.assertTrue(testIsPalindrome(thirdTry));
//	}
//
//	@Test
//	public void fourthPalindromeTest(){
//
//		Assert.assertTrue(testIsPalindrome(fourthTry));
//	}
//
//	@Test
//	public void fifthPalindromeTest(){
//
//		Assert.assertTrue(testIsPalindrome(fifthTry));
//	}
//
//	@Test
//	public void sixthPalindromeTest(){
//
//		Assert.assertTrue(testIsPalindrome(sixthTry));
//	}
//
//	@Test
//	public void seventhPalindromeTest(){
//
//		Assert.assertTrue(testIsPalindrome(seventhTry));
//	}
//
//	@Test
//	public void eigthPalindromeTest(){
//
//		Assert.assertTrue(testIsPalindrome(eigthTry));
//	}
//
//	@Test
//	public void ninthPalindromeTest(){
//
//		Assert.assertTrue(testIsPalindrome(ninthTry));
//	}
//
	
}
