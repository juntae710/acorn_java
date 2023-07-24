package day2;

public class 정훈님s3 {

	public static void main(String[] args) {
		long a=1;
		long b=1;
		int n=2;
		final int MAX = 10;
		
		System.out.println(a +" "+b);
		
		while(true) {
			a=a+b;
			n=n+1;
			System.out.println(a);
			if(n==MAX) break;
			b=a+b;
			n=n+1;
			System.out.println(b);
			if(n==MAX)break;
		}

	}

}
