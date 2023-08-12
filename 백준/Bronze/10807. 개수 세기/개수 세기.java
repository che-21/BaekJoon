import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		int N, v;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		v = sc.nextInt();
		for(int j=0; j<N; j++) {
			if(arr[j] == v) { cnt += 1;}
		}
		System.out.println(cnt);
			
	}	
}