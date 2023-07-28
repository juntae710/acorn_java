package day9;

import java.util.Scanner;

public class Q2 {
	static int index=0;	
	static String[] catchs = new String[6];
	static Scanner sc = new Scanner( System.in);
	
	
	
	public static void main(String[] args) {
		System.out.println("포켓몬스터");
		int menu;
		while(true) {
			System.out.println("메뉴선택 1.이름정하기, 2.조회, 3.이름바꾸기 4.풀어주기");
			
			String menu_ = sc.nextLine();
			menu=Integer.parseInt(menu_);
			switch(menu) {
			case 1:
				 catch_();
				 break;
			case  2:
				check();
				 break;
			}
		}
	}


	public static void check() {
		System.out.println( "가지고 있는 포켓몬스터를 조회합니다.");
		 for( int i=0; i< index; i++) {
			 System.out.println( (i+1) +"." + catchs[i]);
		 }
	}


	public static void catch_() {
		System.out.println("포획한 포켓몬 이름을 적어주세요.");
		 String catch_  =sc.nextLine();
		 catchs[index]= catch_;
		 index++;
	}

}
