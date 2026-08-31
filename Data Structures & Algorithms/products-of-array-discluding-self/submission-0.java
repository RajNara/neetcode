class Solution {
    public int[] productExceptSelf(int[] nums) {
        // while moving left to right, prefix multiply
        // while moving right to left, suffix multiply
        int[] result = new int[nums.length];
        result[0] = 1;
        int postfix = 1;

        // prefix
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        // [1, 1, 2, 8]

        // suffix
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = postfix * result[i];
            postfix = postfix * nums[i];
        }
        // [48, 24, 12, 8]

        return result;
    }
}  
