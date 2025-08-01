package maps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;
import java.util.HashMap;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import testSupport.LoggingExtension;

/**
 * Simple introduction or reminder about different kinds of maps.
 * 
 * @author Matt Boutell
 *
 */

@ExtendWith(LoggingExtension.class)
public class MapImplementationReview {
	private static int points = 0;

	@Test
	public void test() {
		// A map data structure is also called a dictionary. It is like an
		// array, but arbitrary values are used as _keys_ to look up data,
		// rather than using an integer index.
		
		// A HashMap is a good all-purpose map, since it is fast: O(1) search,
		// insertion, and deletion in many situations.
		Map<String, Integer> ages = new HashMap<>();
		// Fill the map.
		ages.put("Bob", 17);
		ages.put("Shelley", 21);
		ages.put("Abby", 18);
		ages.put("Joel", 18);
		ages.put("Rhonda", 16);

		// You can check to see if a map contains a key or not.
		assertTrue(ages.containsKey("Shelley"));
		assertFalse(ages.containsKey("Michael"));
		
		// Get a value stored in the map by passing its key.
		assertEquals((Integer)18, ages.get("Abby"));

		// The test below will fail because the test is incorrect, Rhonda is not 17.
		// Modify the test so it passes. 
		// What we are really after is that you see how to use 'get' to retrieve data.
		assertEquals((Integer)17, ages.get("Rhonda"));

		// Why does this next test fail? The map contains all the names and ages!
		// It's because hash maps order the data using a method we'll learn
		// about later this term. They are NOT sorted by key.
		// To make the test pass, you will need to replace the HashMap above
		// with another kind of map that sorts its data.
		// Hint: look up "java 8 collections api sortedmap", and find which
		// classes implement the SortedMap interface. Use the class that isn't a
		// ConcurrentSkipListMap.
		assertEquals("{Abby=18, Bob=17, Joel=18, Rhonda=16, Shelley=21}", ages.toString());
		points += 2;
	}
	
	@AfterAll
	public static void showPoints() {
		System.out.printf("MAPS-IMPLEMENTATIONS POINTS = %d of 2\n", points);
	}

}
