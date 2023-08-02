package day12.상속;

public class Person {
	//맴버변수 , 인스턴스 변수 , new를 통해서 변수가 만들어짐 (객체라고함)
	String name;
	String id;
	
	
	
	//생성자, 객체의 초기화 담당 , 기본생성자를 기본으로 제공
	//하나라도 만들면 기본생성자는 사라진다.
	// new 할 때 단한번 호출 된다 . 생성자끼리는 호출 가능하다 ( 단 첫줄에 와야함.)
	public Person() {
		this ("아무개","test01");
		//매개변수가 있는 생성자 호출한것
		//생성자 > 생성자 호출가능
		
		//위와 같은 실행결과
		//name = "아무개";
		//id = "test01"
	}
	public Person(String name, String id) {
		this.name=name;
		this.id=id;
		
	}
}
