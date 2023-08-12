import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int A, B;
			A = sc.nextInt();
			B = sc.nextInt();
			if(A==0 && B ==0) {
				break;
			} else {				
				System.out.println(A+B);
			}
		}
	}
}