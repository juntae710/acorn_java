package javaPrj;

import java.util.ArrayList;
import java.util.Scanner;

import day13.성적관리.Score;

public class 독서실좌석2 {

	public static void 독서실좌석어래이() {
		ArrayList<독서실클래스2> 좌석정보 = new ArrayList<>();
		// 좌석번호,조명,콘센트,칸막이,컴퓨터,주의사항
		좌석정보.add(new 독서실클래스2(1, "O", "O", "O", "X", "강냉방"));
		좌석정보.add(new 독서실클래스2(2, "O", "O", "O", "X", "강냉방"));
		좌석정보.add(new 독서실클래스2(3, "O", "O", "O", "X", "강냉방"));
		좌석정보.add(new 독서실클래스2(4, "O", "O", "O", "X", " "));
		좌석정보.add(new 독서실클래스2(5, "O", "O", "O", "X", "복도쪽"));
		좌석정보.add(new 독서실클래스2(6, "O", "O", "O", "X", " "));
		좌석정보.add(new 독서실클래스2(7, "O", "O", "O", "X", " "));
		좌석정보.add(new 독서실클래스2(8, "O", "O", "O", "X", " "));
		좌석정보.add(new 독서실클래스2(9, "O", "O", "O", "X", " "));
		좌석정보.add(new 독서실클래스2(10, "O", "O", "O", "X", "복도쪽"));
		좌석정보.add(new 독서실클래스2(11, "X", "X", "X", "X", " "));
		좌석정보.add(new 독서실클래스2(12, "X", "X", "X", "X", " "));
		좌석정보.add(new 독서실클래스2(13, "X", "X", "X", "X", " "));
		좌석정보.add(new 독서실클래스2(14, "X", "X", "X", "X", " "));
		좌석정보.add(new 독서실클래스2(15, "X", "X", "X", "X", "복도쪽"));
		좌석정보.add(new 독서실클래스2(16, "X", "X", "X", "X", " "));
		좌석정보.add(new 독서실클래스2(17, "X", "X", "X", "X", " "));
		좌석정보.add(new 독서실클래스2(18, "X", "X", "X", "X", " "));
		좌석정보.add(new 독서실클래스2(19, "X", "X", "X", "X", " "));
		좌석정보.add(new 독서실클래스2(20, "X", "X", "X", "X", "복도쪽, 출입구근처"));
		좌석정보.add(new 독서실클래스2(21, "X", "o", "o", "o", "창문"));
		좌석정보.add(new 독서실클래스2(22, "X", "o", "o", "o", "창문"));
		좌석정보.add(new 독서실클래스2(23, "X", "o", "o", "o", "창문"));
		좌석정보.add(new 독서실클래스2(24, "X", "o", "o", "o", "창문"));
		좌석정보.add(new 독서실클래스2(25, "X", "o", "o", "o", "창문, 출입구근처"));

		Scanner sc = new Scanner(System.in);
		System.out.println("좌석을 선택해주세요. 1~25번");
		int 좌석번호 = sc.nextInt();

		System.out.println(좌석정보.get(좌석번호 - 1));
		
		
		
	}
	
	

}
