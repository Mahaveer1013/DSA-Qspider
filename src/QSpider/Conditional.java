package QSpider;

public class Conditional {
    public static void main(String[] args) {
        int a, b, c;
        a = 109;
        b = 143;
        c = 100;
        a%= 10; // x = 9
        b /= 10; // b = 14
        b %= 10; // y = 4
        c /= 100;
        c %= 10;
        System.out.println("first :" + a);
        System.out.println("second :" + b);
        System.out.println("third :" + c);
        System.out.println((a + b + c) % 2 == 0 ? (a + b + c) + " is even" : (a + b + c) + " is odd");
    }

}

