package socket_programming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {
	public static void main(String[] args) throws IOException {
		
		String str = "안녕하세요? 반갑습니다^^";
		
		ServerSocket server = new ServerSocket(8111);
		System.out.println("서버 준비 완료");
		
		Socket socket = server.accept();
		System.out.println("클라이언트 연결 완료");
		
		
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		
		
		
	
		
		
		dos.writeUTF(str);
		dos.flush();
		out.close();
		
		socket.close();
		server.close();
		
		
		System.out.println("서버 종료");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
