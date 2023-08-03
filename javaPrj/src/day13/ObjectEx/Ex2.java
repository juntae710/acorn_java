package day13.ObjectEx;

public class Ex2 {

	public static void main(String[] args) {
		B b1 = new B(5);
		B b2 = new B(5);
		
		//두개의 객체가 만들어짐
		
		if (b1.equals(b2)) { //b1 , b2
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}

	}

}
