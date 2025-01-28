package QSpider.object;

import java.util.Arrays;

public class UserDriver {

    public static void main(String[] args) {
        int[] a = {133, 135, 167, 139};
        int[] b = {1,0,3,4,5,0,6};
//        System.out.println(maxDigit(a));
        moveZeros(b);
    }

    public static void moveZeros(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n] = temp;
                n++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static int maxDigit(int[] arr) {
        int[] ans = new int[10];
        for (int i : arr) {
            while (i > 0) {
                int rem = i % 10;
                ans[rem - 1]++;
                i /= 10;
            }
        }
        int max = 0;
        int num = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] >= max) {
                max = ans[i];
                num = i;
            }
        }
        return num+1;
    }

}
