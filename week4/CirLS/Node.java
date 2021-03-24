package cirLS;

public class Node <E>{
private E item;
private Node next;
public Node(E newItem, Node p){ // 생성자
item = newItem;
next = p;
}
// get 메소드와 set 메소드
public E getItem() { return item;}
public Node getNext() { return next;}
public void setItem(E newItem) { item = newItem;}
public void setNext(Node newNext) { next = newNext;}
}
