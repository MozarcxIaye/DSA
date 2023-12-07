package Leetcode.Array;

import java.util.Arrays;

public class ShufflingArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] arr = shuffle(nums, 3);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            result[j++] = nums[i];
            result[j++] = nums[i + n];
        }

        return result;
    }



}
