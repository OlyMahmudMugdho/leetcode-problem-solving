import java.util.*;

public class Solution1 {
    public static void sort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            int min = nums[i];
            int minIndex = i;
            for(int j = i+1; j < nums.length; j++) {
                if(nums[j] < min){
                    min = nums[j];
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{13,46,24,52,20,9};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}