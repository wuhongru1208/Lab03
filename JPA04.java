package Lab03;

import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double total = 0;

        while (true) {
            System.out.printf("Please enter meal dollars or enter -1 to stop:");
            double cost = scanner.nextDouble();

            if (cost == -1) {
                break;
            }

            count++;
            total += cost;
        }

        scanner.close();

        double average = total / count;

        System.out.printf("餐點總費用: %.2f\n", total);
        System.out.printf(" %d 道餐點平均費用為: %.2f \n", count, average);
    }
}