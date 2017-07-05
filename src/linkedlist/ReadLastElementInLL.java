package linkedlist;

import java.util.LinkedList;

public class ReadLastElementInLL {
	
//	getLast(): Returns the last element in this list.
//	peekLast(): Retrieves, but does not remove, the last element of this list, or returns null if this list is empty. 

	public static void main(String[] args) {
		
		LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Last Element: "+arrl.getLast());
        System.out.println("Last Element: "+arrl.peekLast());
		
		
	}

}
