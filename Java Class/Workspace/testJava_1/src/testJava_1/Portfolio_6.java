package testJava_1;

public class Portfolio_6 {
	public static void main(String[] args) {
		int lotto[] = new int [6];
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	System.out.print("이번 주 로또 번호는 : ");
	for(int i=0; i<6; i++) {
		System.out.print(lotto[i] + " ");
	}	
	System.out.print("번입니다.");
	}
}
