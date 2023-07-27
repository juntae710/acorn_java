package day3;

public class 단아형 {

	public static void main(String[] args) {
		int sum = 0;
		int jsum = 0;
		int i = 1;
		int j=i-1;
		final int MAX=5;
		
		while(i<=100) {
			j=i;
			jsum = jsum + j ;
			sum=sum +(jsum);
		}
		System.out.println(sum);
	}

}
