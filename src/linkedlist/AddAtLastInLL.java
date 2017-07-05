package linkedlist;

import java.util.LinkedList;

public class AddAtLastInLL {
	
//	addLast(): Appends the specified element to the end of this list.
//	offerLast(): Inserts the specified element at the end of this list.
//	offer(): Adds the specified element as the tail (last element) of this list. 
	
	public static void main(String[] args) {
		
		LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println(arrl);
        System.out.println("Adding element at last position...");
        arrl.addLast("I am last");
        System.out.println(arrl);
        System.out.println("Adding element at last position...");
        arrl.offerLast("I am last - 1");
        System.out.println(arrl);
        System.out.println("Adding element at last position...");
        arrl.offer("I am last - 2");
        System.out.println(arrl);
		
		
	}

}
