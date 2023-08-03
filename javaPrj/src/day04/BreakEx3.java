package day04;

import java.util.Scanner;

public class BreakEx3 {

	public static void main(String[] args) {
		//switch, while, for break;
		
		
		//메뉴 1.등록, 2.조회, 3.변경, 4.삭제
		
		Scanner sc = new Scanner(System.in);
		int menu=1;
//		System.out.println("메뉴 1.등록, 2.조회, 3.변경, 4.삭제 5.종료");
//		menu=sc.nextInt();
//		switch(menu) {
//			case 1:
//				System.out.println("등록선택");
//				break;
//			case 2:
//				System.out.println("조회선택");
//				break;
//			case 3:
//				System.out.println("번경선택");
//				break;
//			case 4:
//				System.out.println("삭제선택");
//				break;
//			case 5:
//				System.out.println("종료");
//				break;
//			default:
//				System.out.println("잘못된 선택");
//				
//		}
		
		loop : while (true) {
			System.out.println("메뉴 1.등록, 2.조회, 3.변경, 4.삭제 5.종료");
			menu=sc.nextInt();
			switch(menu) {
				case 1:
					System.out.println("등록선택");
					break;
				case 2:
					System.out.println("조회선택");
					break;
				case 3:
					System.out.println("번경선택");
					break;
				case 4:
					System.out.println("삭제선택");
					break;
				case 5:
					System.out.println("종료");
					break loop ;
				default:
					System.out.println("잘못된 선택");
					
			}
		}
	}

}
