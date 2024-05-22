class Solution {
    public int[] twoSum(int[] numbers, int target) {
           int difference;
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            difference = target - numbers[i];
            int searchResult = binarySearch(numbers, i + 1, difference);
            if (searchResult != -1) {
                result[0] = i + 1;
                result[1] = searchResult;
                return result;
            }
        }
        return null;
    }
    
    public int binarySearch(int[] numbers, int startingIndex, int target) {
        int endIndex = numbers.length - 1;
        int startIndex = startingIndex;

        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (numbers[mid] == target) {
                return mid + 1;
            } else if (numbers[mid] > target) {
                endIndex = mid - 1;
            } else if (numbers[mid] < target) {
                startIndex = mid + 1;
            }

        }

        return -1;


    }
}