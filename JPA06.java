package Lab03;

import java.util.Scanner;

public class JPA06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input:");
            int m = scanner.nextInt();

            if (m == 999) {
                break;
            }

            int n = scanner.nextInt();
            int result = 1;
            for (int i = 0; i < n; i++) {
                result *= m;
            }
            System.out.println(result);
        }
        scanner.close();
    }
}