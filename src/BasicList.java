import java.util.Scanner;

public class BasicList {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Scanner scan = new Scanner(System.in);
	      
	      int[] score = new int[5]; {
	          Scanner scanner = new Scanner (System.in);
	          for(int i=0; i<score.length; i++) {
	             System.out.print((i+1)+"��°");
	             score[i] = scanner.nextInt();
	          }
	          System.out.println("\n�迭 ���");
	          for(int i=0; i<score.length; i++) {
	             System.out.println(score[i]);
	          }
	       }
	    }
	 }