import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    public static int[] removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(nums[0]);
        for (int i = 0; i < (nums.length - 1); i++) {
            int j = i + 1;
            if (nums[i] != nums[j]) {
                list.add(nums[j]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(removeDuplicates(nums1)));
        System.out.println(Arrays.toString(removeDuplicates(nums2)));
    }
}
