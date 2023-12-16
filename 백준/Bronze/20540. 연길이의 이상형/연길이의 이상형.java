import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mbti = sc.next();
		char ie = mbti.charAt(0);
		char ns = mbti.charAt(1);
		char tf = mbti.charAt(2);
		char pj = mbti.charAt(3);
		
		char a = ((ie == 'I') ? 'E' : 'I');
		char b = ((ns == 'N') ? 'S' : 'N');
		char c = ((tf == 'T') ? 'F' : 'T');
		char d = ((pj == 'P') ? 'J' : 'P');
		
		System.out.println(Character.toString(a)+Character.toString(b)+Character.toString(c)+Character.toString(d));
	}	
}