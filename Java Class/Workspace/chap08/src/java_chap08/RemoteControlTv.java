package java_chap08;

public class RemoteControlTv implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("TV 볼륨을 " + volume + "으로 조절합니다.");
	}

}
