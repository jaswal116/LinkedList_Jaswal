package stringwork;

import java.util.StringTokenizer;

public class SplitString {
	
	// 2 ways to Split String in Java – split() & StringTokenizer class
	
	public static void main(String[] args) {
		String assetClasses = "Gold:Stocks:Fixed Income:Commodity:Interest Rates";
		
		//split string example in Java
		String[] splits = assetClasses.split(":");

		System.out.println("splits.size: " + splits.length);

		for(String asset: splits){
		  System.out.println(asset);
		}
		System.out.println("-----------------------");
		
		// String split example using StringTokenizer
		StringTokenizer stringtokenizer = new StringTokenizer(assetClasses, ":");
		while (stringtokenizer.hasMoreElements()) {
		   System.out.println(stringtokenizer.nextToken());
		}
		
	}

}
