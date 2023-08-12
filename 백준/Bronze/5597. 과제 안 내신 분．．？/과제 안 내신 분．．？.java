import java.util.*;

public class Main {
	public static void main(String[] args) {		
		int n;
		int noSub[] = new int[30];
		
		// noSub에서 1부터 30까지 배열에 넣는다.(작은수가 먼저 출력되도록 하기 위해서)
		for(int j=0; j<30; j++) {
			noSub[j] = j+1;
		}
		Scanner sc = new Scanner(System.in);
		
		// n을 입력할 때마다 noSub에서 n인 숫자를 0으로 바꾼다.
		for(int i=0; i<28; i++) {
			n = sc.nextInt();
			for(int k=0; k<30; k++) {
				if(noSub[k]==n) {
					noSub[k] = 0;
				}
			}
		}
		
		for(int x=0; x<30; x++) {
			if(noSub[x]!=0) {
				System.out.println(noSub[x]);
			}
		}
	}	
}