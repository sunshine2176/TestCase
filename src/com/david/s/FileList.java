package com.david.s;

import java.io.File;
import java.util.LinkedList;

public class FileList {

	public void getFiles(String path){
		LinkedList<File> list = new LinkedList<File>();
		File dir = new File(path);
		File files[] = dir.listFiles();
		for (File file : files) {
			if(file.isDirectory()) list.add(file);
			else System.out.println(file.getAbsolutePath());
		}
		File tmp;
		while (!list.isEmpty()) {
			tmp = list.removeFirst();
			files = tmp.listFiles();
			if(files == null) continue;
			for (File file : files) {
				if(file.isDirectory()) list.add(file);
				else System.out.println(file.getAbsolutePath());
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FileList fileList = new FileList();
		fileList.getFiles("D:\\tools\\eclipse\\workspace\\TestCase");
		}
		

}
