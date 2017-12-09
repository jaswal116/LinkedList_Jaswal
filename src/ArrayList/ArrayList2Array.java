package ArrayListCode;

import java.util.ArrayList;

public class ArrayList2Array {
	/*
	 * copy ArrayList to array
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("orange");
		al.add("banana");
		System.out.println("Actual ArrayList: "+al);
		String[] str = new String[al.size()];
		al.toArray(str);
		System.out.println("Created Array Content ");
		for (String i : str) {
			System.out.print(i+" ");
		}
		
	}

}
-->
Actual ArrayList: [apple, mango, orange, banana]
Created Array Content 
apple mango orange banana 
