package ArrayListCode;

import java.util.ArrayList;
import java.util.Collections;
         // Swap the index of two elements in the arraylist


public class SwapArraylistElements {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("orange");
		al.add("banana");
		al.add("litchi");
		al.add("pear");
		System.out.println("Original list: "+al);
		
		Collections.swap(al, 0, 5);
		System.out.println("After swap list: "+ al);
		
	}

}
-->
Original list: [apple, mango, orange, banana, litchi, pear]
After swap list: [pear, mango, orange, banana, litchi, apple]
