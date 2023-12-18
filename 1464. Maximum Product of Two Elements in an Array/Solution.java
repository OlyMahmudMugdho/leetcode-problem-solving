class Solution {
    public static int maxProduct(int[] nums) {
        int length = nums.length;
        int maxProduct = 0;
        for(int i=0;i<length;i++){
            for(int j = 0; j<length;j++){
                if(i==j){
                    continue;
                }
                else {
                    if(((nums[i]-1)*(nums[j]-1)) > maxProduct){
                        maxProduct = (nums[i]-1)*(nums[j]-1);
                        continue;
                    }
                }
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        
    }
}
