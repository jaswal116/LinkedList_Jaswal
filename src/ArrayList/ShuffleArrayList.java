package ArrayListCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArrayList {
	/*
	 * shuffle elements in the ArrayList. 
	 * By calling Collections.shuffle() method you can shuffle the content of the ArrayList. 
	 * Everytime you call shuffle() method, it generates different order of output.
	 */
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("orange");
		al.add("banana");
		al.add("litchi");
		al.add("pear");
		System.out.println("Original list: "+al);
		
		Collections.shuffle(al);
		System.out.println("After shuffle list: "+ al);
		
		Collections.shuffle(al);
		System.out.println("After shuffle list: "+ al);
		
	}

}
