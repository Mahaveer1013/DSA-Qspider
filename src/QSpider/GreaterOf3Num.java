package QSpider;

import java.util.Scanner;

public class GreaterOf3Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Data 1");
        int a = scanner.nextInt();
        System.out.println("Enter Data 2");
        int b = scanner.nextInt();
        System.out.println("Enter Data 3");
        int c = scanner.nextInt();
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println(a * b * c);
        } else if ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 0 && c % 2 == 0) || (b % 2 == 0 && c % 2 == 0)) {
            System.out.println(a % 2 != 0 ? b + c : (b % 2 != 0 ? a + c : a + b));
        } else if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println(a % 2 == 0 ? a : (b % 2 == 0 ? b : c));
        } else {
            System.out.println(0);
        }
    }
}
