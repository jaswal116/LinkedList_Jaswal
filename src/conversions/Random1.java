package conversions;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		for(int i = 0; i<20; i++){
			System.out.println(r.nextInt(155) * 10);
		}
	}

}
