import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		
		StringBuilder sb1 = new StringBuilder(num1).reverse();
		StringBuilder sb2 = new StringBuilder(num2).reverse();
		
		int n1 = Integer.parseInt(sb1.toString());
		int n2 = Integer.parseInt(sb2.toString());
		
		if(n1 >n2) {
			System.out.println(n1);
		}else {
			System.out.println(n2);
		}
	}
}