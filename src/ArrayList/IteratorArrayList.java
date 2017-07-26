package ArrayListCode;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {
	
	//to read all elements in ArrayList by using iterator
	//you can iterate through the ArrayList based on index too.
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();         
		//adding elements to the end         
		al.add("First");         
		al.add("Second");         
		al.add("Third");         
		al.add("Random");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}

}
