package stringwork;

public class CheckPalindrome {
	/*
	 * a string is a palindrome if it remains unchanged when reversed, 
	 * for example "dad" is a palindrome as reverse of "dad" is "dad"
	 */
	
	public static void main(String[] args) {
		isPalindrome("khakkakh");

	}

	private static void isPalindrome(String string) {
		boolean palindrome = true;
		char[] ch = string.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ch[ch.length-i-1]) {
				continue;
			} else {
				palindrome = false;
				break;
			}
		}
		
		System.out.println("Is '"+string+"' a palindrome : "+ palindrome );
	}

}
