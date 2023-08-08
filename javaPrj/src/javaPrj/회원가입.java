package javaPrj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class 회원가입 {
	   public static void main(String[] args) throws IOException {
		   
		  System.out.println("새로운 아이디를 적어주세요\r\n");
		  Scanner sc=new Scanner(System.in);
	      String a = sc.nextLine();
			  
	      String filePath = "res/aaa.txt";
	        String content = a;

	        try {
	            // 파일에 문자열을 추가하기 위해 FileWriter와 BufferedWriter를 사용합니다.
	            FileWriter fileWriter = new FileWriter(filePath, true); // true는 append 모드를 나타냅니다.
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

	            // 새로운 문자열을 파일에 추가합니다.
	            bufferedWriter.write(content);
	            bufferedWriter.newLine(); // 새로운 줄로 이동합니다.

	            // 리소스를 정리합니다.
	            bufferedWriter.close();
	            fileWriter.close();

	            System.out.println("회원가입 되었습니다.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}