 import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
        long V = 1;
        
        for(int i=1; i<N+1; i++){
            V *= i;
        }
        System.out.println(V);
	}	
}