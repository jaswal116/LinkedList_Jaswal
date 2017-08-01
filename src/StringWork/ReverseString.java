package stringwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	/*
	 * String class in java do not have reverse() method , StringBuilder class
	 * does have built in reverse() method.
	 * 
	 * StringBuilder class do not have toCharArray() method , while String class
	 * does have toCharArray() method.
	 */

	public static void main(String[] args) {

		reverseStringCharArray("are you still working");
		reverseStringBuilder("are you fighting");
		reverseStringCollection("i am sleeping");
		reverseStringBytes("why to sleep");
	}

	private static void reverseStringBytes(String string) {
		byte[] bets = string.getBytes();
		byte[] rets= new byte[bets.length];
		for (int i = 0; i < bets.length; i++) {
			rets[i] = bets[bets.length-i-1];
		}
		System.out.println("Reverse of '"+ string + "' : " + new String(rets));
		System.out.println();
	}

	private static void reverseStringCollection(String string) {
		char[] cha = string.toCharArray();
		List<Character> ll = new ArrayList<>();
		for (Character c : cha) {
			ll.add(c);
		}
		Collections.reverse(ll);
		ListIterator<Character> li = ll.listIterator();
		System.out.print("Reverse of '" + string + "' : ");
		while (li.hasNext()) {
			System.out.print(li.next());
		}
		System.out.println();
	}

	private static void reverseStringBuilder(String string) {
		StringBuilder sb = new StringBuilder(string);
		sb = sb.reverse();
		System.out.print("Reverse of '" + string + "' is : " + sb);
		System.out.println();
	}

	private static void reverseStringCharArray(String string) {
		char[] chA = string.toCharArray();
		System.out.print("Reverse of '" + string + "' is : ");
		for (int i = chA.length - 1; i >= 0; i--) {
			System.out.print(chA[i]);
		}
		System.out.println();
	}

}
Output
Reverse of 'are you still working' is : gnikrow llits uoy era
Reverse of 'are you fighting' is : gnithgif uoy era
Reverse of 'i am sleeping' : gnipeels ma i
Reverse of 'why to sleep' : peels ot yhw
