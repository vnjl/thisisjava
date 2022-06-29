package sec04.exam03_compare;

public class StringExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");	// new String 안의 값이 같아도 주소가 달라서 다른 값으로 취급
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));	//equals는 주소가 달라도 형태만 같으면 같은 값으로 취급

	}

}
