import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N, n, X;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		X = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			n = sc.nextInt();
			if(n < X) {
				System.out.print(n +" ");
			}
		}
				
	}
}