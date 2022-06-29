package sec04.exam01_arithmetic;

public class OverflowExample {

	public static void main(String[] args) {
		/*		
 		int x = 10000000;
		int y = 10000000;
		int z = x * y;
		System.out.println(z);
 		*/
		
		long x = 10000000;
		long y = 10000000;
		long z = x * y;
		System.out.println(z);
	}

}
