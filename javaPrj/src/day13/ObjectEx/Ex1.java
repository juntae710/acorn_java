package day13.ObjectEx;

public class Ex1 {

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.toString());
		
		
		Object o = a;//상속관계에서 업캐스팅
		//부모형으로 축소됨
		//오버라이드 된 매서드가 우선관을 갖는다  (오버라이드된 객체의 매서드가 호출된디.)
		//a 객체의 toString 매서드가 호출된다.
	}

}
