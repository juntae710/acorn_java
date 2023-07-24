package day2;

import java.util.Scanner;

public class 재화님p3 {

	public static void main(String[] args) {
		//입력 변수
		int num;
		
		//출력 변수
		int pos=0;
		int neg=0;
		int posEven=0;
		int posOdd=0;

		
		//처리변수
		int count=0; 
		final int MAX = 10;
		
		Scanner sc = new Scanner(System.in);
		
		while(count < MAX) {
			count++;
			num= sc.nextInt();
			
			if(num>0) {
				pos= pos+1;
				if(num %2 == 0) {
					posEven++;
				}else {
					posOdd++;
				}
			}else {
				neg= neg+1;
			}
		}
		//반복 끝
		System.out.println("양수의 개수"+ pos);
		System.out.println("음수의 개수"+ neg);
		System.out.println("짝수의 개수"+ posEven);
		System.out.println("홀수의 개수"+ posOdd);
	}

}
