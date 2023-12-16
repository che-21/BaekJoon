import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mbti = sc.next();
		char ie = mbti.charAt(0);
		char ns = mbti.charAt(1);
		char tf = mbti.charAt(2);
		char pj = mbti.charAt(3);
		sc.close();
		
		String a = Character.toString((ie == 'I') ? 'E' : 'I');
		String b = Character.toString((ns == 'N') ? 'S' : 'N');
		String c = Character.toString((tf == 'T') ? 'F' : 'T');
		String d = Character.toString((pj == 'P') ? 'J' : 'P');
		
		System.out.println(a+b+c+d);
	}	
}