package src;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Infinite";

		ReverseString rev = new ReverseString();
		rev.reverseIt1(s);
	}

	public void reverseIt1(String s) {

		char[] strArray = s.toCharArray();

		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}
	}
}
