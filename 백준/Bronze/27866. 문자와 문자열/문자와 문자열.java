import java.util.*;

public class Main {
	public static void main(String[] args) {	
		int i;
		String S;
		
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		i = sc.nextInt();
		
		String arr[] = S.split("");
		System.out.println(arr[i-1]);
	}	
}