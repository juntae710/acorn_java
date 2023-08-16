package day20.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client0 {

	Socket s;

	DataInputStream dis;
	DataOutputStream dos;

	public Client0() {
		// 서버의 ip,port
		try {
			s = new Socket("61.73.130.228", 6100);
			System.out.println("서버에 요청");

			// 보내기
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());

			dataSend();

			// 받기
			dataRecv();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void dataRecv() {
		try {
			String message = dis.readUTF();
			System.out.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void dataSend() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메시지 작성");
		String message = sc.nextLine();
		try {
			dos.writeUTF(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Client0 c = new Client0();

	}

}
