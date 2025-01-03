package DSA;

public class MedianOfTwoArr {
    //    https://leetcode.com/problems/median-of-two-sorted-arrays/description/
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 5, 7};
        int[] nums2 = {1, 4, 6, 8}; // 1,2,3,4,5,6,7,8
        findMedianSortedArrays(nums1, nums2);
    }

    static private double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0){
            return nums2.length % 2 == 1 ? nums2[nums2.length/2] : (nums2[nums2.length/2] + nums2[(nums2.length/2) + 1]) / 2;
        }
        if(nums2.length == 0){
            return nums1.length % 2 == 1 ? nums1[nums1.length/2] : (nums1[nums1.length/2] + nums1[(nums1.length/2) + 1]) / 2;
        }

        double ans = getMedian(nums1, nums2);
        return ans;
    }

    private static double getMedian(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int i=0, j=0;

        if(len%2 == 0){
            for(int x=0; x<(len/2) + 1; x++){
                if(nums1[i] < nums2[j]){
                    i++;
                }else{
                    j++;
                }
                
            }

        }

        return 0.0;
    }

}
