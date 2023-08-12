import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cmin = sc.nextInt();
		
		if(cmin >= 60) {
			hour += (min + cmin)/60;
			min = (min + cmin)%60;
			if(hour >= 24) {
				hour = hour%24;
			}
		} else {
			min += cmin;
			if(min >= 60) {
				hour += min/60;
				min = min%60;
			}
			if(hour >= 24) {
				hour = hour%24;
			}
		}
		
		System.out.println(hour + " " + min);
	}

}