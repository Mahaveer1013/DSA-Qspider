package QSpider;

import java.util.Scanner;

public class StarPattern {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        boxStar(5);
//        numberPattern1();
//        crossStar();
//        rightTriangle();
//        numberStar();
//        pyramid();
//        reversePyramid();
        pyramidSquares();
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

    public static void rightTriangle() {
        int count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (i + j >= count + 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void numberStar() {
        int count = 5;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (i == j || i + j == count + 1) {
                    System.out.print(i + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void reversePyramid() {
        int count = 4;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= (2 * count) - 1; j++) {
                if (i <= j && i + j < (count * 2) + 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void pyramid() {
        int count = 4;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= (2 * count) - 1; j++) {
                if (i + j >= count + 1 && j <= count + i - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void pyramidSquares() {
        int count = 4;
        int num = 1;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= (2 * count) - 1; j++) {
                if (i + j >= count + 1 && j <= count + i - 1) {
                    System.out.print(num*num + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            num++;
            System.out.println();
        }
    }

}
