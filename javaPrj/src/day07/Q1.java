package day07;

public class Q1 {

	public static void main(String[] args) {
		int[]  temperatures = { 27,27,28,29,30,33,32,33,32,31,31,33,33,31} ;
		int avg = 0;
		int[] havg = new int [temperatures.length];
		System.out.println("모든 기온");
		for(int i=0; i<temperatures.length; i++) {
			System.out.print(temperatures[i]+" ");
		}
		
		System.out.println();
		System.out.println("모든 기온 역순");
		for(int i=13; i>=0; i--) {
			System.out.print(temperatures[i]+" ");
		}
		
		System.out.println();
		System.out.println("평균기온");
		for(int i=0; i<temperatures.length; i++) {
			avg += temperatures[i];
		
		}
		avg/=temperatures.length;
		System.out.println(avg);
		System.out.println("평균기온보다 높은 일수");
		for(int i=0; i<temperatures.length; i++) {
			if(avg <temperatures[i]) {
				havg [i] = temperatures[i];
				System.out.print(havg[i]+" ");
			}
			
		}
		
		
	}

}
