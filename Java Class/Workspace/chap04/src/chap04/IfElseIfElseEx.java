package chap04;

public class IfElseIfElseEx {
	public static void main(String[] args) {
		int score = 75;
		
		if (score>= 90) {
			System.out.println("점수가 100 ~ 90 입니다.");
			System.out.println("등급은 A 입니다.");
		}
		else if (score >= 80) {
			System.out.println("점수가 80 ~ 89 입니다.");
			System.out.println("등급은 B 입니다.");
		}
		else if (score >= 70) {
			System.out.println("점수가 70 ~ 79 입니다.");
			System.out.println("등급은 C 입니다.");
		}
		else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
		
		System.out.println("---------------");
//		if ~ else if ~ else 문이 if ~ else문을 여러개 사용한 것과 동일한 것이 아님
		if (score >= 90) {
			System.out.println("점수가 100 ~ 90 입니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if (score >= 80) {
			System.out.println("점수가 80 ~ 89 입니다.");
			System.out.println("등급은 B 입니다.");
		}
		
		if (score >= 70) {
			System.out.println("점수가 70 ~ 79입니다.");
			System.out.println("등급은 C 입니다.");
		}
		
		if (score >= 60 ) {
			System.out.println("점수가 60 ~ 69 입니다.");
			System.out.println("등급은 D 입니다.");
		}
		
	}
}
