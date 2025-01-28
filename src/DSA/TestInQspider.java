package DSA;

public class TestInQspider {
    public static void main(String[] args) {
        System.out.println(singleNumber());
    }

    public static void profit() {
        int[] arr = {7, 6, 4, 3, 1};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                if (profit > max) {
                    max = profit;
                }
            }
        }
        System.out.println(max);
    }

    public static int singleNumber() {
        int[] nums = {4,2,2,4,1};
        int res = 0;
        for(int i: nums){
            res ^= i;
        }
        return res;
    }
}
