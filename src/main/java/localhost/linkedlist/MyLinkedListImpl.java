package localhost.linkedlist;

import java.util.NoSuchElementException;

/**
 * An implementation of a doubly linked list.
 *
 * @param <T> The type of elements stored in this list.
 */
public class MyLinkedListImpl<T> implements MyList<T> {

	private MyNode<T> first;
	private MyNode<T> last;

	private int size = 0;
	private Integer position = null;

	// Used to keep track of our position in the list.
	private MyNode<T> currentNode;

	/**
	 * Return the size of the list.
	 *
	 * @return The size of the list.
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * Clear (delete) the list of elements.
	 */
	@Override
	public void clear() {
		first = null;
		last = null;
		currentNode = null;
		size = 0;
		position = null;
	}

	/**
	 * Return the first element in the list.
	 *
	 * @return The first element in the list.
	 */
	@Override
	public T getFirst() {
		if (size == 0) {
			throw new NoSuchElementException();
		}
		return first.getData();
	}

	/**
	 * Return the last element in the list.
	 *
	 * @return The last element in the list.
	 */
	@Override
	public T getLast() {
		if (size == 0) {
			throw new NoSuchElementException();
		}
		return last.getData();
	}

	/**
	 * Get the current element from the list.
	 *
	 * @return The current element.
	 */
	@Override
	public T getElement() {
		if (size == 0) {
			throw new NoSuchElementException();
		}

		return currentNode.getData();
	}

	/**
	 * Store an element at the current position in the list.
	 *
	 * @param data The element to store.
	 */
	@Override
	public void setElement(T data) {
		if (size == 0) {
			throw new NoSuchElementException();
		}

		currentNode.setData(data);
	}

	/**
	 * Add an element to the list.
	 *
	 * @param data The element to add.
	 */
	@Override
	public void add(T data) {
		MyNode<T> newNode = new MyNode<>(data);

		if (size == 0) {
			first = newNode;
			last = newNode;
			currentNode = newNode;
			position = 0;
		} else {
			last.setNext(newNode);
			newNode.setPrev(last);
			last = newNode;
		}

		++size;
	}

	/**
	 * Determine if a previous element exists.
	 *
	 * @return True if a previous element exists. False if not.
	 */
	@Override
	public boolean hasPrev() {
		if (size == 0 || currentNode.getPrev() == null) {
			return false;
		}

		return true;
	}

	/**
	 * Determine if a next element exists.
	 *
	 * @return True if a next element exists. False if not.
	 */
	@Override
	public boolean hasNext() {
		if (size == 0 || currentNode.getNext() == null) {
			return false;
		}

		return true;
	}

	/**
	 * Get the previous element in the list.
	 *
	 * @return The previous element in the list.
	 */
	@Override
	public T prev() {
		if (size == 0 || currentNode.getPrev() == null) {
			throw new IndexOutOfBoundsException();
		}

		currentNode = currentNode.getPrev();
		--position;

		return currentNode.getData();
	}

	/**
	 * Get the next element in the list.
	 *
	 * @return The next element in the list.
	 */
	@Override
	public T next() {
		if (size == 0 || currentNode.getNext() == null) {
			throw new IndexOutOfBoundsException();
		}

		currentNode = currentNode.getNext();
		++position;

		return currentNode.getData();
	}

	/**
	 * Get the element at a specific position in the list.
	 *
	 * @param index The position in the list, zero indexed.
	 * @return The requested element.
	 */
	@Override
	public T get(int index) {
		setPosition(index);
		return currentNode.getData();
	}

	/**
	 * Get the current position in the list.
	 *
	 * @return The current position, zero indexed. Null if list is empty.
	 */
	@Override
	public Integer getPosition() {
		return position;
	}

	/**
	 * Set the position in the list.
	 *
	 * @param index The position in the list, zero indexed.
	 */
	@Override
	public void setPosition(int index) {
		if (index > size - 1 || index < 0) {
			throw new IndexOutOfBoundsException();
		}

		MyNode<T> wantedNode = first;

		int searchPosition = 0;
		while (searchPosition < index) {
			wantedNode = wantedNode.getNext();
			++searchPosition;
		}

		currentNode = wantedNode;
		position = searchPosition;
	}

	/**
	 * Set the position to the first element in the list.
	 */
	@Override
	public void setPositionFirst() {
		currentNode = first;
		position = 0;
	}

	/**
	 * Set the position to the last element in the list.
	 */
	@Override
	public void setPositionLast() {
		currentNode = last;
		position = size - 1;
	}

}
