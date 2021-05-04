package chap02;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
//		int타입의 변수 i가 가지고 있는 데이터를 byte 타입의 변수로 타입(형)변환하여 데이터를 저장하고자 함
//		byte 타입은 -128 ~ 127까지의 데이터만 저장할 수 있음
		int i = 128;
		
//		Byte는 byte 타입의 래퍼클래스
//		byte는 자바의 기본 데이터 타입으로 사용되고 있으며, 기본 데이터 타입은 데이터를 표시하는데 주로 사용되기 때문에 별다른 기능이 없음
//		Byte는 기본 데이터 타입인 byte타입에 몇가지 기능을 추가하여 클래스화 한 데이터 타입
		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 학인해주세요.");
		}
		else {
			byte b = (byte)i;
			System.out.println(b);
		}
		
//		byte 타입의 최대값을 넘긴 값이 최소값으로 변환되어 출력
		byte b = (byte)i;
		System.out.println(b);
		
		System.out.println("byte 타입의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte 타입의 최대값 : " + Byte.MAX_VALUE);
	}
}
