package stringwork;

import java.util.StringTokenizer;

public class SplitString {
	
	// 2 ways to Split String in Java � split() & StringTokenizer class
	
	public static void main(String[] args) {
		
		//Splitting colon separated String in Java
	      String colon = "Java:J2EE:JavaFX:JavaME";
	     
	      String[] strings = colon.split(":");
	     
	      System.out.println("Original Colon Separated String : " + colon);
	      System.out.println("String splitted using Split() method of java.lang.String in Java");
	     
	      for(String str : strings){
	          System.out.println(str);
	      }
	     
	      //Splitting comma separated String in Java
	      String comma = "Android,Windows 8,iOS,Symbian";
	      String[] strs = comma.split(",");
	      System.out.println("Original comma separated String : " + comma);
	      System.out.println("Splitting String using split() method in Java");
	    
	      for(String str: strs){
	          System.out.println(str);
	      }
	     
	      //Splitting String on space as delimiter in Java
	      String space = "String Split Example in Java";
	      String[] words = space.split("\\s");
	      System.out.println("Space separated String before split : " + space);
	      System.out.println("Space separated String after split");
	     
	      for(String word: words){
	          System.out.println(word);
	      }
	      System.out.println("-----------------------");
		String assetClasses = "Gold:Stocks:Fixed Income:Commodity:Interest Rates";
		
		//split string example in Java
		String[] splits = assetClasses.split(":");

		System.out.println("splits.size: " + splits.length);

		for(String asset: splits){
		  System.out.println(asset);
		}
		System.out.println("-------StringTokenizer----------------");
		
		// String split example using StringTokenizer
		StringTokenizer stringtokenizer = new StringTokenizer(assetClasses, ":");
		while (stringtokenizer.hasMoreElements()) {
		   System.out.println(stringtokenizer.nextToken());
		}
		
	 }
}
