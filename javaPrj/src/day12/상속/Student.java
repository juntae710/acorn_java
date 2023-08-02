package day12.상속;

public class Student extends Person {
	//자식의 생성자는 기본적으로 부모의 기본생성자를 호출
	//상속관계에서 부모가 기본생성자가 있어야함.
	int classNo;
	
	public Student(String name, String id, int classNo) {
		//super();
		//기본적으로 부모의 기본생성자를 호출합니다.
//		super(name , id);
		//이런식으로 부모에서 호출할 것들 선택 가능
//		this.name=name;
//		this.id=id;
		this.classNo=classNo;
	}
	
	public String toString () {
		return name+" "+id+" "+classNo;
	}
	
}
