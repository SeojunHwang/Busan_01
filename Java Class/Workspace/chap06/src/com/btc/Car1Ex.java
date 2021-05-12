package com.btc;

public class Car1Ex {

	public static void main(String[] args) {
//		자바의 특징 중 하나인 캡슐화
//		private 접근제한자를 사용하여 클래스의 멤버에 직접 접근하는 것을 막고, getter/setter 이용하여 우회 접근하여 안전하게 사용하도록 하는 것을 캡슐화라고 함
		Car1 myCar = new Car1();
//		myCar.speed = -50;
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
