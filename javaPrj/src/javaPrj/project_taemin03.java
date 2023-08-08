package javaPrj;

import java.util.Scanner;

public class project_taemin03 {
    public static void main(String[] args) {
       
        loop:while(true){

            System.out.println("메뉴를 선택하세요>\n1.희망도서 신청 2.희망도서 조회 3.희망도서 취소 4.종료");
            Scanner select = new Scanner(System.in);
			String menuNum = select.nextLine();
            int menu = Integer.parseInt(menuNum);
            switch (menu){
                case 1: 
            		projet_taemin03_class.registerBook();	// 희망도서를 신청하는 메서드
                    break;
                case 2: 
                	projet_taemin03_class.scanBook();		// 신청한도서를 조회하는 메서드
                    break;
                case 3: 
                	projet_taemin03_class.delBook();		// 신청한도서를 취소하는 메서드
                    break;
                case 4: 
                    System.out.println("도서신청을 종료합니다");
                    break loop;
            }
        }
    }
    
    
}
