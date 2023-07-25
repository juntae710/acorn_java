package day6;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		int[] arr = new int[10]; 
		int a = 0;
		Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 "+arr.length +"번 입력하시오");		
        for (int i = 0; i < arr.length; i++) {

            int num = sc.nextInt();
            if (num % 2 == 0) {
            	arr[a] = num;
                a++;
            }
        }
        System.out.println("짝수"+a+"개");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }

	}


