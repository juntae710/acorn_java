package day04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("res/data.txt");
		FileOutputStream fout = new FileOutputStream("res/dataCopy.txt");
		
		int x;
		
		x= fin.read();
		fout.write(x);
		x= fin.read();
		fout.write(x);
		x= fin.read();
		fout.write(x);
		x= fin.read();
		fout.write(x);
		x= fin.read();
		fout.write(x);
		x= fin.read();
		fout.write(x);
		x= fin.read();
		fout.write(x);
		System.out.println(x);
	}

}
