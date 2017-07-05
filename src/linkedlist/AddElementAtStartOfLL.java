package linkedlist;

import java.util.LinkedList;

public class AddElementAtStartOfLL {

	// addFirst(): Inserts the specified element at the beginning of this list.
	// offerFirst(): Inserts the specified element at the front of this list. 
	
	public static void main(String[] args) {
		
		LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println(arrl);
        System.out.println("Adding element at first position...");
        arrl.addFirst("I am first");
        System.out.println(arrl);
        System.out.println("Adding element at first position...");
        arrl.offerFirst("I am first - 2");
        System.out.println(arrl);
		
		
	}

}
