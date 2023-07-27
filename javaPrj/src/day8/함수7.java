package day8;

import java.util.Scanner;

public class 함수7 {

	public static void main(String[] args) {
		//일정을 관리하는 프로그램 작성 (일정 10개)
		
		String[] days = new String[10];
		
		Scanner sc = new Scanner(System.in);
		int menu;
		int index =0;
		
		loop : while (true) {
			System.out.print("메뉴선택: 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료 ");
			String menu_ = sc.nextLine();
			menu=Integer.parseInt(menu_);
			
			switch(menu) {
			case 1:
				System.out.println("일정을 입력하세요");
				String day =sc.nextLine();
				days[index] = day;
				index++;
				break;
			case 2:
				System.out.println("조회");
				for(int i =0; i<index; i++) {
					System.out.println(days[i]);
				}
				break;
			case 3:
				System.out.println("번경");
				System.out.println("변경할 순번과 내용을 입력하세요");
				for(int i =0; i<index; i++) {
					System.out.println((i+1)+ days[i]);
				}
	
				
				String updateIndex_= sc.nextLine();
				 int updateIndex = Integer.parseInt(updateIndex_);
				
				
				String updareDay = sc.nextLine();
				days[updateIndex-1] = updareDay;
				break;
			case 4:
				System.out.println("삭제");
				System.out.println("조회");
				for(int i =0; i<index; i++) {
					System.out.println(days[i]);
				}
				System.out.println("삭제하고 싶은 일정을 선택하세요");
				String deleteIndex_ = sc.nextLine();
				int deleteIndex = Integer.parseInt(deleteIndex_);
				days[deleteIndex-1]="";
				
				break;
			case 5:
				System.out.println("종료");
				
				
				
				break loop;
			default:
				System.out.println("잘못된입력");
				
			}
		}
		
		
		
		}
	}

	


