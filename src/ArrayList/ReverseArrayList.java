package ArrayListCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	/*
	 * reverse ArrayList content. 
	 * You can reverse the content by calling Collections.reverse() method. 
	 * You have to pass ArrayList instance to this method, which reverses the content.
	 */
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("orange");
		al.add("banana");
		al.add("litchi");
		al.add("pear");
		System.out.println("Original list: "+ al);
		Collections.reverse(al);
		System.out.println("After reversing : "+ al);
		
	}

}
