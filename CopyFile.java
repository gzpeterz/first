import java.io.*;

/**
 * @author Administrator
 *
 */
public class CopyFile {

	public static void main(String[] args) {
		CopyFile cf = new CopyFile();
		cf.copyBuff(args[0], args[1]);
	}
	
	public void copyBuff(String inputFile, String outputFile) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File file = null;
		byte[] buff = null;
		int size = 0;

		try {
			file = new File(inputFile);
			size = (int)file.length();
			buff = new byte[size];

			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);
			fis.read(buff);
			fos.write(buff);
			System.out.println("finished copy");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

