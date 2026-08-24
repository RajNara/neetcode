class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] countArray = new int[26];
            
            for (int i = 0; i < s.length(); i++) {
                countArray[s.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(countArray);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
