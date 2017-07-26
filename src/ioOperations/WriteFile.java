package com.journaldev.projectio;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteFile {

	public static void main(String[] args) throws IOException {
		String fileSeparator = System.getProperty("file.separator");
		String absoluteFilePath = 
fileSeparator + "Users" + fileSeparator + "jj" + fileSeparator + "Desktop" + fileSeparator + "test_abs.txt" ;
		File fileNew = new File(absoluteFilePath);
		fileNew.createNewFile();
		String filedata = " While creating the file path, we should use System property file.separator to make our program platform independent. Let’s see different scenarios with a simple java program to create new file in java.";
		FileOutputStream fos = new FileOutputStream(absoluteFilePath);
		fos.write(filedata.getBytes());
		fos.flush();
		fos.close();
		System.out.println("text added");
		
	}

}
