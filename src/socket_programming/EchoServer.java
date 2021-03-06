package socket_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(8111);
		System.out.println("서버 준비 완료");

		Socket socket = server.accept();
		System.out.println("클라이언트 연결 완료");

		System.out.println(socket.getInetAddress());

		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);

		while (true) {

			String userMsg = dis.readUTF();
			System.out.println("사용자 메세지: " + userMsg);

			if (userMsg.equalsIgnoreCase("exit"))
				break;

		}

//		OutputStream out = socket.getOutputStream();
//		DataOutputStream dos = new DataOutputStream(out);

		dis.close();
		in.close();

		socket.close();
		server.close();

		System.out.println("서버 종료");

	}

}
