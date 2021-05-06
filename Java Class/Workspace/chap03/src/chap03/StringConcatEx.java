package chap03;

public class StringConcatEx {

	public static void main(String[] args) {
//		문자열과 다른 타입의 데이터를 문자열 연결 연산자로 연산하면 둘다 문자열로 변환됨
		String str1 = "JDK" + 6.0; // 문자열 'JDK'와 실수 타입의 데이터 6.0을 연산하면 'JDK6.0'이 됨
		String str2 = str1 + " 특징"; // 문자열 'JDK6.0'과 ' 특징' 문자열을 문자열 연산자로 연결
		System.out.println(str2);
		
//		결과가 'JDK33.0'이 나온 이유
//		연산자의 우선순위가 동일할 경우 연산자의 방향은 왼쪽에서 오른쪽으로 진행됨
//		문자열 'JDK' 와 정수 데이터 3이 먼저 연산되고, 그 후에 실수 데이터 3.0과 연산됨
		String str3 = "JDK" + 3 + 3.0;
//		정수 데이터 3과 실수 데이터 3.0이 먼저 연산되고, 그 결과값을 문자열 'JDK'와 연산
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
	}

}
