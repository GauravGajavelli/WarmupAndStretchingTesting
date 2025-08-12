package list;

import java.util.NoSuchElementException;

/**
 * This is a basic iterator type for our doubly linked list class.
 * 
 * @author Curt Clifton
 * @param <E>
 *            the type of elements in the list
 */
public interface DLLIterator<E> {
	/**
	 * @return true iff the list has more elements
	 */
	boolean hasNext();

	/**
	 * Returns the next element in the list, if one exists.
	 * 
	 * @return the next element in the list
	 * @throws NoSuchElementException
	 *             if !this.hasNext()
	 */
	E next() throws NoSuchElementException;
}
/**k4FGqei}yKQ[gKzYfOAaO1DQT4X.G,ZW{Q-P2YFh{9w_?bR4eBO} 726.p3_Q?Av
R4w3R11wW.31{Tu4:.(ut9ntIHhWG; FUfG4F[hU{0R9=E?2 -l*7E+E ?_uvOB
FXsIv1MK9S3DunM-D!jS,3EX(3/H,cr)ovhGoR6Ja)[8oLIgQWCT+Lz9u)D6_r 
evd:Qnm*/