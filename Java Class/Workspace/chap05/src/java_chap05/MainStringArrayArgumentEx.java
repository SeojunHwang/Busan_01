package java_chap05;

public class MainStringArrayArgumentEx {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0); // 프로그램 종료
		}
		
//		args 배열이 String 타입의 배열이므로 입력된 글자를 String 타입의 변수로 받아 줌
		String strNum1 = args[0];
		String strNum2 = args[1];
		
//		기본 데이터 타입인 int의 랩핑클래스 인 Integer 를 사용하여 문자를 숫자로 변환
		int num1 = Integer.parseInt(strNum1); // 입력된 글자를 숫자로 변환
		int num2 = Integer.parseInt(strNum2); // 입력된 글자를 숫자로 변환
		
		int result = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
