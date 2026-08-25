class Solution {
    public boolean isPalindrome(String s) {
        String cleanedS = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int first = 0;
        int last = cleanedS.length() - 1;
        System.out.println(cleanedS);

        while (last >= first) {
            char firstChar = cleanedS.charAt(first);
            char lastChar = cleanedS.charAt(last);

            if (firstChar != lastChar) {
                return false;
            }

            first++;
            last--;
        }

        return true;
    }
}
