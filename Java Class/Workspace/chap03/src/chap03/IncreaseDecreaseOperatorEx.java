package chap03;

public class IncreaseDecreaseOperatorEx {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------");
//		단독으로 사용 시 전치/후치를 따지지 않음
		x++; // 단항연산자 ++ 사용, 후치연산자로 사용
		++x; // 단항연산자 ++ 사용, 전치연산자로 사용
		System.out.println("x = " + x); // 12
		
		System.out.println("----------");
//		단독으로 사용 시 전치/후치를 따지지 않음
		y--; // 단항연산자 -- 사용, 후치연산자로 사용
		--y; // 단항연산자 -- 사용, 전치연산자로 사용
		System.out.println("y = " + y); // 8
		
		System.out.println("----------");
		z = x++; // z에 x를 대입한 후 x의 값을 1 증가, 후치증감연산자 사용
		System.out.println("z = " + z); // 12
		System.out.println("x = " + x); // 13
		
		System.out.println("----------");
		z = ++x; // x의 값을 1 증가 후 z에 x의 값을 대입, 전치증감연산자 사용
		System.out.println("z = " + z); // 14
		System.out.println("x = " + x); // 14
		
		System.out.println("----------");
		z = ++x + y++; // x의 값을 1 증가 후 y와 연산함, 연산된 결과를 z에 대입, 후치증감연산자를 사용한 y의 값을 1 증가
		System.out.println("z = " + z); // 23
		System.out.println("x = " + x); // 15
		System.out.println("y = " + y); // 9
	}

}
