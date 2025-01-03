package QSpider;

import java.util.Scanner;

public class NoOfDigits {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        System.out.println(noOfDigits(scanner.nextInt()));
    }

    public static int noOfDigits(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    
    public static void noOfOddEven(){
        int a = scanner.nextInt();
        int even = 0, odd = 0;
        while (a > 0) {
            int rem = a % 10;
            if (rem % 2 == 0)
                even += rem;
            else
                odd += rem;
            a /= 10;
        }
        System.out.println(even > odd ? even - odd : odd - even);
    }
}
