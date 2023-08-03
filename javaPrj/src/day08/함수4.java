package day08;

import java.util.Scanner;

public class 함수4 {

	public static void main(String[] args) {
		int[] result1 = a();
		int[][] result2 = b();
		
		for(int i=0; i<result1.length; i++) {
			System.out.println(result1[i]);
		}
		for(int i=0; i<result2.length; i++) {
			for(int j=0; j<result2[i].length; j++) {
				
				System.out.print(result2[i][j]+ " ");
			}
			
		}
	}
	//반환은 한 개만 가능하다.
	// int 자리가 반환 타입.
	// 다음은 변수명 
	//반환을 여러개 해줄려면 배열 형태로 꺼내야함
	public static int[] a() {
		int [] result= {3,5};
		return result;
		}
	public static int[][] b (){
		int [][] result = {{1,2},{3,4}};
		return result;
	}
		
	}
	


