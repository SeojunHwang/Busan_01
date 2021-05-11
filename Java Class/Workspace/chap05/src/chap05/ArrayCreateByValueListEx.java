package chap05;

public class ArrayCreateByValueListEx {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double)sum / 3;
		System.out.println("평균 : " + avg);
		
		System.out.println("-----------------");
		
		int scores2[] = {83, 90, 87};
		
		for (int i = 0; i < 3; i++) {
			System.out.println("scores2[" + i + "] : " + scores2[i]);
		}
		
		System.out.println("-----------------");
		
		int[] scores3;
//		scores3 = {83, 90, 87}; // 빈배열을 먼저 선언만 하고 나중에 배열에 데이터를 입력할 경우 반드시 new 키워드를 사용해야함(혹은 기존에 먼저 생성된 배열을 대입해야 함)
		scores3 = scores2; // 기존의 배열 scores2를 배열 scores3에 대입
		scores3 = new int[] {83, 90, 87}; // 새로운 배열을 new 키워드로 생성
		
		for (int i = 0; i < 3; i++) {
			System.out.println("scores3[" + i + "] : " + scores3[i]);
		}
	}
}








