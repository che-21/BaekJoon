import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		long X;
		int N, a;
		short b;
		int cost = 0;
		
		Scanner sc = new Scanner(System.in);
		
		X = sc.nextLong();
		N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			a = sc.nextInt();
			b = sc.nextShort();
			cost += a*b;
		}
		
		if(X==cost) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
			
	}	
}