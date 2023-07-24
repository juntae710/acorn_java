package day1;

public class 박태민 {
	public static void main(String[] args) {
		
		//변수 선언
		//m
		//sum
		//int : 자료형 <-변수 선언시 정수 값을 저장시키기 위한 변수 선언
		
//		int n=0;
		int sum=0;
		
//		while(n<=100) { // 10미만일때
//			n=n+1;
//			sum = sum + n*(101-n);
//			
//		}
		for( int n=1; n<=100; n++){
			sum = sum + n *(101-n);
			
		}
		
		System.out.println(sum);
	}
	
}
