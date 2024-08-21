package src;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example ex = new Example();
		ex.findOccurence("nithin kumar");

		ex.findLongestSubstringwithoutrepeatingchar("LongestsubstringWithoutRepeatingChar");

	}

	private void findLongestSubstringwithoutrepeatingchar(String s) {
		// TODO Auto-generated method stub

		char[] a = s.toLowerCase().toCharArray();

		String substring = null;

		Integer length = 0;

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < a.length; i++) {
			char ch = a[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			
			if (map.size() > length) {
				length = map.size();
				substring = map.keySet().toString();
			}
		}

		

		System.out.println("substring " + substring);
		System.out.println("Length " + length);
	}

	private void findOccurence(String s) {
		// TODO Auto-generated method stub
		char[] a = s.toLowerCase().toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : a) {
			if (ch != ' ') {
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}
		Set<Character> set = map.keySet();

		for (char ch : set) {
			System.out.println(ch + " occured " + map.get(ch));
		}
	}}
