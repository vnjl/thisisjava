package sec04.exam06_assignment;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10; //0에 10 더하고
		System.out.println("result=" + result);
		result -= 5;  //위 결과값에 -5
		System.out.println("result=" + result);
		result *= 3;  //위 결과값에 *5
		System.out.println("result=" + result);
		result /= 5;  //위 결과값에 /5
		System.out.println("result=" + result);
		result %= 3;  //위 결과값의 나머지
		System.out.println("result=" + result);

	}

}
