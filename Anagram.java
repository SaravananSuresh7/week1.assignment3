package week1.assignments3;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops"; // String literal
		String text2 = "potss";
		int length1 = text1.length();
		int length2 = text2.length();
		if (length1 == length2) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);
			if (result == true) {
				System.out.println("text1 and text2 are Anagram");
			} else {
				System.out.println("text1 and text2 are not Anagram");
			}
		}

	}
}
