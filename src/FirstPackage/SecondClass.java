package FirstPackage;

public class SecondClass {

	public static void main(String[] args) {

		int integer = 10 +2;
		
		int int2 = --integer;
		
		integer = 12;
		
		int int3 = integer--;
		 
		// print r where r= n+3 and n = 2
		
		int n = 2;
		
		int r = LikeSecondClass.addThemUp(n, 3);
		
		System.out.println(r);
		
		//use System.out.println() to print your results
		
		System.out.println(integer);
		System.out.println(int2);
		System.out.println(int3);
		
		// print String s with the value "Hello World"
		String s = "Hello World";
		System.out.println(s);
		// print String sn with the value "11"
		String sn = "11";
		System.out.println(sn);
		// print n where n = int3/3
		float n1 = LikeSecondClass.divideThem(3, 3);
		System.out.println(n1);
		// print the result of n <= int2
		if (n <= 2) {
			System.out.println(true);
		}
		// print the result of n != 2
		boolean n2 = LikeSecondClass.areTheyNotTheSame(1, 2);
		System.out.println(n2);
		// print int h where h = n % 2
		int h = n % 2;
		System.out.println(h);
		// print the result of h % 1
		System.out.println(h & 1);
		// print the result of h == h && h != n
		boolean h2 = LikeSecondClass.areTheyTheSame(h, h);
		System.out.println(h2);
		boolean h3 = LikeSecondClass.areTheyNotTheSame(h, n);
		System.out.println(h3);
	}

}
