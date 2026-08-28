class Solution {
    public int[] replaceElements(int[] arr) {
        // suffix max 
        // iterate through array from RIGHT to LEFT
        // initialize max value to -1 and set max value of maxVal & num in array
        int[] retVal = new int[arr.length];
        int maxVal = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            retVal[i] = maxVal;
            maxVal = Math.max(maxVal, arr[i]);
        }

        return retVal;
    }
}