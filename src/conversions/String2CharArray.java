package conversions;

public class String2CharArray {

	public static void main(String[] args) {
		String str = "I am a fool";
		char[] string2chararray = str.toCharArray();
//		System.out.println(string2chararray);
		
		for(char ou: string2chararray){
			if(ou == ' '){
				System.out.println();
			}
			System.out.print(ou);
		}
	}

}
