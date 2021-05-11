package week11;

public class HeapMain {

	public static void main(String[] args) {
		int n,item;
		Heap h = new Heap();
		
		h.insertHeap(13);
		h.insertHeap(8);
		h.insertHeap(10);
		h.insertHeap(15);
		h.insertHeap(20);
		h.insertHeap(19);
		
		h.prinHeap();
		
		n = h.getHEapSize();
		for(int i=1; i<=n; i++) {
			item = h.deleteHeap();
			System.out.printf("\ndeleted Item : [%d]", item);
		}
	}
}
