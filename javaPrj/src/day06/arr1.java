package day06;

public class arr1 {

	public static void main(String[] args) {
		String[] arr = new String[6];
		String[] arr2 = {"수성","금성"};
		arr[0] = "수성";
		arr[1] = "금성";
		arr[2] = "지구";
		arr[3] = "화성";
		arr[4] = "목성";
		arr[5] = "토성";
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
