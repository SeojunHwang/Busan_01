package com.btc;

import com.btc.hankook.Aclass;

public class ExtendClass extends Aclass {
	public void output() {
//		output();
//		outputPrint();
		// default 접근제한자를 사용한 메서드
//		default 접근제한자는 상속과 관련없이 동일한 패키지 내에서만 접근이 가능함
//		defaultPrint();
		
//		protected 접근 제한자는 상속받은 클래스 내에서는 접근이 가능함
//		상속을 받았다면 다른 패키지 내에서 사용하고 있어도 접근이 가능함
		protectedPrint();
	}
}
