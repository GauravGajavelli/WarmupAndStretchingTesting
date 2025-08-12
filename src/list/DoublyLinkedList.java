/**k4FGqei}yKQ[gKzYfOAaO1DQT4X.G,ZW{Q-P2YFh{9w_?bR4eBO} 726.p3_Q?Av
R4w3R11wW.31{Tu4:.(ut9ntIHhWG; FUfG4F[hU{0R9=E?2 -l*7E+E ?_uvOB
FXsIv1MK9S3DunM-D!jS,3EX(3/H,cr)ovhGoR6Ja)[8oLIgQWCT+Lz9u)D6_r 
evd:Qnm*/
package list;

import java.util.NoSuchElementException;

/**
 * Basic implementation of a doubly linked list.
 * 
 * @author Curt Clifton.
 * @param <T>
 *            the type of elements in the list
 */
public class DoublyLinkedList<T extends Comparable<T>> {
	/**
	 * This class represents a node in the list.
	 */
	protected abstract class Node {
		/**
		 * The element stored in this list node.
		 */
		T data;
		/**
		 * The next node in this list.
		 */
		Node next;
		/**
		 * The previous node in this list.
		 */
		Node prev;

		/**
		 * Adds the given element after this node.
		 * 
		 * @param element
		 */
		final void addAfter(T element) {
			InternalNode newNode = new InternalNode();
			newNode.data = element;
			newNode.next = this.next;
			newNode.prev = this;
			this.next.prev = newNode;
			this.next = newNode;
		}

		/**
		 * Removes and returns the element in this node.
		 * 
		 * @return the element
		 */
		public T remove() {
			T result = this.data;
			this.next.prev = this.prev;
			this.prev.next = this.next;
			return result;
		}

		/**
		 * Builds a string representation of the list from this node to the end
		 * of the list by mutating the given builder.
		 * 
		 * @param sb
		 *            mutated
		 */
		abstract void buildString(StringBuilder sb);
	}

	private class InternalNode extends Node {
		@Override
		void buildString(StringBuilder sb) {
			sb.append(this.data);
			sb.append(',');
			this.next.buildString(sb);
		}
	}

	private class HeadNode extends Node {
		@Override
		void buildString(StringBuilder sb) {
			this.next.buildString(sb);
		}
	}

	private class TailNode extends Node {
		@Override
		void buildString(StringBuilder sb) {
			// Nothing to do here. The string representation is completed.
		}
	}

	/**
	 * The (dummy) head node of this list. Does not contain data. The first node
	 * with data can be found at this.head.next, unless the list is empty. If
	 * the list is empty then this.head.next == this.tail.
	 */
	protected Node head;

	/**
	 * The (dummy) tail node of this list. Does not contain data. The last node
	 * with data can be found at this.tail.prev, unless the list is empty. If
	 * the list is empty then this.tail.prev == this.head.
	 */
	protected Node tail;

	/**
	 * Constructs a new, empty list. The empty list consists of head and tail
	 * nodes pointing at each other.
	 */
	public DoublyLinkedList() {
		this.head = new HeadNode();
		this.tail = new TailNode();

		this.head.next = this.tail;
		this.tail.prev = this.head;
	}

	/**
	 * Adds the given element to this list.
	 * 
	 * @param element
	 */
	public void add(T element) {
		this.addFirst(element);
	}
	
	/**
	 * Adds the given element to the head of this list.
	 * 
	 * @param element
	 */
	public void addFirst(T element) {
		this.head.addAfter(element);
	}

	/**
	 * Adds the given element to the tail of this list.
	 * 
	 * @param element
	 */
	public void addLast(T element) {
		this.tail.prev.addAfter(element);
	}

	/**
	 * Removes the first element from this list.
	 * 
	 * @return the first element of this list
	 * @throws NoSuchElementException
	 *             if this list is empty
	 */
	public T removeFirst() throws NoSuchElementException {
		confirmHasElements();
		return this.head.next.remove();
	}

	/**
	 * Removes the last element from this list.
	 * 
	 * @return the last element of this list
	 * @throws NoSuchElementException
	 *             if this list is empty
	 */
	public T removeLast() throws NoSuchElementException {
		confirmHasElements();
		return this.tail.prev.remove();
	}

	/**
	 * @throws NoSuchElementException
	 *             if this list is empty
	 */
	private void confirmHasElements() throws NoSuchElementException {
		if (isEmpty())
			throw new NoSuchElementException("empty list");
	}

	/**
	 * @return true if this list is empty
	 */
	public boolean isEmpty() {
		return this.head.next == this.tail;
	}
	
	/**
	 * @return a new iterator over this list.
	 */
	public DLLIterator<T> iterator() {
		final Node initialHead = this.head;
		return new DLLIterator<T>() {
			private Node current = initialHead;

			public boolean hasNext() {
				return this.current.next != DoublyLinkedList.this.tail;
			}

			public T next() throws NoSuchElementException {
				if (!hasNext()) 
					throw new NoSuchElementException("That's all, folks.");
				this.current = this.current.next;
				return this.current.data;
			}
		};
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		this.head.buildString(sb);
		if (this.head.next != this.tail)
			sb.deleteCharAt(sb.length() - 1);
		sb.append(']');
		return sb.toString();
	}
}
/**m{].1l5DpWj?r3C7zanM1)[n?IsmjnX3q_l+,HPkL/8V* b85*TzL}R]?gzvWsN.
+.8AbQvP,qg(Z!;+svTAR3=wCsgAiq-Y*KWVH8}a*02pFI7_LV+PS6;3aK t;IV
+Vggf-W0Pp;g.O;6FN,4pC;-}mH;]rNWE::GK[;uR[D*VTWCgci95;t-rGjuls-
6*bxt6[LQj!Fb2rszkPP-Jc0:SRm1De1jVt61f[Dzbf{yFC0U[Gx ]!xb(Txnxx
OCVS_TQZvC)T{n0!9;XW85YE*?4Gbpi0KuH=}207K},*-P;Wm?q}:tElziIYLMk
d{Aavl iF![LC7lI0dDdvF;mYp*k+x{9O?uev9aCA2)Pt-}3{iPjx*vGk;onOCL
)0EG=N8-3cv/07E9utUWN4y1kx5J6vMYVR75wgZTr+[gqw;UjptLX}W9EG:]dau
0djy5=U6svqKRg_nG2mNNFAs]ZZvb?Q8BvlTrL7fIeBva[:7An!+!((u}uB,e=f
q3E}ge?7VOI044Qz2bud)v}sV6C*x3Rd7=8Z!3lL1Gly:Ys44B_!]{Hc?PBZv-P
tSZVEsc7N(eUs/FDW;Gmj [nE}lbmvl{r+}4m?U13v5XRle5]Q;!MY_gZ-[zC:H
UmGbCbxcYcB4X+SGNqWVb2_PX/pdQius1i;X.H6.5m=YVRc]{MCin(6ZoeDf_pM
]]g!j]?]m7;j+sqF2z[Uq ]o(1:(dBItGJU_!vXpd-}_::5IO}Eck!XrikItsj[
8s9 ]l *ncKRSSfUKPv=?Aw*sCGXIp}*/
