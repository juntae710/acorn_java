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

public class 메인 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String menu1;
		String menu2;
		String 아이디;

		loop: while (true) {
			System.out.print("1.회원가입 2.로그인");

			menu1 = sc.nextLine();

			switch (menu1) {
			case "회원가입":
				System.out.println("--------회원가입----------------");
				System.out.println("새로운 아이디를 적어주세요\r\n");

				String a = sc.nextLine();
				

				String filePath = "res/고객정보.txt";
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
				break;
			case "로그인":
				while (true) {
					System.out.println("--------로그인-----------------");
					System.out.println("--------아이디를 입력하세요.--------");
					아이디 = sc.nextLine();
					try {

						// file을 가져와 file 객체 생성 ( '\'가 아닌 '/'임을 명심 )
						File aText = new File("res/고객정보.txt");

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

						// 버퍼를 닫아줌 ( 파일을 닫아줌 )
						aBufReader.close();
						int 카운팅 = 0;
						for (int i = 0; i < aLines.size(); i++) {
							if (aLines.get(i).equals(아이디)) {
								System.out.println("로그인완료");
								System.out.print("1.대여 2.반납 3.도서신청");

								menu2 = sc.nextLine();
								switch (menu2) {
								case "대여":
									System.out.println("--------대여------------------");
									System.out.println("대여할 책번호를 입력해 주세요.");
									String 책번호 = sc.nextLine();
									try {

										// file을 가져와 file 객체 생성 ( '\'가 아닌 '/'임을 명심 )
										File aText1 = new File("res/책정보.txt");

										// file 입력 스트림을 생성
										FileReader aReader1 = new FileReader(aText1);

										// 스트림으로 입력 버퍼를 생성
										BufferedReader aBufReader1 = new BufferedReader(aReader1);

										List<String> aLines1 = new ArrayList<String>();

										String aLine1 = "";

										// 텍스트 내용을 한 줄씩 읽어와 aLine에 담고, 이를 aLines에 add 함.
										while ((aLine = aBufReader1.readLine()) != null) {
											aLines.add(aLine);
										}

										// 버퍼를 닫아줌 ( 파일을 닫아줌 )
										aBufReader1.close();
										int 카운팅1 = 0;
										for (int j = 0; j < aLines.size(); j++) {
											if (aLines.get(j).equals(책번호)) {
												System.out.println("대여하시겠습니까?");

											} else {
												카운팅++;

											}

										}
										if (카운팅 == aLines.size()) {
											System.out.println("이미 대여된 책입니다.");
										}

									} catch (Exception e) {
										// TODO
									}
									break;
								case "반납":
									System.out.println("--------반납------------------");
									break;
									
								case "도서신청":
									System.out.println("--------도서신청----------------");
							        loop1:while(true){

							            System.out.println("메뉴를 선택하세요>\n1.희망도서 신청 2.희망도서 조회 3.희망도서 취소 4.종료");
							            Scanner select = new Scanner(System.in);
										String menuNum = select.nextLine();
							            int menu = Integer.parseInt(menuNum);
							            switch (menu){
							                case 1: 
							            		projet_taemin03_class.registerBook();	// 희망도서를 신청하는 메서드
							                    break;
							                case 2: 
							                	projet_taemin03_class.scanBook();		// 신청한도서를 조회하는 메서드
							                    break;
							                case 3: 
							                	projet_taemin03_class.delBook();		// 신청한도서를 취소하는 메서드
							                    break;
							                case 4: 
							                    System.out.println("도서신청을 종료합니다");
							                    break loop1;
							            }
							        }
									break;
								}
							} else {
								카운팅++;

							}

						}
						if (카운팅 == aLines.size()) {
							System.out.println("잘못된입력입니다.");

						}
					} catch (Exception e) {
						// TODO
					}

				} // while
			case "종료":
				System.out.println("--------종료--------");
				break loop;
			default:
				System.out.println("잘못된 입력");
			} // switch

		} // while

	} // main 종료

}
