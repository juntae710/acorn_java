package day04;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<5; i ++ ) {
		
			System.out.println("1.등록, 2.조회, 3.변경, 4.삭제");
			
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("등록");
				break;
			case 2:
				System.out.println("조회");
				break;
			case 3:
				System.out.println("변경");
				break;
			case 4:
				System.out.println("삭제");
				break;
			default :
				System.out.println("잘못입력하였습니다.");
			
			
		}
		}
//		
//		loop : while (true) {
//		System.out.println("1.등록, 2.조회, 3.변경, 4.삭제 5.종료");
//		
//		Scanner sc = new Scanner(System.in);
//		int menu = sc.nextInt();
//			switch (menu) {
//			case 1:
//				System.out.println("등록");
//				break;
//			case 2:
//				System.out.println("등록");
//				break;
//			case 3:
//				System.out.println("등록");
//				break;
//			case 4:
//				System.out.println("등록");
//				break;
//			case 5:
//				System.out.println("종료");
//				break loop;
//			default :
//				System.out.println("잘못입력하였습니다.");
//			
//			
//		}
//		}
//		
		
	}

}
