package java_chap10;

public class ArrayIndexoutOfBoundsExceptionEx {

	public static void main(String[] args) {
//		args : 프로그램 실행 시 추가 옵션을 입력할 수 있는 매개변수
//		String data1 = args[0];
//		String data2 = args[1];
//		
//		System.out.println("args[0] : " + data1);
//		System.out.println("args[1] : " + data2);
		
		int[] number = {1, 2, 3, 4, 5};
		
		try {
			for (int i = 0; i < number.length; i++) {
				System.out.println(number[i]);
			}
			
			number[10] = 100; // 오류 발생, 배열의 크기보다 큰 index에 접근
			System.out.println(number[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 사용 시 오류가 발생했습니다.");
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
//		런타임오류 발생
//		문법 자체는 오류가 없으나 실제 프로그램 실행 시 배열의 크기는 5이기 때문에 index가 4까지 존재하지만 index 10에 접근하고자 하기 때문에 오류가 발생함
		
	}

}
