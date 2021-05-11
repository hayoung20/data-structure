package week11;

public class BHeapMain {
	public static void main(String[] args) {
		Entry[]a = new Entry[16];	//a[0]은 사용 안함
		a[1] = new Entry(90,"watermelon"); a[2] = new Entry(80,"pear");
		a[3] = new Entry(70,"melon"); a[4] = new Entry(50,"lime");
		a[5] = new Entry(60,"mango"); a[6] = new Entry(20,"cherry");
		a[7] = new Entry(30,"grape"); a[8] = new Entry(35,"orange");
		a[9] = new Entry(10,"appricot"); a[10] = new Entry(15,"banana");
		a[11] = new Entry(45,"lemon"); a[12] = new Entry(40,"kiwi");
		BHeap h = new BHeap(a,12);	//힙 객체 생성
		h.createHeap();	//힙 만들기
		System.out.println("최소힙:"); h.print();
		System.out.println("min 삭제 후"); System.out.println(h.deleteMin().getValue());
		h.print();
		h.insert(5, "apple"); System.out.println("5 삽입 후"); h.print();
	}

}