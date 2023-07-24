package day3;

public class 단아형2 {

	public static void main(String[] args) {
		int sum = 0;
		int jsum = 0;
		int i = 1;
	
		final int MAX=5;
		
		while(i<=100) {
	
			jsum = jsum + i;
			sum=sum +(jsum);
		}
		System.out.println(sum);
	}

}
