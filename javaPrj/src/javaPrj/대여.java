package javaPrj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 대여 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("대여할 책번호를 입력해 주세요.");

			String 책번호 = sc.nextLine();

			String menu2;
			try {

				// file을 가져와 file 객체 생성 ( '\'가 아닌 '/'임을 명심 )
				File aText = new File("res/책정보.txt");

				// file 입력 스트림을 생성
				FileReader aReader = new FileReader(aText);

				// 스트림으로 입력 버퍼를 생성
				BufferedReader aBufReader = new BufferedReader(aReader);

				List<String> aLines = new ArrayList<String>();

				String aLine = "";

				// 텍스트 내용을 한 줄씩 읽어와 aLine에 담고, 이를 aLines에 add 함.
				while ((aLine = aBufReader.readLine()) != null) {
					aLines.add(aLine);
				}

				// 버퍼를 닫아줌 ( 파일을 닫position아줌 )
				aBufReader.close();
				int 카운팅 = 0;
				for (int i = 0; i < aLines.size(); i++) {
					if (aLines.get(i).equals(책번호)) {
						System.out.println("대여하시겠습니까?");
						System.out.println("네 | 아니요");
						menu2 = sc.nextLine();
						switch (menu2) {
						case "네":

							String filePath = "res/책정보.txt"; // Specify the path to your text file
							String textToDelete = 책번호; // Specify the text you want to delete

							try {
								File inputFile = new File(filePath);
								File tempFile = new File("temp.txt"); // Temporary file to hold modified content

								BufferedReader reader = new BufferedReader(new FileReader(inputFile));
								BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

								String currentLine;

								while ((currentLine = reader.readLine()) != null) {
									// Check if the current line contains the text to delete
									if (!currentLine.contains(textToDelete)) {
										writer.write(currentLine);
										writer.newLine();
									}
								}

								writer.close();
								reader.close();

								if (inputFile.delete()) {

									if (tempFile.renameTo(inputFile)) {
										System.out.println("대여완료(대여기간 : 금일부터 2주)");
									} else {
										System.err.println("임시파일 이름 바꾸기 오류");
									}
								} else {
									System.err.println("원본파일 삭제오류");
								}
							} catch (IOException e) {
								e.printStackTrace();
							}

							break;
						case "아니요":
							break;
						}
					} else {
						카운팅++;

					}

				}
				if (카운팅 == aLines.size()) {
					System.out.println("현제 도서관에 없는 책입니다.");
				}

			} catch (Exception e) {
				// TODO
			}
		}
		
	}

}
