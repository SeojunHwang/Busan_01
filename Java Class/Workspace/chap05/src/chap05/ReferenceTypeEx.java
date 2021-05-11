package chap05;

public class ReferenceTypeEx {

	public static void main(String[] args) {
		byte bValue = 25;
		short sValue = 25;
		
		if (bValue == sValue) {
			System.out.println("bValue의 값과 sValue의 값은 같습니다.");
		}
		else {
			System.out.println("bValue의 값과 sValue의 값은 다릅니다.");
		}
		
		
		String str1 = "참조타입"; // new 키워드를 사용해서 스택 영역과 힙 영역에 데이터를 추가
		String str2 = "참조타입"; // str1이 선언되면서 저장한 데이터의 주소만 가져옴
		
		if (str1 == str2) {
			System.out.println("str1의 값과 str2의 값은 같습니다.");
		}
		else {
			System.out.println("str1의 값과 str2의 값은 다릅니다.");
		}
		
//		String 데이터 타입은 참조 타입
//		참조 타입은 변수 초기화 시 new 키워드를 반드시 사용해야 함
//		String 데이터 타입은 기본 타입처럼 사용하는 데이터 타입이므로 예외를 둬서 기본 타입처럼 new 키워드 없이도 사용할 수 있도록 함
//		String 타입의 변수 2개 이상을 동일한 코드 블럭 내에서 선언하고 동일한 데이터를 new 키워드없이 대입연산자만 사용하여 저장하였을 경우 먼저 선언된 String 타입의 변수에만 new 키워드가 사용되고, 나중에 선언된 String 타입의 변수에는 기존에 선언된 String 타입의 변수가 가지고 있는 메모리주소를 대입함 
//		String 데이터 타입은 클래스로 만들어져 있음
//		String 데이터 타입은 클래스로 만들어져 있기 때문에 여러가지 메서드가 존재함
		String str3 = "참조타입";
		String str4 = new String("참조타입");
		
		if (str3 == str4) {
			System.out.println("변수 str3 : " + str3 + "\n변수 str4 : " + str4);
			System.out.println("str3의 값과 str4의 값은 같습니다.");
		}
		else {
			System.out.println("변수 str3 : " + str3 + "\n변수 str4 : " + str4);
			System.out.println("str3의 값과 str4의 값은 다릅니다.");
		}
		
//		String 타입의 변수 str3과 str4가 가지고 있는 실제 데이터를 비교할 수 있음
		if (str3.equals(str4)) {
			System.out.println("변수 str3 : " + str3 + "\n변수 str4 : " + str4);
			System.out.println("str3의 값과 str4의 값은 같습니다.");
		}
		else {
			System.out.println("변수 str3 : " + str3 + "\n변수 str4 : " + str4);
			System.out.println("str3의 값과 str4의 값은 다릅니다.");
		}
	}

}
