import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Given nums = [2, 7, 11, 15], target = 9,Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        Arrays.sort(copy);
        int i = 0;
        int j = copy.length - 1;
        while (true) {
            int sum = copy[i] + copy[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                break;
            }
        }
        int start = 0, end = nums.length - 1;
        while (nums[start] != copy[i]) start++;
        while (nums[end] != copy[j]) end--;
        return new int[]{start, end};
    }
}
