package sec04.exam01_arithmetic;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;		//처음 시작이 문자면 숫자도 문자로 인식
		String str4 = 3 + 3.0 + "JDK";		//처음이 숫자면 계산 후 인식
		System.out.println(str3);
		System.out.println(str4);

	}

}
