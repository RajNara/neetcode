class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort array
        // initialize return value
        // loop through nums
        // lock initial value
        // if initial value > 0, then return early since != 0
        // if initial value == initial value + 1 continue
        // calc left and right pointers
        // move up if sum is less than 0
        // move down is sum is greater than 0
        // add to return if sum == 0
        // move up and down
        // move up until left is a new value
        // return

        Arrays.sort(nums);
        List<List<Integer>> returnVal = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int leftP = i + 1;
            int rightP = nums.length - 1;

            while (rightP > leftP) {            
                int sum = nums[i] + nums[leftP] + nums[rightP];

                if (sum > 0) {
                    rightP--;
                } else if (sum < 0) {
                    leftP++;
                } else {
                    returnVal.add(Arrays.asList(nums[i], nums[leftP], nums[rightP]));
                    leftP++;
                    rightP--;
                    while (leftP < rightP && nums[leftP] == nums[leftP - 1]) {
                        leftP++;
                    }

                    while (leftP < rightP && nums[rightP] == nums[rightP + 1]) {
                        rightP--;
                    }
                }
            }
        }

        return returnVal;
    }
}
