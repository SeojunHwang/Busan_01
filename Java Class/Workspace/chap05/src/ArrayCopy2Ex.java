package java_chap05;

import java.util.Arrays;

public class ArrayCopy2Ex {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[3];
		
		System.out.println("\n --- 원본 배열 oldStrArray --- ");
		for (int i = 0; i < oldStrArray.length; i++) {
			System.out.print(oldStrArray[i] + ", ");
		}
		
		System.out.println("\n --- 사본 배열 newStrArray --- ");
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
//		arraycopy(원본배열명, 원본배열시작index, 사본배열명, 사본배열시작index, 복사할크기);
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		System.out.println("\n --- 원본 배열 oldStrArray --- ");
		for (int i = 0; i < oldStrArray.length; i++) {
			System.out.print(oldStrArray[i] + ", ");
		}
		
		System.out.println("\n --- 사본 배열 newStrArray --- ");
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
		
		System.out.println("\n----- Arrays 클래스 이용하여 복사 -----\n");
//		Arrays 클래스는 배열을 위한 여러가지 메서드를 지원하고 있음
//		https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html 참고
//		Arrays.copyOf() : Arrays 클래스의 배열 복사 메서드
//			전달받은 배열의 특정 길이만큼 새로운 배열로 복사하여 반환
//			만약 원본 배열의 크기보다 사본 배열의 크기가 클 경우 원본 배열의 크기를 넘어서는 영역을 해당 데이터 타입의 초기값으로 초기화하여 배열을 생성함
//		ex) 사본배열명 = Arrays.copyOf(원본배열명, 사본의 크기)
		
		System.out.println("--- Arrays.copyOf ---");
		String[] oriStrArray = {"html", "css", "javascript", "jquery", "java"};
		String[] copyStrArray1 = Arrays.copyOf(oriStrArray, 5);
		
		for (int i = 0; i < copyStrArray1.length; i++) {
			System.out.println("copyStrArray1[" + i + "] : " + copyStrArray1[i]);
		}
		
		String[] copyStrArray2 = Arrays.copyOf(oriStrArray, 3);
		String[] copyStrArray3 = Arrays.copyOf(oriStrArray, 10);
		
		for (int i = 0; i < copyStrArray2.length; i++) {
			System.out.println("copyStrArray2[" + i + "] : " + copyStrArray2[i]);
		}
		
		for (int i = 0; i < copyStrArray3.length; i++) {
			System.out.println("copyStrArray3[" + i + "] : " + copyStrArray3[i]);
		}
		
//		Arrays.copyOfRange() : 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환
//		ex) 사본배열명 = Arrays.copyOfRange(원본배열명, 시작index, 끝index -1)
		String[] oriStrArrRange = {"html", "css", "javascript", "jquery", "java"};
		String[] copyStrArrRange = Arrays.copyOfRange(oriStrArrRange, 1, 4);
		
		System.out.println("----- Arrays.copyOfRange -----");
		for (int i = 0; i < copyStrArrRange.length; i++) {
			System.out.println("copyStrArrRange[" + i + "] : " + copyStrArrRange[i]);
		}
		
//		Arrays.fill() : 전달받은 배열의 모든 요소를 특정 값으로 초기화해 줌
//		ex) Arrays.fill(배열명, 채울 데이터);
		String[] oriStrArrFill = new String[5]; // String 타입의 빈 배열 선언, String은 참조형이므로 null로 데이터가 초기화됨
		Arrays.fill(oriStrArrFill, "java");
		
		System.out.println("----- Arrays.copyOfRange -----");
		for (int i = 0; i < oriStrArrFill.length; i++) {
			System.out.println("oriStrArrFill[" + i + "] : " + oriStrArrFill[i]);
		}
		
	}

}
