package sec00;

public class FromOneToTen {

	public static void main(String[] args) {
		int total = 0;                 
		for(int i=1; i<=10; i++) {     // i = 10
			total = total + i;         // �� 55 = �� 45 + 10 
			System.out.print(i);       // 1 + 2 + 3 + ... + 8 + 9 + 10 = 55  
			if(i!=10) {                // 
				System.out.print("+");
			}		
		}
		System.out.print("="+total);
	}

}
