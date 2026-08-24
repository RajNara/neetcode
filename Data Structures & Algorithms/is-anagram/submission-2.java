class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] arr1 = new char[26];
        char[] arr2 = new char[26];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            arr1[sChar - 'a']++;
            arr2[tChar - 'a']++;
        }

        return Arrays.equals(arr1, arr2);
    }
}
