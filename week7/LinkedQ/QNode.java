package LinkedQ;

interface Queue{
	boolean isEmpty();
	void enQueue(char item);
	char deQueue();
	void delete();
	char peek();
}

class QNode {
	char data;
	QNode link;
}
