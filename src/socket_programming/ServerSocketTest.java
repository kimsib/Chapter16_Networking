package socket_programming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
public static void main(String[] args) {
	
	try {
		ServerSocket serverSocket = new ServerSocket(4111);
		System.out.println("클라이언트 연결 대기중...");
		
		Socket clientSocket = serverSocket.accept();
		
		
		System.out.println("연결되었습니다." + serverSocket);
		
		clientSocket.close();
		serverSocket.close();
		
		
		
		
	} catch (IOException e) {
	
		e.printStackTrace();
	}
}
}
