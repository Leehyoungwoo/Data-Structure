package Array;

public class Queue {
	private int[] elements;
	private int front = 0;
	private int rear = -1;
	private int size = 100;

	public Queue() {
		elements = new int[size];
	}

	public Queue(int data) {
		elements = new int[size];
		elements[front] = data;
		rear++;
	}

	public void offer(int data) {
		if (rear == elements.length) {
			size++;
			rear++;
			int[] extenedElements = new int[size];
			for (int i = 0; i < rear; i++) {
				extenedElements[i + 1] = elements[i];
			}
			extenedElements[front] = data;
			elements[front] = data;
		}
	}

	public int peek() {
		return elements[front];
	}

	public int poll() {
		if (rear == -1) {
			return -1;
		} else {
			int data = elements[front];
			elements[front] = 0;
			front++;
			return data;
		}
	}
}
