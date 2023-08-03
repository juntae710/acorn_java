package day04;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		System.out.println("아이디 이름 나이 키를 입력해주세요.");
		Scanner sc = new Scanner (System.in);
		String id = sc.next();
		String name = sc.next();
		int 나이= sc.nextInt();
		double 키= sc.nextDouble();
		
		
		System.out.println("사용자 정보"+" 아이디:"+id+" 이름:"+name+" 나이:"+나이+" 키:"+키);
	}

}
