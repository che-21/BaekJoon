import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int T, A, B;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			int sum = A + B;
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + sum);
		}
	}

}