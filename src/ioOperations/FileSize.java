package com.journaldev.projectio;

import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		String fileSeparator = System.getProperty("file.separator");
		String absoluteFilePath = 
fileSeparator + "Users" + fileSeparator + "jj" + fileSeparator + "desktop" + fileSeparator + "test_abs.txt" ;
		File file = new File(absoluteFilePath);
		if (file.exists()){
			System.out.println(file.length()+ " bytes");
		}
		else{
			System.out.println("file does not exist"); 		
			}
		
	}

}
