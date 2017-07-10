package ArrayListCode;

import java.util.ArrayList;

public class AddList2ArrayList {
		/*
		 * to add all elements of a list to ArrayList
		 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		// add elements in ArrayList
		al.add("apple");
		al.add("mango");
		al.add("orange");
		al.add("banana");
		System.out.println("Actual ArrayList: "+al);
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("litchi");
		arr1.add("tomato");
		arr1.addAll(0, al);
		System.out.println("New ArrayList: "+ arr1);
	}

}
