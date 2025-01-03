package DSA;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums= {2,5};
        int target = 1;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        if(target < nums[0]){
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
                if(nums[start]>target){
                    return start;
                }
            }else if (nums[mid] > target) {
                end = mid - 1;
                if(nums[end]<target){
                    return end+1;
                }
            } else {
                return mid;
            }

        }
        return nums[end] > target ? end-1 : nums[start] < target ? start+1 : start;
    }
}