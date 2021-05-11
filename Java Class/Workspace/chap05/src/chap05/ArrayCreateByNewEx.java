package chap05;

public class ArrayCreateByNewEx {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; // 정수 타입의 빈 배열을 선언 시 배열의 요소를 0으로 초기화함
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
//		실수형 빈 배열을 선언하면 0.0으로 초기화됨
		double[] arr2 = new double[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
//		String 타입의 빈 배열을 선언 시 각 요소를 null로 초기화함
//		참조형 데이터 타입의 빈 배열을 선언 시 각 요소는 null로 초기화됨
		String[] arr3 = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

}
