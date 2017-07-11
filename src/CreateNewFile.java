package com.journaldev.projectio;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		
		
		String fileSeparator = System.getProperty("file.separator");
		String absoluteFilePath = 
fileSeparator + "Users" + fileSeparator + "jj" + fileSeparator + "Desktop" + fileSeparator + "test_abs.txt" ;
		
		File fileNew = new File(absoluteFilePath);
		if(fileNew.createNewFile()){
			System.out.println(absoluteFilePath + " is created");
		}else{
			System.out.println(absoluteFilePath + " already exists");
		}
		
		// file name only
		fileNew = new File("test_name.txt");
		if (fileNew.createNewFile()){
			System.out.println("test_name.txt File Created in Project root directory");
		}else{
			System.out.println("test_name.txt File already exists in Project root directory");
		}
			
		// relative path only
		
		String relativePath = "tmp" + fileSeparator + "test_rel.txt";
		fileNew = new File(relativePath);
		if(fileNew.createNewFile()){
			System.out.println(relativePath + " File Created in Project root directory" );
		}else{
			System.out.println(relativePath + " File already exists in Project root directory" );
		}
		
		
	}

}
