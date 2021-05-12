package chap06;

public class Calculator7Ex {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator7.pi;
		int result2 = Calculator7.plus(10, 5);
		int result3 = Calculator7.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
//		정적 멤버에 접근 시 객체 생성 후 접근하는 방법은 좋지 않음
//		Calculator7 cal = new Calculator7();
//		double result11 = 10 * 10 * cal.pi;
//		int result21 = cal.plus(10, 5);
//		int result31 = cal.minus(10, 5);
//		
//		System.out.println("result11 : " + result11);
//		System.out.println("result21 : " + result21);
//		System.out.println("result31 : " + result31);
	}

}
