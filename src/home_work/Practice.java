package src.home_work;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[0];

            for (int i = 0, j = 1; i < nums.length - 1 && j < nums.length - 1; i++) {
                if (nums[i] + nums[j] == target) {
                    res = new int[]{i, j};
                } else {
                    j++;
                }
            }
        return res;
    }
}
