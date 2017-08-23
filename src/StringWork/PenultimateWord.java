package basicsstring;

import java.util.Scanner;

// Write a Java program to find the penultimate (next to last) word of a sentence.

public class PenultimateWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Type the line to find second last letter");
		String a = in.nextLine();

		findPenultimateWord(a);

		in.close();

	}

	private static void findPenultimateWord(String a) {
		String[] str = a.split("[ ]+");
		System.out.println(str[str.length-2]); 
	}

}
