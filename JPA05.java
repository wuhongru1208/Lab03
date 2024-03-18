package Lab03;

import java.util.Scanner;

public class JPA05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter one value:");
            int n = scanner.nextInt();

            if (n >= 1 && n <= 10) {
                int a = 1;
                for (int j = 1; j <= n; j++) {
                    a *= j;
                }
                System.out.println(n + "! : " + a);
            } else {
                System.out.println("Error, the value is out of range.");
            }
        }
        scanner.close();
    }
}