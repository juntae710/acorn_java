package day03;

import java.util.Scanner;

public class 민지님 {

	public static void main(String[] args) {
		int positive=0;
		int negative=0;
		int even=0;
		int odd=0;
		int i=0;
		int n;
		
		final int MAX = 5;
		
		Scanner sc= new Scanner (System.in);
		while(i<MAX) {
			System.out.println("수를 입력하세요.");
			n= sc.nextInt();
			if(n>0) {
				positive++;
				if(n % 2 == 0) {
					even++;
				}else {
					odd++;
				}
			}else {
				negative++;
			}
			i++;
		}
		System.out.println("양수의 개수" + positive);
		System.out.println("음수의 개수" + negative);
		System.out.println("짝수의 개수" + even);
		System.out.println("홀수의 개수" + odd);

	}

}
