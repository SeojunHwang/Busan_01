package chap02;

public class IntEx {

	public static void main(String[] args) {
//		short : int 타입보다 작은 범위를 표시하는 정수 타입
//			현재는 잘 사용하지 않음
//		int : 자바의 기본 정수형 타입
//			4byte 크기를 가지고 있음
//			부호 사용 가능
//		long : 자바의 대용량 정수형 타입
//			8byte 크기를 가지고 있으며 부호 사용 가능
//			숫자를 표현 시 접미사 l(L)을 사용해야 함(int 타입이 기본 타입고, long은 기본 타입이 아니기 때문에 접미사 l이 없으면 해당 데이터가 long 타입인지 int 타입인지 구분할 수 없음
		
//		모든 데이터는 큰 데이터 타입의 변수에 작은 데이터 타입의 변수를 대입 시 자동타입변환이 발생함
//		반대로 작은 데이터 타입의 변수에 큰 데이터 타입의 변수를 대입 시 큰 데이터 타입의 데이터가 손실될 가능성이 있음
		
		int var1 = 10; // 10진수 10 저장
		int var2 = 012; // 8진수 10 저장
		int var3 = 0xA; // 16진수 10 저장
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		System.out.println("----- long 타입 -----");
		
		// 숫자 10은 int 타입의 리터럴 데이터 10을 의미
//		자바에서 일반적으로 사용하는 형식데로 숫자를 사용하면 무조건 int 타입의 데이터로 인식함
//		int타입이 기본형이기 때문임
		long lvar1 = 10;
//		숫자 20L 은 long 타입의 리터럴 데이터 20을 의미
		long lvar2 = 20l;
//		1000000000000 라는 데이터는 int 타입의 리터럴 데이터로 표현할 수 없는 데이터이기 때문에 오류가 발생함
//		long lvar3 = 1000000000000;
//		1000000000000L 라는 데이터는 long 타입의 리터럴 데이터이므로 충분히 표현할 수 있기 때문에 문제가 없음
		long lvar4 = 1000000000000L;
		
		System.out.println(lvar1);
		System.out.println(lvar2);
		System.out.println(lvar4);
	}

}











