package src;

public class ReverseString2 {
	public static void main(String[] args) {
		String input = "infinite computer solutions";
		String[] words = input.split(" ");
		StringBuilder reversedString = new StringBuilder();

		for (String word : words) {
			String reversedWord = new StringBuilder(word).reverse().toString();
			reversedString.append(reversedWord).append(" ");
		}
		reversedString.setLength(reversedString.length() - 1);

		System.out.println("Input: " + input);
		System.out.println("Output: " + reversedString.toString());
	}
}