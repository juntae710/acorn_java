package day02;

public class 표준태 {

	public static void main(String[] args) {
		double hp = 250;
		double	hu = 0.036;
		double hup = 0;
		double kp = 180;
		double	ku = 0.042;
		double kup = 0;
		int y = 1999;
		int c = 0;
		int sum;
		
		while(kp <= hp) {
			hup = hp * hu;
			hp= hp + hup;
			kup = kp * ku;
			kp=kp+kup;
			
			c=c+1;
			
					
		}
		sum = y+c;
		System.out.println(sum);
		}
	}
