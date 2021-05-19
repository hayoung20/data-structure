package week12;

public class Ex10_2 {

	public static void main(String[] args) {
		AdjList G9 = new AdjList();
		
		for (int i=0; i<7; i++)
			G9.insertVertex(i);
		G9.insertEdge(0, 2);
		G9.insertEdge(0, 1);
		G9.insertEdge(1, 4);
		G9.insertEdge(1, 3);
		
		G9.insertEdge(2, 4);
		G9.insertEdge(2, 0);
		G9.insertEdge(3, 6);
		G9.insertEdge(3, 1);
		G9.insertEdge(4, 6);
		G9.insertEdge(4, 2);
		G9.insertEdge(4, 1);
		G9.insertEdge(5, 6);
		G9.insertEdge(6, 5);
		G9.insertEdge(6, 4);
		G9.insertEdge(6, 3);
		System.out.printf("\n 그래프 G9의 인접리스트 : ");
		G9.printAdjList(); System.out.println();
		
		System.out.printf("\n\n 깊이우선탐색 >>");
		G9.DFS(0);
		
		System.out.printf("\n\n 너비우선탐색 >>");
		G9.BFS(0);
	}
}
