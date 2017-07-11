package com.codesCracker;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	/*Anagram : a word, phrase, or name formed by rearranging 
	the letters of another, such as cinema, formed from iceman.*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		String str1 = scan.nextLine();
		System.out.println("Enter the second string");
		String str2 = scan.nextLine();
		
		CheckAnagram.anagramOrNot(str1, str2);
		
	}

	private static void anagramOrNot(String str1, String str2) {
		boolean isAnagram = false;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		isAnagram = Arrays.equals(ch1, ch2);
		System.out.println("Two strings are anagram : " + isAnagram);
	}

}
