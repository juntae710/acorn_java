package day09;

import java.util.Scanner;

public class Q1 {
	static String[] catchs = new String[6];
	static Scanner sc = new Scanner( System.in);
	static int index=0;	
	
	
	public static void main(String[] args) {
		System.out.println("포켓몬스터");
		int menu;
		while(true) {
			System.out.println("메뉴선택 1.이름정하기 ,2.조회");
			
			String menu_ = sc.nextLine();
			menu=Integer.parseInt(menu_);
			switch(menu) {
			case 1:
				 System.out.println("포획한 포켓몬 이름을 적어주세요.(최대 6마리)");
				 String catch_  =sc.nextLine();
				 catchs[index]= catch_;
				 index++;
				 break;
			case  2:
				System.out.println( "가지고 있는 포켓몬스터를 조회합니다.");
				 for( int i=0; i< index; i++) {
					 System.out.println( (i+1) +"." + catchs[i]);
				 }
			}
		}
	}

}
