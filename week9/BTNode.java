package week9;

public class BTNode<Key extends Comparable<Key>> {
	private Key	item;
	private BTNode<Key> left;
	private BTNode<Key> right;
	
	public BTNode( Key newItem, BTNode<Key> lt, BTNode<Key> rt) {
		item = newItem; left = lt; right = rt; }
	public Key getKey() {return item;}
	public BTNode<Key> getLeft() {return left;}
	public BTNode<Key> getRight() {return right;}
	
	public void setKey(Key newItem) {item = newItem;}
	public void setLeft(BTNode<Key> lt) {left = lt;}
	public void setRight(BTNode<Key> rt) {right = rt;}
}
