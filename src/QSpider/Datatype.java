package QSpider;

public class Datatype {
    public static void main(String[] args) {
        // Two types of data types in Java:
        // 1. Primitive ⚠️️every number is int by default and every point number is double by default⚠️
        // 2. Non-Primitive

        // 1. Primitive Data Types:
        // These are basic data types predefined by the language.

        // byte: 8-bit integer, ranges from -128 to 127
        byte a = 100;
        System.out.println("byte: " + a);

        // short: 16-bit integer, ranges from -32,768 to 32,767
        short b = 30000;
        System.out.println("short: " + b);

        // int: 32-bit integer, ranges from -2^31 to 2^31-1
        int c = 100000;
        System.out.println("int: " + c);

        // long: 64-bit integer, ranges from -2^63 to 2^63-1
        long d = 10000000000L;
        System.out.println("long: " + d);

        // float: 32-bit floating point, single precision
        float e = 3.14f;
        System.out.println("float: " + e);

        // double: 64-bit floating point, double precision
        double f = 3.14159265359;
        System.out.println("double: " + f);

        // char: 16-bit Unicode character
        char g = 'A';
        System.out.println("char: " + g);

        // boolean: true or false
        boolean h = true;
        System.out.println("boolean: " + h);

        // 2. Non-Primitive Data Types:
        // These are user-defined or built-in objects like Strings, Arrays, and Classes.

        // String: A sequence of characters
        String str = "Hello, World!";
        System.out.println("String: " + str);

        // Array: A collection of elements of the same type
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Class: A user-defined data type
        MyClass obj = new MyClass();
        obj.displayMessage();
    }
}

// A user-defined class example
class MyClass {
    void displayMessage() {
        System.out.println("This is a user-defined class.");
    }
}


// Output

// byte: 100
// short: 30000
// int: 100000
// long: 10000000000
// float: 3.14
// double: 3.14159265359
// char: A
// boolean: true
// String: Hello, World!
// Array: 1 2 3 4 5
// This is a user-defined class.