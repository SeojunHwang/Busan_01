package com.btc.hankook;

public class Aclass {
//	public 을 사용하는 메서드
	public void output() {
		System.out.println("Aclass의 public를 사용한 output 호출");
	}
	
//	private을 사용한 메서드
//	private 접근 제한자를 사용하고 있기 때문에 해당 클래스를 외부에서 객체로 생성 시 private 접근제한자를 사용한 메서드는 보이지 않음(접근할 수 없음)
//	private 접근 제한자를 사용한 멤버에 접근하려면 외부에서 접근할 수 있는 멤버를 통해서 우회하여 접근하여야 함
	private void print() {
		System.out.println("Aclass의 private를 사용한 output 호출");
	}
	
	public void outputPrint() {
		print();
	}
	
//	default 접근 제한자를 사용한 메서드
//	동일한 패키지 내에서는 제한이 없는 접근 제한자
//	다른 패키지에서는 접근을 할 수 없음
	void defaultPrint() {
		System.out.println("Aclass의 default를 사용한 defaultPrint 호출");
	}
	
//	protected 접근 제한자를 사용한 메서드
	protected void protectedPrint() {
		System.out.println("Aclass의 protected 를 사용한 protectedPrint 호출");
	}
}
