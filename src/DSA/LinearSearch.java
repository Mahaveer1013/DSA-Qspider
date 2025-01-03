package DSA;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 13, 56, 34, -13, 5};
        int[][] arr2D = {
                {12, 13, 56, 34, -13, 5},
                {12,1,3,5,6,5,4,32},
                {13,4,3,5,45,7,68}
        };

        LinearSearch obj = new LinearSearch();
        System.out.println(obj.findMin(arr));
        System.out.println(obj.findMax(arr));
        System.out.println(obj.findElement(arr, -13));
        System.out.println(Arrays.toString(obj.findElementIn2DArray(arr2D, -13)));
        int a = 100;
        System.out.println(Integer.parseInt((a+"").charAt(0)+""));

    }

    int findMin(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    int findMax(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    int findElement(int[] arr, int element) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    int[] findElementIn2DArray(int[][] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == element) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


}
