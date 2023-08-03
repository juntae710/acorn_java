package day08;

import java.util.Scanner;

public class 함수2 {

	public static void main(String[] args) {
		int n=5;
		srtSum2(n);
	}

	public static void srtSum2(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	

}
