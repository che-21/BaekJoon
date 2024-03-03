import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();  // 반복 횟수 R
            String b = sc.next();  // 반복할 문자열 S

            for (int j = 0; j < b.length(); j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print(b.charAt(j));
                }
            }
            System.out.println();
        }

        sc.close();
    }
}