class Solution {
    // we need the length of the string
    // and a delimiter to know where the string ends
    // join all these together to produce encoded string
    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();

        for (String str : strs) {
            encodedStr.append(str.length()).append("#").append(str);
        }

        return encodedStr.toString();
    }

    // start at 0
    // move ahead till we hit '#'
    // extract integer from this substring to get length of word
    // 
    public List<String> decode(String str) {
        int i = 0;
        List<String> result = new ArrayList<>();

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int lengthOfWord = Integer.parseInt(str.substring(i, j));

            i = j + 1;
            j = i + lengthOfWord;
            String word = str.substring(i, j);
            result.add(word);
            i = j;
        }   
        return result;
    }
}
