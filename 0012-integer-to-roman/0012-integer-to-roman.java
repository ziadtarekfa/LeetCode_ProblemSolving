class Solution {
    public String intToRoman(int num) {
          HashMap<Integer, String> intToRoman = new HashMap<Integer, String>();
        intToRoman.put(1, "I");
        intToRoman.put(5, "V");
        intToRoman.put(10, "X");
        intToRoman.put(50, "L");
        intToRoman.put(100, "C");
        intToRoman.put(500, "D");
        intToRoman.put(1000, "M");

        int numOfDigits = String.valueOf(num).length();
        //int newNumber=0;
        StringBuilder result = new StringBuilder();
//4400
        //MMMM
        //400
        while (num != 0) {
            if (numOfDigits == 4) {
                num -= 1000;
                result.append(intToRoman.get(1000));
                numOfDigits = String.valueOf(num).length();
            } else if (numOfDigits == 3) {
                if (num >= 900) {
                    num -= 900;
                    result.append(intToRoman.get(100));
                    result.append(intToRoman.get(1000));
                }
                if (num >= 500) {
                    num -= 500;
                    result.append(intToRoman.get(500));
                } else if (num >= 400) {
                    num -= 400;
                    result.append(intToRoman.get(100));
                    result.append(intToRoman.get(500));
                } else if (num >= 100) {
                    num -= 100;
                    result.append(intToRoman.get(100));
                }
                  numOfDigits = String.valueOf(num).length();
            }
            if (numOfDigits == 2) {
                if (num >= 90) {
                    num -= 90;
                    result.append(intToRoman.get(10));
                    result.append(intToRoman.get(100));
                }
                if (num >= 50) {
                    num -= 50;
                    result.append(intToRoman.get(50));
                } else if (num >= 40) {
                    num -= 40;
                    result.append(intToRoman.get(10));
                    result.append(intToRoman.get(50));
                } else if (num >= 10) {
                    num -= 10;
                    result.append(intToRoman.get(10));
                }
                    numOfDigits = String.valueOf(num).length();
            }
            if (numOfDigits == 1) {
                if (num >= 9) {
                    num -= 9;
                    result.append(intToRoman.get(1));
                    result.append(intToRoman.get(10));
                }
                if (num >= 5) {
                    num -= 5;
                    result.append(intToRoman.get(5));
                } else if (num >= 4) {
                    num -= 4;
                    result.append(intToRoman.get(1));
                    result.append(intToRoman.get(5));
                } else if (num >= 1) {
                    num -= 1;
                    result.append(intToRoman.get(1));
                }
            }
        }
        return result.toString();
    }
}