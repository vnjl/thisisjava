package sec04.exam03_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;							// int은 소수점 없는 것
		double v3 = 1.0;					// double은 소수점 있는 것
		System.out.println(v2 == v3);;		//true
		
		double v4 = 0.1;
		float v5 = 0.1f;					// double이랑 같은 취급 X
		System.out.println(v4 == v5);		//false
		System.out.println((float)v4 == v5);	//true
		System.out.println((int)(v4*10) == (int)(v5*10));	//true

	}

}
