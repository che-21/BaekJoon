import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int H, M;
		Scanner sc = new Scanner(System.in);
		
		H = sc.nextInt();
		M = sc.nextInt();
		
		M -= 45;
		
		if(H<0 || M<0) {
			if(H<0 && M<0) {
				if(M<=-60) {
					H += M/60;					
				} else
					H+= (M/60)-1;
				M += 60;
				M %= 60;
				H += 24;
			} else if(H<0) {
				if(M>59) {
					H += M/60;
					if(H<0) {
						H += 24;
					}
					M %= 60;
				} else {
					H += 24;			
				}
			} else {
				if(H>23) {
					if(M<=-60) {
						H += M/60;					
					} else {
						H+= (M/60)-1;
					}
					if(H>23) {
						H -= 24;
					}
					M += 60;
					M %= 60;
				} else {
					if(M<=-60) {
						H += M/60;					
					} else {
						H+= (M/60)-1;
					}
					H += 24;
					M += 60;
					M %= 60;
				}
			}
		}
		
		if(H>23 || M>59) {
			if(H>23 && M>59) {
				H += (M/60)-24;
				M %= 60;
			} else if(H>23) {
				H += (M/60)-24;
			} else {
				H += M/60;
				if(H>23) {
					H -= 24;
				}
				M %= 60;
			}
		}
		
		System.out.println(H+" "+M);
		
	}
	
}
