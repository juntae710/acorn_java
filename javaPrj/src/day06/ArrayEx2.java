package day06;

public class ArrayEx2 {

	public static void main(String[] args) {
		//좋아하는 과일 5
		//내가 좋아하는 음료 5
		
		String[] fruits= {"샤인머스킷","복숭아","사과","망고"};
		String[] beverage= {"고구마라때","카라멜마끼아또","아아","청포도에이드"};
		
		// 2차원 배열
		
		// 2차원 배열 선언
		//String[][] favorites = new String [2][5];
		String[][] favorites = {{"샤인머스킷","복숭아","사과","망고"},
						{"고구마라때","카라멜마끼아또","아아","청포도에이드"}};
		
		System.out.println(favorites[0][0]);
		System.out.println(favorites[0][1]);
		System.out.println(favorites[0][2]);
		System.out.println(favorites[0][3]);
		System.out.println("");
		System.out.println(favorites[1][0]);
		System.out.println(favorites[1][1]);
		System.out.println(favorites[1][2]);
		System.out.println(favorites[1][3]);
		
		
		
	}

}
