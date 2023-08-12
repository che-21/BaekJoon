import java.util.*;
import java.util.stream.IntStream;

public class Main {
	static void reverse(int[]a, int b, int c) {
		int[]copy = Arrays.copyOfRange(a,b,c);
		
		int len = copy.length;
		for(int z=0; z<len; z++) {
			a[b+z] = copy[len-(z+1)];
		}
	}
	public static void main(String[] args) {
		int N, M, i, j;
		
		Scanner sc = new Scanner(System.in);
		
		//N번째 바구니까지 설정
		N = sc.nextInt();
		int[] baskets = IntStream.range(1, N+1).toArray();		

		//M회 바꾸기
		M = sc.nextInt();
		for(int y=0; y<M; y++) {
			//i번째 바구니부터 j번째 바구니 범위 설정
			i = sc.nextInt();
			j = sc.nextInt();

			//i번째~j번째 바구니 역정렬
			reverse(baskets,i-1,j);
		}
		for(int k : baskets) {
			System.out.print(k + " ");
		}
	}	
}