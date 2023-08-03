package day04;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		System.out.println("원하는 단 숫자를 적어주세요.");
		Scanner sc = new Scanner(System.in);
		int su =sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(su+" "+i+" "+i*su);
		}
	}

}
