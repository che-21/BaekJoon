import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String voca = sc.next();
		StringBuilder vc = new StringBuilder(voca).reverse();
		
		if((vc.toString()).equals(voca)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}