package day4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<10; i ++ ) {
		
			System.out.println("수를 10번 입력하여 주세요.");
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			if( a %2 ==0) {
				sum= sum+a;
			
			}
			
		}
		System.out.println(sum);
	}

}
