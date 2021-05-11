package java_chap06;

public class Calculator2Main {

	public static void main(String[] args) {
//		사칙 연산을 하는 프로그램을 작성
//		+, -, *, /
		int a;
		int b;
		int result;
		
		a = 10;
		b = 20;
		
//		result = a + b;
//		System.out.println("a + b = " + result);
//		
//		result = a + b;
//		System.out.println("a + b = " + result);
//		
//		result = a + b;
//		System.out.println("a + b = " + result);
//		
//		result = a - b;
//		System.out.println("a - b = " + result);
//		
//		result = a - b;
//		System.out.println("a - b = " + result);
//		
//		result = a - b;
//		System.out.println("a - b = " + result);
//		
//		
//		
//		result = a * b;
//		System.out.println("a * b = " + result);
//		
//		a = 30;
//		b = 5;
//		result = a / b;
//		System.out.println("a / b = " + result);
		
		add(a, b);
		add(10, 30);
		minus(a, b);
		multi(a, b);
		divide(30, 5);
	}
	
//	자바의 메서드 생성
//	자바스크립트와는 달리 접근 제한자와 반환 타입 입력해야 함
//	매개 변수 입력 시 매개변수의 데이터 타입을 입력해야 함
//	메서드는 이러한 중복 실행되는 부분을 따로 모아서 소스코드를 간단하게 표기하기 위해 사용
//	자바스크립트에서의 4가지 함수 형식과 동일함
	
	public static void add(int x, int y) {
		int result = x + y;
		System.out.println("두 수의 합은 : " + result);
	}
	
	public static void minus(int x, int y) {
		int result = x - y;
		System.out.println("두 수의 차는 : " + result);
	}
	
	public static void multi(int x, int y) {
		int result = x * y;
		System.out.println("두 수의 곱은 : " + result);
	}
	
	public static void divide(int x, int y) {
		double result = (double)x / (double)y;
		System.out.println("두 수의 나눗셈은 : " + result);
	}
}





