package com.david.s;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	
	
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		File file = new File("failApps/failList.txt");
		FileWriter fw = new FileWriter(new File(file.getAbsolutePath()), true);
		for(int i = 0; i < 5; i++){
			fw.write("ttt" + i + "\n");
			fw.flush();
		}
		fw.close();
	}

}
