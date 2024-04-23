class Solution {
    public String reverseWords(String s) {
        
        String cleanedWords = s.trim().replaceAll("\\s+", " ");
        StringBuilder builder = new StringBuilder();
// the sky is blue
        int firstIndex = 0;
        for (int i = 0; i < cleanedWords.length(); i++) {
            if (cleanedWords.charAt(i) == ' ' || i == cleanedWords.length() - 1) {
                if (i == cleanedWords.length() -1) {
                    builder.insert(0, " ");
                }
                builder.insert(0, cleanedWords.substring(firstIndex, i + 1));


                firstIndex = i + 1;
            }
        }

        return builder.toString().trim();
    }
}