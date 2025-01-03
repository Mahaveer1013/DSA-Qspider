package QSpider;

import java.util.Scanner;

public class PerfectNumber {

    public static Scanner scanner = new Scanner(System.in); //28

    public static void main(String[] args) {
        int i=0;
        int count=1;
        while(count<=4){
            if(isPerfect(i)){
                System.out.println(i + " is a perfect number");
                count++;
            }
            i++;
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }
}
