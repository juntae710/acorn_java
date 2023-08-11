package javaPrj;

import java.util.Scanner;

public class 독서실클래스3 extends 독서실좌석배치도{

   public static int seat2 () {

      System.out.println(" 원하는 좌석을 입력해 주세요.\n"
            + " (예시)0행5열 -> 05)\n"
            + " 사용중 : ■\n 빈좌석 : □\n"
            + " 통 로 : ─");

      //System.out.print("\r 012345\n");
      for (int i = 0; i < seat.length; i++) {
         //System.out.print(i);
         
         for (int j = 0; j < seat.length; j++) {
            System.out.print(seat[i][j]);
         }
         System.out.print("\n");
      }

      Scanner sc = new Scanner(System.in);
      String a = sc.nextLine();
      String line = a.substring(0, 1);
      int lineInt = Integer.parseInt(line);
      String row = a.substring(1, 2);
      int rowInt = Integer.parseInt(row);
      if (seat[lineInt][rowInt].equals("■")) {
         seat[lineInt][rowInt] = "□";
         System.out.println(" 퇴실합니다.\n");
         
      }else if(seat[lineInt][rowInt].equals("□")) {
          seat[lineInt][rowInt] = "□";
          System.out.println(" 빈좌석입니다.\n"
                + " 다시 입력해 주세요.\n================");}
          
      else {
         System.out.println(" 다시 입력해 주세요.\n");
      }

      System.out.println(" 현재 좌석 상태");
      //System.out.print("\r 012345\n");
      for (int i = 0; i < seat.length; i++) {
         //System.out.print(i);
         for (int j = 0; j < seat.length; j++) {
            System.out.print(seat[i][j]);
         }
         System.out.print("\n");
      }
      return rowInt;
   }

}