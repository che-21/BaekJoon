import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		int N, M, i, j;
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();

		int arr[] = new int [N];
		
		for(int k=0; k<N; k++) {
			arr[k] = k+1;
		}
		for(int num=0; num<M; num++) {
			i = sc.nextInt()-1;
			j = sc.nextInt()-1;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int y=0; y<N; y++) {
			System.out.print(arr[y] + " ");
		}
	}	
}