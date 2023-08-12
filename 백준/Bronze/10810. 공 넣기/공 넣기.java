import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		int N, M;
		int i, j, k;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();

		int arr[] = new int [N];
		for(int num=0; num<M; num++) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			
			for(int x=i-1; x<j; x++) {
				arr[x] = k;
			}
		}
		for(int y=0; y<N; y++) {
			System.out.print(arr[y] + " ");
		}
	}	
}