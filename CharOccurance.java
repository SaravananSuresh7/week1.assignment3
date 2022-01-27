package week1.assignments3;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "Welcome to kerala";
		int count = 0;
		char charArray[] = str.toCharArray();
		str.length();
		for (int i = 0; i < charArray.length; i++) {
			char a = str.charAt(i);
			if (a == 'a') {
				count++;
			}
		}
		System.out.println("Total occurance of char is " + count);

	}

}
