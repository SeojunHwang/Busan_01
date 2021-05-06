package java_chap05;

public class ArrayCopyEx {

	public static void main(String[] args) {
//		for문을 사용한 복사
		
		int[] numbers1 = new int[] {1, 2, 3, 4, 5};
		int[] numbers2 = new int[10];
		
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println("numbers1[" + i + "] : " + numbers1[i]);
		}
		
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println("numbers2[" + i + "] : " + numbers2[i]);
		}
		
		System.out.println("----- for 를 이용한 복사 -----");
		
		for (int i = 0; i < numbers1.length; i++) {
			numbers2[i] = numbers1[i];
		}
		
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println("numbers2[" + i + "] : " + numbers2[i]);
		}
		
		System.out.println("----- 왜 for 및 Arrays 클래스를 이용해서 복사하는가 -----");
		
		int[] numbers3 = new int[] {1, 2, 3, 4, 5};
		int[] numbers4 = numbers3;
		
		for (int i = 0; i < numbers3.length; i++) {
			System.out.println("numbers3[" + i + "] : " + numbers3[i]);
		}
		
		for (int i = 0; i < numbers4.length; i++) {
			System.out.println("numbers4[" + i + "] : " + numbers4[i]);
		}
		
		System.out.println("----- 대입 후 서로 값 변경 -----");
		numbers3[0] = 100;
		numbers4[4] = 5000;
		
		
		for (int i = 0; i < numbers3.length; i++) {
			System.out.println("numbers3[" + i + "] : " + numbers3[i]);
		}
		
		for (int i = 0; i < numbers4.length; i++) {
			System.out.println("numbers4[" + i + "] : " + numbers4[i]);
		}
	}

}
