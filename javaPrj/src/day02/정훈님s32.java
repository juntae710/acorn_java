package day02;

public class 정훈님s32 {

	public static void main(String[] args) {
		long a=1;
		long b=1;
		int n=2;
		final int MAX = 10;
		
		System.out.println(a +" "+b);
		
		while(n<= MAX) {
			a=a+b;
			b=a+b;
			n=n+2;
			System.out.println(a +" "+b);
		}

	}

}
