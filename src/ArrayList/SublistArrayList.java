package ArrayListCode;

import java.util.ArrayList;
import java.util.List;

public class SublistArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("orange");
		al.add("banana");
		al.add("litchi");
		al.add("pear");
		System.out.println("Actual ArrayList: "+ al);
		List<String> arr1 = al.subList(1, 4);  // sublist() returns a list, exclude last element
		System.out.println("Sublist: "+ arr1);
		
	}

}
