package DSA;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length -1 ; i++) {
            int max = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] > arr[max])
                    max = j;
            }
            swap(arr, arr.length-i-1, max);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j]<arr[j-1])
                    swap(arr, j, j-1);
                else
                    break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
