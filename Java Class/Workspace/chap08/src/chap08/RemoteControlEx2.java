package chap08;

public class RemoteControlEx2 {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("전원을 켭니다.");
			}
			
			public void turnOff() {
				System.out.println("전원을 끕니다.");
			}
			
			public void setVolume(int volume) {
				System.out.println("볼륨을 " + volume + "으로 조절합니다.");
			}
		};
		
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(false);
		rc.turnOff();
	}

}
