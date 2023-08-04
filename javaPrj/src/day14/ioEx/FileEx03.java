package day14.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx03 {

	public static void main(String[] args) {
		
		
		//기반 스트림
		try {
			//데이터가 들어오는 길 (통로)를 얻어온것
			FileInputStream fis = new FileInputStream("res/acorn.txt");
			
			int data = fis.read();
			
			System.out.println((char)data);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
