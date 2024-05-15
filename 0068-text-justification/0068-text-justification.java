class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
         ArrayList<String> result = new ArrayList<>();
        int i = 0;
        int n = words.length;
        while (i < n) {
            int j = i + 1;
            int lineLength = words[i].length();

            while (j < n && (lineLength + words[j].length() + (j - i - 1)) < maxWidth) {
                lineLength += words[j].length();
                j++;
            }
            int diff = maxWidth - lineLength;
            int numberOfWords = j - i;
            if (numberOfWords == 1 || j >= n) {
                result.add(leftJustify(words, diff, i, j));
            } else {
               result.add( middleJustify(words, diff, i, j));
            }

            i = j;
        }

        return result;
    }
    
      public  String leftJustify(String[] words, int diff, int i, int j) {

        //["What","must","be","acknowledgment","shall","be"]

        int spacesOnRight = diff - (j - i - 1);
        StringBuilder result = new StringBuilder(words[i]);
        for (int k = i + 1; k < j; ++k) {
        result.append(" " + words[k]);
        }
        result.append(" ".repeat(spacesOnRight));
        return result.toString();
    }

    public  String middleJustify(String[] words, int diff, int i, int j) {
        int spacesNeeded = j - i - 1;
        int spaces = diff / spacesNeeded;
        int extraSpaces = diff % spacesNeeded;
        StringBuilder result = new StringBuilder(words[i]);
        for (int k = i + 1; k < j; ++k) {
            int spacesToApply = spaces + (extraSpaces-- > 0 ? 1 : 0);
            result.append(" ".repeat(spacesToApply) + words[k]);
        }
        return result.toString();
    }
}