package com.btc;

public class Car1 {
//	접근제한자 private 사용 시 외부 접근 금지
	private int speed; // int 타입의 초기값 0
	private boolean stop; // boolean 타입의 초기값 false
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
