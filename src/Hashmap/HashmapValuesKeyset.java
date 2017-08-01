package gitHub;

import java.util.HashMap;

public class HashmapValuesKeyset {

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<>();
		 hashmap.put("home loan", "citibank");
		 hashmap.put("personal loan", "Wells Fargo");
		 hashmap.put("car loan", "td bank");
		
		 for(String key : hashmap.keySet() ){
			 
			 System.out.println("Loan type : " + key + ", Provider : " + hashmap.get(key));
			 
		 }
	}
}
