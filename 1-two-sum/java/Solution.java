import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int[] nums = new int[2];
        twoSum(nums, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                result[0] = i;
                result[1] = map.get(remainder);
                System.out.println(result[0]  + " " + result[1]);
                return result;
            }
            System.out.println("putting : " + nums[i] + " , " + i);
            map.put(nums[i], i);
            
        }

        return result;
    }
}