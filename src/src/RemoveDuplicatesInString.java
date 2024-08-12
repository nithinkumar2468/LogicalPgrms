package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {

		String s = "Infinite Computer Solutions";

		RemoveDuplicatesInString ob = new RemoveDuplicatesInString();
		ob.RemoveIt(s);
	}

	public void RemoveIt(String s) {
		char[] charArray = s.toLowerCase().toCharArray();

		List<Character> list = new ArrayList<Character>();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		Set<Character> set = new HashSet<Character>();
		for (Character ch : charArray) {
			if (ch != ' ') {
				if (map.containsKey(ch)) {
					list.remove(ch);
				} else {
					set.add(ch);
				}
			}
		}

		Object[] c = set.toArray();
		for (Object ch : c) {
			System.out.print(ch);
		}
	}
}
