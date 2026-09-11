class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> retVal = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int firstP = i + 1;
            int lastP = nums.length - 1;

            while (lastP > firstP) {
                int sum = nums[i] + nums[firstP] + nums[lastP];

                if (sum > 0) {
                    lastP--;
                } else if (sum < 0) {
                    firstP++;
                } else {
                    retVal.add(Arrays.asList(nums[i], nums[firstP], nums[lastP]));

                    firstP++;
                    lastP--;

                    while (lastP > firstP && nums[firstP] == nums[firstP - 1]) {
                        firstP++;
                    }
                }
            }
        }

        return retVal;
    }
}
