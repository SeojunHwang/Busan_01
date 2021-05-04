package chap02;

public class OperationPromotionEx {
	
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		자바에서 정수의 연산은 기본적으로 int타입을 통해서 진행함
//		자바의 기본 정수 타입이 int 타입으로 지정되어 있기 때문에 정수의 연산을 모두 int 타입으로 변환 후 연산을 진행함
//		byteValue1 + byteValue2 는 byte타입의 변수가 모두 int 타입으로 변경된 후 연산을 해야 정상적으로 진행됨
//		연산된 결과를 다시 byte타입으로 강제 타입 변화을 헤야 정상적으로 저장이 됨
//		byte byteValue3 = byteValue1 + byteValue2;
//		byte byteValue3 = (byte)(byteValue1 + byteValue2);
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char vahrValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue5 = 10;
//		int intValue4 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}
