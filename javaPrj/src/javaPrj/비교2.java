package javaPrj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class 비교2 {

	public static void main(String[] args) {
		System.out.println("아이디를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		
		String name1;
		name1= sc.nextLine();
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/고객정보.txt"));
			
			boolean 결과 = name1.equals(bf);
			
			if (결과==true ) {
				System.out.println("로그인 완료.");
				
			} else {
				System.out.println("잘못된입력입니다.");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
		
		
		
		

	}

}
	
