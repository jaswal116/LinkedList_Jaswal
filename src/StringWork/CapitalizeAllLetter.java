package basicsstring;

import java.util.Scanner;

//Write a Java program to capitalize the first letter of each word in a sentence.

public class CapitalizeAllLetter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Type the line to capitalize first letter of the words");
		String a = in.nextLine();

		capitalizeAll(a);

		in.close();

	}

	private static void capitalizeAll(String a) {
		char[] ch = a.toCharArray();
		String str = "";
		for (int i = 0; i<ch.length; i++) {
			if (i == 0) {
				str += str += Character.toUpperCase(ch[i]);
			} else if (Character.isSpaceChar(ch[i])) {
				str += ch[i];
				str += Character.toUpperCase(ch[i+1]);
				i++;
			}else {
				str += ch[i];
			}
			
		}
		System.out.println(str);
		
	}

}
