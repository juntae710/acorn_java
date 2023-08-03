package day12.숙제4;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 	
		 System.out.println("카카오 잔고를 적어주세요");
		 int km=sc.nextInt();
		
		Kakao k = new Kakao();
	
		System.out.println("-----카카오-----");
		// 입금 (잔고 , 입금액)
		
		
		// 출금 (잔고, 출금액, 수수료)
		int result2 = k.withdraw(km, 1000);
		System.out.println("잔고:" + result2);
		km-=1500;
		
		// 적금 (적금액, 적금개월수)
		int result3 = (int) k.Savings(200000, 24);
		System.out.println("만기금액:" + result3);
		
		///////////////////////////////////////////////////////
		
		 System.out.println("토스 잔고를 적어주세요");
		 int tm=sc.nextInt();
		 
		Toss t = new Toss ();
		System.out.println("-----토스-----");
		// 입금 (잔고 , 입금액)
		int result4 = t.deposit(tm, 1000);
		System.out.println("잔고:" + result4);
		tm+=1000;
			
		// 출금 (잔고, 출금액, 수수료)
		int result5 = t.withdraw(tm, 1000);
		System.out.println("잔고:" + result5);
		tm-=2000;
		
		// 적금 (적금액, 적금개월수)
		int result6 = (int) t.Savings(200000, 24);
		System.out.println("만기금액:" + result6);

	}

}
