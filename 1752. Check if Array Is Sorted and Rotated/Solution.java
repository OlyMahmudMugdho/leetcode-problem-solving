class Solution {
    public boolean check(int[] nums) {
        int[] unsortedNums = Arrays.copyOf(nums, nums.length);
        int[] sortedNums = sort(nums);
        int x = 0;
        for (int i = 0; i < unsortedNums.length - 1; i++) {
            if (unsortedNums[i] > unsortedNums[i + 1]) {
                x = i + 1;
                break;
            }
        }

        for (int i = 0; i < sortedNums.length; i++) {
            if (sortedNums[i] != unsortedNums[(i + x) % sortedNums.length]) {
                return false;
            }
        }
        x = 0;
        return x == 0;
    }

    public int[] sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = nums[i];
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        return nums;
    }
}