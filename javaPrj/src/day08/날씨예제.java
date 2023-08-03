package day08;

public class 날씨예제 {

	public static void main(String[] args) {
		//4주차 목요일 출력
		int a= weather(3,5);
		System.out.println(a);
	}
	
	
	// 01주차
	// 0일요일
	public static int weather( int week  , int day) {
		
		int[][]  result = {
				
				{ 20,25,28,33,32,31,30},
				{ 25,25,28,33,32,31,30},
				{ 30,25,28,33,32,31,30},
				{ 30,25,28,33,32,31,30}
				
		};		
		
		int a=  result[week][day];
		return a ;
		
	}

}
