package day08;

public class 함수9 {

	public static void main(String[] args) {
		//지역 변수 : 함수안에서 만든 변수는 그 함수안에서 유효하다.
		//변수의 유효범위
		// main에서 만든 변수는 main에서만 유효함
		String[] days= new String[3]; //인자 정보 , 반환 정보 활용
		int i=0;
		days[i]="놀러가기";
		System.out.println(days[i]);
		
		
		

	}

	public static void selectDay(String[] days) {
//		for(String day : days) {
//			System.out.println(day);
//		}
	}

	public static void insertDay(String[] a, int index) {
//		a[index]="놀러가기";
	}

}
