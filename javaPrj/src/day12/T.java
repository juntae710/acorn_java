package day12;

public class T {

	public static void main(String[] args) {
		가정용선풍기 home = new 가정용선풍기();
		home.가정용선풍기();
		선풍기(home);
		home.사이즈();
		home.전력공급();
		System.out.println();
		
		손선풍기 hand = new 손선풍기();
		hand.손선풍기();
		선풍기(home);
		hand.사이즈();
		hand.전력공급();
		System.out.println();
		
		공업용선풍기 factory = new 공업용선풍기();
		factory.공업용선풍기();
		선풍기(home);
		factory.사이즈();
		factory.전력공급();
		System.out.println();
		}

	public static void 선풍기(선풍기 선풍기) {
		선풍기.켜기버튼();
		선풍기.끄기버튼();
		선풍기.날개회전();
		선풍기.속도조절();

	}

}
