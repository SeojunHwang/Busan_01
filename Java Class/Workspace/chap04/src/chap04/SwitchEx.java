package chap04;

public class SwitchEx {

	public static void main(String[] args) {
//		int num = (int)(Math.random() * 6) + 1;
		double rand = Math.random();
		int num = (int)(rand * 6) + 1;
		
		System.out.println("double 변수 rand : " + rand + "\nint 변수 num : " + num);
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
			
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
			
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
			
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
			
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
			
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
	}

}
