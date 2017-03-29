package localhost;

import localhost.linkedlist.MyLinkedListImpl;
import localhost.linkedlist.MyList;


/**
 * Demo our custom linked list.
 * <p>
 * We populate the list and output it from both directions.
 */
public class Application {

	public static void main(String[] args) {
		/*
		 * Create and populate the list.
		 */

		MyList<Integer> linkedList = new MyLinkedListImpl<>();

		int totalElements = 10;
		for (int i = 0; i < totalElements; i++) {
			linkedList.add(i + 1);
		}
		System.out.format("Created a list of %d elements. Here's the list:%n", linkedList.size());

		/*
		 * List elements in ascending order.
		 */

		linkedList.setPositionFirst();
		System.out.format("Position %d: %d%n", linkedList.getPosition(), linkedList.getElement());

		while (linkedList.hasNext()) {
			linkedList.next();
			System.out.format("Position %d: %d%n", linkedList.getPosition(), linkedList.getElement());
		}

		/*
		 * List elements in descending order.
		 */

		System.out.println("Here is the list in descending order:");

		linkedList.setPositionLast();
		System.out.format("Position %d: %d%n", linkedList.getPosition(), linkedList.getElement());

		while (linkedList.hasPrev()) {
			linkedList.prev();
			System.out.format("Position %d: %d%n", linkedList.getPosition(), linkedList.getElement());
		}
	}

}
