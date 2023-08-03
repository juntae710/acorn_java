package day04;

public class BreakEx {

	public static void main(String[] args) {
		//switch, while, for break;
		
		
		int i=0;
		int sum=0;
		while(true) {
			//무한반복 , 탈출조건
			i++;
			sum=sum+i;
			if (i>=10)break;
		}
		System.out.println(sum);
		
	}

}
