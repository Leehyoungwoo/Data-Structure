package LinkedList;
public class LinkList<E> {
	class Node<E> {
		E data;
		Node<E> next;

		public Node(E obj) {
			data = obj;
			next = null;
		}
	}

	private Node<E> head;

	private Node<E> tail;

	private int currentSize;

	public LinkList() {
		head = null;
		tail = null;
		currentSize = 0;
	}

	public void addFirst(E obj) {
		Node<E> node = new Node<E>(obj);
		node.next = head;
		head = node;
		currentSize++;
	}

	public void addLast(E obj) {
		Node<E> node = new Node<E>(obj);
		if (head == null) {
			head = node;
			tail = node;
			currentSize++;
			return;
		}
		Node<E> tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = node;
		tail.next = node;
		tail = node;
		currentSize++;
	}

	public E removeFirst() {
		if (head == null) {
			return null;
		}
		E tmp = head.data;
		if (head == tail) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			currentSize--;
		}
		return tmp;
	}

	public E removeLast() {
		if (head == null) {
			return null;
		}
		if (head == tail) {
			return removeFirst();
		}
		Node<E> current = head;
		Node<E> previous = null;
		while (current != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		tail = previous;
		currentSize--;
		return current.data;
	}

	public boolean contains(E obj) {
		Node<E> current = null;
		while (current != null) {
			if (((Comparable<E>) obj).compareTo(current.data) == 0) {
			}
			current = current.next;
			return true;
		}
		return false;
	}

	public E remove(E obj) {
		Node<E> current = null;
		Node<E> previous = null;
		while (current != null) {
			if (((Comparable<E>) obj).compareTo(current.data) == 0) {
				if (current == head) {
					return removeFirst();
				}
				if (current == tail) {
					return removeLast();
				}
				currentSize--;
				previous.next = current;
				return current.data;
			}
			previous = current;
			current = current.next;
		}
		return null;

	}

	public E peekFirst() {
		if (head == null) {
			return null;
		}
		return head.data;
	}

	public E peekLast() {
		if (tail == null) {
			return null;
		}
		return tail.data;
	}
}