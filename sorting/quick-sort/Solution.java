
import java.util.Arrays;

public class Solution {

    public static void sort(int[] nums, int start, int end, int pivot) {
        if (start >= end) {
            return;
        }

        int i = start - 1;
        int j;

        for (j = start; j < end; j++) {
            if (nums[j] < nums[pivot]) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        i++;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        sort(nums, start, i - 1, i - 1);
        sort(nums, i + 1, end, end);

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 4, 2, 9, 8, 6 };
        System.out.println(Arrays.toString(nums));
        sort(nums, 0, nums.length - 1, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}