package QSpider;

import java.util.Scanner;

public class StarPattern {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        boxStar(5);
//        numberPattern1();
//        crossStar();
        rightTriangle();
    }

    public static void boxStar(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPattern1() {
        int num = 1;
        int count = 5;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print((num < 10 ? "0" + num : num) + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void rightTriangle(){
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if(j<=i){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
                System.out.println();
        }
    }

}
