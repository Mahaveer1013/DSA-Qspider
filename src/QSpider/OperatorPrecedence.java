package QSpider;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        // Example 1: Arithmetic operators
        int result1 = a + b * c; // Multiplication has higher precedence than addition
        System.out.println("result1 (a + b * c) = " + result1);  // 10 + (5 * 2) = 10 + 10 = 20

        // Example 2: Parentheses to change precedence
        int result2 = (a + b) * c; // Parentheses have the highest precedence
        System.out.println("result2 ((a + b) * c) = " + result2);  // (10 + 5) * 2 = 15 * 2 = 30

        // Example 3: Combining multiple operators with the same precedence
        int result3 = a - b + c;  // Left to right evaluation (subtraction and addition have the same precedence)
        System.out.println("result3 (a - b + c) = " + result3);  // (10 - 5) + 2 = 5 + 2 = 7

        // Example 4: Relational and logical operators
        boolean result4 = a > b && b > c;  // '&&' has lower precedence than relational operators
        System.out.println("result4 (a > b && b > c) = " + result4);  // (10 > 5) && (5 > 2) = true && true = true

        // Example 5: Unary operators
        int result5 = ++a + b;  // Pre-increment has higher precedence than addition
        System.out.println("result5 (++a + b) = " + result5);  // (10 + 1) + 5 = 11 + 5 = 16

        // Example 6: QSpider.Conditional operator (ternary operator)
        int result6 = (a > b) ? a : b;  // Ternary operator evaluates the condition first
        System.out.println("result6 ((a > b) ? a : b) = " + result6);  // (11 > 5) ? 11 : 5 = 11

        // Example 7: Assignment operators
        int result7 = 10;
        result7 += 5 * 2;  // *=, /=, +=, -= have lower precedence than arithmetic operators
        System.out.println("result7 (result7 += 5 * 2) = " + result7);  // 10 + (5 * 2) = 10 + 10 = 20
    }
}
