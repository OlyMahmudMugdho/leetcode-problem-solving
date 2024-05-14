package G5635_1_Kth_Smallest;

import java.util.Arrays;

public class KthSmallest {
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        return sorted[k-1];
    }
    public static void main(String[] args) {
        int[] nums = new int[]{7,10,4,3,20,15};
        System.out.println(kthSmallest(nums,0,nums.length-1,3));
    }
}
