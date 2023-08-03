package day09;

import java.util.Scanner;

public class Q3 {
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
			case 3:
				 System.out.println("이름을 바꿀 순번과 내용을 입력해주세요.");
				 String updateIndex_= sc.nextLine();
				 int updateIndex = Integer.parseInt(updateIndex_);				 
				 
				 String updateDay = sc.nextLine();				 
				 catchs[updateIndex-1] =  updateDay;
				 break;
			case 4:
				 System.out.println("풀어줄 포켓몬을 정해주세요.");
				 String deletepokemon_= sc.nextLine();
				 int deletepokemon = Integer.parseInt(deletepokemon_);
				 String[] newArray = new String[catchs.length - 1];         
			        System.out.println(deletepokemon);
			        System.out.println(catchs[deletepokemon]);
			        for( int i=0; i< deletepokemon; i++){
			        	newArray[i]=catchs[i];
			        }              
			                        
			        //new배열  삭제위치에서 마지막까지  반복
			        //원본배열의 위치는 new배열위치+1 이다
			        for( int i=deletepokemon; i< newArray.length ;i++){
			        	newArray[i]=catchs[i+1];
			        } 
			
			        catchs=newArray ;
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
