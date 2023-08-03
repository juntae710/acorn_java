package day08;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		int sumTotal = total();
		System.out.println(sumTotal);
	}

	public static int total() {
		//두 수의 합을 구하는 함수 만들기
		System.out.println("합을 원하는 두수를 적어주세요");
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		int sum = 0;
		sum = su1 + su2;
		return sum;
	}

}
