class Solution {
    public boolean isPalindrome(String s) {
        String replacedS = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(replacedS);
        int firstL = 0;
        int lastL = replacedS.length() - 1;

        while (lastL >= firstL) {
            if (replacedS.charAt(firstL) == replacedS.charAt(lastL)) {
                firstL++;
                lastL--;
            } else {
                return false;
            }
        }

        return true;
    }
}
