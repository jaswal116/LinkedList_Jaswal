package conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String2Arraylist2Back {

	public static void main(String[] args) {
		String str = "one, two, three, four";
		String[] strarr = str.split(", ");
		List<String> arraylist = Arrays.asList(strarr);
		
		for(String s: arraylist){
			System.out.println("string -"+ s);
		}
		
//		String[] starr = new String[arraylist.size()];
//		for(int i = 0;i <= arraylist.size(); i++ ){
//			starr[i] = arraylist.get(i).toString();
//		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i < arraylist.size(); i++ ){
			if(i == arraylist.size()-1){
				sb.append(arraylist.get(i));
				break;
			}
			sb.append(arraylist.get(i) + ", ");
		}
		System.out.println(sb.toString());
		
			
	}

}
