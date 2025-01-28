//https://leetcode.com/problems/3sum/?envType=problem-list-v2&envId=array

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = List.of(nums[i], nums[j], nums[k]);
                        if(checkIfSubListNotExists(res, temp))
                            res.add(temp);
                    }
                }
            }
        }
        return res;
    }

    public static boolean checkIfSubListNotExists(List<List<Integer>> mainArr, List<Integer> subArr){
        for (int i = 0; i < mainArr.size(); i++) {
            if (mainArr.get(i).containsAll(subArr))
                return false;
        }
        return true;
    }

}
