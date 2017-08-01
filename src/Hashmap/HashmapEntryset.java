package gitHub;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapEntryset {

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("home loan", "citibank");
		hashmap.put("personal loan", "Wells Fargo");
		hashmap.put("car loan", "td bank");
		
		 Set<Entry<String, String>> entryset = hashmap.entrySet();
		 
		 for(Entry<String, String> entry : entryset){
			 System.out.println("Loantype : " + entry.getKey() + ", Provider : " + entry.getValue());
		 }
	}
}
