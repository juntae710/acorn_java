package day10.classTyep;

public class CutomerTest2 {

	public static void main(String[] args) {
		int a;
		a=10;
		//Cutomer1형 변수를 만들어 봅시다.
		// Cutomer1 Cutomer1  = new Cutomer1();
		
		//참조형변수의 초기값은 null입니다.
		//참조형변수를 초기화 하고 싶을 땐 null로 초기화
		//null => 아무것도 참조하지 않음을 나타내는 값
		//Cutomer1gud 변수가 만들어 지지 않았다.
		Cutomer1 Customer1 = null;
		//변수를 만드는 행위Cutomer1
		//Customer1 = new Cutomer1(); <= 이 코드가 반드시 있어야 함.
		//변수를 만들지 않음
		// 오류 발생 (NullPounterException)
		Customer1.id="test01";
		Customer1.pw="1234";
		Customer1.name="홍길동";
		Customer1.address="서울시 마포구";
		
		System.out.println(Customer1.id);
		
		

	}

}
