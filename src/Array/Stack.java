package Array;

public class Stack {
	private int[] elements;
	private int top = -1;
	private int size = 100;

	public Stack() {
		elements = new int[size];
	}

	public Stack(int data) {
		elements = new int[size];
		elements[top++] = data;
	}

	public void push(int data) {
		if (top == elements.length - 1) {
			size = top++;
			int[] extendElemets = new int[size];
			extendElemets = elements;
			elements[top++] = data;
		}
	}

	public int pop() {
		if (top == -1) { /// 스택이 비어있을때
			return -1;
		} else {
			int n = elements[top];
			elements[top] = 0;
			top--;
			return n;
		}
	}
	public void print() {
		for (int i = 0; i < elements.length; i++) {
			System.out.print(elements[i]+ "\t");
		}
		System.out.print("= top");
		System.out.println();
	}

}
