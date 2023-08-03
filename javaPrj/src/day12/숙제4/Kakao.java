package day12.숙제4;

public class Kakao extends Bank  {
	//출금
	@Override
	public int withdraw(int money, int withdraw) {
		int result = money-withdraw-500;
		System.out.println("잔고:"+money+" 출금액+수수료:"+(withdraw+500));
		return result;
	}
	//적금
	@Override
	public double Savings(int money, int month) {
		double result = money*month*1.04;
		System.out.println("적금액:"+money+
				" 적금개월수:"+month+"개월"+
				" 이윤:"+4+"%"
				);
		return result;
	}

	


	

}
