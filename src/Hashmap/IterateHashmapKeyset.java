package gitHub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IterateHashmapKeyset {

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		 hashmap.put("home loan", "citibank");
		 hashmap.put("personal loan", "Wells Fargo");
		 hashmap.put("car loan", "td bank");
		
		 Set<String> keyset = hashmap.keySet();
		 Iterator<String> it = keyset.iterator();
		 while(it.hasNext()){
			 String key = it.next();
			 System.out.println("Key : " + key + ", Provider : " + hashmap.get(key));
		 }
	}
}
