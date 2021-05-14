package java_chap07;

public class CellPhone {
//	부모의 인스턴스 멤버
//	인스턴스 멤버는 반드시 객체를 생성해야만 사용할 수 있음
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
