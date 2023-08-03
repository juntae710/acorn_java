package day04;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int sum = 0 ;
		System.out.println("몇까지의 수의 합을 구하고 싶은가요?");
		Scanner sc = new Scanner (System.in);
		int a= sc.nextInt();
		
		for(int i=1; i<=a; i++ ) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
