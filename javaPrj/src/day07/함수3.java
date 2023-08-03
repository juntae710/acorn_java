package day07;

public class 함수3 {
	
	public static void main(String[] args) {
		// 1~10 까지의 합
		//함수 하용 X
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum);

		System.out.println("프로그램 종료");
		
		
		//함수 하용
		i();
	}
	public static void i() {
		int sum2=0;
		for(int i=1; i<=10; i++) {
			sum2+=i;
		}
		System.out.println(sum2);

		System.out.println("프로그램 종료");
	}
}
