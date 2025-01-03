package QSpider;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();
        for (int i = num1; i < num2; i++) {
            if (checkIsArmstrong(i)) {
                System.out.println(i + " is an armstrong number");
            }
        }
    }

    private static boolean checkIsArmstrong(int num) {
        int sum = 0, temp = num;
        int count = countDigits(num);
        while (temp > 0) {
            sum += pow(temp % 10, count);
            temp /= 10;
        }
        return sum == num;
    }

    private static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    private static int pow(int b, int e) {
        int res = 1;
        for (int i = 0; i < e; i++) {
            res *= b;
        }
        return res;
    }
}
