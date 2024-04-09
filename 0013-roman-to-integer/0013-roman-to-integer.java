class Solution {
    public int romanToInt(String s) {
            int sum = 0;

        StringBuilder builder = new StringBuilder(s);
        int index_CM = s.indexOf("CM");
        int index_CD = s.indexOf("CD");
        int index_IV = s.indexOf("IV");
        int index_IX = s.indexOf("IX");
        int index_XL = s.indexOf("XL");
        int index_XC = s.indexOf("XC");


        if (index_IV != -1) {
            sum+=4;
            builder.delete(index_IV, index_IV + 2);
        }
        if (index_IX != -1) {
            sum+=9;
            builder.delete(index_IX, index_IX + 2);
        }

        if (index_XL != -1) {
            sum+=40;
            builder.delete(index_XL, index_XL + 2);
        }
        if (index_XC != -1) {
            sum+=90;
            builder.delete(index_XC, index_XC + 2);
        }
        if (index_CD != -1) {
            sum+=400;
            builder.delete(index_CD, index_CD + 2);
        }
        if (index_CM != -1) {
            sum+=900;
            builder.delete(index_CM, index_CM + 2);
        }



        String str = builder.toString();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            switch (currentChar) {
                case 'I':
                    sum += 1;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                // Add default case if needed for handling invalid characters
            }
        }



         return sum;
    }
}