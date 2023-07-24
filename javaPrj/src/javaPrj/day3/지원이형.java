package day3;

public class 지원이형 {

	public static void main(String[] args) {
		int sum=0;
		int n=0;
		int a=2;
		int b=3;
		
		while(n<7) {
			sum=sum+a;
			a*=b;
			n++;
		}
		System.out.println(sum);
	}

}
