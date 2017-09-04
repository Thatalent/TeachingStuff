package FirstPackage;
import FirstPackage.FirstClass;

public class SecondClass extends FirstClass {

	public static void main(String[] args) {

		int integer = 10 +2;
		
		int int2 = --integer;
		
		FirstClass first = new FirstClass();
		
		first.secret = "";
		
		System.out.println(first.secret);
		
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
		
<<<<<<< HEAD
		String s ="Hello World";
		
		System.out.println(s);
		
		// print String sn with the value "11"
		
		String sn="11";
				
				System.out.println(sn);
		
		// print n where n = int3/3
				
		n=int3/3;
				System.out.println(n);
=======
		// print String sn with the value "11"
		
		// print n where n = int3/3
>>>>>>> parent of e772fc2... Merge branch 'modernitalia-branch-1' into master

		// print the result of n <= int2
		
		// print the result of n != 2
		
		// print int h where h = n % 2
		
		// print the result of h % 1
		
		// print the result of h == h && h != n
	}

}
