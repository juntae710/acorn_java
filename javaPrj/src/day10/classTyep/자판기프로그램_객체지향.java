package day10.classTyep;

public class 자판기프로그램_객체지향 {

	public static void main(String[] args) {
		//변수의 지역성
		// 변수는 그안에서 만들어진 변수만 사용가능
		커피데이타2 coffee = null;
		coffee = new 커피데이타2();
		
		//printInfo(coffee);
		coffee.printInfo();
		
		//fillCoffee(coffee);
		coffee.fillCoffee();
		
		//printInfo(coffee);
		
		int money=100;
		//String result = 밀크커피만들기(coffee, money);
		String result = coffee.밀크커피만들기(money)
		System.out.println(result);

	}
}
