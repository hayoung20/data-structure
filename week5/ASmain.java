package week5;

public class ASmain {
	public static void main(String[] args) {
		Array_StackG<String> stack = new Array_StackG<String>();
		
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
	}

}
