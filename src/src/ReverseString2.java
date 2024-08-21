package src;

public class ReverseString2 {
	public static void main(String[] args) {
		String input = "infinite computer solutions 12 bangalore";

		String[] words = input.split(" ");

		StringBuilder reversedString = new StringBuilder();

		for (String word : words) {
			String reversedWord = new StringBuilder(word).reverse().toString();
			reversedString.append(reversedWord).append(" ");
		}
		reversedString.setLength(reversedString.length() - 1);

		System.out.println("Input: " + input);
		System.out.println("Output: " + reversedString.toString());
		
		ReverseString2 rev = new ReverseString2();
		rev.reverseIt(input);
	}

	public void reverseIt(String s) {
		
		String[] words = s.split(" ");

		System.out.print("My Method : ");
		for (int i = 0; i < words.length; i++) {
			String str = words[i];
			for (int j = str.length() - 1; j >= 0; j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
}