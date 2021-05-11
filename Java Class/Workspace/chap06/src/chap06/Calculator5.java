package java_chap06;

// 메서드 오버로딩은 동일한 이름의 메서드명으로 여러개의 메서드를 선언하여 사용하는 것
// 매개변수의 타입이 다르거나, 매개변수의 개수가 다르거나, 매개변수의 순서가 다르면 동일한 이름의 메서드를 여러개 선언할 수 있음
public class Calculator5 {
	public void plusInteger(int x, int y) {
		int result = x + y;
		System.out.println("두 정수의 덧셈은 : " + result);
	}
	
	public void plusInteger3(int x, int y, int z) {
		int result = x + y + z;
		System.out.println("세 정수의 덧셈은 : " + result);
	}
	
	public void plusDouble(double x, double y) {
		double result = x + y;
		System.out.println("두 실수의 덧셈은 : " + result);
	}
	
	public void plus(int x, int y) {
		int result = x + y;
		System.out.println("두 정수의 덧셈은 : " + result);
	}
	
	public void plus(int x, int y, int z) {
		int result = x + y + z;
		System.out.println("세 정수의 덧셈은 : " + result);
	}
	
	public void plus(double x, double y) {
		double result = x + y;
		System.out.println("두 실수의 덧셈은 : " + result);
	}
	
	public void plus(int x, double y) {
		double result = x + y;
		System.out.println("두 수의 덧셈은 : " + result);
	}
	
	public void plus(double x, int y) {
		double result = x + y;
		System.out.println("두 수의 덧셈은 : " + result);
	}
}



