package week1.assignments3;

public class FindTypes {
	public static void main(String[] args) {
		String test = "~ This is my 3rd Assignment ~";
		char charArray[] = test.toCharArray();
		int letter = 0, space = 0, num = 0, specialChar = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i])) {
				letter++;
			} else if (Character.isSpaceChar(charArray[i])) {
				space++;
			} else if (Character.isDigit(charArray[i])) {
				num++;
			} else {
				specialChar++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("num: " + num);
		System.out.println("specialChar: " + specialChar);
	}

}
