package sec00;

public class FromOneToTen {

	public static void main(String[] args) {
		int total = 0;
		for(int i=1; i<=100; i++) {
			total += i;
			System.out.print(i);
			if(i!=100) {
				System.out.print("+");
			}
		}
		System.out.print("=" + total);
		
	}

}
