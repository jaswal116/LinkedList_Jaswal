package com.projecteuler;

public class CheckMirrorString {

	public boolean IsMirrorSequence(String s) {
		boolean mirror = Boolean.TRUE;
		int size = s.length();
		for (int i = 0; i < size; i++) {

			if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(size - 1 - i)))
				continue;
			else {
				mirror = Boolean.FALSE;
				break;
			}
		}
			return mirror;
	}

	public static void main(String[] args) {

		CheckMirrorString te = new CheckMirrorString();
		System.out.println("\"Munish\" is a mirror sequence: "+te.IsMirrorSequence("Munish"));
		System.out.println("\"Kayak\" is a mirror sequence: "+te.IsMirrorSequence("kayak"));
		System.out.println("\"Able was I ere I saw Elba\" is a mirror sequence: "+te.IsMirrorSequence("Able was I ere I saw Elba"));
	}
}
