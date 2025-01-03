package DSA.weeklyContest429;

//https://leetcode.com/contest/weekly-contest-429/problems/maximum-number-of-distinct-elements-after-operations/

public class MaxDistinctAfterOperation {
    public static void main(String[] args) {

        int[] nums = {1,2,2,3,3,4};
        int k = 2;
//        int[] sorted = bubbleSort(nums);
//        for(int a:sorted) {
//            System.out.println(a);
//        }
        System.out.println(maxDistinctElements(nums, k));

    }
    public static int maxDistinctElements(int[] nums, int k) {
        nums = bubbleSort(nums);

        int count = 0;
        int prev = Integer.MIN_VALUE;  // To store the previous distinct element

        for (int num : nums) {
            // If the number is not equal to the previous element, it's distinct
            if (num != prev) {
                count++;
                prev = num;
            } else {
                // Try adjusting the current number within the range [-k, k]
                boolean foundDistinct = false;
                for (int delta = -k; delta <= k; delta++) {
                    int adjusted = num + delta;

                    // Only consider adjustments that result in a value different from the previous
                    if (adjusted != prev) {
                        count++;
                        prev = adjusted;
                        foundDistinct = true;
                        break; // Stop once a distinct value is found
                    }
                }
                // If no distinct number was found after adjustment, continue with the next number
                if (!foundDistinct) {
                    continue;
                }
            }
        }

        return count;
    }

    public static int[] bubbleSort(int[] arr){
        if(arr.length == 0){
            return arr;
        }
        while (true){
            boolean count = false;
            int len = 0;
            for (int i = 1; i<arr.length - len; i++){
                if(arr[i-1]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    count = true;
                    len++;
                }
            }
            if(!count){
                return arr;
            }
        }
    }
}
