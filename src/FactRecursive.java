import java.util.Scanner;

public class FactRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		sc.close();

		System.out.println(FactRecursive(input));

	}

	public static int FactRecursive(int n) {

		if (n <= 1) {

			return n;

		}

		else {

			return FactRecursive(n-1) * n;

		}
	}

}
