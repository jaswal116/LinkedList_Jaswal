package ArrayListCode;

import java.util.ArrayList;

public class ArrayListBasic {
	/*
	 * creating object for ArrayList, adding objects into ArrayList, 
	 * accessing objects based on index, 
	 * searching an object in ArrayList whether it is listed under this instance or not, 
	 * adding elements at specific index, checking whether the ArrayList is empty or not, 
	 * getting object index, and finally size of the ArrayList.creating object for ArrayList, 
	 * adding objects into ArrayList, accessing objects based on index, 
	 * searching an object in ArrayList whether it is listed under this instance or not, 
	 * adding elements at specific index, checking whether the ArrayList is empty or not, 
	 * getting object index, and finally size of the ArrayList.
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		// add elements in ArrayList
		al.add("apple");
		al.add("mango");
		al.add("orange");
		al.add("banana");
		System.out.println(al);
		//get elements by index
		System.out.println("Element at index 1: "+al.get(1));
		System.out.println("Does list contains litchi? "+al.contains("litchi"));
		//add elements at a specific index
		al.add(1, "litchi");
		System.out.println(al);
		System.out.println("Is arraylist empty? "+al.isEmpty());
		System.out.println("Index of litchi is "+al.indexOf("litchi"));
		System.out.println("Size of the arraylist is: "+al.size());
				
	}
}
