package chap04;

public class ForLotto {

	public static void main(String[] args) {
		// 문제 1) Math.random() 과 for문을 사용하여 임의의 숫자 6개를 출력하는 프로그램을 작성하세요
//		(int)(Math.random() * 45) + 1 // 1 ~ 45까지의 숫자를 출력
		
		for (int i = 0; i < 6; i++) {
			int rnd = (int)(Math.random() * 45) + 1;
			
			if (i == 5) {
				System.out.println("이번주 로또 보너스 숫자 : " + rnd);
			}
			else {
				System.out.println("이번주 로또 " + (i + 1) + "번째 숫자 : " + rnd);
			}
		}
		
//		문제 2) 자바스크립트의 for 문과 램덤 함수를 이용하여 임의의 숫자 6개를 출력하는 프로그램을 작성하세요
//		중복되는 숫자가 나오지 않도록 해야 함
//		배열 사용
	}

}
