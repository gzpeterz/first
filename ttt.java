/**
 * 
 */
package com.hc.io;
import java.io.*;
import java.util.*;

/**
 * @author Administrator
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		Compare compare = new Compare("d:/360.rar");
		long start = 0;
		long end = 0;
		start = compare.getNow();
		compare.readFile();
		end = compare.getNow();
		System.out.println("FIS 需要花的时间:" + (end - start));

		start = compare.getNow();
		compare.bufferedReadFile();
		end = compare.getNow();
		System.out.println("BIF  需要花的时间:" + (end - start));
	}
}

class Compare {
	String fileName = "";
	
	public Compare(String name) {
		fileName = name;
	}
	
	public long getNow() {
		Date date = new Date();
		return date.getTime();
	}

	public void bufferedReadFile() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(fileName);
			bis = new BufferedInputStream(fis);
			byte[] arr = new byte[1024];
			while(bis.read(arr) != -1) {
				// null
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("buffered 文件读玩了");
	}
	
	public void readFile() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
			byte[] arr = new byte[1024];
			while(fis.read(arr) != -1) {
				// null
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("文件读玩了");
	}
	
}
