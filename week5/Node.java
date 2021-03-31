package week5;

public class Node <E> {
		private E item;
		private Node<E> next;
		public Node(E item, Node<E> next) {
			super();
			this.item = item;
			this.next = next;
		}
		public E getItem() {
			return item;
		}
		public void setItem(E item) {
			this.item = item;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
		

	}

