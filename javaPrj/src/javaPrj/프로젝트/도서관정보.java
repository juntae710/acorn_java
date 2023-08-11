package javaPrj.프로젝트;

import java.util.Scanner;

public class 도서관정보 {

	now도서관 now = new now도서관();
	대림도서관 dl = new 대림도서관();
	생각공장도서관 sg = new 생각공장도서관();

	public void other() {

		loop05: while (true) {
			System.out.println("----------------------\n도서관 정보를 조회합니다.\n1.now도서관\n2.대림도서관\n3.생각공장도서관\n4.종료");

			// 이름, 주소, 운영시간, 휴관일, 대여권수, 대여일수, 전화번호
			Scanner sc = new Scanner(System.in);
			String su = sc.nextLine();
			int suNum = Integer.parseInt(su);
			switch (suNum) {
			case 1:
				System.out.println("\n현재 도서관 정보");
				System.out.println("------------------------");
				now.이름();
				now.주소();
				now.운영시간();
				now.휴관일();
				now.대여권수();
				now.대여일수();
				now.전화번호();
				System.out.println("");
				break;
			case 2:
				System.out.println("\n대림도서관 정보");
				System.out.println("------------------------");
				dl.이름();
				dl.주소();
				dl.운영시간();
				dl.휴관일();
				dl.대여권수();
				dl.대여일수();
				dl.전화번호();
				System.out.println("");
				break;
			case 3:
				System.out.println("\n생각공장도서관 정보");
				System.out.println("------------------------");
				sg.이름();
				sg.주소();
				sg.운영시간();
				sg.휴관일();
				sg.대여권수();
				sg.대여일수();
				sg.전화번호();
				System.out.println("");
				break;
			case 4:
				System.out.println("종료");
				break loop05;
			}
		}
	}

}