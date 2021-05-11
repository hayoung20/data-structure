package bracket;

public class HuffmanMain {
	public static void main(String[] args) {
		HuffmanEntry[] a;	//a[0]은 사용 안함
		a = new HuffmanEntry[7];
		
		a[1] = new HuffmanEntry(60,"a",null,null,null);a[2] = new HuffmanEntry(20, "b", null,null,null);
		a[3] = new HuffmanEntry(30,"c",null,null,null);	a[4] = new HuffmanEntry(35, "d", null,null,null);
		a[5] = new HuffmanEntry(40,"e",null,null,null);	a[6] = new HuffmanEntry(90, "f", null,null,null);
		
		Huffman h = new Huffman(a,6);
		System.out.println("최소힙 만들기 전");
		h.print();
		
		h.createHeap();
		System.out.println("최소힙:");
		h.print();
		
		System.out.println("허프만 코드");
		HuffmanEntry root = h.createTree();
		h.preorder(root);
		System.out.println();
	}
}
