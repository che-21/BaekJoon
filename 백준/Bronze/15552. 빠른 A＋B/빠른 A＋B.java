import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<=T; i++) {	
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(A+B));
			bw.newLine();
		}
        bf.close();
		bw.flush();
        bw.close();
	}
}
