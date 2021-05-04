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
//		자바의 정수 기본 데이터 타입이 int 타입이므로 byte, charm short 타입의 변수끼리 연산을 하면 자동으로 int 타입으로 형변환이 발생함
//		char vahrValue3 = charValue1 + charValue2; // int 타입의 결과값으로 변경됨
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
//		정수형 데이터와 실수형 데이터를 연산하면 더 큰 데이터 타입인 실수형 데이터 타입으로 자동 형변환이 발새하고 데이터 연산이 이루어짐
		int intValue5 = 10;
//		int intValue4 = 10 / 4.0; // 10 -> 10.0 으로 자동 형변환 후 데이터 연산을 진행함
		double doubleValue = intValue5 / 4.0; // 실수 타입의 데이터는 정수 타입의 변수에 저장할 수 없으므로 실수형 타입의 기본 데이터 타입인 double 타입의 변수에 저장
		System.out.println(doubleValue);
	}

}
