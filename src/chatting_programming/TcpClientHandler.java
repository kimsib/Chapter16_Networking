package chatting_programming;

import java.io.IOException;

/**
 * 
 * @author sibeomkim
 *
 *AppClient�� ������ �̿��Ͽ�
 *������ ���� ����� �����Ѵ�.
 */
public class TcpClientHandler implements Runnable {
	
	public void run() {
		try {
			//�����κ��� �޼��� ����
			String line= null;
			while(true ) {
				line = AppClient.br.readLine();
				if(line != null) {
					System.out.println(line);
				}
			} catch(IOException ex) {
				ex.printStackTrace();
				} finally {
					try {
						
						
						
					} catch(IOException ex) {ex.printStackTrace();}
					
				}
			
		}
	}

}
