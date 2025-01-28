package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/triangle/?envType=problem-list-v2&envId=array
public class minimumTotal {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(-1));
        arr.add(List.of(2,3));
        arr.add(List.of(1,-1,-3));
        System.out.println(minimumTotal(arr));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum = triangle.get(0).get(0);
        if(triangle.size()==1)
            return sum;
        for(int i=1; i<triangle.size(); i++){
            sum += min(triangle.get(i));
        }
        return sum;
    }
    public static int min(List<Integer> arr){
        int min = arr.get(0);
        for(int i = 1; i<arr.size(); i++){
            if(arr.get(i)<min)
                min = arr.get(i);
        }
        return min;
    }
}
