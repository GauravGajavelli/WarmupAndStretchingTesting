package maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Practice in using maps.
 * 
 * @author Nate Chenette
 *
 */

public class NGramCounting {

	/**
	 * Given an input text and a length n, the method should produce a Map from n-grams of 
	 * the text (i.e., length-n substrings) to counts, where n-gram S is mapped to count C
	 * if S shows up C times among substrings of the text. 
	 * 
	 * This method would be useful in frequency-based cryptanalysis of the classic substitution 
	 * cipher.
	 * 
	 * @param text
	 * @param n, the length of the n-grams to count
	 * @return
	 */
	static Map<String,Integer> nGramCounter(String text, int n) {
		Map<String,Integer> toRet = new HashMap<>();
		if (n == 0) {
			return toRet;
		}

		for (int i = 0; i <= text.length()-n; i++) {
			String s = text.substring(i,i+n);
			int f = toRet.getOrDefault(s,0)+1;
			toRet.put(s,f);
		}

		return toRet;
	}

}
