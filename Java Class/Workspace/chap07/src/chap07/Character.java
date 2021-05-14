package chap07;

public class Character {
//	게임의 케릭터가 할 수 있는 행동 목록을 규격화 하여 지정함
	public void move() {
		System.out.println("이동합니다.");
	}
	
	public void stop() {
		System.out.println("멈춥니다.");
	}
	
	public void attack() {
		System.out.println("공격합니다.");
	}
	
	public void skill() {
		System.out.println("스킬을 사용합니다.");
	}
	
	public void specialSkill() {
		System.out.println("궁극기를 사용합니다.");
	}
}
