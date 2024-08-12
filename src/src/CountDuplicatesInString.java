package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicatesInString {

	public static void main(String[] args) {

		String str = "Infinite Computer Solutions";
		CountDuplicatesInString ob = new CountDuplicatesInString();
		ob.findDuplicate(str);
	}

	public void findDuplicate(String s) {
		char[] charArray = s.toLowerCase().toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : charArray) {
			if (ch != ' ') {
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}

		Set<Character> set = map.keySet();

		for (Character ch : set) {
			System.out.println(ch + " occured " + map.get(ch));
		}
	}

}
