package day9;

public class 함수_재사용성 {

	public static void main(String[] args) {
		int su1=9,su2=5;
		int sum=su1+su2;
		System.out.println(sum);
		
		int su3=5, su4=6;
		int result = adder(su3,su4);
		System.out.println(result);
	}
	//반환타입을 정해줘야 하고 반환은 하나 
	//반환 없을때는 void
	//복잡한 데이터 반환하고 싶으면 배열이나 객체 형태로
	
	//기능 : 두수를 더해주는 기능 , (함수명작명:기능에 맞게 첫글자 소문자)
	//작성자 : 표준태
	//입력정보 : 두개의 정수
	//반환정보 : 두수의 합
	public static int adder(int su1, int su2) {
		int sum = su1+su2;
		return sum;
	}
}
