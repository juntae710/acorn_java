package day09;

public class 자료형_Customer_test {

	public static void main(String[] args) {
		//Class 사용해보기
		
		
		//자료형 변수;
		int a;
		
		//배열, 객체는 메모리에 공간을 확보하는 행위를 할때는 new로
		//힙메모리 사용 강제되게 해야함
		
		자료형_Customer c= new 자료형_Customer();
		c.name="홍길동";
		c.id="angel";
		c.age=25;
		
		
		System.out.println(c.name);
		System.out.println(c.id);
		System.out.println(c.age);
	}

}
