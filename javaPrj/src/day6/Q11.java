package day6;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		//출력
		double avg;
		double kor_avg;
		double eng_avg;
		double math_avg;
		//입력
		String name;
		int kor;
		int eng;
		int math;
		//처리
		int sum;
		int kor_sum= 0;
		int eng_sum= 0;
		int math_sum= 0;
		final int MAX=2;
		final int SUBJECT=3;
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<MAX; i++) {
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			sum = kor+eng+math;
			avg = (double)sum/SUBJECT;
			
			kor_sum+=kor;
			eng_sum+=eng;
			math_sum+=math;
			
			if(avg>=90) {
				System.out.println(name+" "+kor+" "+eng+" "+math+" "+avg+" Excellent");
			}else if(avg<60){
				System.out.println(name+" "+kor+" "+eng+" "+math+" "+avg+" Fail");
			}else{
				System.out.println(name+" "+kor+" "+eng+" "+math+" "+avg);
			}
			
			kor_avg = (double)kor_sum/MAX;
			eng_avg = (double)eng_sum/MAX;
			math_avg = (double)math_sum/MAX;
			
			System.out.println(kor_avg);
			System.out.println(eng_avg);
			System.out.println(math_avg);
			
		}
		
	}

}
