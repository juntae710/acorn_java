package day03;

public class 윤정님2 {

	public static void main(String[] args) {
		int sum = 2;
		int n=2;
		int i=1;
		
		while(i<7) {
			n=(n*2)+n;
			sum = sum+n;
			i++;
		}
		System.out.println(sum);
	}

}
