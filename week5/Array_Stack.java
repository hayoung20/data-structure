package week5;

public class Array_Stack {
	public static void main(String args[]){
		 int stackSize = 5;
		 char deletedItem;
		 ArrayStack S = new ArrayStack(stackSize);
		
		 S.push('A');
		 S.printStack( );
		
		 S.push('B');
		 S.printStack();
		
		 S.push('C');
		 S.printStack( );
		
		 deletedItem = S.pop();
		 if(deletedItem != 0)
		 System.out.println("deleted Item : " + deletedItem);
		 S.printStack();
		 }
}
