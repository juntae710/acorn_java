
package day09;

public class 함수리턴 {

	public static void main(String[] args) {
		int[] arr =new int[] {9,8,7};
		printArry(arr);
		//호출되면 코드를 수행하고 ㅍ호풀한 쪽으로 돌아감
	}
	public static void printArry(int[] a) {
		for(int number : a) {
			System.out.print(number+" ");
			
		}
		System.out.println();
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}

