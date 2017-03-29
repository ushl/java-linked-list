package localhost.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {

	@Test
	public void getData() throws Exception {
		MyNode<Integer> node = new MyNode<>(1);

		Assert.assertEquals(new Integer(1), node.getData());
	}

	@Test
	public void setData() throws Exception {
		MyNode<Integer> node = new MyNode<>(1);

		node.setData(42);

		Assert.assertEquals(new Integer(42), node.getData());
	}

	@Test
	public void getPrev() throws Exception {
		MyNode<Integer> node1 = new MyNode<>(1);
		MyNode<Integer> node2 = new MyNode<>(2);

		node2.setPrev(node1);

		Assert.assertEquals(node1, node2.getPrev());
	}

	@Test
	public void setPrev() throws Exception {
		MyNode<Integer> node1 = new MyNode<>(1);
		MyNode<Integer> node2 = new MyNode<>(2);

		node2.setPrev(node1);

		Assert.assertEquals(node1, node2.getPrev());
	}

	@Test
	public void getNext() throws Exception {
		MyNode<Integer> node1 = new MyNode<>(1);
		MyNode<Integer> node2 = new MyNode<>(2);

		node1.setNext(node2);

		Assert.assertEquals(node2, node1.getNext());
	}

	@Test
	public void setNext() throws Exception {
		MyNode<Integer> node1 = new MyNode<>(1);
		MyNode<Integer> node2 = new MyNode<>(2);

		node1.setNext(node2);

		Assert.assertEquals(node2, node1.getNext());
	}

	@Test
	public void testToString() throws Exception {
		MyNode<Integer> node1 = new MyNode<>(1);

		Assert.assertEquals("1", node1.toString());
	}

}