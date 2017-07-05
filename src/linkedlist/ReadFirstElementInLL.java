package linkedlist;

import java.util.LinkedList;

public class ReadFirstElementInLL {
	
//	element(): Retrieves, but does not remove, the head (first element) of this list.
//	getFirst(): Returns the first element in this list.
//	peek(): Retrieves, but does not remove, the head (first element) of this list.
//	peekFirst(): Retrieves, but does not remove, the first element of this list, or returns null if this list is empty. 

	public static void main(String[] args) {
        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("First Element: "+arrl.element());
        System.out.println("First Element: "+arrl.getFirst());
        System.out.println("First Element: "+arrl.peek());
        System.out.println("First Element: "+arrl.peekFirst());

		
	}

}
