class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int longestSequence = 0;

        for (int n : set) {
            int currentNum = n;
            int longest = 0;

            if (!set.contains(n - 1)) {
                while (set.contains(n)) {
                    n++;
                    longest++;
                }
            }

            longestSequence = Math.max(longest, longestSequence);
        }

        return longestSequence;
    }
}
