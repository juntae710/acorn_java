package day08;

public class Q6_1 {

	public static void main(String[] args) {
		
		int[] week = new int [7];
		System.out.println("5만년뒤 지구 한주 기온");
		System.out.println("일요일");
		weather();
		System.out.println("월요일");
		weather();
		System.out.println("화요일");
		weather();
		System.out.println("수요일");
		weather();
		System.out.println("목요일");
		weather();
		System.out.println("금요일");
		weather();
		System.out.println("토요일");
		weather();
		
			
		
	}

	public static void weather() {
		int tem = (int) (Math.random()*35);
		System.out.println(tem+"도");
	}

}
