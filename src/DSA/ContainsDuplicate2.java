package DSA;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] a = {13,23,1,2,3};
        int k = 5;
        System.out.println(containsNearbyDuplicate(a, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 2 && k >= 2) {
            return nums[0] == nums[1];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int start = Math.max(i - k, 0);
            int end = Math.min(i + k-1, nums.length);
            for (int j = start; j < end; j++) {
                if (nums[i] == nums[j] && i != j && Math.abs(i - j) <= k)
                    return true;
            }
        }
        return false;
    }
}
