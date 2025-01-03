package QSpider;

public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic QSpider.Operators
        int a = 10, b = 20;
        System.out.println("Arithmetic QSpider.Operators:");
        System.out.println("Addition: " + (a + b)); // Output: 30
        System.out.println("Subtraction: " + (a - b)); // Output: -10
        System.out.println("Multiplication: " + (a * b)); // Output: 200
        System.out.println("Division: " + (b / a)); // Output: 2
        System.out.println("Modulus: " + (b % a)); // Output: 0

        // 2. Relational QSpider.Operators
        System.out.println("\nRelational QSpider.Operators:");
        System.out.println("a == b: " + (a == b)); // Output: false
        System.out.println("a != b: " + (a != b)); // Output: true
        System.out.println("a > b: " + (a > b)); // Output: false
        System.out.println("a < b: " + (a < b)); // Output: true
        System.out.println("a >= b: " + (a >= b)); // Output: false
        System.out.println("a <= b: " + (a <= b)); // Output: true

        // 3. Logical QSpider.Operators
        boolean x = true, y = false;
        System.out.println("\nLogical QSpider.Operators:");
        System.out.println("x && y: " + (x && y)); // Output: false
        System.out.println("x || y: " + (x || y)); // Output: true
        System.out.println("!x: " + (!x)); // Output: false

        // 4. Bitwise QSpider.Operators
        int c = 5, d = 3; // 5 = 0101, 3 = 0011
        System.out.println("\nBitwise QSpider.Operators:");
        System.out.println("c & d: " + (c & d)); // Output: 1
        System.out.println("c | d: " + (c | d)); // Output: 7
        System.out.println("c ^ d: " + (c ^ d)); // Output: 6
        System.out.println("~c: " + (~c)); // Output: -6
        System.out.println("c << 1: " + (c << 1)); // Output: 10
        System.out.println("c >> 1: " + (c >> 1)); // Output: 2

        // 5. Assignment QSpider.Operators
        int e = 10;
        System.out.println("\nAssignment QSpider.Operators:");
        e += 5; // e = e + 5
        System.out.println("e += 5: " + e); // Output: 15
        e -= 3; // e = e - 3
        System.out.println("e -= 3: " + e); // Output: 12
        e *= 2; // e = e * 2
        System.out.println("e *= 2: " + e); // Output: 24
        e /= 4; // e = e / 4
        System.out.println("e /= 4: " + e); // Output: 6
        e %= 3; // e = e % 3
        System.out.println("e %= 3: " + e); // Output: 0

        // 6. Unary QSpider.Operators
        int f = 10;
        System.out.println("\nUnary QSpider.Operators:");
        System.out.println("+f: " + (+f)); // Output: 10
        System.out.println("-f: " + (-f)); // Output: -10
        System.out.println("f++: " + (f++)); // Output: 10
        System.out.println("++f: " + (++f)); // Output: 12
        System.out.println("f--: " + (f--)); // Output: 12
        System.out.println("--f: " + (--f)); // Output: 10

        // 7. Ternary Operator
        int g = 5, h = 10;
        System.out.println("\nTernary Operator:");
        System.out.println("g > h ? g : h: " + (g > h ? g : h)); // Output: 10

        // 8. instanceof Operator
        String str = "Hello";
        System.out.println("\ninstanceof Operator:");
        System.out.println("str instanceof String: " + (str instanceof String)); // Output: true
    }
}
