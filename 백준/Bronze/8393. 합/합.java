import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int n, i;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
}