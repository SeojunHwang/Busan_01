package chap02;

public class FloatDoubleEx {
	public static void main(String[] args) {
//		float : 실수를 표현하는데 사용하는 데이터 타입, 접미사 F(f)를 붙어야 함, 4byte 크기를 가지고 있음, 소수점 아래 8번째자리까지 표현할 수 있음
//		double : 실수를 표현하는데 사용하는 데이터 타입, 실수의 기본 데이터 타입, 접미사 필요 없음, 8byte의 크기를 가지고 있음
		double var1 = 3.14;
//		float var2 = 3.14; // float 타입의 변수에 3.14 라는 double 타입의 리터럴 데이터를 대입하기 때문에 오류가 발생함
		float var3 = 3.14f; // 3.14의 뒤에 접미사로 f로 사용되어 있기 때문에 float 타입의 리터럴 데이터임을 표기하고 있어 문제 없이 float 타입의 변수에 데이터를 대입할 수 있음
		
//		최대로 표시할 수 있는 영역에서 반올림처리가 되니 주의할 것
		double var4 = 0.12345678901234567890;
		float var5 = 0.12345678901234567890f;
		
		System.out.println("var1 : " + var1);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
//		지수 사용
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		System.out.println("var9 : " + var9);
	}
}
