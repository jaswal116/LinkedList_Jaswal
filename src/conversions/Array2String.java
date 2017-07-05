package conversions;

public class Array2String {

	public static void main(String[] args) {
		char[] output = new char[] { 't','h','i','s', ' ','i', 's', ' ', 'f', 'o', 'o', 'l'};
		
		String out = new String(output);
		System.out.println("output 1 "+ out);
		
		String out2 = String.valueOf(output);
		System.out.println("output 2 "+ out2);
		}

}
