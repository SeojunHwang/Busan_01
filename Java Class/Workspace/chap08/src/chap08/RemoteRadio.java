package chap08;

public class RemoteRadio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("라디오 전원을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("라디오 전원을 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		System.out.println("라디오 볼륨을 " + volume + "으로 조절합니다.");
	}
	
	public void setFrequency(double frq) {
		System.out.println("라디오 주파수를 " + frq + "으로 조절합니다.");
	}
}
