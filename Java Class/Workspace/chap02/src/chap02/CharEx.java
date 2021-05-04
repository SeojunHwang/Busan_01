package chap02;

public class CharEx {

	public static void main(String[] args) {
//		char 타입에 문자를 저장 시 ''를 사용해야 함
//		String 타입에 문자열을 저장 시 ""를 사용해야 함
		char c1 = 'A';
		char c2 = 65; // 아스키코드에서 문자 A를 10진수로 표현
		char c3 = '\u0041'; // UTF8 방식의 유니코드에서의 문자 A를 뜻함
		
		char c4 = '가'; // 한글문자 '가'
		char c5 = 44032; // 한글문자 '가'의 유니코드 값을 10진수로 표현
		char c6 = '\uac00'; // 한글문자 '가'의 유니코드 값
		
		int uniCode = c1; // int타입은 자바의 기본 정수형이고, char 타입은 정수 및 문자를 저장할 수 있는 데이터 타입이므로 char타입에 저장된 데이터를 int 타입의 변수에 저장할 수 있음
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode); // 변수 uniCode는 정수 타입의 변수이므로 문자 A가 저장되어 있지만 표현을 정수형으로 하고 있기 때문에 A의 10진수 코드값인 65가 출력됨
		
	}

}
