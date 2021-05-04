package chap02;

public class ByteEx {

	public static void main(String[] args) {
//		byte 는 -128 ~ 127까지 저장 가능
		byte var1 = -128;
		byte var2 = -38;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128; // byte 타입의 저장 범위인 127을 넘어서는 숫자를 저장하기 때문에 오류가 발생함
//		byte 타입의 변수에 최대 혹은 최소값을 넘어서는 값을 입력하게 될 경우 데이터의 부호가 변경되어 원하지 않는 결과값을 출력하게 됨
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
//		System.out.println(var6);
	}

}
