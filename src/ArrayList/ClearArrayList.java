package ArrayListCode;

import java.util.ArrayList;

public class ClearArrayList {
	/*
	 * to delete all elements from my ArrayList
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();         
		al.add("First");         
		al.add("Second");         
		al.add("Third");         
		al.add("Random");
		System.out.println("Actual ArrayList: "+ al);
		al.clear();
		System.out.println("ArrayList after clear(): "+ al);
		
	}

}
