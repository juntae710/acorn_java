package day3;

public class 반복문별 {

	public static void main(String[] args) {
		//별 5개 5줄
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//별 점점 늘어나기 5줄
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//별 점점 줄어들기 5줄
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=6-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//별 2개씩 늘어나기 5줄
//		int k=1;
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=k; j++) {
//				System.out.print("*");
//			}
//			k+=2;
//			System.out.println("");
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i*2-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//별 피라미드
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i*2-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
		//별 피라미드 and 역피라미드
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i*2-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		}
	}


