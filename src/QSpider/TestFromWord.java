package QSpider;

import java.util.Arrays;
import java.util.Set;

public class TestFromWord {
    public static void main(String[] args) {
        int[] arr = {45, 69, 99, 7, 3, 18};
//        System.out.println("The Array is " + Arrays.toString(arr));
//        System.out.println("Sum of array is : " + sumOfArr(arr)); //1
//        System.out.println("Minimum value is : " + getMinElement(arr)); //2
//        System.out.println("Maximum element is : " + getMaxElement(arr)); //3
//        getMinAndSecondMinElement(arr); //4
//        getMaxAndSecondMaxElement(arr); //5
//        System.out.println("Average is : " + avgOfArr(arr)); //6
//        System.out.println("Sum of even indexed numbers : " + findSumOfEvenIndexed(arr)); //7
//        System.out.println("Sum of odd indexed numbers : " + findSumOfOddIndexed(arr)); //8
//        System.out.println("Minimum value from even indexed is : " + getMinFromAllEvenIndexed(arr)); //9
//        System.out.println("Minimum value from odd indexed is : " + getMinFromAllOddIndexed(arr)); //10
//        System.out.println("Avg of even indexed numbers is  : " + getAvgFromAllEvenIndexed(arr)); //11
//        System.out.println("Avg of odd indexed numbers is " + getAvgFromAllOddIndexed(arr)); //12
//        System.out.println("Sum of first half array is : " + getSumOfFirstHalf(arr)); //13
//        System.out.println("Sum of second half array is : " + getSumOfSecondHalf(arr));//14
//        System.out.println("Min of first half array is : " + getMinOfFirstHalf(arr));//15
//        System.out.println("Min of second half array is : " + getMinOfSecondHalf(arr));//16
//        System.out.println("Max of first half array is : " + getMaxOfFirstHalf(arr));//17
//        System.out.println("Max of second half array is : " + getMaxOfSecondHalf(arr));//18
//        System.out.println("Avg of first half array is : " + getAvgOfFirstHalf(arr)); //19
//        System.out.println("Avg of second half array is : " + getAvgOfSecondHalf(arr));//20
//        System.out.println("Reverse of array is : " + Arrays.toString(revArr(arr))); //21
//        System.out.println("Reverse of first half elements of array is : " + Arrays.toString(revFirstHalfElemOfArr(arr))); //22
//        System.out.println("Reverse of second half elements of array is : " + Arrays.toString(revSecondHalfElemOfArr(arr))); //23
//        System.out.println("Even indexed elements of array : " + revEvenIndexedElements(arr)); //25
//        System.out.println("Odd indexed elements of array : " + revOddIndexedElements(arr)); //27
//        System.out.println("Index of specified element is present at index :" + findFirstOccurenceIndex(arr,3)); //28
//        System.out.println("Values at given indexes are swapped :" + Arrays.toString(swapDataAtIndexes(arr,1,2))); //29
//        System.out.println("Reverse of array is : " + Arrays.toString(revElemOfArr(arr))); //30
//        System.out.println("Reverse of first half of array is : " + Arrays.toString(revFirstHalfArr(arr))); //31
//        System.out.println("Reverse of second half of array is : " + Arrays.toString(revSecondHalfArr(arr))); //32
//
//        System.out.println("Sum of even numbers : " + findSumOfEven(arr));
//        System.out.println("Sum of odd numbers : " + findSumOfOdd(arr));
//        System.out.println("Maximum element of all odd indexed is : " + getMaxFromAllOddIndexed(arr));
//        System.out.println("Maximum element of all even indexed is : " + getMaxFromAllEvenIndexed(arr));
//        System.out.println("("+3+") Nth largest number is : " + getNthMax(arr, 3));
//        rotateOneElemLeft(arr);
//        rotateNElemLeft(arr, 2);
//        rotateOneElemRight(arr);
//        rotateNElemRight(arr, 2);
//        System.out.println(findLastOccurenceIndex(arr, 3));;
//        findNoOfOccurenceOfAllElem(arr);
//        removeElemOfArr(arr, 5);
//        int[] arr1 = {21,28,31,23};
//        int[] arr2 = {8};
//        mergeTwoArrays(arr1, arr2);
//        System.out.println(Arrays.toString(bubbleSort(arr)));
//        int[] arr1 = {1,2,3,4};
//        int[] arr2 = {5};
//        zigzagArray(arr1, arr2);
        int[][] twoDArr = {{1,2,3}, {4,5}, {7}};
        arrSumColPattern(twoDArr);
    }
//
//    public static void (int[][] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < arr[i].length && i<arr[j].length; j++) {
//                sum += arr[j][i];
//            }
//            System.out.print(sum + " ");
//        }
//    }

    public static void arrSumColPattern(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length && i<arr[j].length; j++) {
                sum += arr[j][i];
            }
            System.out.print(sum + " ");
        }
    }

    public static void arrSumPattern(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(": " + sum);
        }
    }

    public static int[] swapDataAtIndexes(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    public static int findFirstOccurenceIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastOccurenceIndex(int[] arr, int target) {
        int index = findFirstOccurenceIndex(arr, target);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
            }
        }
        return index;
    }

    public static int[] revArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swapDataAtIndexes(arr, i, arr.length - i - 1);
        }
        return arr;
    }

    public static int[] revElemOfArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = NumberPattern.revNum(arr[i]);
        }
        return arr;
    }

    public static int[] revFirstHalfArr(int[] arr) {
        int[] temp = new int[arr.length / 2];
        for (int i = 0; i < arr.length / 2; i++) {
            temp[i] = arr[(arr.length / 2) - i - 1];
        }
        return temp;
    }

    public static int[] revSecondHalfArr(int[] arr) {
        int[] temp = new int[arr.length / 2];
        for (int i = 0; i < arr.length / 2; i++) {
            temp[i] = arr[arr.length - i - 1];
        }
        return temp;
    }

    public static int[] revFirstHalfElemOfArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = NumberPattern.revNum(arr[i]);
        }
        return arr;
    }

    public static int[] revSecondHalfElemOfArr(int[] arr) {
        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] = NumberPattern.revNum(arr[i]);
        }
        return arr;
    }

    public static String revEvenIndexedElements(int[] arr) {
        arr = revArr(arr);
        String a = "[";
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean isFirst = i == arr.length - 1 || i == arr.length - 2;
            if (i % 2 == 0) {
                a += isFirst ? arr[i] + " " : "," + arr[i] + " ";
            }
        }
        a += "]";
        return a;
    }

    public static String revOddIndexedElements(int[] arr) {
        arr = revArr(arr);
        String a = "[";
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean isFirst = i == arr.length - 1 || i == arr.length - 2;
            if (i % 2 == 1) {
                a += isFirst ? arr[i] + " " : "," + arr[i] + " ";
            }
        }
        a += "]";
        return a;
    }

    public static int getSumOfFirstHalf(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getSumOfSecondHalf(int[] arr) {
        int sum = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMinOfFirstHalf(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length / 2; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    public static int getMinOfSecondHalf(int[] arr) {
        int min = arr[arr.length / 2];
        for (int i = arr.length / 2 + 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    public static int getMaxOfFirstHalf(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length / 2; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    public static int getMaxOfSecondHalf(int[] arr) {
        int max = arr[arr.length / 2];
        for (int i = arr.length / 2 + 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    public static int getAvgOfFirstHalf(int[] arr) {
        return getSumOfFirstHalf(arr) / (arr.length / 2);
    }

    public static int getAvgOfSecondHalf(int[] arr) {
        return getSumOfSecondHalf(arr) / (arr.length / 2);
    }

    public static int sumOfArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMinElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
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

        System.out.println("First largest: " + max1);
        System.out.println("Second largest: " + max2);
    }

    public static int findSumOfOddIndexed(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int findSumOfEvenIndexed(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void getMinAndSecondMinElement(int[] arr) {
        int min1, min2;
        if (arr[0] < arr[1]) {
            min1 = arr[0];
            min2 = arr[1];
        } else {
            min1 = arr[1];
            min2 = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }

        System.out.println("First smallest: " + min1);
        System.out.println("Second smallest: " + min2);
    }

    public static int getNthMax(int[] arr, int num) {
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

    public static int avgOfArr(int[] arr) {
        return sumOfArr(arr) / arr.length;
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

    public static int getMinFromAllEvenIndexed(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min && i % 2 == 0) min = arr[i];
        }
        return min;
    }

    public static int getMinFromAllOddIndexed(int[] arr) {
        int min = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min && i % 2 == 1) min = arr[i];
        }
        return min;
    }

    public static int getAvgFromAllOddIndexed(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 1) {
                count++;
                sum += arr[i];
            }
        }
        return sum / count;
    }

    public static int getAvgFromAllEvenIndexed(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                count++;
                sum += arr[i];
            }
        }
        return sum / count;
    }

    public static int getMaxFromAllOddIndexed(int[] arr) {
        int max = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max && i % 2 == 1) max = arr[i];
        }
        return max;
    }

    public static int getMaxFromAllEvenIndexed(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max && i % 2 == 0) max = arr[i];
        }
        return max;
    }

    public static void rotateOneElemLeft(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println("Array is left shifted " + 1 + " time : " + Arrays.toString(arr));
    }

    public static void rotateNElemLeft(int[] arr, int n) {
        int[] tempArr = new int[n];
        for (int i = 0; i < n; i++) {
            tempArr[i] = arr[i];
        }
        for (int i = n; i < arr.length; i++) {
            arr[i - n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[arr.length - n + i] = tempArr[i];
        }
        System.out.println("Array is left shifted " + n + " times : " + Arrays.toString(arr));
    }

    public static void rotateOneElemRight(int[] arr) {
        System.out.println("Array is right shifted " + 1 + " time : " + Arrays.toString(arr));
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println("Array is right shifted " + 1 + " time : " + Arrays.toString(arr));
    }

    public static void rotateNElemRight(int[] arr, int n) {
        n %= arr.length;
        while (n > 0) {
            rotateOneElemRight(arr);
            n--;
        }
        System.out.println("Array is right shifted " + n + " times : " + Arrays.toString(arr));
    }

    public static int findNoOfOccurence(int[] arr, int key) {
        int count = 0;
        for (int i : arr) {
            if (i == key) count++;
        }
        return count;
    }

    public static int[] bubbleSort(int[] arr) {
        boolean isSwapped = true;
        for (int j = arr.length; j>0 && isSwapped; j--) {
            isSwapped = false;
            for (int i = 0; i < j-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSwapped = true;
                }
            }
        }
        return arr;
    }

    public static void findNoOfOccurenceOfAllElem(int[] arr) {
        bubbleSort(arr);
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            int c = 1;
            while (i + 1 != arr.length && arr[i] == arr[i + 1]) {
                c++;
                i++;
            }
            System.out.println(arr[i] + " : " + c);
        }
    }

    public static void removeElemOfArr(int[] arr, int num) {
//        int[] arr = {1, 5, 3, 5, 0, 1, 3, 5, 4, 2, 0};

        int[] newArr = new int[arr.length - findNoOfOccurence(arr, num)];
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != num) {
                newArr[i++] = arr[j];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void zigzagArray(int[] a, int[] b){
        int i=0, j=0, k=0;
        int[] newArr = new int[a.length + b.length];
        for (int l = 0; l < newArr.length; l++) {
            if(i< a.length)
                newArr[k++] = a[i++];
            if(j<b.length)
                newArr[k++] = b[j++];
        }
        System.out.println(Arrays.toString(newArr));
    }
}