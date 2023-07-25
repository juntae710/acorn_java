package day6;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int sum=0;
		int[] su =new int [10];
		System.out.println("수를 입력하시오");
		for(int i=0; i<su.length; i++) {
			Scanner sc = new Scanner(System.in);
			su[i]=sc.nextInt();
		}
		for(int i=0; i<su.length; i++) {
			sum += su[i];
			System.out.print(su[i]+" ");
		}
		System.out.println(" ");
		System.out.println(sum);
		
		
		
	}

}
