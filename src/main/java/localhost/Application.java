package localhost;

import localhost.linkedlist.MyLinkedListImpl;
import localhost.linkedlist.MyList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Demo our custom linked list.
 * <p>
 * We populate the list and output it from both directions.
 */
public class Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		/*
		 * Create and populate the list.
		 */

		MyList<Integer> linkedList = new MyLinkedListImpl<>();

		int totalElements = 10;
		for (int i = 0; i < totalElements; i++) {
			linkedList.add(i + 1);
		}
		LOGGER.info(String.format("Created a list of %d elements. Here's the list:", linkedList.size()));

		/*
		 * List elements in ascending order.
		 */

		linkedList.setPositionFirst();
		LOGGER.info(String.format("Position %d: %d", linkedList.getPosition(), linkedList.getElement()));

		while (linkedList.hasNext()) {
			linkedList.next();
			LOGGER.info(String.format("Position %d: %d", linkedList.getPosition(), linkedList.getElement()));
		}

		/*
		 * List elements in descending order.
		 */

		LOGGER.info("Here is the list in descending order:");

		linkedList.setPositionLast();
		LOGGER.info(String.format("Position %d: %d", linkedList.getPosition(), linkedList.getElement()));

		while (linkedList.hasPrev()) {
			linkedList.prev();
			LOGGER.info(String.format("Position %d: %d", linkedList.getPosition(), linkedList.getElement()));
		}
	}

}
