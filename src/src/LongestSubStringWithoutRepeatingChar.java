package src;

import java.util.LinkedHashMap;

public class LongestSubStringWithoutRepeatingChar {

	public void longestSubstring(String str) {
		char[] charArray = str.toLowerCase().toCharArray();

		String longestSubstring = null;

		int length = 0;
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}

			if (map.size() > length) {
				length = map.size();
				longestSubstring = map.keySet().toString();
			}
		}
		System.out.println("String : " + str);
		System.out.println("Substring : " + longestSubstring);
		System.out.println("Length : " + length);
	}

	public static void main(String[] args) {
		LongestSubStringWithoutRepeatingChar obj = new LongestSubStringWithoutRepeatingChar();

		obj.longestSubstring("LongestsubstringWithoutRepeatingChar");
	}
}