package list;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author anderson, chenett1
 * 
 * @param <T>
 *            Any Comparable type
 * 
 *            Stores a doubly linked list whose elements are kept in sorted order.
 */
public class SortedLinkedList<T extends Comparable<T>> {
	
	DoublyLinkedList<T> dll;

	/**
	 * Creates an empty list
	 * 
	 */
	public SortedLinkedList() {
		dll = new DoublyLinkedList<T>();
	}

	/**
	 * Creates a sorted list containing the same elements as the parameter
	 * 
	 * @param other
	 *            the input list
	 */
	public SortedLinkedList(DoublyLinkedList<T> other) {
		this();
		DLLIterator<T> i = other.iterator(); // Creates an iterator using the factory method
		while (i.hasNext()) {     // Note how the iterator is used
			this.add(i.next());   // This line uses your add method below
		}	
	}

	/**
	 * Adds the given element to the list, keeping it sorted.
	 */
	public void add(T element) {
		DLLIterator<T> i = this.dll.iterator(); // Creates an iterator using the factory method
		Set<T> sorted = new TreeSet<T>();
		
		sorted.add(element);
		while (i.hasNext()) {     // Note how the iterator is used
			sorted.add(i.next());
		}
		
		while (!this.dll.isEmpty()) {
			sorted.add(this.dll.removeFirst());
		}
		
		
		DoublyLinkedList<T> newList = new DoublyLinkedList<T>();
		for (T t:sorted) {
			newList.addLast(t);
		}
		
		this.dll = newList;
	}
	
	/**
	 * Prints the internal list.
	 */
	@Override
	public String toString() {
		return dll.toString();
	}

}
