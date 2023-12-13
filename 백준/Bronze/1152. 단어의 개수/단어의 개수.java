import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * next()		: 스페이스, 공백 전까지 입력받은 문자열 리턴 (띄어쓰기 기준)
		 * nextLine()	: 엔터를 치기 전까지 쓴 문자열 리턴 (줄넘김 기준)
		*/
		String voca = sc.nextLine();
		String[] arr = voca.split(" ");
		
		if(arr.length == 0) {
			System.out.println("0");
		}else if((arr[0]=="")) {
			System.out.println(arr.length-1);
		}else {
			System.out.println(arr.length);
		}
	}
}