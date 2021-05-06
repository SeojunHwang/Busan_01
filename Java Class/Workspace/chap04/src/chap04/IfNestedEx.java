package chap04;

public class IfNestedEx {

	public static void main(String[] args) {
//		Math.random() : 0.0 ~ 1.0 사이의 임의의 숫자를 출력하는 명령어 0.0 ~ 0.9까지 출력
//		Math.random() * 10 을 하면 0 ~ 9까지의 숫자를 출력
		int score = (int)(Math.random() * 20) + 81;
		System.out.println("점수 : " + score);
		
		String grade;
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			}
			else {
				grade = "A";
			}
		}
		else {
			if (score >= 85) {
				grade = "B+";
			}
			else {
				grade = "B";
			}
		}
		
		System.out.println("학점 : " + grade);
	}

}
