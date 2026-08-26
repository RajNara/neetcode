class Solution {
    
    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();

        for (String str : strs) {
            encodedStr.append(str.length()).append("!").append(str);
        }

        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        // initialize at 0
        int i = 0;

        // return val
        List<String> retVal = new ArrayList<>();

        // loop through encoded str
        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '!') {
                j++;
            }

            Integer lengthOfWord = Integer.parseInt(str.substring(i, j));

            i = j+1;
            j = i + lengthOfWord;

            String word = str.substring(i, j);
            retVal.add(word);

            i = j;
        }

        return retVal;
    }
}
