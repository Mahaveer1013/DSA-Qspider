package QSpider;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first data: ");
        int a = scanner.nextInt();
        System.out.print("Enter second data: ");
        int b = scanner.nextInt();
        System.out.println(add(a, b));
    }
    private static boolean add(int a, int b) {
        return (a+b) % 3 == 0 && (a+b) % 5 ==0;
    }
}
