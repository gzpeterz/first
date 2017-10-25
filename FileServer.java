import java.io.*;
import java.net.*;

/**
 * @author Administrator
 *
 */
public class FileServer {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.print("missed the filename");
			System.exit(-1);
		}
		
		ServerSocket ss = null;
		Socket socket = null;
		FileInputStream fis = null;
		OutputStream os = null;
		byte[] buff = new byte[1024];
		int len = 0;
		
		try {
			ss = new ServerSocket(9999);
			System.out.println("server is listening on 9999.. ");
			socket = ss.accept();
			os = socket.getOutputStream();
			fis = new FileInputStream(args[0]);
			while ((len = fis.read(buff)) != -1) {
				os.write(buff, 0, len);
				os.flush();
			}
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("file tranfer finished");
	}
}
