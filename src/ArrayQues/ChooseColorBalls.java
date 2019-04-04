Task description

Choose a particular colour balls from an array of different colour balls


import java.util.ArrayList;
import java.util.List;

public class ChooseColorBalls {

	public static void main(String[] args) {
		
		String[] balls = {"red", "yellow",  "yellow", "yellow",  "yellow", "red", "yellow", "yellow", "yellow", "red" };
		List<String> b = ChooseColorBalls.colorBalls("yellow", balls);
		System.out.println(b);
	}
		public static List<String> colorBalls(String c, String[] d ){
			List<String> getColorBalls = new ArrayList<String>();
			for (String i : d) {
				if (i == c) {
					getColorBalls.add(i);
				}
			}
			return getColorBalls;
		}
}	
