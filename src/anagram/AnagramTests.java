package anagram;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import testSupport.LoggingExtension;

/**
 * Tests Anagram.
 * 
 * @author Claude Anderson.
 */

@ExtendWith(LoggingExtension.class)
public class AnagramTests {
	private static float points = 0;
	
	
	/**
	 * Tests {@link Anagram#isAnagram(String, String)}.
	 */
	@Test
	public void testAnagram1() {
		assertFalse(Anagram.isAnagram("a", "b"));
		assertTrue(Anagram.isAnagram("a", "a"));
		points += 0.5;
	}

	/**
	 * Tests {@link Anagram#isAnagram(String, String)}.
	 */
	@Test
	public void testAnagram2() {
		assertFalse(Anagram.isAnagram("a", "b"));
		assertTrue(Anagram.isAnagram("a", "A"));
		points += 0.5;
	}

	/**
	 * Tests {@link Anagram#isAnagram(String, String)}.
	 */
	@Test
	public void testAnagram3() {
		assertFalse(Anagram.isAnagram("a", "b"));
		assertTrue(Anagram.isAnagram("ab", "ba"));
		points += 1;
	}

	/**
	 * Tests {@link Anagram#isAnagram(String, String)}.
	 */
	@Test
	public void testAnagram4() {
		assertFalse(Anagram.isAnagram("a", "b"));
		assertTrue(Anagram.isAnagram("abc", "cba"));
		points += 1;
	}

	/**
	 * Tests {@link Anagram#isAnagram(String, String)}.
	 */
	@Test
	public void testAnagram5() {
		assertFalse(Anagram.isAnagram("a", "b"));
		assertTrue(Anagram.isAnagram("abc", "bca"));
		points += 1;
	}

	/**
	 * Tests {@link Anagram#isAnagram(String, String)}.
	 */
	@Test
	public void testAnagram6() {
		assertFalse(Anagram.isAnagram("aabb", "bbbaa"));
		assertTrue(Anagram.isAnagram("Claude Anderson", "Nuanced Ordeals"));
		assertTrue(Anagram.isAnagram("Matt Boutell", "Total Tumble"));
		assertTrue(Anagram.isAnagram("Nate Chenette", "Canteen Teeth"));
		assertTrue(Anagram.isAnagram("Delvin Defoe", "Defend Olive")); // like Popeye!
		assertTrue(Anagram.isAnagram("Dave Fisher", "Evader Fish"));
		assertTrue(Anagram.isAnagram("Dave Mutchler", "Traveled Much"));
		assertTrue(Anagram.isAnagram("  Wollowski", "Silk Owl Ow"));
		assertFalse(Anagram.isAnagram("aabb", "aaab"));
		points += 1.5;
	}

	/**
	 * Tests {@link Anagram#isAnagram(String, String)}.
	 */
	@Test
	public void testAnagram7() {
		assertTrue(Anagram.isAnagram("aabb", "bbaa"));
		assertFalse(Anagram.isAnagram("Claude Anderson", "Nuanced  Ordeals"));
		assertFalse(Anagram.isAnagram("MA", "LB"));
		assertFalse(Anagram.isAnagram("ay", "bx"));
		assertFalse(Anagram.isAnagram("ab", "c"));
		points += 1.5;
	}
	
	@AfterAll
	public static void showPoints() {
		System.out.printf("ANAGRAM POINTS = %.1f of 7.0\n", points);
	}
	
}
