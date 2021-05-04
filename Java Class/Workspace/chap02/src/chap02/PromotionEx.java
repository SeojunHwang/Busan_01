package chap02;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // byte 타입의 변수를 int 타입의 변수에 대입, 자동 형 변환
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; // char 타입의 변수를 int 타입의 변수에 대입, 자동 형 변환
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 500;
		long longValue = intValue; // int 타입의 변수를 long 타입의 변수에 대입, 자동 형 변환
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; // int 타입의 변수를 double 타입의 변수에 대입, 자동 형 변환
		System.out.println(doubleValue);
	}

}
