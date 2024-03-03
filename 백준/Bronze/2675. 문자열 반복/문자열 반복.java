import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // scanner를 최소화 하기!
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();  // 반복 횟수 R
            String S = sc.next();  // 반복할 문자열 S

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }

        sc.close();
    }
}