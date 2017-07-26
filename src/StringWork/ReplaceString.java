package stringwork;

public class ReplaceString {

	public static void main(String[] args) {
		
		//Replace method to replace single character in String
		//replace(char oldChar, char newChar)
		
		String replace = "This String replace Example shows how to replace one char from String";
		String newString = replace.replace('r', 't');
		System.out.println("Replace 'r' with 't': " + newString);
		
		//Replace method to replace character sequence in String
		//replace(CharSequence target, CharSequence replacement)
		
		String replace1 = "String replace Example of replacing Character Sequence";
		String newString1 = replace1.replace("re", "RE");
		System.out.println("Replace 're' with 'RE': " + newString1);
		
		//Replace method to replace all matched pattern in String
		//replaceAll(String regex, String replacement)
		
		String replace2 = "String replace Example with regular expression";
		String newString2 = replace2.replaceAll("^S","R");
		System.out.println("Replace 'S' in START with 'R': " + newString2);
		
		//Replace method to replace first matched pattern in String
		//replaceFirst(String regex, String replacement)
		
		String replace3 = "String replace Example with replaceFirst";
		String newString3 = replace3.replaceFirst("re","RE");
		System.out.println("Replace 'S' in START with 'R': " + newString3);
	}

}
