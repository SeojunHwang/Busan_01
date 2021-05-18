package java_chap08;

public class RemoteControlMain {

	public static void main(String[] args) {
		RemoteControlTv remoteTV = new RemoteControlTv();
		
		remoteTV.turnOn();
		remoteTV.setVolume(7);
		remoteTV.setMute(true);
		remoteTV.turnOff();
		
		RemoteRadio remoteRadio = new RemoteRadio();
		remoteRadio.turnOn();
		remoteRadio.setFrequency(99.9);
		remoteRadio.setVolume(6);
		remoteRadio.setMute(true);
		remoteRadio.turnOff();
		
		SmartTelevision stv = new SmartTelevision();
		stv.turnOn();
		stv.setVolume(10);
		stv.setMute(true);
		stv.search("www.google.co.kr");
		stv.turnOff();
		
		System.out.println("----- 다중 상속받은 인터페이스를 다시 상속받아 사용-----");
		TVBox mibox = new AdroidTvBox();
		mibox.turnOn();
		mibox.search("www.google.co.kr");
		mibox.setVolume(5);
		mibox.setMute(false);
		mibox.turnOff();
	}

}
