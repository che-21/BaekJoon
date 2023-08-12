import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		int N;
		int max = 1_000_000;
		int min = -1_000_000;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		min = arr[0];
		for(int j=0; j<N-1; j++) {
			int max1 = (arr[j] < arr[j+1]) ? arr[j+1] : arr[j];
			if(max < max1) {
				max = max1;
			}
			int min1 = (arr[j] > arr[j+1]) ? arr[j+1] : arr[j];
			if(min > min1) {
				min = min1;
			}
		}
		System.out.println(min + " " + max);
	}	
}