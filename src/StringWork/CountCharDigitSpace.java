package basicsstring;

import java.util.Scanner;

/*
 * Write a Java program to count the letters, spaces, numbers and other characters of an input string.
 */

public class CountCharDigitSpace {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		System.out.println("Type the string to be reversed");
		String str = in.nextLine();
		count(str);
		in.close();
	}

	private static void count(String str) {
		char[] ch = str.toCharArray();
		int alphabet = 0;
		int number = 0;
		int space = 0;
		int other = 0;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				alphabet++;
			} else if (Character.isDigit(ch[i])){
				number ++;
			} else if (Character.isSpaceChar(ch[i])){
				space ++;
			} else {
				other++;
			}
		}
		System.out.println("alphabet : "+ alphabet);
		System.out.println("number : "+ number);
		System.out.println("space : "+ space);
		System.out.println("other : "+ other);
		
	}

}
