package search;

public class EfficientSearch {
	public static int search(int[] sortedArray, int searchTerm) {
		// TODO You recognize this starting code as a SEQUENTIAL (one at a time, in-order) search. 
		// It runs in O(n) worst-case time.
		// So if there are 1,000,000 items in the array, it will have to make that many comparisons in the worst case.
		// If searchItem is not found, it examines all sortedArray.length items and then returns -1.
		// 
		// Since the array is sorted, 
		// replace it with the much-more efficient BINARY search, which runs in O(log n) worst case time. 
		// If there are 1,000,000 items in the array, it will only have to make ~20 comparisons.
		//
		// You can look up binary search algorithm from the CSSE220 materials
		// or here: https://en.wikipedia.org/wiki/Binary_search_algorithm#Procedure
		
		int k = 0;
		while ((k < sortedArray.length) && (searchTerm != sortedArray[k])) {
			k++;
		}
		return ((k == sortedArray.length)) ? -1 : k;
	}
}
