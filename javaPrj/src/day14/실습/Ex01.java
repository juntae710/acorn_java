package day14.실습;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex01 {

	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/name.txt"));

			while (true) {

				String name = bf.readLine();
				if (name == null)
					break;			
				System.out.println(name);
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
