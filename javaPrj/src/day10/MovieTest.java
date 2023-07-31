package day10;

public class MovieTest {

	public static void main(String[] args) {
		Movie[] Movies = new Movie[3];
		
		Movies[0]= new Movie();
		Movies[0].Movies("너의 이름은", 180);
		System.out.println(Movies[0].printInpo());
		
		Movies[1]= new Movie();
		Movies[1].Movies("날씨의 아이", 240);
		System.out.println(Movies[1].printInpo());
		
		Movies[2]= new Movie();
		Movies[2].Movies("스즈메의 문단속", 2);
		System.out.println(Movies[2].printInpo());
	}

}
