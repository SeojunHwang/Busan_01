package chap07;

public class InstanceofEx {
	
//	매개변수로 Parent6 클래스 타입의 변수를 입력받음
	public static void method1(Parent6 parent) {
//		instanceof 연산자를 사용하여 변환하려는 타입과 현재 객체의 원본 타입이 같은지 확인
		if (parent instanceof Child6) {
			Child6 child = (Child6) parent;
			System.out.println("method1 - Child으로 변환 성공");
		}
		else {
			System.out.println("method1 - Child으로 변환 실패");
		}
	}
	
//	매개변수로 Parent6 클래스 타입의 변수를 입력받음
	public static void method2(Parent6 parent) {
//		타입의 확인 없이 바로 강제 타입 변환을 실행
		Child6 child = (Child6) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
//		Parent6 클래스 타입의 변수 parentA에 자식 클래스인 Child6 의 객체를 생성
		Parent6 parentA = new Child6();
		method1(parentA);
		method2(parentA);
		
//		Parent6 클래스 타입의 변수 parentB에 Parent6 클래스 타입의 객체 생성
		Parent6 parentB = new Parent6();
		method1(parentB);
		method2(parentB);
	}

}
