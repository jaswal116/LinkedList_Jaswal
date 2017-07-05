package ArrayQues;

import java.util.HashMap;
import java.util.Map;

public class NumberBalls {

	public static void main(String[] args) {
		
		String[] balls = {"red", "yellow",  "yellow", "yellow",  "yellow", "red", "yellow", "yellow", "yellow", "red" };		
		System.out.println("Number of red balls: "+NumberBalls.colorBalls("red", balls));
		System.out.println("Number of yellow balls: "+NumberBalls.colorBalls("yellow", balls));
		
	}

	public static int colorBalls(String c, String[] d ){
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String ball : d) {
			int i =  0;
			if(ball.equalsIgnoreCase(c)){
			
				if (map.containsKey(ball)) {
					map.put(ball,map.get(ball)+1);
					
				}else{
					map.put(ball, i+1);
				}
			}
		}
		return map.get(c);
	}

}
