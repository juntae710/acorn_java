package day8;

public class Q6 {

	public static void main(String[] args) {

		int[] week = new int [7];
	
		for(int i=0; i<week.length; i++) {
			week[i] =(int) (Math.random()*35);
			System.out.println(week[i]);
		}
	}

}
