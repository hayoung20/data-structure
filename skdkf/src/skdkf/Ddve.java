package skdkf;

import java.util.Scanner;

public class Ddve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] score = new int[5]; {
		         Scanner scanner = new Scanner (System.in);
		         for(int i=0; i<score.length; i++) {
		            System.out.print((i+1)+"번째");
		            score[i] = scanner.nextInt();
		         }
		         System.out.println("\n배열 출력");
		         for(int i=0; i<score.length; i++) {
		            System.out.println(score[i]);
		         }
		      }
		   }
		}5
