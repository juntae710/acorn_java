package day4;

public class Q11 {

	public static void main(String[] args) {
		//출력
		double avg;
		double kor_avg;
		double eng_avg;
		double math_avg;
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		int kor_sum;
		int eng_sum;
		int math_sum;
		int MAX=60;
		int SUBJECT=3;
		int i=0;
		
		while(i>1) {
			sum = kor+eng+math;
			avg = sum/SUBJECT;
			kor_sum=kor_sum+kor;
			eng_sum=eng_sum+eng;
			math_sum=math_sum+math;
			
			
			i++;
		}

	}

}
