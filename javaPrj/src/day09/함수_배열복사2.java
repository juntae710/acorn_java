package day09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 함수_배열복사2 {

	public static void main(String[] args) {
		//원본 배열
		int [] arr = new int[] {3,5,9};
		
		//새로운 배열
		int a= 2;
		int b= (arr.length )- (a);
		int[] newArr = new int [b];
		          //원본배열 , 시작위치 , 새로운 배열 , 시작위치 ,개수
		
		System.arraycopy(arr, a, newArr, 0, b);
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));

	}

}
