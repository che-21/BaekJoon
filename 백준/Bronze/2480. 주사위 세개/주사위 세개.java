import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int money = 0;
		
		if(a != b && b != c && a != c) {
			if(a > b && a > c) {
				money += a * 100;
				System.out.println(money);
			} else if(b > a && b > c) {
				money += b * 100;
				System.out.println(money);
			} else {
				money += c * 100;
				System.out.println(money);
			}
		}
		
		if(a == b && a != c && b!= c) {
			money += 1000 + a * 100;
			System.out.println(money);
		} else if(a == c && a != b && b!=c) {
			money += 1000 + a * 100;
			System.out.println(money);
		} else if(b == c && a != b && a != c) {
			money += 1000 + b * 100;
			System.out.println(money);
		}
		
		if (a == b && b == c && a ==c ) {
			money += 10000 + a * 1000;
			System.out.println(money);
		}
	}

}