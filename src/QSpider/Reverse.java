package QSpider;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        int rev = 0;
        rev = (rev*10) + (num%10);
        num /=10;
        rev = (rev*10) + (num%10);
        num /=10;
        rev = (rev*10) + (num%10);
        System.out.println(rev);
    }
}
