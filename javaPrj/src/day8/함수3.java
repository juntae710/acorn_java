package day8;

import java.util.Scanner;

public class 함수3 {

	public static void main(String[] args) {
		int n=5;
		int result =srtSum2(n);
		System.out.println(result);
	}

	public static int srtSum2(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		return sum;
	}
	

}
