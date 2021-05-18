package java_chap08;

public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ImplementationC - methodA() 호출");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC - methodB() 호출");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC - methodC() 호출");
	}

}
