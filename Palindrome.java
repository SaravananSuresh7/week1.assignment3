package week1.assignments3;

public class Palindrome {
	public static void main(String[] args) {
		String str = "Malayalam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Given string is a Palindrome");
		} else {
			System.out.println("Given strinng is not a Palindrome");
		}

	}

}
