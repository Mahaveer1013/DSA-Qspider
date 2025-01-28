package DSA;

public class MedianOfTwoArr {
    //    https://leetcode.com/problems/median-of-two-sorted-arrays/description/
    public static void main(String[] args) {
        int[] nums1 = {2,3};
        int[] nums2 = {1};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double length = nums1.length + nums2.length;
        if(nums1.length == 0){
            double len = nums2.length;
            if(len%2==0)
                return (double) (nums2[(nums2.length / 2) - 1] + nums2[nums2.length / 2]) /2;
            else
                return nums2[nums2.length/2];
        }
        if(nums2.length == 0){
            double len = nums1.length;
            if(len%2==0) {
                double sum = nums1[(nums1.length / 2) - 1] + nums1[nums1.length / 2];
                System.out.println(sum);
                System.out.println(sum/2);
                return sum / 2;
            }
            else
                return nums1[nums1.length/2];
        }
        if (length % 2 == 0) {
            return findMidElemForEven(nums1, nums2, length/2);
        } else {
            return findMidElemForOdd(nums1, nums2, length/2);
        }
    }

    public static double findMidElemForEven(int[] num1, int[] num2, double count) {
        int i = 0, j = 0;
        double prev = 0, curr = 0;
        for (int k = 0; k <= count; k++) {
            prev = curr;
            if (i < num1.length && (j >= num2.length ||  num2[j] >= num1[i]))
                curr = num1[i++];
            else
                curr = num2[j++];
        }
        System.out.println(curr);
        System.out.println(prev);
        return (prev + curr) / 2;
    }

    public static double findMidElemForOdd(int[] num1, int[] num2, double count) {
        int i = 0, j = 0;
        double curr = 0;
        for (int k = 0; k <= count; k++) {
            if (i < num1.length && (j >= num2.length || num2[j] >= num1[i]))
                curr = num1[i++];
            else
                curr = num2[j++];
        }
        return curr;
    }

}
