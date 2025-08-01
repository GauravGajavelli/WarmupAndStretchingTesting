package list;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import testSupport.LoggingExtension;


/**
 * Test class for {@link DoublyLinkedList}.
 * 
 * @author Curt Clifton
 */

@ExtendWith(LoggingExtension.class)
public class DoublyLinkedListTest {

	private DoublyLinkedList<String> empty;
	private DoublyLinkedList<String> forward;
	private DoublyLinkedList<String> reverse;

	/**
	 * Sets up some lists.
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		this.empty = new DoublyLinkedList<String>();

		this.forward = new DoublyLinkedList<String>();
		this.forward.addLast("Rose");
		this.forward.addLast("Hulman");

		this.reverse = new DoublyLinkedList<String>();
		this.reverse.addFirst("Rose");
		this.reverse.addFirst("Hulman");
	}

	/**
	 * Test method for {@link list.DoublyLinkedList#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		assertTrue(this.empty.isEmpty());
		assertFalse(this.forward.isEmpty());
		this.forward.removeFirst();
		assertFalse(this.forward.isEmpty());
		this.forward.removeFirst();
		assertTrue(this.forward.isEmpty());
	}

	/**
	 * Test method for {@link list.DoublyLinkedList#toString()}.
	 */
	@Test
	public void testToString() {
		assertEquals("[]", this.empty.toString());
		assertEquals("[Rose,Hulman]", this.forward.toString());
		assertEquals("[Hulman,Rose]", this.reverse.toString());
	}

	/**
	 * Test method for {@link list.DoublyLinkedList#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst1() {
		assertEquals("Rose", this.forward.removeFirst());
		assertEquals("[Hulman]", this.forward.toString());
	}

	/**
	 * Test method for {@link list.DoublyLinkedList#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst2() {
		this.forward.removeFirst();
		assertEquals("Hulman", this.forward.removeFirst());
		assertEquals("[]", this.forward.toString());
	}

	/**
	 * Test method for {@link list.DoublyLinkedList#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst3() {
		assertEquals("Hulman", this.reverse.removeFirst());
		assertEquals("[Rose]", this.reverse.toString());
	}

	/**
	 * Test method for {@link list.DoublyLinkedList#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst4() {
		this.reverse.removeFirst();
		assertEquals("Rose", this.reverse.removeFirst());
		assertEquals("[]", this.reverse.toString());
	}

	/**
	 * Test method for {@link list.DoublyLinkedList#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst5() {
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			this.empty.removeFirst();
	    });
	}

	/**
	 * Test method for {@link list.DoublyLinkedList#iterator()}.
	 */
	@Test
	public void testIterator1() {
		DLLIterator<String> iter = this.empty.iterator();
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			iter.next();
	    });
	}

	/**
	 * Test method for {@link list.DoublyLinkedList#iterator()}.
	 */
	@Test
	public void testIterator2() {
		DLLIterator<String> iter = this.empty.iterator();
		assertFalse(iter.hasNext());
		
		iter = this.forward.iterator();
		assertTrue(iter.hasNext());
		assertEquals("Rose", iter.next());
		assertEquals("Hulman", iter.next());
		assertFalse(iter.hasNext());
		
		iter = this.reverse.iterator();
		assertTrue(iter.hasNext());
		assertEquals("Hulman", iter.next());
		assertEquals("Rose", iter.next());
		assertFalse(iter.hasNext());
	}
}
