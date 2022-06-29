package sec03.exam02_incresase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------------------");
		x++;					//x=12
		++x;
		System.out.println("x="+ x);
		
		System.out.println("------------------------------");
		y--;					//y=8
		--y;
		System.out.println("y=" + y);
		
		System.out.println("------------------------------");
		z = x++;				
		System.out.println("z=" + z); // z=12
		System.out.println("x=" + x); // x=13
		
		System.out.println("------------------------------");
		z= ++x;
		System.out.println("z=" + z); // z=14
		System.out.println("x=" + x); // x=14
		
		System.out.println("------------------------------");
		z= ++x + y++;		// 23 = 15 + 8(9)
		System.out.println("z=" + z); // z=23
		System.out.println("x=" + x); // x=15
		System.out.println("y=" + y); // y=9

	}

}
