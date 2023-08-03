package day03;

public class 예진님 {

	public static void main(String[] args) {
		int sum=0;
		int n=2;
		int i=0;
		
		while(i<7) {
			sum+=n;
			n*=3;
			i++;
		}
		System.out.println(sum);
	}

}
