package java_chap06;

public class Calculator3 {
	
	public void plus(int x, int y) {
		int result = x + y;
		System.out.println("두 수의 덧셈은 : " + result);
	}
	
	public void minus(int x, int y) {
		int result = x - y;
		System.out.println("두 수의 뺄셈은 : " + result);
	}
	
	public void multi(int x, int y) {
		int result = x * y;
		System.out.println("두 수의 곱셈은 : " + result);
	}
	
	public void divide(int x, int y) {
		double result = (double)x / (double)y;
		System.out.println("두 수의 나눗셈은 : " + result);
	}
}
