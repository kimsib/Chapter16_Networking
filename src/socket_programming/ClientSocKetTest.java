package socket_programming;

import java.io.IOException;
import java.net.Socket;

public class ClientSocKetTest {
public static void main(String[] args) {
	
	
	try {
		Socket socket = new Socket("localhost", 4111);
		System.out.println("����Ǿ����ϴ�." + socket);
		socket.close();
		
	} catch(IOException ex) {}
	
	
	
}
}
