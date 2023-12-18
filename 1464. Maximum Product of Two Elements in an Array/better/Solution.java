public class Solution {
    public static int maxProduct(int[] nums) {
        int length = nums.length;
        int max = -1;
        int maxIndex = -1;
        int secondMax = -1;

        for (int i = 0; i < length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < length; i++) {
            if ((nums[i] <= max) && (nums[i] >= secondMax) && i != maxIndex) {
                secondMax = nums[i];
            }
        }

        return (max-1)*(secondMax-1);
    }
    public static void main(String[] args) {
        
    }
}
