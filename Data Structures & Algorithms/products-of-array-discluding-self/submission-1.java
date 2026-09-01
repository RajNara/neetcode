class Solution {
    public int[] productExceptSelf(int[] nums) {
        // prefix then suffix products

        int[] resultArr = new int[nums.length];
        resultArr[0] = 1;

        int postFixProduct = 1;

        for (int i = 1; i < nums.length; i++) {
            resultArr[i] = resultArr[i-1] * nums[i-1];
        }
        // [1, 1, 2, 8]

        // traverse backwards
        for (int i = nums.length - 1; i >= 0; i--) {
            resultArr[i] = postFixProduct * resultArr[i];
            postFixProduct = postFixProduct * nums[i];
        }

        return resultArr;
    }
}  
