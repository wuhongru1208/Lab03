package Lab03;

import java.util.Scanner;

class JPA301 {
    public static void main(String argv[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1 + ... + " + n + " = " + sum);
        scanner.close();
    }
}