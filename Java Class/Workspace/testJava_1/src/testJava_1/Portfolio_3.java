package testJava_1;

public class Portfolio_3 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합 " + "= " + sum);
	}
}
