package src;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class StringPgrms {

	public static void main(String[] args) {
		StringPgrms ob = new StringPgrms();

		String s = "infinite computer solutions";

		System.out.println("Enter your option : " + "\n" + "1: findOccurence  2: findSubString ");

		Scanner sc = new Scanner(System.in);

		Integer n = sc.nextInt();

		if (n == 1) {
			ob.findCharOccurence(s);
		} else {
			ob.findSubString(s);
		}

	}

	public void findCharOccurence(String s) {
		char[] a = s.toLowerCase().toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : a) {
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

	public void findSubString(String s) {
		char[] arr = s.toLowerCase().toCharArray();

		Integer length = 0;
		String sub = "";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			if (map.size() > length) {
				length = map.size();
				sub = map.keySet().toString();
			}
		}
		System.out.println("Input : " + s);
		System.out.println("Output : " + sub);
		System.out.println("Length : " + length);
	}
}