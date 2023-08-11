package javaPrj;

import java.util.Scanner;

public class 독서실번호배열 extends 독서실좌석배치도 {

	public static void main(String[] args) {

		System.out.println(" 좌석을 선택해주세요\n 사용중 : ■\n 빈좌석 : □");

		for (int i = 0; i < seat.length; i++) {

			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]);
			}
			System.out.print("\n");
		}

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		int 열 = 0;
		int 행 = 0;

		if (no == 1) {
			열 = 2;
			행 = 2;
		} else if (no == 2) {
			열 = 2;
			행 = 4;
		} else if (no == 3) {
			열 = 2;
			행 = 6;
		} else if (no == 4) {
			열 = 2;
			행 = 8;
		} else if (no == 5) {
			열 = 2;
			행 = 10;
		} else if (no == 6) {
			열 = 3;
			행 = 2;
		} else if (no == 7) {
			열 = 23;
			행 = 4;
		} else if (no == 8) {
			열 = 3;
			행 = 6;
		} else if (no == 9) {
			열 = 3;
			행 = 8;
		} else if (no == 10) {
			열 = 3;
			행 = 10;
		} else if (no == 11) {
			열 = 6;
			행 = 2;
		} else if (no == 12) {
			열 = 6;
			행 = 4;
		} else if (no == 13) {
			열 = 6;
			행 = 6;
		} else if (no == 14) {
			열 = 6;
			행 = 8;
		} else if (no == 15) {
			열 = 6;
			행 = 10;
		} else if (no == 16) {
			열 = 7;
			행 = 2;
		} else if (no == 17) {
			열 = 7;
			행 = 4;
		} else if (no == 18) {
			열 = 7;
			행 = 6;
		} else if (no == 19) {
			열 = 7;
			행 = 8;
		} else if (no == 20) {
			열 = 7;
			행 = 10;
		}

		if (seat[열][행].equals("□")) {
			seat[열][행] = "■";
			System.out.println(" 좌석이 선택되었습니다.\n");
		} else {
			System.out.println(" 이미 선택된 좌석입니다.\n");
		}

		System.out.println(" 현재 좌석 상태");

		for (int i = 0; i < seat.length; i++) {

			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]);
			}
			System.out.print("\n");
		}
	}

}