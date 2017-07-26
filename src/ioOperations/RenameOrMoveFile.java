package com.journaldev.projectio;

import java.io.File;

public class RenameOrMoveFile {

	public static void main(String[] args) {
		
//		String fileSeparator = System.getProperty("file.separator");
//		String absPath = fileSeparator  + "Users" + fileSeparator + "JJ" + fileSeparator + "Desktop" + fileSeparator  +"abc.txt";
//		String absPath2 = fileSeparator  + "Users" + fileSeparator + "JJ" + fileSeparator + "Desktop" + fileSeparator  +"xyz.txt";
		File file  = new File("/Users/JJ/Desktop/abc.txt");
		File newFile = new File ("/Users/JJ/Desktop/xyz.txt");
		if(file.renameTo(newFile)){
			System.out.println("File rename success");
		}else{
			System.out.println("File rename unsuccessful");
		}
		
		//move file from one directory to another
//		File file  = new File(absPath);
//		File newFile = new File (absPath2);
//        if(file.renameTo(newFile)){
//            System.out.println("File move success");;
//        }else{
//            System.out.println("File move failed");
//        }
		
	}

}
