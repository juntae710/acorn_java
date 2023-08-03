package day03;

public class 제어문if {

	public static void main(String[] args) {
		int myAge = 26;
		int yourAge = 27;
		
		if(myAge > yourAge) {
			System.out.println("내가 형이다.");
		}
		
		if(myAge > yourAge) {
			System.out.println("내가 형이다.");
		}else {
			System.out.println("친구이거나 너가 형이야");
		}
		
		if(myAge > yourAge) {
			System.out.println("내가 형이다");
		}else if (myAge == yourAge){
			System.out.println("우린 친구야");
		}else {
			System.out.println("형이 형이야");
		}

	}

}
