package day14.ioEx;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) {
		//입출력 스트림
		//입력스트림 (데이터가 들어오는 길 (입력전용 메모리 버퍼))
		//츨력스트림 (데이터가 나가는 길 (출력전용 메모리 버퍼))

		
		//기반스트림
		//보조스트림
		
		try {
			int su = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//보조 프로그렘이 필요해짐
		//한 문자를 읽는 보조 스트림을 사용함
		//InputStreamReader ir = new InputStreamReader(Sys);
	}

}
