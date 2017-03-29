package localhost.linkedlist;

public interface MyList<T> {

	/**
	 * Return the size of the list.
	 *
	 * @return The size of the list.
	 */
	int size();

	/**
	 * Clear (delete) the list of elements.
	 */
	void clear();

	/**
	 * Return the first element in the list.
	 *
	 * @return The first element in the list.
	 */
	T getFirst();

	/**
	 * Return the last element in the list.
	 *
	 * @return The last element in the list.
	 */
	T getLast();

	/**
	 * Get the current element from the list.
	 *
	 * @return The current element.
	 */
	T getElement();

	/**
	 * Store an element at the current position in the list.
	 *
	 * @param data The element to store.
	 */
	void setElement(T data);

	/**
	 * Add an element to the list.
	 *
	 * @param data The element to add.
	 */
	void add(T data);

	/**
	 * Determine if a previous element exists.
	 *
	 * @return True if a previous element exists. False if not.
	 */
	boolean hasPrev();

	/**
	 * Determine if a next element exists.
	 *
	 * @return True if a next element exists. False if not.
	 */
	boolean hasNext();

	/**
	 * Get the previous element in the list.
	 *
	 * @return The previous element in the list.
	 */
	T prev();

	/**
	 * Get the next element in the list.
	 *
	 * @return The next element in the list.
	 */
	T next();

	/**
	 * Get the element at a specific position in the list.
	 *
	 * @param index The position in the list, zero indexed.
	 * @return The requested element.
	 */
	T get(int index);

	/**
	 * Get the current position in the list.
	 *
	 * @return The current position, zero indexed. Null if list is empty.
	 */
	Integer getPosition();

	/**
	 * Set the position in the list.
	 *
	 * @param index The position in the list, zero indexed.
	 */
	void setPosition(int index);

	/**
	 * Set the position to the first element in the list.
	 */
	void setPositionFirst();

	/**
	 * Set the position to the last element in the list.
	 */
	void setPositionLast();

}
