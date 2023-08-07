package javaPrj;

import java.util.Scanner;

public class 비교 {

	public static void main(String[] args) {
		System.out.println("아이디를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		
		String name1;
		String name2;
		name1= sc.nextLine();
		name2= "juntae";
		
		
		boolean 결과 = name1.equals(name2);
		
		if (결과==true ) {
			System.out.println("로그인 완료.");
			
		} else {
			System.out.println("잘못된입력입니다.");
		}
		
		

	}

}
