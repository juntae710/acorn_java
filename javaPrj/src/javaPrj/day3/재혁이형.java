package day3;

public class 재혁이형 {

	public static void main(String[] args) {
		int year=1999;
		double h =2500000;
		double k =1800000;
		double a ;
		double b ;
		
		while(h>k) {
			year++;
			a= h*0.036;
			b= k*0.042;
			
			h= h+a;
			k= k+b;
		}
		System.out.println(year);
	}

}
