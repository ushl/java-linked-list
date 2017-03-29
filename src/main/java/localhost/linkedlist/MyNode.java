package localhost.linkedlist;

/**
 * This class represents a single node in a linked list.
 */
public class MyNode<T> {

	private T data;
	private MyNode<T> prev = null;
	private MyNode<T> next = null;

	public MyNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public MyNode<T> getPrev() {
		return prev;
	}

	public void setPrev(MyNode<T> prev) {
		this.prev = prev;
	}

	public MyNode<T> getNext() {
		return next;
	}

	public void setNext(MyNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}

}
