package socket_programming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {
	public static void main(String[] args) throws IOException {
		
		String str = "�ȳ��ϼ���? �ݰ����ϴ�^^";
		
		ServerSocket server = new ServerSocket(8111);
		System.out.println("���� �غ� �Ϸ�");
		
		Socket socket = server.accept();
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
		
		
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		
		
		
	
		
		
		dos.writeUTF(str);
		dos.flush();
		out.close();
		
		socket.close();
		server.close();
		
		
		System.out.println("���� ����");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}