package L287_Find_Duplicate;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3,3,3,3}));
    }
}
