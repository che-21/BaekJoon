import java.util.*;

public class Main {
	public static void main(String[] args) {
		int N;
		float M=0, avg=0;
		float sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		float score[] = new float[N];

		for(int i=0; i<N; i++) {
			score[i] = sc.nextFloat();
			if(M<score[i]) {
				M = score[i];
			}
		}
		for(int j=0; j<N; j++) {
			score[j] = score[j]/M*100;
			sum += score[j];
		}
		avg = sum/N;
		System.out.println(avg);
	}	
}