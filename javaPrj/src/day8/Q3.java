package day8;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		stra();
	}

	public static void stra() {
		System.out.println("별이 나왔으면 하는 개수를 적어주세요.");
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		for(int i=0; i<=su; i++) {
			System.out.print("*");
		}
	}

}
