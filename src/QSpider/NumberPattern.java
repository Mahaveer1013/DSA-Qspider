package QSpider;

public class NumberPattern {
    public static void main(String[] args) {
//        numberCollapse(123, 456);
//        snakePattern();
        isNeon(9);
    }

    public static void snakePattern() {
        int count = 5;
        int num = 1;
        for (int i = 1; i <= count; i++) {
            if (i % 2 == 0) {
                num = num + count - 1;
                for (int j = 1; j <= count; j++) {
                    System.out.print(num < 10 ? "0" + num-- + " " : num-- + " ");
                }
            } else {
                num = num != 1 ? num + count + 1 : num;
                for (int j = 1; j <= count; j++) {
                    System.out.print(num < 10 ? "0" + num++ + " " : num++ + " ");
                }
            }
            System.out.println();
        }
    }

    public static void numberCollapse(int a, int b) {
        System.out.println(mergeTwoNum(revNum(a), b));
    }

    public static int revNum(int num) {
        int ans = 0;
        while (num > 0) {
            ans = (ans * 10) + (num % 10);
            num /= 10;
        }
        return ans;
    }

    public static void isNeon(int num) {
        if (num == sumOfSquare(num * num))
            System.out.println("Neon");
        else
            System.out.println("Not neon");
    }

    public static int sumOfSquare(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int mergeTwoNum(int a, int b) {
        int ans = 0;
        while (a > 0 || b > 0) {
            if (a > 0) {
                ans = (ans * 10) + (a % 10);
                a /= 10;
            }
            if (b > 0) {
                ans = (ans * 10) + (b % 10);
                b /= 10;
            }
        }
        return ans;
    }
}
