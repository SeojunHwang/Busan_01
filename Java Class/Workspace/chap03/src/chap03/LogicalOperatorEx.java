package chap03;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		int charCode = 'A';
		
//		&와 &&, |와 ||는 결과는 동일하나 연산과정에서 차이가 발생함
//		&&와 || 는 if문에서 둘 중 하나의 결과만으로 전체의 결과를 출력할 수 있을 경우 앞쪽의 조건문만 연산하고 뒤쪽의 조건문은 연산하지 않음
//		&와 | 는 무조건 모든 조건문을 전부 연산하고 결과를 출력함
		
		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 입니다.");
		}
		
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 입니다.");
		}
		
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0 ~ 9 까지의 숫자 입니다.");
		}
		
		int value = 6;
		
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 입니다.");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 입니다.");
		}
	}

}
