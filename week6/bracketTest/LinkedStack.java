package bracketTest;

public class LinkedStack implements Stack {
	private StackNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		// System.out.println("Inserted Item : " + item);
	}
	public char pop() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		} else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}
	public void delete() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		} else {
			top = top.link;
		}
	}
	public char peek() {
		if (isEmpty()) {
			System.out.printf("Peeking fail! Linked Stack is empty!!");
			return 0;
		} else
			return top.data;
	}
	public void printStack() {
		if (isEmpty())
			System.out.printf("Linked Stack is empty!! %n %n");
		else {
			StackNode temp = top;
			System.out.println("Linked Stack>> ");
			while (temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}
}
