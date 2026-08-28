class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] retVal = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            retVal[i] = nums[i];
            retVal[i + nums.length] = nums[i];
        }

        return retVal;
    }
}