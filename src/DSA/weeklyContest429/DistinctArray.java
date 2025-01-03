package DSA.weeklyContest429;

//https://leetcode.com/contest/weekly-contest-429/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/

public class DistinctArray {

    public static void main(String[] args) {
        int[] arr = {4,5,6,4,4};
        System.out.println(minimumOperations(arr));
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        while((!checkArrEquality(nums)) && nums.length!=0){
            count++;
            nums = removeThreeElements(nums);
        }
        return count;
    }

    public static boolean checkArrEquality(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] removeThreeElements(int[] arr) {

        if (arr == null || arr.length <= 3) {
            if (checkArrEquality(arr)){
                return arr;
            }else{
                return new int[] {};
            }
        }

        int[] arr2 = new int[arr.length - 3];

        for (int i = 3, k = 0; i < arr.length; i++) {
            arr2[k++] = arr[i];
        }
        return arr2;
    }
}
