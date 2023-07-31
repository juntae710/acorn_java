package day10.classTyep;

//class 정의 한것
//클래스 멤버 변수
public class 커피데이타3 {
	int 설탕;
	int 프리마;
	int 원두;
	int 물;
	int 매출금액;

	//입력
	//지역변수
	public void input(int 설탕, int 프리마, int 원두,int 물) {
		this.물 = 물;
		this.원두 = 원두;
		this.설탕 = 설탕;
		this.프리마 = 프리마;
	}
	//출력
	public void printInfo() {
		System.out.println(매출금액);
		System.out.println(물);
		System.out.println(설탕);
		System.out.println(원두);
		System.out.println(프리마);
	}

	
}
