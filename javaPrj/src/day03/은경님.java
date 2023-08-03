package day03;

public class 은경님 {

	public static void main(String[] args) {
		int sum=0;
		int n=2;
		int i=1;
		System.out.print( n +", ");
		while(i<=7) {
			sum += n;
			n=n*3; //n*=3
			System.out.print( n +", ");
			i++;
		}
		System.out.println("\n sum="+sum);
	}

}
