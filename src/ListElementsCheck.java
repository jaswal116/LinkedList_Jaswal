package ArrayListCode;

import java.util.ArrayList;
import java.util.List;

public class ListElementsCheck {
	/*
	 * to find does ArrayList contains all list elements or not
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("orange");
		al.add("banana");
		List<String> arr1 = new ArrayList<String>();
		arr1.add("mango");
		arr1.add("orange");
		System.out.println("Does ArrayList contains elements in list: "+ al.containsAll(arr1));
		arr1.add("litchi");
		System.out.println("Does ArrayList contains elements in list: "+ al.containsAll(arr1));
		
		
	}

}
