package QSpider;

import java.util.Scanner;

public class NumberRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        int num = scanner.nextInt();
        int ans = 0;
        while(num>0){
            ans = (ans*10) + (num%10);
            num/=10;
        }
        System.out.println("Answer: "+ans);
    }
}
