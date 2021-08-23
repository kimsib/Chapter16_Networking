package ftp_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FTPClient {
	public static final String IP = "localhost";
//	public static final String IP = "127.0.0.1";
	public static final int PORT = 9002;

	public static void main(String[] args) {
		
		// ����� ��Ʈ��
		InputStream in = null;
		OutputStream out = null;
		DataInputStream din = null;
		DataOutputStream dout = null;
		
		FileOutputStream fos = null;
		Scanner scan = null;
		
		//����
		Socket socket = null;
		
		try {
			socket = new Socket(IP, PORT);
			scan = new Scanner(System.in);
			// ����
			in = socket.getInputStream();
			din = new DataInputStream(in);
			
			// �۽�
			out = socket.getOutputStream();
			dout = new DataOutputStream(out);
			
			menudisplay();
			String fileName = scan.nextLine();
			
			//������ ����
			dout.writeUTF(fileName);
			System.out.println(timeStamp() + "���� ������ ��û�Ͽ����ϴ�.");
			System.out.println();
			//���ϵ����� ����
			System.out.println("���� ������...");
			System.out.println();
			
			
			
			fos = new FileOutputStream("c:/Temp/"+ fileName);
			int cnt = 0;
			while(true) {
				//�б�
				int data = din.read();
				if(data == -1)break;
				//����
				fos.write(data);
				if(cnt % 5000 == 0) {
				System.out.println("@");
				}
				cnt++;
			}
			System.out.println();
			System.out.println(timeStamp() + "���� ������ �Ϸ��Ͽ����ϴ�" + 
			"(" + cnt + "����Ʈ)");
		
			
System.out.println();
System.out.println(timeStamp() + "���� �ٿ�ε� �Ϸ�");
System.out.println();

		
	}
		
		
		
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(din != null) {din.close();}
				if(dout != null) {dout.close();}
				if(fos != null) {fos.close();}
				if(socket != null) {socket.close();}
			} catch(IOException ex) {ex.printStackTrace();}
		}
		
		
		System.out.println(timeStamp() + "Ŭ���̾�Ʈ ���� ��û ���α׷��� �����մϴ�");
		
		
		
	}

	private static void menudisplay() {
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println(" �ް� ���� ������ �̸�(���ϸ�,Ȯ����)�� �Է��� �ּ���");
		System.out.println();
		System.out.println("   [1]aaa.txt [2]bbb.txt [3]ccc.txt [4]image.gih");
		System.out.println();

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.print(" ����>");

	}

	private static String timeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss");

		return format.format(new Date());
	}

}
