package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) { // Not a Number, 숫자이면 false
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		} 
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
