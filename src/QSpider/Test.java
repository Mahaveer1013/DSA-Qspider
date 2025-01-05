package QSpider;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        test(1,2,3);
    }

    public static void test(int... a){
        for(int n:a){
            System.out.println(n);
        }
    }

}
