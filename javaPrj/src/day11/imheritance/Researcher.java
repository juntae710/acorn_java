package day11.imheritance;

public class Researcher extends Student {
	
	
	
	
	public void 연구하기() {
		System.out.println(" 연구하기");
	}
	//부모의 매서드를 재정의 할수있다 => 오버라이딩
	public void 잠자기() {
		System.out.println("4시간만 잡시다");
	}
}
