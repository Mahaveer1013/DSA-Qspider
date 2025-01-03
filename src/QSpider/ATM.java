package QSpider;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        int amt = scanner.nextInt();
        int fiveHundred = amt / 500;
        amt %= 500;
        int twoHundred = amt / 200;
        amt %= 200;
        int hundred = amt / 100;
        amt %= 100;
        System.out.println("fiveHundred : " + fiveHundred);
        System.out.println("twoHundred : " + twoHundred);
        System.out.println("hundred : " + hundred);
        System.out.println("balance : " + amt);
    }
}
