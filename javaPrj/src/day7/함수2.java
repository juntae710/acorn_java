package day7;

public class 함수2 {
	
	public static void main(String[] args) {
		//기본은 메인 함수안에 모든 코드를 작성하고
		//함수를 사용하고 싶을 때는 메인 함수밖에  
		//public static void 함수명 하고 {}안에 코드 작성후
		//메인 함수 안에 함수명(); 이용해서 사용
		
		//함수 : 특정기능을 수행하는 코드블럭, 코드의 중봉을 제거할 목적으로.코드분할
		// printTitle :함수명 (기능에 맞게 이름 정하기)
		//기능 :성적표 타이틀 출력가능
		//입력 : 입력으로 받는 값
		//반환값 : 기능을 수행하고 반환하는 값
		
		
		
		// 성적 타이틀 출력 하는 코드
		//노가다
//		System.out.println("++++++++++++");
//		System.out.println("====성적표====");
//		System.out.println("++++++++++++");
//		
//		System.out.println("++++++++++++");
//		System.out.println("====성적표====");
//		System.out.println("++++++++++++");
//		
//		System.out.println("++++++++++++");
//		System.out.println("====성적표====");
//		System.out.println("++++++++++++");
//		
		//함수
		printTitle();
		printTitle();
		printTitle();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void printTitle() {
		System.out.println("*************");
		System.out.println("****성적표****");
		System.out.println("*************");
	}
}
