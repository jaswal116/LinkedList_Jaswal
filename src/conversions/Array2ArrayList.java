package Conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array2ArrayList {

	public static void main(String[] args) {
		
		String[] asset = {"equity", "stocks", "gold", "foreign exchange","fixed income", "futures", "options"}; 
		
		//Using Arrays.asList() method
		
		List<String> assetList = Arrays.asList(asset); 
		System.out.println(assetList);
		/*
		 * This method returns a List view of underlying array.
		 * List returned by this method would be fixed size.
		 * since List is fixed size, you can not add element into it. If you try you will get exception.
		 * when you change an element into this List corresponding element in original array will also be changed.
		 * This is the most efficient way of converting array to arraylist as per my knowledge because it doesn't copy the content of underlying array to create list.
		 * From Java 5 or JDK 1.5 onwards this method supports generic so you can generate type safe ArrayList from array.
		 * Arrays.asList() method is that it returns a fixed size List not a read only List, 
		 * although you can not add() or remove() elements on this List 
		 * you can still change existing elements by using set method. 
		 */
		
		
		//by using Collections.addAll method - not that efficient as the earlier method but its more flexible.
		List<String> assetList1 = new ArrayList<String>(); 
		Collections.addAll(assetList1, asset);
		//we can add some more asset classes into our existing assetlist 
		Collections.addAll(assetList1, "Equity Derivatives", "Eqity Index Arbitrage" , "Mutual Fund");
		System.out.println(assetList1);
		/*
		 * 1) Its not as fast as Arrays.asList() but more flexible.
		 * 2) This method actually copies the content of the underlying array into ArrayList provided.
		 * 3) Since you are creating copy of original array, 
		 * you can add, modify and remove any element without affecting original one.
		 * 4) If you want to provide individual element you can do so by specifying them 
		 * individually as comma separated. 
		 */
		
		//Since List returned by Arrays.asList() is fixed-size it’s not much of use, this way we can convert returned list into proper ArrayList.
		ArrayList<String> newAssetList = new ArrayList<String>();
		newAssetList.addAll(Arrays.asList(asset));
		System.out.println(newAssetList);
	
	}

}
