package day12.숙제4;

import java.util.Scanner;

public class test2 {

	static Scanner sc = new Scanner(System.in);
	static Kakao k = new Kakao();
	static Toss t = new Toss();

	public static void main(String[] args) {
		int choice1;
		System.out.println("은행을 선택해주세요 (1.카카오 2.토스)");

		String choice1_ = sc.nextLine();
		choice1 = Integer.parseInt(choice1_);
		
		int km;
		System.out.println("소지하고있는 잔고를 적어주세요.");
		String km_ = sc.nextLine();
		
		a : while (true) {
			switch (choice1) {
			case 1:
				int choice2;
				
				
				km = Integer.parseInt(km_);
				

				System.out.println("1.입금 2.출금 3.적금");
				String choice2_ = sc.nextLine();
				choice2 = Integer.parseInt(choice2_);
				
		
					
					switch (choice2) {
					case 1:
						int deposit;
						System.out.println("입금하고싶은 금액을 적어주세요.");
						String deposit_ = sc.nextLine();
						deposit = Integer.parseInt(deposit_);

						int result = k.deposit(km, deposit);
						System.out.println("잔고:" + result);
						km = result;

						break;
					case 2:
						int withdraw;
						System.out.println("출금하고싶은 금액을 적어주세요.");
						String withdraw_ = sc.nextLine();
						withdraw = Integer.parseInt(withdraw_);

						int result2 = k.withdraw(km, withdraw);
						System.out.println("잔고:" + result2);
						km -= withdraw;

						break;
					case 3:
						int money;
						int month;
						int and = 0;
						System.out.println("적금금액과 개월수를 순서대로 적어주세요");
						String money_ = sc.nextLine();
						money = Integer.parseInt(money_);
						String month_ = sc.nextLine();
						month = Integer.parseInt(month_);

						int result3 = (int) k.Savings(200000, 24);
						System.out.println("만기금액:" + result3);
						km += and;

						break;
					case 4:
						break ;

					
				}
				
				break;
			}
		}
		

	}

}
