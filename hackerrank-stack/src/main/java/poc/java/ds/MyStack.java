package poc.java.ds;

public class MyStack {
	private Node top;

	public boolean isEmpty() {
		return top == null;
	}

	public int peek() {
		// Check for NPE
		return top.data;
	}

	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}

	public int pop() {
		// Check for NPE
		int data = top.data;
		top = top.next;

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
		return "MyStack [top=" + top + "]";
	}

}
