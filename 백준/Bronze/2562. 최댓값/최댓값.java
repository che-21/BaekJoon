import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		int arr[] = new int[9];
		int max = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				num = i+1;
			}
		}
		System.out.println(max);
		System.out.println(num);
	}	
}