package QSpider;

import java.util.Scanner;

public class Fibonacci {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        NthNum();
        firstNNumbers();
    }

    public static void NthNum() {
        System.out.print("Enter Nth number to print:");
        int count = scanner.nextInt();
        int num1 = 0, num2 = 1, num3 = 1;

        for (int i = 2; i < count; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(num3);
    }

    public static void firstNNumbers() {
        System.out.print("Enter no of count: ");
        int count = scanner.nextInt();
        int num1 = 0, num2 = 1, num3;

        System.out.print("[" + num1);
        System.out.print("," + num2);
        for (int i = 2; i < count; i++) {
            num3 = num1 + num2;
            System.out.print("," + num3);
            num1 = num2;
            num2 = num3;
        }
        System.out.print("]");
    }
}
