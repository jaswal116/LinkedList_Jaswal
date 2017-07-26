package ArrayListCode;

import java.util.ArrayList;

public class ArrayListDuplicate {
	/*
	 * clone() - create duplicate object of an ArrayList instance
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();         
		//adding elements to the end         
		al.add("First");         
		al.add("Second");         
		al.add("Third");         
		al.add("Random");
		System.out.println("Actual arraylist: "+ al);
		@SuppressWarnings("unchecked")
		ArrayList<String> copy = (ArrayList<String>) al.clone();
		System.out.println("Duplicate arraylist: "+ copy);
		System.out.println("Are two lists equal: " +al.equals(copy));
		
		
	}

}
