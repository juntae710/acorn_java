package day12.숙제4;

public class Toss implements BankI  {
	//입금
	@Override
	public int deposit(int money, int deposit) {
		int result = money+deposit;
		System.out.println("잔고:"+money+" 입금액:"+deposit);
		return result;
	}
	//출금
	@Override
	public int withdraw(int money, int withdraw) {
		int result = money-withdraw-1000;
		System.out.println("잔고:"+money+" 출금액+수수료:"+(withdraw+1000));
		return result;
	}
	//적금
	@Override
	public double Savings(int money, int month) {
		double result = money*month*1.05;
		System.out.println("적금액:"+money+
				" 적금개월수:"+month+"개월"+
				" 이윤:"+5+"%"
				);
		return result;
	}

	


	

}
