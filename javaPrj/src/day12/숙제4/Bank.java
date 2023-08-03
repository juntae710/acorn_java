package day12.숙제4;

public abstract class Bank implements BankI  {
	//입금
	@Override
	public int deposit(int money, int deposit) {
		int result = money+deposit;
		System.out.println("잔고:"+money+" 입금액:"+deposit);
		return result;
	}
	//출금
	@Override
	public abstract int withdraw(int money, int withdraw);
	//적금
	@Override
	public abstract double Savings(int money, int month);

	


	

}
