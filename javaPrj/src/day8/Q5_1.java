package day8;

import java.util.Scanner;

public class Q5_1 {

	public static void main(String[] args) {
		System.out.println("금액을 적어주세요.");
		Scanner sc = new Scanner(System.in);
		int d=sc.nextInt();
		int[] res=m(d);
		for(int qty : res) {
			System.out.println(qty+"개");
		}
		
	}

	public static int[] m(int in) {
		//토글 사용
		int [] m=new int[8];	 
		int a = in;
		int b = 50000;
		int c = 0;
		
		
	
		for(int i=0; i<m.length; i++) {
			m[i]=a/b;
			a%=b;
			
			if(c==0) {
				b/=5;
				c++;
			}else {
				b/=2;
				c--;
			}
		}
		
		return m;
	}

}
