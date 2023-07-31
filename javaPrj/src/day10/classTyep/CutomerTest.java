package day10.classTyep;

public class CutomerTest {

	public static void main(String[] args) {
		int a;
		a=10;
		//Cutomer1형 변수를 만들어 봅시다.
		// Cutomer1 Cutomer1  = new Cutomer1();
		
		//Cutomer1gud 변수가 만들어 지지 않았다.
		Cutomer1 Customer1; // 
		//변수를 만드는 행위Cutomer1
		Customer1 = new Cutomer1();
		
		Customer1.id="test01";
		Customer1.pw="1234";
		Customer1.name="홍길동";
		Customer1.address="서울시 마포구";
		
		System.out.println(Customer1.id);
		
		

	}

}
