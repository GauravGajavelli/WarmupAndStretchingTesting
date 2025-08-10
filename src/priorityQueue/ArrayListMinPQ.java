package priorityQueue;
import java.util.ArrayList;

/**
 * An implementation of the Priority Queue interface using an array list.
 * 
 * @author Matt Boutell and Gaurav Gajavelli. Created Mar 29, 2014.
 * 
 * @param <T>
 *            Generic type of PQ elements
 */
public class ArrayListMinPQ<T extends Comparable<T>> {
	// Requirement: The methods below must use the items list.
	// You may not add other fields to this ArrayListMinPQ class, 
	// but you may add local variables to the methods. 
	private ArrayList<T> items;

	public ArrayListMinPQ() {
		items = new ArrayList<>();

	}

	public T findMin() {
		// This is also known as peekMin
		
		if (this.isEmpty()) {
			return null;
		}
		return items.get(0);

	}

	public T deleteMin() {
		if (this.isEmpty()) {
			return null;
		}
		return items.remove(0);

	}

	public void insert(T item) {
		for (int i = 0; i < items.size(); i++) {
			T element = items.get(i);
			if (item.compareTo(element) < 0) { // if we find what it's less than, it goes there
				items.add(i, item);
				return;
			}
		}
		items.add(item);
	}

	public int size() {
		return items.size();
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	public void clear() {
		items.clear();
	}
}