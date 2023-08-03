package day08;

import java.util.Scanner;

public class 함수6 {

	public static void main(String[] args) {
		int[] result = getMoneyCount(312510);
		for(int moneyUnit : result) { //향상된 for문 배열을 쭈루룩 뽑아줌
			System.out.print(moneyUnit + " ");
		}
	}

	public static int[] getMoneyCount(int money) {
		int [] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int [] moneyArrMain = new int [moneyArr.length];
		
		
		for(int i = 0 ; i <moneyArr.length; i++ ) {
			moneyArrMain[i]= money / moneyArr[i];
			money %= moneyArr[i];
		}
		
//        System.out.print("돈 매수 구하기: ");
//        for(int i=0 ; i < moneyArrMain.length; i++) {
//            System.out.print(moneyArrMain[i] + " ");
//        }
        return moneyArrMain;
	}
		
}
	


