package day03;

public class 반복문구구단 {

	public static void main(String[] args) {
		//2단~4단 출력
		//2단
//		for(int i=1; i<=9; i++) {
//			System.out.println(2*i);
			
		//2~4단
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
		}
	}


