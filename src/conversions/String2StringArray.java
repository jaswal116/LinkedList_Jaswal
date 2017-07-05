package conversions;

public class String2StringArray {

	public static void main(String[] args) {
		String str = "one, two, three, four";
		String[] strarr = str.split(", ");
		for(String s: strarr){
		System.out.println(s);
		}

	}

}
