import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int N;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		N /= 4;
		
		for(int i=0; i<N; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}	
}