package Lab03;

import java.util.Scanner;

public class JPA07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input:");
            int m = scanner.nextInt();

            if (m == 999) {
                break;
            }

            int n = scanner.nextInt();
            int gcd = 1;
            for (int i = 1; i <= m && i <= n; i++) {
                if (m % i == 0 && n % i == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }
        scanner.close();
    }
}
