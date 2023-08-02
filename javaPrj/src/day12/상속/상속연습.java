package day12.상속;

public class 상속연습 {

	public static void main(String[] args) {
		
		//person p = new person();
		// 불가능 기본 생성자가 없기때문에
		
		
		Person p = new Person("준태","1234");
		
		Student s = new Student("김민규","k100",1);
		System.out.println(s.toString());
	}

}
