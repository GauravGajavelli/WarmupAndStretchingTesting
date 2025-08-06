package anagram;

import java.util.HashMap;
import java.util.Map;

/**
 * This utility class can test whether two strings are anagrams.
 *
 * @author Claude Anderson.
 */
public class Anagram {

	/**
	 * We say that two strings are anagrams if one can be transformed into the
	 * other by permuting the characters (and ignoring case).
	 * 
	 * For example, "Data Structure" and "Saturated Curt" are anagrams,
	 * as are "Elvis" and "Lives".
	 * 
	 * @param s1
	 *            first string
	 * @param s2
	 *            second string
	 * @return true iff s1 is an anagram of s2
	 */
	public static boolean isAnagram(String s1, String s2) {
		Map<Character,Integer> freqs = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char c = toLowerCase(s1.charAt(i));
			int newFreq = freqs.getOrDefault(c, 0)+1;
			freqs.put(c, newFreq);
		}
		
		for (int i = 0; i < s2.length(); i++) {
			char c = toLowerCase(s2.charAt(i));
			int newFreq = freqs.getOrDefault(c, 0)-1;
			if (newFreq == 0) {
				freqs.remove(c);
			} else {
				freqs.put(c, newFreq);
			}
		}
		return freqs.keySet().size() == 0;
	}
	
	private static char toLowerCase(char c) {
		if (c >= 'a' && c <= 'z') {
			return c;
		}
		if (c >= 'A' && c <= 'Z') {
			return (char) (c-'A'+'a');
		}
		return c;
	}
}
