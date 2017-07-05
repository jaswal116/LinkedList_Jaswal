package conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArray2Arraylist {

	public static void main(String[] args) {
		String[] str = new String[]{"one", "two", "three"};
		List<String> arraylist = Arrays.asList(str);
		List<String> arraylist2 = new ArrayList<String>(arraylist);
		for(String s: arraylist2){
			System.out.println(s);
			}
	}

}
