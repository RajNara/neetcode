class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int retVal = 0;
        int sum = 0;
        // a sum of 0 has occured once at the very beginning
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            // calc prefix sum
            sum = sum + nums[i];

            if (map.containsKey(sum - k)) {
                retVal = retVal + map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return retVal;
    }
}