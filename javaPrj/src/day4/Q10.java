package day4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		System.out.println("원하는 메뉴(마이쭈,세콤달콤,껌)와 개수를 적어주세요");
		Scanner sc = new Scanner (System.in);
		String menu=sc.next();
		int su =sc.nextInt();
		switch (menu) {
			case "마이쭈" :
				System.out.println(menu +" "+su+"개 "+700*su+"백원");
				break;
			case "세콤달콤" :
				System.out.println(menu +" "+su+"개 "+500*su+"백원");
				break;
			case "껌" :
				System.out.println(menu +" "+su+"개 "+1000*su+"백원");
		}
			
	}

}
