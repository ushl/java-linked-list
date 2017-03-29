package localhost.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

@SuppressWarnings("Duplicates")
public class MyLinkedListImplTest {

	/*
	 * clear
	 */

	@Test
	public void clear() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		linkedList.clear();

		int size = linkedList.size();
		Assert.assertEquals(0, size);
	}

	/*
	 * getFirst
	 */

	@Test
	public void getFirst() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		int data = linkedList.getFirst();
		Assert.assertEquals(1, data);
	}

	@Test(expected = NoSuchElementException.class)
	public void getFirst_EmptyList() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.getFirst();
	}

	/*
	 * getLast
	 */

	@Test
	public void getLast() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		int data = linkedList.getLast();
		Assert.assertEquals(3, data);
	}

	@Test(expected = NoSuchElementException.class)
	public void getLast_EmptyList() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.getLast();
	}

	/*
	 * getElement
	 */

	@Test
	public void getElement() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);

		int data = linkedList.getElement();
		Assert.assertEquals(1, data);
	}

	@Test(expected = NoSuchElementException.class)
	public void getElement_EmptyList() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.getElement();
	}

	/*
	 * setElement
	 */

	@Test
	public void setElement() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);

		linkedList.setElement(42);

		int data = linkedList.getElement();
		Assert.assertEquals(42, data);
	}

	@Test(expected = NoSuchElementException.class)
	public void setElement_EmptyList() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.setElement(42);
	}

	/*
	 * add
	 */

	@Test
	public void add() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		int size = linkedList.size();
		Assert.assertEquals(3, size);
	}

	/*
	 * hasPrev
	 */

	@Test
	public void hasPrev() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);

		// The list should be on the first element.
		boolean hasPrev = linkedList.hasPrev();
		Assert.assertFalse(hasPrev);

		// The list should now be on the second element.
		linkedList.next();
		hasPrev = linkedList.hasPrev();
		Assert.assertTrue(hasPrev);
	}

	/*
	 * hasNext
	 */

	@Test
	public void hasNext() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);

		// The list should be on the first element.
		boolean hasNext = linkedList.hasNext();
		Assert.assertTrue(hasNext);

		// The list should now be on the second element.
		linkedList.next();
		hasNext = linkedList.hasNext();
		Assert.assertFalse(hasNext);
	}

	/*
	 * prev
	 */

	@Test
	public void prev() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		linkedList.next();
		linkedList.next();

		int data = linkedList.prev();
		Assert.assertEquals(2, data);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void prev_EmptyList() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.prev();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void prev_NoPrevious() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		linkedList.prev();
	}

	/*
	 * next
	 */

	@Test
	public void next() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		int data = linkedList.next();
		Assert.assertEquals(2, data);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void next_EmptyList() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.next();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void next_NoNext() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);

		linkedList.next();
		linkedList.next();
	}

	/*
	 * size
	 */

	@Test
	public void size() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		int size = linkedList.size();
		Assert.assertEquals(3, size);
	}

	/*
	 * get
	 */

	@Test
	public void get() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		int data = linkedList.get(2);
		Assert.assertEquals(3, data);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void get_InvalidIndex1() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		linkedList.get(42);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void get_InvalidIndex2() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		linkedList.get(-42);
	}

	/*
	 * getPosition
	 */
	@Test
	public void getPosition() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);

		Assert.assertEquals(new Integer(0), linkedList.getPosition());

		linkedList.next();
		Assert.assertEquals(new Integer(1), linkedList.getPosition());
	}

	@Test
	public void getPosition_EmptyList() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();

		Assert.assertNull(linkedList.getPosition());

	}

	/*
	 * setPosition
	 */

	@Test
	public void setPosition() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		linkedList.setPosition(2);

		int data = linkedList.getElement();
		Assert.assertEquals(3, data);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void setPosition_InvalidIndex1() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		linkedList.setPosition(42);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void setPosition_InvalidIndex2() throws Exception {
		MyList<Integer> linkedList = new MyLinkedListImpl<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		linkedList.setPosition(-42);
	}

}