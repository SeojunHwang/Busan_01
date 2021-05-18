package chap08;

public interface RemoteControl {
//	인터페이스의 필드는 모두 상수임
//	public static final 키워드를 사용하지 않아도 컴파일러가 자동으로 추가함
//	static {} 블럭을 사용할 수 없음
	public static final int MAX_VALUME = 10;
	int MIN_VALUME = 0;
	
//	인터페이스의 메서드는 기본적으로 모두 추상 메서드
//	정적 메서드 사용 가능
//	디폴트 메서드 사용 가능
//	public abstract 키워드를 사용하지 않아도 컴파일러가 자동으로 추가함
	public abstract void turnOn();
	void turnOff();
	public void setVolume(int volume);
	
//	디폴트 메서드
//	자바 8버전에서 default 메서드가 추가됨
//	기본적으로 public 접근 제한자를 사용(컴파일러가 자동으로 추가함)
//	default 키워드를 반드시 사용해야 함
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리됩니다.");
		}
		else {
			System.out.println("무음 해제됩니다");
		}
	}
	
//	정적 메서드
//	자바 8버전에서 추가됨
//	기본적으로 정적 메서드와 동일함
//	public 접근 제한자를 사용(컴파일러가 자동으로 추가함)
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}





