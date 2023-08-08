package javaPrj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 반납 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("반납\n책번호를 입력해주세요.");
			Scanner sc = new Scanner(System.in);
			String 책번호 = sc.nextLine();

			String filePath = "res/책정보.txt";
			String content = 책번호;

			try {
				FileWriter fileWriter = new FileWriter(filePath, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write(content);
				bufferedWriter.newLine();
				bufferedWriter.close();
				fileWriter.close();
				System.out.println("반납 되었습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}