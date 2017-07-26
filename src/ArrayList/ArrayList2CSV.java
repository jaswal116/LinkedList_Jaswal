package ArrayListCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2CSV {
	/*
	 * convert given list of strings to comma seperated values (csv) format
	 */

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("orange");
		al.add("banana");
		al.add("litchi");
		al.add("pear");
		System.out.println("Original list "+al);
		ArrayList2CSV alc = new ArrayList2CSV();
		System.out.println("CSV STRING: "+ alc.getCSV(al));
		
		
	}
	
	public String getCSV(List<String> li){
		StringBuffer sb = new StringBuffer();
		for (String str : li) {
			if (sb.length() != 0) {
				sb.append(", ");
			}
			
			sb.append(str);
		}
		return sb.toString();
		
	}
	
}
