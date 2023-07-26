package day7;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int[] measure = new int [20];
		int k;
		System.out.println("약수를 구하고 싶은 수를 적어주세요.");
		Scanner sc = new Scanner(System.in);
		k=sc.nextInt();
		for(int i=1; i<=k; i++) {
			for(int j=1; j<=k; j++) {
				if(i*j==k) {
					measure[j]=i; 
					System.out.println(measure[j]);
				}
			}
		}
		
		
		
	

	}

}
