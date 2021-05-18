package java_chap08;

// 인터페이스를 통하면 자바에서 불가능했던 다중 상속이 가능함
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트 TV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VALUME) {
			this.volume = RemoteControl.MAX_VALUME;
		}
		else if (volume < RemoteControl.MIN_VALUME) {
			this.volume = RemoteControl.MIN_VALUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 스마트 TV 볼륨 " +  volume);
	}

}
