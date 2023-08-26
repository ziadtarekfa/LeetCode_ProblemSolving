class Solution {
    public String longestCommonPrefix(String[] strs) {
                int min = strs[0].length();
        for (String str : strs) {
            if (str.length() < min) {
                min = str.length();
            }
        }
        StringBuilder result = new StringBuilder("");
        int i = 0;
        int j = 0;


        while (j < min) {
            char prefix = strs[0].charAt(j);
            i = 1;
            while (i < strs.length) {
                char character = strs[i].charAt(j);
                if (character != prefix) {
                    return result.toString();
                }
                i++;
            }
            j++;
            result.append(prefix);
        }
        return result.toString();
    }
}