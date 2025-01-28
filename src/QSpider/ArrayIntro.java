package QSpider;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        String s = "I   am    a good boy";
        s = s.replaceAll("\s+", " ");
        String ans = "";
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += i != 0 ? arr[i] + " " : arr[i];
        }
        System.out.println(ans);
    }

    private static void mergeArray() {
        int[] a = {1, 23, 84, 90};
        int[] b = {8, 20, 30, 95};
        int index1 = 0, index2 = 0;
        int[] res = new int[a.length + b.length];
        for (int i = 0; i < res.length; i++) {
            if (index1 < a.length && a[index1] < b[index2])
                res[i] = a[index1++];
            else if (index2 < b.length)
                res[i] = b[index2++];
        }
        System.out.println(Arrays.toString(res));
    }

    private static int getNthMax() {
        int[] arr = {1, 5, 2, 4, 3};
        int num = 3;
        int max = getMaxElement(arr);
        while (num - 1 > 0) {
            int temp_max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > temp_max && arr[i] < max) {
                    temp_max = arr[i];
                }
            }
            max = temp_max;
            num--;
        }
        return max;
    }

    public static int getMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static void getMaxAndSecondMaxElement(int[] arr) {
        int max1, max2;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Largest: " + max1);
        System.out.println("Second largest: " + max2);
    }

    public static void printOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void printEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int findSumOfOdd(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int findSumOfEven(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int[] getArr() {
        System.out.print("Enter length of array: ");
        int count = scanner.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }


    public static int getMinElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
}
