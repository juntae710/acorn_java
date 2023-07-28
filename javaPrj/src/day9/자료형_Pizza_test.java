package day9;

public class 자료형_Pizza_test {

	public static void main(String[] args) {
		자료형_Pizza c= new 자료형_Pizza();
		c.도우 = "씬";
		c.메인제료 = "고구마";
		c.자르는횟수 = 2;
		
		System.out.println("커스텀 피자");
		System.out.print(c.메인제료 +"피자 ");
		System.out.print(c.도우 + "도우 ");
		System.out.print(c.자르는횟수 + "번 컷팅");
		

	}

}
