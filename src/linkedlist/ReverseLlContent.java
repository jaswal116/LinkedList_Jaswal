package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLlContent {
	
	// You can reverse the content by calling Collections.reverse() method. 
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        for(String str: list){
            System.out.println(str);
        }
		
		
		
	}

}
