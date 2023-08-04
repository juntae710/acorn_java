package day14.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		
		
		//기반 스트림
		try {
			//데이터가 들어오는 길 (통로)를 얻어온것
			FileInputStream fis = new FileInputStream("res/test.txt");
			
//			su = fis.read();
//			System.out.println((char)su);
//			su = fis.read();
//			System.out.println((char)su);
			
			//파일이 생서오딜 때 파일 끝에 -1 생성됨 (파일의 끝을 알리는 문자)
			while(true) {
				int su;
				su = fis.read();
				if (su == -1) break;
				System.out.println((char)su);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
