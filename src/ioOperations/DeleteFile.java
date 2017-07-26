package com.journaldev.projectio;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		String fileSeparator = System.getProperty("file.separator");
		String AbsFilePath = fileSeparator + "Users" + fileSeparator + "jj" + fileSeparator + "Desktop" + fileSeparator + "file1.txt";
		File fileNew = new File(AbsFilePath);
		if (fileNew.delete()) {
			System.out.println(AbsFilePath + " is deleted");
		} else {
			System.out.println(AbsFilePath + " is not present");
		}
		
		String RelFilePath = "tmp" + fileSeparator + "file.txt";
		fileNew = new File(RelFilePath);
		if(fileNew.delete()){
            System.out.println(RelFilePath + " is deleted");
        }else {
        	System.out.println(RelFilePath + " does not exist");
        }
		fileNew = new File("tmp");
		if(fileNew.delete()){
            System.out.println("tmp directory deleted from Project root directory");
        }else {
        	System.out.println("tmp directory doesn't exists or not empty in project root directory");
        }
		
		
		
		
//		String RelFilePath = "tmp" ;
//		File fileNew = new File(RelFilePath);
//		
//		if (fileNew.isDirectory() == false) {
//			System.out.println(RelFilePath+" is not a directory");
//			return ;
//		}
//		File[] listFiles = fileNew.listFiles();
//		for (File file : listFiles) {
//			System.out.println("Deleting "+ file.getName());
//			file.delete();
//		}
//		
//		System.out.println(fileNew + " Deleted success :" + fileNew.delete());
		
		
	}
}
  
