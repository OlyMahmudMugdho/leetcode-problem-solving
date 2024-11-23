import java.util.Arrays;

class Solution {
    public static void sort(int[] nums) {
        // insertion sort
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 4, 2, 8, 3, 1 };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}