package chatting_programming;

import java.io.IOException;

/**
 * 
 * @author sibeomkim
 *
 *AppClient의 소켓을 이용하여
 *서버의 수신 기능을 관리한다.
 */
public class TcpClientHandler implements Runnable {
	
	public void run() {
		try {
			//서버로부터 메세지 수신
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
