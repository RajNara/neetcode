class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] arr = new int[26];

            for (Character c : s.toCharArray()) {
                arr[c - 'a']++;
            }

            String key = Arrays.toString(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        ArrayList<List<String>> retVal = new ArrayList<>();
        retVal.addAll(map.values());

        return retVal;
    }
}
