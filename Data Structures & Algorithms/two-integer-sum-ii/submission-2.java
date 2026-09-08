class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstP = 0;
        int secondP = numbers.length - 1;

        while (secondP > firstP) {
            if (numbers[firstP] + numbers[secondP] > target) {
                secondP--;
            } else if (numbers[firstP] + numbers[secondP] < target) {
                firstP++;
            } else {
                return new int[] {firstP + 1, secondP + 1};
            }
        }

        return new int[]{};
    }
}
