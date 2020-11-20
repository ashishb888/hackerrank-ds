package poc.java.ds;

public class MyQueue {

	private Node head;
	private Node tail;

	public boolean isEmpty() {
		return head == null;
	}

	public int peek() {
		// Check for NPE
		return head.data;
	}

	public void add(int data) {
		Node node = new Node(data);

		if (tail != null)
			tail.next = node;

		tail = node;

		if (head == null)
			head = node;
	}

	public int remove() {
		// Check for NPE
		int data = head.data;
		head = head.next;

		if (head == null)
			tail = null;

		return data;
	}

	private static class Node {
		private int data;
		private Node next;

		private Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}

	@Override
	public String toString() {
		return "MyQueue [head=" + head + ", tail=" + tail + "]";
	}
}
