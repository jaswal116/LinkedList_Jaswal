package gitHub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashmapEntryset {

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		 hashmap.put("home loan", "citibank");
		 hashmap.put("personal loan", "Wells Fargo");
		 hashmap.put("car loan", "td bank");
		
		 Set<Entry<String, String>> entryset = hashmap.entrySet();
		 Iterator<Entry<String, String>> it = entryset.iterator();
		 while (it.hasNext()){
			 Entry<String, String> entry = it.next();
			 System.out.println("loan type : " + entry.getKey() + ", Provider : " + entry.getValue());
		 }
	}

}
