class Solution {
    public boolean isPalindrome(String s) {
                StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character >= 65 && character <= 90 || character >= 97 && character <= 122 || character >= 48 && character <=57)
                builder.append(Character.toLowerCase(character));
        }
        String str = builder.toString();
        String reversedString = builder.reverse().toString();

        return  str.equals(reversedString);
    }
}